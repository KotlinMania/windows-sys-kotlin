package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

public data class CROSS_SLIDE_PARAMETER(public var threshold: CROSS_SLIDE_THRESHOLD = 0, public var distance: Float = 0.0f)

public data class INTERACTION_ARGUMENTS_CROSS_SLIDE(public var flags: CROSS_SLIDE_FLAGS = 0u)

public data class INTERACTION_ARGUMENTS_MANIPULATION(
    public var delta: MANIPULATION_TRANSFORM = MANIPULATION_TRANSFORM(),
    public var cumulative: MANIPULATION_TRANSFORM = MANIPULATION_TRANSFORM(),
    public var velocity: MANIPULATION_VELOCITY = MANIPULATION_VELOCITY(),
    public var railsState: MANIPULATION_RAILS_STATE = 0,
)

public data class INTERACTION_ARGUMENTS_TAP(public var count: UInt = 0u)

public data class INTERACTION_CONTEXT_CONFIGURATION(public var interactionId: INTERACTION_ID = 0, public var enable: INTERACTION_CONFIGURATION_FLAGS = 0u)

public data class INTERACTION_CONTEXT_OUTPUT(
    public var interactionId: INTERACTION_ID = 0,
    public var interactionFlags: INTERACTION_FLAGS = 0u,
    public var inputType: WindowsAndMessaging.POINTER_INPUT_TYPE = WindowsAndMessaging.POINTER_INPUT_TYPE(),
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var arguments: INTERACTION_CONTEXT_OUTPUT_0 = INTERACTION_CONTEXT_OUTPUT_0(),
)

public data class INTERACTION_CONTEXT_OUTPUT_0(
    public var manipulation: INTERACTION_ARGUMENTS_MANIPULATION = INTERACTION_ARGUMENTS_MANIPULATION(),
    public var tap: INTERACTION_ARGUMENTS_TAP = INTERACTION_ARGUMENTS_TAP(),
    public var crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE = INTERACTION_ARGUMENTS_CROSS_SLIDE(),
)

public data class INTERACTION_CONTEXT_OUTPUT2(
    public var interactionId: INTERACTION_ID = 0,
    public var interactionFlags: INTERACTION_FLAGS = 0u,
    public var inputType: WindowsAndMessaging.POINTER_INPUT_TYPE = WindowsAndMessaging.POINTER_INPUT_TYPE(),
    public var contactCount: UInt = 0u,
    public var currentContactCount: UInt = 0u,
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var arguments: INTERACTION_CONTEXT_OUTPUT2_0 = INTERACTION_CONTEXT_OUTPUT2_0(),
)

public data class INTERACTION_CONTEXT_OUTPUT2_0(
    public var manipulation: INTERACTION_ARGUMENTS_MANIPULATION = INTERACTION_ARGUMENTS_MANIPULATION(),
    public var tap: INTERACTION_ARGUMENTS_TAP = INTERACTION_ARGUMENTS_TAP(),
    public var crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE = INTERACTION_ARGUMENTS_CROSS_SLIDE(),
)

public data class MANIPULATION_TRANSFORM(
    public var translationX: Float = 0.0f,
    public var translationY: Float = 0.0f,
    public var scale: Float = 0.0f,
    public var expansion: Float = 0.0f,
    public var rotation: Float = 0.0f,
)

public data class MANIPULATION_VELOCITY(
    public var velocityX: Float = 0.0f,
    public var velocityY: Float = 0.0f,
    public var velocityExpansion: Float = 0.0f,
    public var velocityAngular: Float = 0.0f,
)
