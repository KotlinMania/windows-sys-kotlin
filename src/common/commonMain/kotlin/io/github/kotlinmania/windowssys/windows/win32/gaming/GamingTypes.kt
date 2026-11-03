package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias GAMESTATS_OPEN_RESULT = Int

public typealias GAMESTATS_OPEN_TYPE = Int

public typealias GAME_INSTALL_SCOPE = Int

public typealias GAMING_DEVICE_DEVICE_ID = Int

public typealias GAMING_DEVICE_VENDOR_ID = Int

public fun interface GameUICompletionRoutineFn {
    public operator fun invoke(returncode: HRESULT, context: Long)
}

public typealias GameUICompletionRoutine = GameUICompletionRoutineFn?

public typealias KnownGamingPrivileges = Int

public fun interface PlayerPickerUICompletionRoutineFn {
    public operator fun invoke(returncode: HRESULT, context: Long, selectedxuids: Long, selectedxuidscount: ULong)
}

public typealias PlayerPickerUICompletionRoutine = PlayerPickerUICompletionRoutineFn?

public typealias XBL_IDP_AUTH_TOKEN_STATUS = Int
