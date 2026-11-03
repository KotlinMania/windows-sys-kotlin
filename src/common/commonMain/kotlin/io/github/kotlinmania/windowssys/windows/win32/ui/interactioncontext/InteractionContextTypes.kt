package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

public typealias CROSS_SLIDE_FLAGS = UInt

public typealias CROSS_SLIDE_THRESHOLD = Int

public typealias HINTERACTIONCONTEXT = Long

public typealias HOLD_PARAMETER = Int

public typealias INERTIA_PARAMETER = Int

public typealias INTERACTION_CONFIGURATION_FLAGS = UInt

public fun interface INTERACTION_CONTEXT_OUTPUT_CALLBACKFn {
    public operator fun invoke(clientdata: Long, output: Long)
}

public typealias INTERACTION_CONTEXT_OUTPUT_CALLBACK = INTERACTION_CONTEXT_OUTPUT_CALLBACKFn?

public fun interface INTERACTION_CONTEXT_OUTPUT_CALLBACK2Fn {
    public operator fun invoke(clientdata: Long, output: Long)
}

public typealias INTERACTION_CONTEXT_OUTPUT_CALLBACK2 = INTERACTION_CONTEXT_OUTPUT_CALLBACK2Fn?

public typealias INTERACTION_CONTEXT_PROPERTY = Int

public typealias INTERACTION_FLAGS = UInt

public typealias INTERACTION_ID = Int

public typealias INTERACTION_STATE = Int

public typealias MANIPULATION_RAILS_STATE = Int

public typealias MOUSE_WHEEL_PARAMETER = Int

public typealias TAP_PARAMETER = Int

public typealias TRANSLATION_PARAMETER = Int
