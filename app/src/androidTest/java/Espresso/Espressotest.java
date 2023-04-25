package Espresso;

import static androidx.test.espresso.Espresso.onView;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.parcial2_2023.MainActivity;
import com.example.parcial2_2023.R;

import org.junit.Rule;
import org.junit.Test;

public class Espressotest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void ingresardatosdeusuario()
    {
        onView(ViewMatchers.withId(R.id.numero1)).perform(ViewActions.typeText("20"));
        onView(ViewMatchers.withId(R.id.numero2)).perform(ViewActions.typeText("23"));

        onView(ViewMatchers.withId(R.id.suma)).perform(ViewActions.click());


    }
}
