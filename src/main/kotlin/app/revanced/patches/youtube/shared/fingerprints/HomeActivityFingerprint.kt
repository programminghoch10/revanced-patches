package app.revanced.patches.youtube.shared.fingerprints

import app.revanced.patcher.fingerprint.methodFingerprint

internal val homeActivityFingerprint = methodFingerprint {
    custom { methodDef, classDef ->
        methodDef.name == "onCreate" && classDef.endsWith("Shell_HomeActivity;")
    }
}
