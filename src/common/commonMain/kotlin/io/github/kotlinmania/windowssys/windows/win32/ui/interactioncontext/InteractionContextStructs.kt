package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

public data class CrossSlideParameter(
    public var threshold: CrossSlideThreshold = 0,
    public var distance: Float = 0.0f,
)

public data class InteractionArgumentsCrossSlide(
    public var flags: CrossSlideFlags = 0u,
)

public data class InteractionArgumentsManipulation(
    public var delta: ManipulationTransform = ManipulationTransform(),
    public var cumulative: ManipulationTransform = ManipulationTransform(),
    public var velocity: ManipulationVelocity = ManipulationVelocity(),
    public var railsState: ManipulationRailsState = 0,
)

public data class InteractionArgumentsTap(
    public var count: UInt = 0u,
)

public data class InteractionContextConfiguration(
    public var interactionId: InteractionId = 0,
    public var enable: InteractionConfigurationFlags = 0u,
)

public data class InteractionContextOutput(
    public var interactionId: InteractionId = 0,
    public var interactionFlags: InteractionFlags = 0u,
    public var inputType: PointerInputType = 0,
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var arguments: InteractionContextOutput0 = InteractionContextOutput0(),
)

public data class InteractionContextOutput0(
    public var manipulation: InteractionArgumentsManipulation = InteractionArgumentsManipulation(),
    public var tap: InteractionArgumentsTap = InteractionArgumentsTap(),
    public var crossSlide: InteractionArgumentsCrossSlide = InteractionArgumentsCrossSlide(),
)

public data class InteractionContextOutput2(
    public var interactionId: InteractionId = 0,
    public var interactionFlags: InteractionFlags = 0u,
    public var inputType: PointerInputType = 0,
    public var contactCount: UInt = 0u,
    public var currentContactCount: UInt = 0u,
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var arguments: InteractionContextOutput20 = InteractionContextOutput20(),
)

public data class InteractionContextOutput20(
    public var manipulation: InteractionArgumentsManipulation = InteractionArgumentsManipulation(),
    public var tap: InteractionArgumentsTap = InteractionArgumentsTap(),
    public var crossSlide: InteractionArgumentsCrossSlide = InteractionArgumentsCrossSlide(),
)

public data class ManipulationTransform(
    public var translationX: Float = 0.0f,
    public var translationY: Float = 0.0f,
    public var scale: Float = 0.0f,
    public var expansion: Float = 0.0f,
    public var rotation: Float = 0.0f,
)

public data class ManipulationVelocity(
    public var velocityX: Float = 0.0f,
    public var velocityY: Float = 0.0f,
    public var velocityExpansion: Float = 0.0f,
    public var velocityAngular: Float = 0.0f,
)
