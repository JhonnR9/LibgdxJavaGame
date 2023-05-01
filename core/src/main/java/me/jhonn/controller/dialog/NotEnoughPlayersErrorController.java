package me.jhonn.controller.dialog;

import com.github.czyzby.autumn.mvc.stereotype.ViewDialog;

/** Shown when there are no players with active controls. */
@ViewDialog(id = "inactive", value = "ui/templates/dialogs/inactive.lml", cacheInstance = true)
public class NotEnoughPlayersErrorController {
}