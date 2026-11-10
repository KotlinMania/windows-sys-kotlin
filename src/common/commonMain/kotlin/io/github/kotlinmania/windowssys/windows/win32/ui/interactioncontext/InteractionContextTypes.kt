package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias CrossSlideFlags = UInt

public typealias CrossSlideThreshold = Int

public typealias Hinteractioncontext = COpaquePointer?

public typealias HoldParameter = Int

public typealias InertiaParameter = Int

public typealias InteractionConfigurationFlags = UInt

public fun interface InteractionContextOutputCallbackFn {
    public operator fun invoke(clientdata: COpaquePointer?, output: COpaquePointer?)
}

public typealias InteractionContextOutputCallback = InteractionContextOutputCallbackFn?

public fun interface InteractionContextOutputCallback2Fn {
    public operator fun invoke(clientdata: COpaquePointer?, output: COpaquePointer?)
}

public typealias InteractionContextOutputCallback2 = InteractionContextOutputCallback2Fn?

public typealias InteractionContextProperty = Int

public typealias InteractionFlags = UInt

public typealias InteractionId = Int

public typealias InteractionState = Int

public typealias ManipulationRailsState = Int

public typealias MouseWheelParameter = Int

public typealias TapParameter = Int

public typealias TranslationParameter = Int
