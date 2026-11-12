package io.github.kotlinmania.windowssys.windows.win32.ui.interactioncontext

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

public data class CrossSlideParameter(
    public var threshold: CrossSlideThreshold = 0,
    public var distance: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrossSlideParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CrossSlideParameter> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CrossSlideParameter =
                    CrossSlideParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CrossSlideParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.threshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.distance)
                }
            }
    }
}

public data class InteractionArgumentsCrossSlide(
    public var flags: CrossSlideFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsCrossSlide> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsCrossSlide> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InteractionArgumentsCrossSlide =
                    InteractionArgumentsCrossSlide(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InteractionArgumentsCrossSlide) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class InteractionArgumentsManipulation(
    public var delta: ManipulationTransform = ManipulationTransform(),
    public var cumulative: ManipulationTransform = ManipulationTransform(),
    public var velocity: ManipulationVelocity = ManipulationVelocity(),
    public var railsState: ManipulationRailsState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsManipulation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsManipulation> {
                override val sizeBytes: Long = 60L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InteractionArgumentsManipulation =
                    InteractionArgumentsManipulation(
                        (ManipulationTransform.typeLayout()).readNative(addr),
                        (ManipulationTransform.typeLayout()).readNative(addr + 20L),
                        (ManipulationVelocity.typeLayout()).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: InteractionArgumentsManipulation) {
                    (ManipulationTransform.typeLayout()).writeNative(addr, value.delta)
                    (ManipulationTransform.typeLayout()).writeNative(addr + 20L, value.cumulative)
                    (ManipulationVelocity.typeLayout()).writeNative(addr + 40L, value.velocity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.railsState)
                }
            }
    }
}

public data class InteractionArgumentsTap(
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsTap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionArgumentsTap> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InteractionArgumentsTap =
                    InteractionArgumentsTap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InteractionArgumentsTap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                }
            }
    }
}

public data class InteractionContextConfiguration(
    public var interactionId: InteractionId = 0,
    public var enable: InteractionConfigurationFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionContextConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InteractionContextConfiguration> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InteractionContextConfiguration =
                    InteractionContextConfiguration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InteractionContextConfiguration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.interactionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.enable)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ManipulationTransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ManipulationTransform> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ManipulationTransform =
                    ManipulationTransform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ManipulationTransform) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.translationX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.translationY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.scale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.expansion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.rotation)
                }
            }
    }
}

public data class ManipulationVelocity(
    public var velocityX: Float = 0.0f,
    public var velocityY: Float = 0.0f,
    public var velocityExpansion: Float = 0.0f,
    public var velocityAngular: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ManipulationVelocity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ManipulationVelocity> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ManipulationVelocity =
                    ManipulationVelocity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ManipulationVelocity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.velocityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.velocityY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.velocityExpansion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.velocityAngular)
                }
            }
    }
}
