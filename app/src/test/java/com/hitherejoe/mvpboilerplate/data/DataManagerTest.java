package com.hitherejoe.mvpboilerplate.data;

import com.google.android.apps.secrets.test.common.TestDataFactory;
import com.hitherejoe.mvpboilerplate.data.model.NamedResource;
import com.hitherejoe.mvpboilerplate.data.model.Pokemon;
import com.hitherejoe.mvpboilerplate.data.remote.MvpBoilerplateService;
import com.hitherejoe.mvpboilerplate.util.RxSchedulersOverrideRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import rx.Single;
import rx.observers.TestSubscriber;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DataManagerTest {

    @Mock
    MvpBoilerplateService mMockMvpBoilerplateService;
    DataManager mDataManager;

    @Rule
    // Must be added to every test class that targets app code that uses RxJava
    public final RxSchedulersOverrideRule mOverrideSchedulersRule = new RxSchedulersOverrideRule();

    @Before
    public void setUp() {
        mDataManager = new DataManager(mMockMvpBoilerplateService);
    }

    @Test
    public void getPokemonListCompletesAndEmitsPokemonList() {
        List<NamedResource> namedResourceList = TestDataFactory.makeNamedResourceList(5);
        MvpBoilerplateService.PokemonListResponse pokemonListResponse =
                new MvpBoilerplateService.PokemonListResponse();
        pokemonListResponse.results = namedResourceList;

        when(mMockMvpBoilerplateService.getPokemonList(anyInt()))
                .thenReturn(Single.just(pokemonListResponse));

        TestSubscriber<List<String>> testSubscriber = new TestSubscriber<>();
        mDataManager.getPokemonList(10).subscribe(testSubscriber);
        testSubscriber.assertCompleted();
        testSubscriber.assertValue(TestDataFactory.makePokemonNameList(namedResourceList));
    }

    @Test
    public void getPokemonCompletesAndEmitsPokemon() {
        String name = "charmander";
        Pokemon pokemon = TestDataFactory.makePokemon(name);
        when(mMockMvpBoilerplateService.getPokemon(anyString()))
                .thenReturn(Single.just(pokemon));

        TestSubscriber<Pokemon> testSubscriber = new TestSubscriber<>();
        mDataManager.getPokemon(name).subscribe(testSubscriber);
        testSubscriber.assertCompleted();
        testSubscriber.assertValue(pokemon);
    }

}
