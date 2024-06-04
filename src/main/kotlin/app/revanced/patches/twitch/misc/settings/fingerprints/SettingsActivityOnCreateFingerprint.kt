package app.revanced.patches.twitch.misc.settings.fingerprints

import app.revanced.patcher.fingerprint.methodFingerprint

internal val settingsActivityOnCreateFingerprint = methodFingerprint {
    custom { methodDef, classDef ->
        classDef.endsWith("/SettingsActivity;") &&
            methodDef.name == "onCreate"
    }
}
