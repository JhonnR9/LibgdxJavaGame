package me.jhonn.service.controls;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.utils.Array;
import com.github.czyzby.kiwi.util.gdx.collection.GdxArrays;
import me.jhonn.configuration.preferences.ControlsData;
import me.jhonn.service.controls.impl.InactiveControl;
import me.jhonn.service.controls.impl.KeyboardControl;
import me.jhonn.service.controls.impl.TouchControl;

/** Represents all types of available input sources. */
public enum ControlType {
    TOUCH {
        @Override
        public Control create(final ControlsData data) {
            return new TouchControl();
        }
    },
    KEYBOARD {
        @Override
        public Control create(final ControlsData data) {
            final Control control = new KeyboardControl();
            control.copy(data);
            return control;
        }
    },

    INACTIVE {
        @Override
        public Control create(final ControlsData data) {
            return new InactiveControl();
        }
    };

    /** @param data serialized controls.
     * @return deserialized controller. */
    public abstract Control create(ControlsData data);
}
