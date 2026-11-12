@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size

public class Ksrelativeevent0 internal constructor(
    objectHandleCtorArg: Handle,
    objectPointerCtorArg: MutPtr<CVoid>,
) {
    public var objectHandle: Handle = objectHandleCtorArg
        internal set

    public var objectPointer: MutPtr<CVoid> = objectPointerCtorArg
        internal set

    public constructor() : this(
        objectHandleCtorArg = MutPtr(0L),
        objectPointerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.objectHandle

    public operator fun component2(): MutPtr<CVoid> = this.objectPointer

    public fun copy(objectHandle: Handle = this.objectHandle, objectPointer: MutPtr<CVoid> = this.objectPointer): Ksrelativeevent0 = Ksrelativeevent0(objectHandleCtorArg = objectHandle, objectPointerCtorArg = objectPointer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksrelativeevent0) return false
        if (this.objectHandle != other.objectHandle) return false
        if (this.objectPointer != other.objectPointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectHandle.hashCode()
        result = 31 * result + this.objectPointer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectHandle: Handle = MutPtr(0L),
            objectPointer: MutPtr<CVoid> = MutPtr(0L),
        ): Ksrelativeevent0 =
            Ksrelativeevent0(
                objectHandleCtorArg = objectHandle,
                objectPointerCtorArg = objectPointer,
            )
    }
}

public data class Ksresolution(
    public var granularity: Long = 0L,
    public var error: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksresolution> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksresolution> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksresolution =
                    Ksresolution(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ksresolution) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.granularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.error)
                }
            }
    }
}

public class KsrtaudioBuffer internal constructor(
    bufferAddressCtorArg: MutPtr<CVoid>,
    public var actualBufferSize: UInt,
    public var callMemoryBarrier: Bool,
) {
    public var bufferAddress: MutPtr<CVoid> = bufferAddressCtorArg
        internal set

    public constructor() : this(
        bufferAddressCtorArg = MutPtr(0L),
        actualBufferSize = 0u,
        callMemoryBarrier = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.bufferAddress

    public operator fun component2(): UInt = this.actualBufferSize

    public operator fun component3(): Bool = this.callMemoryBarrier

    public fun copy(bufferAddress: MutPtr<CVoid> = this.bufferAddress, actualBufferSize: UInt = this.actualBufferSize, callMemoryBarrier: Bool = this.callMemoryBarrier): KsrtaudioBuffer = KsrtaudioBuffer(bufferAddressCtorArg = bufferAddress, actualBufferSize = actualBufferSize, callMemoryBarrier = callMemoryBarrier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioBuffer) return false
        if (this.bufferAddress != other.bufferAddress) return false
        if (this.actualBufferSize != other.actualBufferSize) return false
        if (this.callMemoryBarrier != other.callMemoryBarrier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferAddress.hashCode()
        result = 31 * result + this.actualBufferSize.hashCode()
        result = 31 * result + this.callMemoryBarrier.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsrtaudioBuffer =
                    KsrtaudioBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.bufferAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.actualBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.callMemoryBarrier)
                }
            }

        public operator fun invoke(
            bufferAddress: MutPtr<CVoid> = MutPtr(0L),
            actualBufferSize: UInt = 0u,
            callMemoryBarrier: Bool = 0,
        ): KsrtaudioBuffer =
            KsrtaudioBuffer(
                bufferAddressCtorArg = bufferAddress,
                actualBufferSize = actualBufferSize,
                callMemoryBarrier = callMemoryBarrier,
            )
    }
}

public data class KsrtaudioBuffer32(
    public var bufferAddress: UInt = 0u,
    public var actualBufferSize: UInt = 0u,
    public var callMemoryBarrier: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioBuffer32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioBuffer32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsrtaudioBuffer32 =
                    KsrtaudioBuffer32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioBuffer32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bufferAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.actualBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.callMemoryBarrier)
                }
            }
    }
}

public class KsrtaudioBufferProperty internal constructor(
    public var property: Ksidentifier,
    baseAddressCtorArg: MutPtr<CVoid>,
    public var requestedBufferSize: UInt,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        baseAddressCtorArg = MutPtr(0L),
        requestedBufferSize = 0u,
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): MutPtr<CVoid> = this.baseAddress

    public operator fun component3(): UInt = this.requestedBufferSize

    public fun copy(property: Ksidentifier = this.property, baseAddress: MutPtr<CVoid> = this.baseAddress, requestedBufferSize: UInt = this.requestedBufferSize): KsrtaudioBufferProperty = KsrtaudioBufferProperty(property = property, baseAddressCtorArg = baseAddress, requestedBufferSize = requestedBufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioBufferProperty) return false
        if (this.property != other.property) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.requestedBufferSize != other.requestedBufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.baseAddress.hashCode()
        result = 31 * result + this.requestedBufferSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
            requestedBufferSize: UInt = 0u,
        ): KsrtaudioBufferProperty =
            KsrtaudioBufferProperty(
                property = property,
                baseAddressCtorArg = baseAddress,
                requestedBufferSize = requestedBufferSize,
            )
    }
}

public data class KsrtaudioBufferProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
    public var requestedBufferSize: UInt = 0u,
)

public class KsrtaudioBufferPropertyWithNotification internal constructor(
    public var property: Ksidentifier,
    baseAddressCtorArg: MutPtr<CVoid>,
    public var requestedBufferSize: UInt,
    public var notificationCount: UInt,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        baseAddressCtorArg = MutPtr(0L),
        requestedBufferSize = 0u,
        notificationCount = 0u,
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): MutPtr<CVoid> = this.baseAddress

    public operator fun component3(): UInt = this.requestedBufferSize

    public operator fun component4(): UInt = this.notificationCount

    public fun copy(property: Ksidentifier = this.property, baseAddress: MutPtr<CVoid> = this.baseAddress, requestedBufferSize: UInt = this.requestedBufferSize, notificationCount: UInt = this.notificationCount): KsrtaudioBufferPropertyWithNotification = KsrtaudioBufferPropertyWithNotification(property = property, baseAddressCtorArg = baseAddress, requestedBufferSize = requestedBufferSize, notificationCount = notificationCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioBufferPropertyWithNotification) return false
        if (this.property != other.property) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.requestedBufferSize != other.requestedBufferSize) return false
        if (this.notificationCount != other.notificationCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.baseAddress.hashCode()
        result = 31 * result + this.requestedBufferSize.hashCode()
        result = 31 * result + this.notificationCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
            requestedBufferSize: UInt = 0u,
            notificationCount: UInt = 0u,
        ): KsrtaudioBufferPropertyWithNotification =
            KsrtaudioBufferPropertyWithNotification(
                property = property,
                baseAddressCtorArg = baseAddress,
                requestedBufferSize = requestedBufferSize,
                notificationCount = notificationCount,
            )
    }
}

public data class KsrtaudioBufferPropertyWithNotification32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
    public var requestedBufferSize: UInt = 0u,
    public var notificationCount: UInt = 0u,
)

public data class KsrtaudioGetreadpacketInfo(
    public var packetNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var performanceCounterValue: ULong = 0uL,
    public var moreData: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioGetreadpacketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioGetreadpacketInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KsrtaudioGetreadpacketInfo =
                    KsrtaudioGetreadpacketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioGetreadpacketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packetNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.performanceCounterValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.moreData)
                }
            }
    }
}

public data class KsrtaudioHwlatency(
    public var fifoSize: UInt = 0u,
    public var chipsetDelay: UInt = 0u,
    public var codecDelay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwlatency> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwlatency> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsrtaudioHwlatency =
                    KsrtaudioHwlatency(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioHwlatency) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fifoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.chipsetDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.codecDelay)
                }
            }
    }
}

public class KsrtaudioHwregister internal constructor(
    registerCtorArg: MutPtr<CVoid>,
    public var width: UInt,
    public var numerator: ULong,
    public var denominator: ULong,
    public var accuracy: UInt,
) {
    public var register: MutPtr<CVoid> = registerCtorArg
        internal set

    public constructor() : this(
        registerCtorArg = MutPtr(0L),
        width = 0u,
        numerator = 0uL,
        denominator = 0uL,
        accuracy = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.register

    public operator fun component2(): UInt = this.width

    public operator fun component3(): ULong = this.numerator

    public operator fun component4(): ULong = this.denominator

    public operator fun component5(): UInt = this.accuracy

    public fun copy(register: MutPtr<CVoid> = this.register, width: UInt = this.width, numerator: ULong = this.numerator, denominator: ULong = this.denominator, accuracy: UInt = this.accuracy): KsrtaudioHwregister = KsrtaudioHwregister(registerCtorArg = register, width = width, numerator = numerator, denominator = denominator, accuracy = accuracy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioHwregister) return false
        if (this.register != other.register) return false
        if (this.width != other.width) return false
        if (this.numerator != other.numerator) return false
        if (this.denominator != other.denominator) return false
        if (this.accuracy != other.accuracy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.register.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.numerator.hashCode()
        result = 31 * result + this.denominator.hashCode()
        result = 31 * result + this.accuracy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwregister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwregister> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KsrtaudioHwregister =
                    KsrtaudioHwregister(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioHwregister) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.denominator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.accuracy)
                }
            }

        public operator fun invoke(
            register: MutPtr<CVoid> = MutPtr(0L),
            width: UInt = 0u,
            numerator: ULong = 0uL,
            denominator: ULong = 0uL,
            accuracy: UInt = 0u,
        ): KsrtaudioHwregister =
            KsrtaudioHwregister(
                registerCtorArg = register,
                width = width,
                numerator = numerator,
                denominator = denominator,
                accuracy = accuracy,
            )
    }
}

public data class KsrtaudioHwregister32(
    public var register: UInt = 0u,
    public var width: UInt = 0u,
    public var numerator: ULong = 0uL,
    public var denominator: ULong = 0uL,
    public var accuracy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwregister32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioHwregister32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KsrtaudioHwregister32 =
                    KsrtaudioHwregister32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioHwregister32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.denominator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.accuracy)
                }
            }
    }
}

public class KsrtaudioHwregisterProperty internal constructor(
    public var property: Ksidentifier,
    baseAddressCtorArg: MutPtr<CVoid>,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        baseAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): MutPtr<CVoid> = this.baseAddress

    public fun copy(property: Ksidentifier = this.property, baseAddress: MutPtr<CVoid> = this.baseAddress): KsrtaudioHwregisterProperty = KsrtaudioHwregisterProperty(property = property, baseAddressCtorArg = baseAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioHwregisterProperty) return false
        if (this.property != other.property) return false
        if (this.baseAddress != other.baseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.baseAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
        ): KsrtaudioHwregisterProperty =
            KsrtaudioHwregisterProperty(
                property = property,
                baseAddressCtorArg = baseAddress,
            )
    }
}

public data class KsrtaudioHwregisterProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var baseAddress: UInt = 0u,
)

public class KsrtaudioNotificationEventProperty internal constructor(
    public var property: Ksidentifier,
    notificationEventCtorArg: Handle,
) {
    public var notificationEvent: Handle = notificationEventCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        notificationEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): Handle = this.notificationEvent

    public fun copy(property: Ksidentifier = this.property, notificationEvent: Handle = this.notificationEvent): KsrtaudioNotificationEventProperty = KsrtaudioNotificationEventProperty(property = property, notificationEventCtorArg = notificationEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioNotificationEventProperty) return false
        if (this.property != other.property) return false
        if (this.notificationEvent != other.notificationEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.notificationEvent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            notificationEvent: Handle = MutPtr(0L),
        ): KsrtaudioNotificationEventProperty =
            KsrtaudioNotificationEventProperty(
                property = property,
                notificationEventCtorArg = notificationEvent,
            )
    }
}

public data class KsrtaudioNotificationEventProperty32(
    public var property: Ksidentifier = Ksidentifier(),
    public var notificationEvent: UInt = 0u,
)

public class KsrtaudioPacketvregister internal constructor(
    completedPacketCountCtorArg: MutPtr<ULong>,
    completedPacketQPCCtorArg: MutPtr<ULong>,
    completedPacketHashCtorArg: MutPtr<ULong>,
) {
    public var completedPacketCount: MutPtr<ULong> = completedPacketCountCtorArg
        internal set

    public var completedPacketQPC: MutPtr<ULong> = completedPacketQPCCtorArg
        internal set

    public var completedPacketHash: MutPtr<ULong> = completedPacketHashCtorArg
        internal set

    public constructor() : this(
        completedPacketCountCtorArg = MutPtr(0L),
        completedPacketQPCCtorArg = MutPtr(0L),
        completedPacketHashCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ULong> = this.completedPacketCount

    public operator fun component2(): MutPtr<ULong> = this.completedPacketQPC

    public operator fun component3(): MutPtr<ULong> = this.completedPacketHash

    public fun copy(completedPacketCount: MutPtr<ULong> = this.completedPacketCount, completedPacketQPC: MutPtr<ULong> = this.completedPacketQPC, completedPacketHash: MutPtr<ULong> = this.completedPacketHash): KsrtaudioPacketvregister = KsrtaudioPacketvregister(completedPacketCountCtorArg = completedPacketCount, completedPacketQPCCtorArg = completedPacketQPC, completedPacketHashCtorArg = completedPacketHash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioPacketvregister) return false
        if (this.completedPacketCount != other.completedPacketCount) return false
        if (this.completedPacketQPC != other.completedPacketQPC) return false
        if (this.completedPacketHash != other.completedPacketHash) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completedPacketCount.hashCode()
        result = 31 * result + this.completedPacketQPC.hashCode()
        result = 31 * result + this.completedPacketHash.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioPacketvregister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioPacketvregister> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KsrtaudioPacketvregister =
                    KsrtaudioPacketvregister(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioPacketvregister) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr, value.completedPacketCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 8L, value.completedPacketQPC)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 16L, value.completedPacketHash)
                }
            }

        public operator fun invoke(
            completedPacketCount: MutPtr<ULong> = MutPtr(0L),
            completedPacketQPC: MutPtr<ULong> = MutPtr(0L),
            completedPacketHash: MutPtr<ULong> = MutPtr(0L),
        ): KsrtaudioPacketvregister =
            KsrtaudioPacketvregister(
                completedPacketCountCtorArg = completedPacketCount,
                completedPacketQPCCtorArg = completedPacketQPC,
                completedPacketHashCtorArg = completedPacketHash,
            )
    }
}

public class KsrtaudioPacketvregisterProperty internal constructor(
    public var property: Ksidentifier,
    baseAddressCtorArg: MutPtr<CVoid>,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        baseAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): MutPtr<CVoid> = this.baseAddress

    public fun copy(property: Ksidentifier = this.property, baseAddress: MutPtr<CVoid> = this.baseAddress): KsrtaudioPacketvregisterProperty = KsrtaudioPacketvregisterProperty(property = property, baseAddressCtorArg = baseAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsrtaudioPacketvregisterProperty) return false
        if (this.property != other.property) return false
        if (this.baseAddress != other.baseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.baseAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
        ): KsrtaudioPacketvregisterProperty =
            KsrtaudioPacketvregisterProperty(
                property = property,
                baseAddressCtorArg = baseAddress,
            )
    }
}

public data class KsrtaudioSetwritepacketInfo(
    public var packetNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var eosPacketLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioSetwritepacketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsrtaudioSetwritepacketInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsrtaudioSetwritepacketInfo =
                    KsrtaudioSetwritepacketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsrtaudioSetwritepacketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packetNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eosPacketLength)
                }
            }
    }
}

public data class Kssounddetectorproperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var eventId: Guid = Guid(),
)

public data class KsstreamallocatorStatus(
    public var framing: KsallocatorFraming = KsallocatorFraming(),
    public var allocatedFrames: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsstreamallocatorStatusEx(
    public var framing: KsallocatorFramingEx = KsallocatorFramingEx(),
    public var allocatedFrames: UInt = 0u,
    public var reserved: UInt = 0u,
)

public class KsstreamHeader internal constructor(
    public var size: UInt,
    public var typeSpecificFlags: UInt,
    public var presentationTime: Kstime,
    public var duration: Long,
    public var frameExtent: UInt,
    public var dataUsed: UInt,
    dataCtorArg: MutPtr<CVoid>,
    public var optionsFlags: UInt,
    public var reserved: UInt,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        typeSpecificFlags = 0u,
        presentationTime = Kstime(),
        duration = 0L,
        frameExtent = 0u,
        dataUsed = 0u,
        dataCtorArg = MutPtr(0L),
        optionsFlags = 0u,
        reserved = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.typeSpecificFlags

    public operator fun component3(): Kstime = this.presentationTime

    public operator fun component4(): Long = this.duration

    public operator fun component5(): UInt = this.frameExtent

    public operator fun component6(): UInt = this.dataUsed

    public operator fun component7(): MutPtr<CVoid> = this.data

    public operator fun component8(): UInt = this.optionsFlags

    public operator fun component9(): UInt = this.reserved

    public fun copy(size: UInt = this.size, typeSpecificFlags: UInt = this.typeSpecificFlags, presentationTime: Kstime = this.presentationTime, duration: Long = this.duration, frameExtent: UInt = this.frameExtent, dataUsed: UInt = this.dataUsed, data: MutPtr<CVoid> = this.data, optionsFlags: UInt = this.optionsFlags, reserved: UInt = this.reserved): KsstreamHeader = KsstreamHeader(size = size, typeSpecificFlags = typeSpecificFlags, presentationTime = presentationTime, duration = duration, frameExtent = frameExtent, dataUsed = dataUsed, dataCtorArg = data, optionsFlags = optionsFlags, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsstreamHeader) return false
        if (this.size != other.size) return false
        if (this.typeSpecificFlags != other.typeSpecificFlags) return false
        if (this.presentationTime != other.presentationTime) return false
        if (this.duration != other.duration) return false
        if (this.frameExtent != other.frameExtent) return false
        if (this.dataUsed != other.dataUsed) return false
        if (this.data != other.data) return false
        if (this.optionsFlags != other.optionsFlags) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.typeSpecificFlags.hashCode()
        result = 31 * result + this.presentationTime.hashCode()
        result = 31 * result + this.duration.hashCode()
        result = 31 * result + this.frameExtent.hashCode()
        result = 31 * result + this.dataUsed.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.optionsFlags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): KsstreamHeader =
                    KsstreamHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (Kstime.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: KsstreamHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.typeSpecificFlags)
                    (Kstime.typeLayout()).writeNative(addr + 8L, value.presentationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.duration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.frameExtent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.optionsFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.reserved)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            typeSpecificFlags: UInt = 0u,
            presentationTime: Kstime = Kstime(),
            duration: Long = 0L,
            frameExtent: UInt = 0u,
            dataUsed: UInt = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            optionsFlags: UInt = 0u,
            reserved: UInt = 0u,
        ): KsstreamHeader =
            KsstreamHeader(
                size = size,
                typeSpecificFlags = typeSpecificFlags,
                presentationTime = presentationTime,
                duration = duration,
                frameExtent = frameExtent,
                dataUsed = dataUsed,
                dataCtorArg = data,
                optionsFlags = optionsFlags,
                reserved = reserved,
            )
    }
}

public class KsstreamMetadataInfo internal constructor(
    public var bufferSize: UInt,
    public var usedSize: UInt,
    dataCtorArg: MutPtr<CVoid>,
    systemVaCtorArg: MutPtr<CVoid>,
    public var flags: UInt,
    public var reserved: UInt,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public var systemVa: MutPtr<CVoid> = systemVaCtorArg
        internal set

    public constructor() : this(
        bufferSize = 0u,
        usedSize = 0u,
        dataCtorArg = MutPtr(0L),
        systemVaCtorArg = MutPtr(0L),
        flags = 0u,
        reserved = 0u,
    )

    public operator fun component1(): UInt = this.bufferSize

    public operator fun component2(): UInt = this.usedSize

    public operator fun component3(): MutPtr<CVoid> = this.data

    public operator fun component4(): MutPtr<CVoid> = this.systemVa

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.reserved

    public fun copy(bufferSize: UInt = this.bufferSize, usedSize: UInt = this.usedSize, data: MutPtr<CVoid> = this.data, systemVa: MutPtr<CVoid> = this.systemVa, flags: UInt = this.flags, reserved: UInt = this.reserved): KsstreamMetadataInfo = KsstreamMetadataInfo(bufferSize = bufferSize, usedSize = usedSize, dataCtorArg = data, systemVaCtorArg = systemVa, flags = flags, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsstreamMetadataInfo) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.usedSize != other.usedSize) return false
        if (this.data != other.data) return false
        if (this.systemVa != other.systemVa) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferSize.hashCode()
        result = 31 * result + this.usedSize.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.systemVa.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamMetadataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamMetadataInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KsstreamMetadataInfo =
                    KsstreamMetadataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: KsstreamMetadataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.usedSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.systemVa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved)
                }
            }

        public operator fun invoke(
            bufferSize: UInt = 0u,
            usedSize: UInt = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            systemVa: MutPtr<CVoid> = MutPtr(0L),
            flags: UInt = 0u,
            reserved: UInt = 0u,
        ): KsstreamMetadataInfo =
            KsstreamMetadataInfo(
                bufferSize = bufferSize,
                usedSize = usedSize,
                dataCtorArg = data,
                systemVaCtorArg = systemVa,
                flags = flags,
                reserved = reserved,
            )
    }
}

public class KsstreamSegment internal constructor(
    ksInterfaceHandlerCtorArg: MutPtr<CVoid>,
    ksDataTypeHandlerCtorArg: MutPtr<CVoid>,
    public var ioOperation: Ksiooperation,
    completionEventCtorArg: Handle,
) {
    public var ksInterfaceHandler: MutPtr<CVoid> = ksInterfaceHandlerCtorArg
        internal set

    public var ksDataTypeHandler: MutPtr<CVoid> = ksDataTypeHandlerCtorArg
        internal set

    public var completionEvent: Handle = completionEventCtorArg
        internal set

    public constructor() : this(
        ksInterfaceHandlerCtorArg = MutPtr(0L),
        ksDataTypeHandlerCtorArg = MutPtr(0L),
        ioOperation = 0,
        completionEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ksInterfaceHandler

    public operator fun component2(): MutPtr<CVoid> = this.ksDataTypeHandler

    public operator fun component3(): Ksiooperation = this.ioOperation

    public operator fun component4(): Handle = this.completionEvent

    public fun copy(ksInterfaceHandler: MutPtr<CVoid> = this.ksInterfaceHandler, ksDataTypeHandler: MutPtr<CVoid> = this.ksDataTypeHandler, ioOperation: Ksiooperation = this.ioOperation, completionEvent: Handle = this.completionEvent): KsstreamSegment = KsstreamSegment(ksInterfaceHandlerCtorArg = ksInterfaceHandler, ksDataTypeHandlerCtorArg = ksDataTypeHandler, ioOperation = ioOperation, completionEventCtorArg = completionEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsstreamSegment) return false
        if (this.ksInterfaceHandler != other.ksInterfaceHandler) return false
        if (this.ksDataTypeHandler != other.ksDataTypeHandler) return false
        if (this.ioOperation != other.ioOperation) return false
        if (this.completionEvent != other.completionEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ksInterfaceHandler.hashCode()
        result = 31 * result + this.ksDataTypeHandler.hashCode()
        result = 31 * result + this.ioOperation.hashCode()
        result = 31 * result + this.completionEvent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ksInterfaceHandler: MutPtr<CVoid> = MutPtr(0L),
            ksDataTypeHandler: MutPtr<CVoid> = MutPtr(0L),
            ioOperation: Ksiooperation = 0,
            completionEvent: Handle = MutPtr(0L),
        ): KsstreamSegment =
            KsstreamSegment(
                ksInterfaceHandlerCtorArg = ksInterfaceHandler,
                ksDataTypeHandlerCtorArg = ksDataTypeHandler,
                ioOperation = ioOperation,
                completionEventCtorArg = completionEvent,
            )
    }
}

public data class KsstreamUvcMetadata(
    public var startOfFrameTimestamp: KsstreamUvcMetadatatypeTimestamp = KsstreamUvcMetadatatypeTimestamp(),
    public var endOfFrameTimestamp: KsstreamUvcMetadatatypeTimestamp = KsstreamUvcMetadatatypeTimestamp(),
)

public data class KsstreamUvcMetadatatypeTimestamp(
    public var presentationTimeStamp: UInt = 0u,
    public var sourceClockReference: UInt = 0u,
    public var anonymous: KsstreamUvcMetadatatypeTimestamp0 = KsstreamUvcMetadatatypeTimestamp0(),
    public var reserved0: UShort = 0u,
    public var reserved1: UInt = 0u,
)

public data class KsstreamUvcMetadatatypeTimestamp0(
    public var anonymous: KsstreamUvcMetadatatypeTimestamp00 = KsstreamUvcMetadatatypeTimestamp00(),
    public var sCRToken: UShort = 0u,
)

public data class KsstreamUvcMetadatatypeTimestamp00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamUvcMetadatatypeTimestamp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsstreamUvcMetadatatypeTimestamp00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): KsstreamUvcMetadatatypeTimestamp00 =
                    KsstreamUvcMetadatatypeTimestamp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsstreamUvcMetadatatypeTimestamp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KstelephonyCallcontrol(
    public var callType: TelephonyCalltype = 0,
    public var callControlOp: TelephonyCallcontrolop = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyCallcontrol> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyCallcontrol> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KstelephonyCallcontrol =
                    KstelephonyCallcontrol(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KstelephonyCallcontrol) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.callType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.callControlOp)
                }
            }
    }
}

public data class KstelephonyCallinfo(
    public var callType: TelephonyCalltype = 0,
    public var callState: TelephonyCallstate = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyCallinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyCallinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KstelephonyCallinfo =
                    KstelephonyCallinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KstelephonyCallinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.callType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.callState)
                }
            }
    }
}

public data class KstelephonyProviderchange(
    public var callType: TelephonyCalltype = 0,
    public var providerChangeOp: TelephonyProviderchangeop = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyProviderchange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstelephonyProviderchange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KstelephonyProviderchange =
                    KstelephonyProviderchange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KstelephonyProviderchange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.callType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.providerChangeOp)
                }
            }
    }
}

public data class Kstime(
    public var time: Long = 0L,
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kstime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kstime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Kstime =
                    Kstime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Kstime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.denominator)
                }
            }
    }
}

public class Kstopology internal constructor(
    public var categoriesCount: UInt,
    categoriesCtorArg: ConstPtr<Guid>,
    public var topologyNodesCount: UInt,
    topologyNodesCtorArg: ConstPtr<Guid>,
    public var topologyConnectionsCount: UInt,
    topologyConnectionsCtorArg: ConstPtr<KstopologyConnection>,
    topologyNodesNamesCtorArg: ConstPtr<Guid>,
    public var reserved: UInt,
) {
    public var categories: ConstPtr<Guid> = categoriesCtorArg
        internal set

    public var topologyNodes: ConstPtr<Guid> = topologyNodesCtorArg
        internal set

    public var topologyConnections: ConstPtr<KstopologyConnection> = topologyConnectionsCtorArg
        internal set

    public var topologyNodesNames: ConstPtr<Guid> = topologyNodesNamesCtorArg
        internal set

    public constructor() : this(
        categoriesCount = 0u,
        categoriesCtorArg = ConstPtr(0L),
        topologyNodesCount = 0u,
        topologyNodesCtorArg = ConstPtr(0L),
        topologyConnectionsCount = 0u,
        topologyConnectionsCtorArg = ConstPtr(0L),
        topologyNodesNamesCtorArg = ConstPtr(0L),
        reserved = 0u,
    )

    public operator fun component1(): UInt = this.categoriesCount

    public operator fun component2(): ConstPtr<Guid> = this.categories

    public operator fun component3(): UInt = this.topologyNodesCount

    public operator fun component4(): ConstPtr<Guid> = this.topologyNodes

    public operator fun component5(): UInt = this.topologyConnectionsCount

    public operator fun component6(): ConstPtr<KstopologyConnection> = this.topologyConnections

    public operator fun component7(): ConstPtr<Guid> = this.topologyNodesNames

    public operator fun component8(): UInt = this.reserved

    public fun copy(categoriesCount: UInt = this.categoriesCount, categories: ConstPtr<Guid> = this.categories, topologyNodesCount: UInt = this.topologyNodesCount, topologyNodes: ConstPtr<Guid> = this.topologyNodes, topologyConnectionsCount: UInt = this.topologyConnectionsCount, topologyConnections: ConstPtr<KstopologyConnection> = this.topologyConnections, topologyNodesNames: ConstPtr<Guid> = this.topologyNodesNames, reserved: UInt = this.reserved): Kstopology = Kstopology(categoriesCount = categoriesCount, categoriesCtorArg = categories, topologyNodesCount = topologyNodesCount, topologyNodesCtorArg = topologyNodes, topologyConnectionsCount = topologyConnectionsCount, topologyConnectionsCtorArg = topologyConnections, topologyNodesNamesCtorArg = topologyNodesNames, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kstopology) return false
        if (this.categoriesCount != other.categoriesCount) return false
        if (this.categories != other.categories) return false
        if (this.topologyNodesCount != other.topologyNodesCount) return false
        if (this.topologyNodes != other.topologyNodes) return false
        if (this.topologyConnectionsCount != other.topologyConnectionsCount) return false
        if (this.topologyConnections != other.topologyConnections) return false
        if (this.topologyNodesNames != other.topologyNodesNames) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.categoriesCount.hashCode()
        result = 31 * result + this.categories.hashCode()
        result = 31 * result + this.topologyNodesCount.hashCode()
        result = 31 * result + this.topologyNodes.hashCode()
        result = 31 * result + this.topologyConnectionsCount.hashCode()
        result = 31 * result + this.topologyConnections.hashCode()
        result = 31 * result + this.topologyNodesNames.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kstopology> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kstopology> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Kstopology =
                    Kstopology(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<KstopologyConnection>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Kstopology) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.categoriesCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.categories)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.topologyNodesCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr + 24L, value.topologyNodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.topologyConnectionsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<KstopologyConnection>(64)
                    ).writeNative(addr + 40L, value.topologyConnections)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr + 48L, value.topologyNodesNames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.reserved)
                }
            }

        public operator fun invoke(
            categoriesCount: UInt = 0u,
            categories: ConstPtr<Guid> = ConstPtr(0L),
            topologyNodesCount: UInt = 0u,
            topologyNodes: ConstPtr<Guid> = ConstPtr(0L),
            topologyConnectionsCount: UInt = 0u,
            topologyConnections: ConstPtr<KstopologyConnection> = ConstPtr(0L),
            topologyNodesNames: ConstPtr<Guid> = ConstPtr(0L),
            reserved: UInt = 0u,
        ): Kstopology =
            Kstopology(
                categoriesCount = categoriesCount,
                categoriesCtorArg = categories,
                topologyNodesCount = topologyNodesCount,
                topologyNodesCtorArg = topologyNodes,
                topologyConnectionsCount = topologyConnectionsCount,
                topologyConnectionsCtorArg = topologyConnections,
                topologyNodesNamesCtorArg = topologyNodesNames,
                reserved = reserved,
            )
    }
}

public data class KstopologyConnection(
    public var fromNode: UInt = 0u,
    public var fromNodePin: UInt = 0u,
    public var toNode: UInt = 0u,
    public var toNodePin: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyConnection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyConnection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KstopologyConnection =
                    KstopologyConnection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KstopologyConnection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fromNode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fromNodePin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.toNode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.toNodePin)
                }
            }
    }
}

public data class KstopologyEndpointid(
    public var topologyName: UShortArray = UShortArray(260),
    public var pinId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KstopologyEndpointid) return false
        if (!this.topologyName.contentEquals(other.topologyName)) return false
        if (this.pinId != other.pinId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.topologyName.contentHashCode()
        result = 31 * result + this.pinId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyEndpointid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyEndpointid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): KstopologyEndpointid =
                    KstopologyEndpointid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: KstopologyEndpointid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.topologyName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.pinId)
                }
            }
    }
}

public data class KstopologyEndpointidpair(
    public var renderEndpoint: KstopologyEndpointid = KstopologyEndpointid(),
    public var captureEndpoint: KstopologyEndpointid = KstopologyEndpointid(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyEndpointidpair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KstopologyEndpointidpair> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1048L
                override fun readNative(addr: Long): KstopologyEndpointidpair =
                    KstopologyEndpointidpair(
                        (KstopologyEndpointid.typeLayout()).readNative(addr),
                        (KstopologyEndpointid.typeLayout()).readNative(addr + 524L),
                    )
                override fun writeNative(addr: Long, value: KstopologyEndpointidpair) {
                    (KstopologyEndpointid.typeLayout()).writeNative(addr, value.renderEndpoint)
                    (KstopologyEndpointid.typeLayout()).writeNative(addr + 524L, value.captureEndpoint)
                }
            }
    }
}

public data class Ksvpmaxpixelrate(
    public var size: KsAmvpsize = KsAmvpsize(),
    public var maxPixelsPerSecond: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksvpmaxpixelrate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksvpmaxpixelrate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksvpmaxpixelrate =
                    Ksvpmaxpixelrate(
                        (KsAmvpsize.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ksvpmaxpixelrate) {
                    (KsAmvpsize.typeLayout()).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxPixelsPerSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KsvpsizeProp(
    public var property: Ksidentifier = Ksidentifier(),
    public var size: KsAmvpsize = KsAmvpsize(),
)

public data class Ksvpsurfaceparams(
    public var dwPitch: UInt = 0u,
    public var dwXOrigin: UInt = 0u,
    public var dwYOrigin: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksvpsurfaceparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksvpsurfaceparams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Ksvpsurfaceparams =
                    Ksvpsurfaceparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ksvpsurfaceparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPitch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwXOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwYOrigin)
                }
            }
    }
}

public data class KswavetableWaveDesc(
    public var identifier: Ksidentifier = Ksidentifier(),
    public var size: UInt = 0u,
    public var looped: Bool = 0,
    public var loopPoint: UInt = 0u,
    public var inROM: Bool = 0,
    public var format: Ksdataformat = Ksdataformat(),
)

public class KswaveBuffer internal constructor(
    public var attributes: UInt,
    public var bufferSize: UInt,
    bufferAddressCtorArg: MutPtr<CVoid>,
) {
    public var bufferAddress: MutPtr<CVoid> = bufferAddressCtorArg
        internal set

    public constructor() : this(
        attributes = 0u,
        bufferSize = 0u,
        bufferAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.attributes

    public operator fun component2(): UInt = this.bufferSize

    public operator fun component3(): MutPtr<CVoid> = this.bufferAddress

    public fun copy(attributes: UInt = this.attributes, bufferSize: UInt = this.bufferSize, bufferAddress: MutPtr<CVoid> = this.bufferAddress): KswaveBuffer = KswaveBuffer(attributes = attributes, bufferSize = bufferSize, bufferAddressCtorArg = bufferAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KswaveBuffer) return false
        if (this.attributes != other.attributes) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.bufferAddress != other.bufferAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.attributes.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.bufferAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KswaveBuffer =
                    KswaveBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KswaveBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.bufferAddress)
                }
            }

        public operator fun invoke(
            attributes: UInt = 0u,
            bufferSize: UInt = 0u,
            bufferAddress: MutPtr<CVoid> = MutPtr(0L),
        ): KswaveBuffer =
            KswaveBuffer(
                attributes = attributes,
                bufferSize = bufferSize,
                bufferAddressCtorArg = bufferAddress,
            )
    }
}

public data class KswaveCompatcaps(
    public var ulDeviceType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveCompatcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveCompatcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KswaveCompatcaps =
                    KswaveCompatcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KswaveCompatcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulDeviceType)
                }
            }
    }
}

public data class KswaveInputCapabilities(
    public var maximumChannelsPerConnection: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
    public var totalConnections: UInt = 0u,
    public var activeConnections: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveInputCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveInputCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): KswaveInputCapabilities =
                    KswaveInputCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KswaveInputCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumChannelsPerConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minimumSampleFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumSampleFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.totalConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.activeConnections)
                }
            }
    }
}

public class KswaveOutputCapabilities(
    public var maximumChannelsPerConnection: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
    public var totalConnections: UInt = 0u,
    public var staticConnections: UInt = 0u,
    public var streamingConnections: UInt = 0u,
    public var activeConnections: UInt = 0u,
    public var activeStaticConnections: UInt = 0u,
    public var activeStreamingConnections: UInt = 0u,
    public var total3DConnections: UInt = 0u,
    public var static3DConnections: UInt = 0u,
    public var streaming3DConnections: UInt = 0u,
    public var active3DConnections: UInt = 0u,
    public var activeStatic3DConnections: UInt = 0u,
    public var activeStreaming3DConnections: UInt = 0u,
    public var totalSampleMemory: UInt = 0u,
    public var freeSampleMemory: UInt = 0u,
    public var largestFreeContiguousSampleMemory: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveOutputCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveOutputCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): KswaveOutputCapabilities =
                    KswaveOutputCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: KswaveOutputCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumChannelsPerConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minimumSampleFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumSampleFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.totalConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.staticConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.streamingConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.activeConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.activeStaticConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.activeStreamingConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.total3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.static3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.streaming3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.active3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.activeStatic3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.activeStreaming3DConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.totalSampleMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.freeSampleMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.largestFreeContiguousSampleMemory)
                }
            }
    }
}

public data class KswaveVolume(
    public var leftAttenuation: Int = 0,
    public var rightAttenuation: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveVolume> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KswaveVolume> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KswaveVolume =
                    KswaveVolume(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KswaveVolume) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.leftAttenuation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.rightAttenuation)
                }
            }
    }
}

public data class KsAmvpdatainfo(
    public var dwSize: UInt = 0u,
    public var dwMicrosecondsPerField: UInt = 0u,
    public var amvpDimInfo: KsAmvpdiminfo = KsAmvpdiminfo(),
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var bEnableDoubleClock: Bool = 0,
    public var bEnableVACT: Bool = 0,
    public var bDataIsInterlaced: Bool = 0,
    public var lHalfLinesOdd: Int = 0,
    public var bFieldPolarityInverted: Bool = 0,
    public var dwNumLinesInVREF: UInt = 0u,
    public var lHalfLinesEven: Int = 0,
    public var dwReserved1: UInt = 0u,
)

public data class KsAmvpdiminfo(
    public var dwFieldWidth: UInt = 0u,
    public var dwFieldHeight: UInt = 0u,
    public var dwVBIWidth: UInt = 0u,
    public var dwVBIHeight: UInt = 0u,
    public var rcValidRegion: Rect = Rect(),
)

public data class KsAmvpsize(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmvpsize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmvpsize> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsAmvpsize =
                    KsAmvpsize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsAmvpsize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHeight)
                }
            }
    }
}

public data class KsAmExactRateChange(
    public var outputZeroTime: Long = 0L,
    public var rate: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmExactRateChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmExactRateChange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsAmExactRateChange =
                    KsAmExactRateChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsAmExactRateChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.outputZeroTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rate)
                }
            }
    }
}

public data class KsAmSimpleRateChange(
    public var startTime: Long = 0L,
    public var rate: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmSimpleRateChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsAmSimpleRateChange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsAmSimpleRateChange =
                    KsAmSimpleRateChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsAmSimpleRateChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rate)
                }
            }
    }
}

public data class KsAnalogvideoinfo(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwActiveWidth: UInt = 0u,
    public var dwActiveHeight: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
)

public data class KsBitmapinfoheader(
    public var biSize: UInt = 0u,
    public var biWidth: Int = 0,
    public var biHeight: Int = 0,
    public var biPlanes: UShort = 0u,
    public var biBitCount: UShort = 0u,
    public var biCompression: UInt = 0u,
    public var biSizeImage: UInt = 0u,
    public var biXPelsPerMeter: Int = 0,
    public var biYPelsPerMeter: Int = 0,
    public var biClrUsed: UInt = 0u,
    public var biClrImportant: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsBitmapinfoheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsBitmapinfoheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KsBitmapinfoheader =
                    KsBitmapinfoheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: KsBitmapinfoheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.biSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.biWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.biHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.biPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.biBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.biCompression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.biSizeImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.biXPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.biYPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.biClrUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.biClrImportant)
                }
            }
    }
}

public data class KsColcon(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsColcon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsColcon> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsColcon =
                    KsColcon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KsColcon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bitfield3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield4)
                }
            }
    }
}

public data class KsCompression(
    public var ratioNumerator: UInt = 0u,
    public var ratioDenominator: UInt = 0u,
    public var ratioConstantMargin: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsCompression> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsCompression> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsCompression =
                    KsCompression(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsCompression) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ratioNumerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ratioDenominator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ratioConstantMargin)
                }
            }
    }
}

public data class KsCopyMacrovision(
    public var mACROVISIONLevel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsCopyMacrovision> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsCopyMacrovision> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsCopyMacrovision =
                    KsCopyMacrovision(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsCopyMacrovision) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mACROVISIONLevel)
                }
            }
    }
}

public data class KsDataformatH264videoinfo(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var h264VideoInfoHeader: KsH264videoinfo = KsH264videoinfo(),
)

public data class KsDataformatImageinfo(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var imageInfoHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsDataformatMpegvideoinfo2(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var mpegVideoInfoHeader2: KsMpegvideoinfo2 = KsMpegvideoinfo2(),
)

public data class KsDataformatVbiinfoheader(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
)

public data class KsDataformatVideoinfoheader(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfoHeader: KsVideoinfoheader = KsVideoinfoheader(),
)

public data class KsDataformatVideoinfoheader2(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfoHeader2: KsVideoinfoheader2 = KsVideoinfoheader2(),
)

public data class KsDataformatVideoinfoPalette(
    public var dataFormat: Ksdataformat = Ksdataformat(),
    public var videoInfo: KsVideoinfo = KsVideoinfo(),
)

public data class KsDatarangeAnalogvideo(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var analogVideoInfo: KsAnalogvideoinfo = KsAnalogvideoinfo(),
)

public data class KsDatarangeH264Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsH264videoinfo = KsH264videoinfo(),
)

public data class KsDatarangeImage(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var imageInfoHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsDatarangeMpeg1Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsMpeg1videoinfo = KsMpeg1videoinfo(),
)

public data class KsDatarangeMpeg2Video(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsMpegvideoinfo2 = KsMpegvideoinfo2(),
)

public data class KsDatarangeVideo(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsVideoinfoheader = KsVideoinfoheader(),
)

public data class KsDatarangeVideo2(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfoHeader: KsVideoinfoheader2 = KsVideoinfoheader2(),
)

public data class KsDatarangeVideoPalette(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var videoInfo: KsVideoinfo = KsVideoinfo(),
)

public data class KsDatarangeVideoVbi(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var bFixedSizeSamples: Bool = 0,
    public var bTemporalCompression: Bool = 0,
    public var streamDescriptionFlags: UInt = 0u,
    public var memoryAllocationFlags: UInt = 0u,
    public var configCaps: KsVideoStreamConfigCaps = KsVideoStreamConfigCaps(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
)

public data class KsDvdcopyBuskey(
    public var busKey: UByteArray = UByteArray(5),
    public var reserved: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyBuskey) return false
        if (!this.busKey.contentEquals(other.busKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.busKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyBuskey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyBuskey> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): KsDvdcopyBuskey =
                    KsDvdcopyBuskey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopyBuskey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr, value.busKey.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 5L, value.reserved.toList())
                }
            }
    }
}

public data class KsDvdcopyChlgkey(
    public var chlgKey: UByteArray = UByteArray(10),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyChlgkey) return false
        if (!this.chlgKey.contentEquals(other.chlgKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chlgKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyChlgkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyChlgkey> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsDvdcopyChlgkey =
                    KsDvdcopyChlgkey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopyChlgkey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                    ).writeNative(addr, value.chlgKey.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved.toList())
                }
            }
    }
}

public data class KsDvdcopyDisckey(
    public var discKey: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyDisckey) return false
        if (!this.discKey.contentEquals(other.discKey)) return false
        return true
    }

    override fun hashCode(): Int = this.discKey.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyDisckey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyDisckey> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2048L
                override fun readNative(addr: Long): KsDvdcopyDisckey =
                    KsDvdcopyDisckey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopyDisckey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                    ).writeNative(addr, value.discKey.toList())
                }
            }
    }
}

public data class KsDvdcopyRegion(
    public var reserved: UByte = 0u,
    public var regionData: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyRegion) return false
        if (this.reserved != other.reserved) return false
        if (this.regionData != other.regionData) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.regionData.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyRegion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyRegion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsDvdcopyRegion =
                    KsDvdcopyRegion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopyRegion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.regionData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.reserved2.toList())
                }
            }
    }
}

public data class KsDvdcopySetCopyState(
    public var dVDCopyState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopySetCopyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopySetCopyState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsDvdcopySetCopyState =
                    KsDvdcopySetCopyState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopySetCopyState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dVDCopyState)
                }
            }
    }
}

public data class KsDvdcopyTitlekey(
    public var keyFlags: UInt = 0u,
    public var reservedNT: UIntArray = UIntArray(2),
    public var titleKey: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsDvdcopyTitlekey) return false
        if (this.keyFlags != other.keyFlags) return false
        if (!this.reservedNT.contentEquals(other.reservedNT)) return false
        if (!this.titleKey.contentEquals(other.titleKey)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyFlags.hashCode()
        result = 31 * result + this.reservedNT.contentHashCode()
        result = 31 * result + this.titleKey.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyTitlekey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdcopyTitlekey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): KsDvdcopyTitlekey =
                    KsDvdcopyTitlekey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 18L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsDvdcopyTitlekey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 4L, value.reservedNT.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.titleKey.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 18L, value.reserved.toList())
                }
            }
    }
}

public data class KsDvdYcrCb(
    public var reserved: UByte = 0u,
    public var y: UByte = 0u,
    public var cr: UByte = 0u,
    public var cb: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdYcrCb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdYcrCb> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsDvdYcrCb =
                    KsDvdYcrCb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KsDvdYcrCb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.cr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.cb)
                }
            }
    }
}

public data class KsDvdYuv(
    public var reserved: UByte = 0u,
    public var y: UByte = 0u,
    public var v: UByte = 0u,
    public var u: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdYuv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsDvdYuv> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsDvdYuv =
                    KsDvdYuv(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KsDvdYuv) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.v)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.u)
                }
            }
    }
}

public class KsFrameInfo internal constructor(
    public var extendedHeaderSize: UInt,
    public var dwFrameFlags: UInt,
    public var pictureNumber: Long,
    public var dropCount: Long,
    hDirectDrawCtorArg: Handle,
    hSurfaceHandleCtorArg: Handle,
    public var directDrawRect: Rect,
    public var anonymous1: KsFrameInfo0,
    public var reserved2: UInt,
    public var anonymous2: KsFrameInfo1,
) {
    public var hDirectDraw: Handle = hDirectDrawCtorArg
        internal set

    public var hSurfaceHandle: Handle = hSurfaceHandleCtorArg
        internal set

    public constructor() : this(
        extendedHeaderSize = 0u,
        dwFrameFlags = 0u,
        pictureNumber = 0L,
        dropCount = 0L,
        hDirectDrawCtorArg = MutPtr(0L),
        hSurfaceHandleCtorArg = MutPtr(0L),
        directDrawRect = Rect(),
        anonymous1 = KsFrameInfo0(),
        reserved2 = 0u,
        anonymous2 = KsFrameInfo1(),
    )

    public operator fun component1(): UInt = this.extendedHeaderSize

    public operator fun component2(): UInt = this.dwFrameFlags

    public operator fun component3(): Long = this.pictureNumber

    public operator fun component4(): Long = this.dropCount

    public operator fun component5(): Handle = this.hDirectDraw

    public operator fun component6(): Handle = this.hSurfaceHandle

    public operator fun component7(): Rect = this.directDrawRect

    public operator fun component8(): KsFrameInfo0 = this.anonymous1

    public operator fun component9(): UInt = this.reserved2

    public operator fun component10(): KsFrameInfo1 = this.anonymous2

    public fun copy(extendedHeaderSize: UInt = this.extendedHeaderSize, dwFrameFlags: UInt = this.dwFrameFlags, pictureNumber: Long = this.pictureNumber, dropCount: Long = this.dropCount, hDirectDraw: Handle = this.hDirectDraw, hSurfaceHandle: Handle = this.hSurfaceHandle, directDrawRect: Rect = this.directDrawRect, anonymous1: KsFrameInfo0 = this.anonymous1, reserved2: UInt = this.reserved2, anonymous2: KsFrameInfo1 = this.anonymous2): KsFrameInfo = KsFrameInfo(extendedHeaderSize = extendedHeaderSize, dwFrameFlags = dwFrameFlags, pictureNumber = pictureNumber, dropCount = dropCount, hDirectDrawCtorArg = hDirectDraw, hSurfaceHandleCtorArg = hSurfaceHandle, directDrawRect = directDrawRect, anonymous1 = anonymous1, reserved2 = reserved2, anonymous2 = anonymous2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsFrameInfo) return false
        if (this.extendedHeaderSize != other.extendedHeaderSize) return false
        if (this.dwFrameFlags != other.dwFrameFlags) return false
        if (this.pictureNumber != other.pictureNumber) return false
        if (this.dropCount != other.dropCount) return false
        if (this.hDirectDraw != other.hDirectDraw) return false
        if (this.hSurfaceHandle != other.hSurfaceHandle) return false
        if (this.directDrawRect != other.directDrawRect) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.anonymous2 != other.anonymous2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extendedHeaderSize.hashCode()
        result = 31 * result + this.dwFrameFlags.hashCode()
        result = 31 * result + this.pictureNumber.hashCode()
        result = 31 * result + this.dropCount.hashCode()
        result = 31 * result + this.hDirectDraw.hashCode()
        result = 31 * result + this.hSurfaceHandle.hashCode()
        result = 31 * result + this.directDrawRect.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            extendedHeaderSize: UInt = 0u,
            dwFrameFlags: UInt = 0u,
            pictureNumber: Long = 0L,
            dropCount: Long = 0L,
            hDirectDraw: Handle = MutPtr(0L),
            hSurfaceHandle: Handle = MutPtr(0L),
            directDrawRect: Rect = Rect(),
            anonymous1: KsFrameInfo0 = KsFrameInfo0(),
            reserved2: UInt = 0u,
            anonymous2: KsFrameInfo1 = KsFrameInfo1(),
        ): KsFrameInfo =
            KsFrameInfo(
                extendedHeaderSize = extendedHeaderSize,
                dwFrameFlags = dwFrameFlags,
                pictureNumber = pictureNumber,
                dropCount = dropCount,
                hDirectDrawCtorArg = hDirectDraw,
                hSurfaceHandleCtorArg = hSurfaceHandle,
                directDrawRect = directDrawRect,
                anonymous1 = anonymous1,
                reserved2 = reserved2,
                anonymous2 = anonymous2,
            )
    }
}

public data class KsFrameInfo0(
    public var lSurfacePitch: Int = 0,
    public var reserved1: UInt = 0u,
)

public data class KsFrameInfo1(
    public var anonymous: KsFrameInfo10 = KsFrameInfo10(),
    public var frameCompletionNumber: ULong = 0uL,
)

public data class KsFrameInfo10(
    public var reserved3: UInt = 0u,
    public var reserved4: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFrameInfo10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFrameInfo10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsFrameInfo10 =
                    KsFrameInfo10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsFrameInfo10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved4)
                }
            }
    }
}

public data class KsFramingItem(
    public var memoryType: Guid = Guid(),
    public var busType: Guid = Guid(),
    public var memoryFlags: UInt = 0u,
    public var busFlags: UInt = 0u,
    public var flags: UInt = 0u,
    public var frames: UInt = 0u,
    public var anonymous: KsFramingItem0 = KsFramingItem0(),
    public var memoryTypeWeight: UInt = 0u,
    public var physicalRange: KsFramingRange = KsFramingRange(),
    public var framingRange: KsFramingRangeWeighted = KsFramingRangeWeighted(),
)

public data class KsFramingItem0(
    public var fileAlignment: UInt = 0u,
    public var framePitch: Int = 0,
)

public data class KsFramingRange(
    public var minFrameSize: UInt = 0u,
    public var maxFrameSize: UInt = 0u,
    public var stepping: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFramingRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFramingRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsFramingRange =
                    KsFramingRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsFramingRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stepping)
                }
            }
    }
}

public data class KsFramingRangeWeighted(
    public var range: KsFramingRange = KsFramingRange(),
    public var inPlaceWeight: UInt = 0u,
    public var notInPlaceWeight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFramingRangeWeighted> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsFramingRangeWeighted> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): KsFramingRangeWeighted =
                    KsFramingRangeWeighted(
                        (KsFramingRange.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KsFramingRangeWeighted) {
                    (KsFramingRange.typeLayout()).writeNative(addr, value.range)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.inPlaceWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.notInPlaceWeight)
                }
            }
    }
}

public class KsH264videoinfo(
    public var wWidth: UShort = 0u,
    public var wHeight: UShort = 0u,
    public var wSARwidth: UShort = 0u,
    public var wSARheight: UShort = 0u,
    public var wProfile: UShort = 0u,
    public var bLevelIDC: UByte = 0u,
    public var wConstrainedToolset: UShort = 0u,
    public var bmSupportedUsages: UInt = 0u,
    public var bmCapabilities: UShort = 0u,
    public var bmSVCCapabilities: UInt = 0u,
    public var bmMVCCapabilities: UInt = 0u,
    public var dwFrameInterval: UInt = 0u,
    public var bMaxCodecConfigDelay: UByte = 0u,
    public var bmSupportedSliceModes: UByte = 0u,
    public var bmSupportedSyncFrameTypes: UByte = 0u,
    public var bResolutionScaling: UByte = 0u,
    public var bSimulcastSupport: UByte = 0u,
    public var bmSupportedRateControlModes: UByte = 0u,
    public var wMaxMBperSecOneResolutionNoScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsNoScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalScalablility: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalQualityScalablity: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalQualityScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsTemporalSpatialScalablity: UShort = 0u,
    public var wMaxMBperSecFourResolutionsTemporalSpatialScalability: UShort = 0u,
    public var wMaxMBperSecOneResolutionFullScalability: UShort = 0u,
    public var wMaxMBperSecTwoResolutionsFullScalability: UShort = 0u,
    public var wMaxMBperSecThreeResolutionsFullScalability: UShort = 0u,
    public var wMaxMBperSecFourResolutionsFullScalability: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsH264videoinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsH264videoinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): KsH264videoinfo =
                    KsH264videoinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 37L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 39L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 41L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 66L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: KsH264videoinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wSARwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wSARheight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wProfile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.bLevelIDC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wConstrainedToolset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bmSupportedUsages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.bmCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bmSVCCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bmMVCCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFrameInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.bMaxCodecConfigDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 37L, value.bmSupportedSliceModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 38L, value.bmSupportedSyncFrameTypes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 39L, value.bResolutionScaling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 40L, value.bSimulcastSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 41L, value.bmSupportedRateControlModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.wMaxMBperSecOneResolutionNoScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.wMaxMBperSecTwoResolutionsNoScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.wMaxMBperSecThreeResolutionsNoScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.wMaxMBperSecFourResolutionsNoScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.wMaxMBperSecOneResolutionTemporalScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.wMaxMBperSecTwoResolutionsTemporalScalablility)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.wMaxMBperSecThreeResolutionsTemporalScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.wMaxMBperSecFourResolutionsTemporalScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.wMaxMBperSecOneResolutionTemporalQualityScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.wMaxMBperSecTwoResolutionsTemporalQualityScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.wMaxMBperSecThreeResolutionsTemporalQualityScalablity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 64L, value.wMaxMBperSecFourResolutionsTemporalQualityScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 66L, value.wMaxMBperSecOneResolutionTemporalSpatialScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.wMaxMBperSecTwoResolutionsTemporalSpatialScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 70L, value.wMaxMBperSecThreeResolutionsTemporalSpatialScalablity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 72L, value.wMaxMBperSecFourResolutionsTemporalSpatialScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 74L, value.wMaxMBperSecOneResolutionFullScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 76L, value.wMaxMBperSecTwoResolutionsFullScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.wMaxMBperSecThreeResolutionsFullScalability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.wMaxMBperSecFourResolutionsFullScalability)
                }
            }
    }
}

public data class KsMpeg1videoinfo(
    public var hdr: KsVideoinfoheader = KsVideoinfoheader(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var bSequenceHeader: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsMpeg1videoinfo) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (!this.bSequenceHeader.contentEquals(other.bSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.bSequenceHeader.contentHashCode()
        return result
    }
}

public data class KsMpegaudioinfo(
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsMpegaudioinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsMpegaudioinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsMpegaudioinfo =
                    KsMpegaudioinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KsMpegaudioinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved3)
                }
            }
    }
}

public data class KsMpegvideoinfo2(
    public var hdr: KsVideoinfoheader2 = KsVideoinfoheader2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsMpegvideoinfo2) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (this.dwProfile != other.dwProfile) return false
        if (this.dwLevel != other.dwLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.bSequenceHeader.contentEquals(other.bSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.dwProfile.hashCode()
        result = 31 * result + this.dwLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bSequenceHeader.contentHashCode()
        return result
    }
}

public data class KsRgbquad(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsRgbquad> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsRgbquad> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsRgbquad =
                    KsRgbquad(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KsRgbquad) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.rgbBlue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.rgbGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rgbRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.rgbReserved)
                }
            }
    }
}

public data class KsTruecolorinfo(
    public var dwBitMasks: UIntArray = UIntArray(3),
    public var bmiColors: List<KsRgbquad> = List(256) { KsRgbquad() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsTruecolorinfo) return false
        if (!this.dwBitMasks.contentEquals(other.dwBitMasks)) return false
        if (this.bmiColors != other.bmiColors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBitMasks.contentHashCode()
        result = 31 * result + this.bmiColors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsTruecolorinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsTruecolorinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1036L
                override fun readNative(addr: Long): KsTruecolorinfo =
                    KsTruecolorinfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(KsRgbquad.typeLayout(), (256).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KsTruecolorinfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.dwBitMasks.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(KsRgbquad.typeLayout(), (256).toInt())
                    ).writeNative(addr + 12L, value.bmiColors)
                }
            }
    }
}

public data class KsTvtunerChangeInfo(
    public var dwFlags: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwAnalogVideoStandard: UInt = 0u,
    public var dwChannel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsTvtunerChangeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsTvtunerChangeInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsTvtunerChangeInfo =
                    KsTvtunerChangeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KsTvtunerChangeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAnalogVideoStandard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwChannel)
                }
            }
    }
}

public data class KsVbiinfoheader(
    public var startLine: UInt = 0u,
    public var endLine: UInt = 0u,
    public var samplingFrequency: UInt = 0u,
    public var minLineStartTime: UInt = 0u,
    public var maxLineStartTime: UInt = 0u,
    public var actualLineStartTime: UInt = 0u,
    public var actualLineEndTime: UInt = 0u,
    public var videoStandard: UInt = 0u,
    public var samplesPerLine: UInt = 0u,
    public var strideInBytes: UInt = 0u,
    public var bufferSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsVbiinfoheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsVbiinfoheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): KsVbiinfoheader =
                    KsVbiinfoheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: KsVbiinfoheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.samplingFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minLineStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxLineStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.actualLineStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.actualLineEndTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.videoStandard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.samplesPerLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.strideInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.bufferSize)
                }
            }
    }
}

public data class KsVbiFrameInfo(
    public var extendedHeaderSize: UInt = 0u,
    public var dwFrameFlags: UInt = 0u,
    public var pictureNumber: Long = 0L,
    public var dropCount: Long = 0L,
    public var dwSamplingFrequency: UInt = 0u,
    public var tvTunerChangeInfo: KsTvtunerChangeInfo = KsTvtunerChangeInfo(),
    public var vBIInfoHeader: KsVbiinfoheader = KsVbiinfoheader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsVbiFrameInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsVbiFrameInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): KsVbiFrameInfo =
                    KsVbiFrameInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (KsTvtunerChangeInfo.typeLayout()).readNative(addr + 28L),
                        (KsVbiinfoheader.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: KsVbiFrameInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extendedHeaderSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFrameFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.pictureNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.dropCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwSamplingFrequency)
                    (KsTvtunerChangeInfo.typeLayout()).writeNative(addr + 28L, value.tvTunerChangeInfo)
                    (KsVbiinfoheader.typeLayout()).writeNative(addr + 44L, value.vBIInfoHeader)
                }
            }
    }
}

public data class KsVideoinfo(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
    public var anonymous: KsVideoinfo0 = KsVideoinfo0(),
)

public data class KsVideoinfo0(
    public var bmiColors: List<KsRgbquad> = List(256) { KsRgbquad() },
    public var dwBitMasks: UIntArray = UIntArray(3),
    public var trueColorInfo: KsTruecolorinfo = KsTruecolorinfo(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsVideoinfo0) return false
        if (this.bmiColors != other.bmiColors) return false
        if (!this.dwBitMasks.contentEquals(other.dwBitMasks)) return false
        if (this.trueColorInfo != other.trueColorInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmiColors.hashCode()
        result = 31 * result + this.dwBitMasks.contentHashCode()
        result = 31 * result + this.trueColorInfo.hashCode()
        return result
    }
}

public data class KsVideoinfoheader(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsVideoinfoheader2(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var anonymous: KsVideoinfoheader20 = KsVideoinfoheader20(),
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: KsBitmapinfoheader = KsBitmapinfoheader(),
)

public data class KsVideoinfoheader20(
    public var dwControlFlags: UInt = 0u,
    public var dwReserved1: UInt = 0u,
)

public class KsVideoStreamConfigCaps(
    public var guid: Guid = Guid(),
    public var videoStandard: UInt = 0u,
    public var inputSize: Size = Size(),
    public var minCroppingSize: Size = Size(),
    public var maxCroppingSize: Size = Size(),
    public var cropGranularityX: Int = 0,
    public var cropGranularityY: Int = 0,
    public var cropAlignX: Int = 0,
    public var cropAlignY: Int = 0,
    public var minOutputSize: Size = Size(),
    public var maxOutputSize: Size = Size(),
    public var outputGranularityX: Int = 0,
    public var outputGranularityY: Int = 0,
    public var stretchTapsX: Int = 0,
    public var stretchTapsY: Int = 0,
    public var shrinkTapsX: Int = 0,
    public var shrinkTapsY: Int = 0,
    public var minFrameInterval: Long = 0L,
    public var maxFrameInterval: Long = 0L,
    public var minBitsPerSecond: Int = 0,
    public var maxBitsPerSecond: Int = 0,
)

public data class LoopedstreamingPositionEventData(
    public var ksEventData: Kseventdata = Kseventdata(),
    public var position: ULong = 0uL,
)

public data class MediumInfo(
    public var mediaPresent: Bool = 0,
    public var mediaType: UInt = 0u,
    public var recordInhibit: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediumInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediumInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MediumInfo =
                    MediumInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MediumInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mediaPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.recordInhibit)
                }
            }
    }
}

public data class MfMdlSharedPayloadKey(
    public var combined: MfMdlSharedPayloadKey0 = MfMdlSharedPayloadKey0(),
    public var gMDLHandle: Guid = Guid(),
)

public data class MfMdlSharedPayloadKey0(
    public var pHandle: UInt = 0u,
    public var fHandle: UInt = 0u,
    public var uPayload: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfMdlSharedPayloadKey0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfMdlSharedPayloadKey0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MfMdlSharedPayloadKey0 =
                    MfMdlSharedPayloadKey0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MfMdlSharedPayloadKey0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.uPayload)
                }
            }
    }
}

public data class NabtsfecBuffer(
    public var dataSize: UInt = 0u,
    public var groupID: UShort = 0u,
    public var reserved: UShort = 0u,
    public var data: UByteArray = UByteArray(448),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NabtsfecBuffer) return false
        if (this.dataSize != other.dataSize) return false
        if (this.groupID != other.groupID) return false
        if (this.reserved != other.reserved) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSize.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsfecBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsfecBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 456L
                override fun readNative(addr: Long): NabtsfecBuffer =
                    NabtsfecBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (448).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NabtsfecBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.groupID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (448).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public data class NabtsBuffer(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var pictureNumber: Long = 0L,
    public var nabtsLines: List<NabtsBufferLine> = List(11) { NabtsBufferLine() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsBuffer> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 543L
                override fun readNative(addr: Long): NabtsBuffer =
                    NabtsBuffer(
                        (VbicodecfilteringScanlines.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NabtsBufferLine.typeLayout(), (11).toInt())
                        ).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: NabtsBuffer) {
                    (VbicodecfilteringScanlines.typeLayout()).writeNative(addr, value.scanlinesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.pictureNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NabtsBufferLine.typeLayout(), (11).toInt())
                    ).writeNative(addr + 136L, value.nabtsLines)
                }
            }
    }
}

public data class NabtsBufferLine(
    public var confidence: UByte = 0u,
    public var bytes: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NabtsBufferLine) return false
        if (this.confidence != other.confidence) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.confidence.hashCode()
        result = 31 * result + this.bytes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsBufferLine> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NabtsBufferLine> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 37L
                override fun readNative(addr: Long): NabtsBufferLine =
                    NabtsBufferLine(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NabtsBufferLine) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.confidence)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 1L, value.bytes.toList())
                }
            }
    }
}

public data class OptimalWeightTotals(
    public var minTotalNominator: Long = 0L,
    public var maxTotalNominator: Long = 0L,
    public var totalDenominator: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OptimalWeightTotals> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OptimalWeightTotals> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): OptimalWeightTotals =
                    OptimalWeightTotals(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: OptimalWeightTotals) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.minTotalNominator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxTotalNominator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.totalDenominator)
                }
            }
    }
}

public data class PipeDimensions(
    public var allocatorPin: KsCompression = KsCompression(),
    public var maxExpansionPin: KsCompression = KsCompression(),
    public var endPin: KsCompression = KsCompression(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PipeDimensions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PipeDimensions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): PipeDimensions =
                    PipeDimensions(
                        (KsCompression.typeLayout()).readNative(addr),
                        (KsCompression.typeLayout()).readNative(addr + 12L),
                        (KsCompression.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PipeDimensions) {
                    (KsCompression.typeLayout()).writeNative(addr, value.allocatorPin)
                    (KsCompression.typeLayout()).writeNative(addr + 12L, value.maxExpansionPin)
                    (KsCompression.typeLayout()).writeNative(addr + 24L, value.endPin)
                }
            }
    }
}

public data class PipeTermination(
    public var flags: UInt = 0u,
    public var outsideFactors: UInt = 0u,
    public var weigth: UInt = 0u,
    public var physicalRange: KsFramingRange = KsFramingRange(),
    public var optimalRange: KsFramingRangeWeighted = KsFramingRangeWeighted(),
    public var compression: KsCompression = KsCompression(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PipeTermination> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PipeTermination> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PipeTermination =
                    PipeTermination(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (KsFramingRange.typeLayout()).readNative(addr + 12L),
                        (KsFramingRangeWeighted.typeLayout()).readNative(addr + 24L),
                        (KsCompression.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: PipeTermination) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outsideFactors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.weigth)
                    (KsFramingRange.typeLayout()).writeNative(addr + 12L, value.physicalRange)
                    (KsFramingRangeWeighted.typeLayout()).writeNative(addr + 24L, value.optimalRange)
                    (KsCompression.typeLayout()).writeNative(addr + 44L, value.compression)
                }
            }
    }
}

public data class SecureBufferInfo(
    public var guidBufferIdentifier: Guid = Guid(),
    public var cbBufferSize: UInt = 0u,
    public var cbCaptured: UInt = 0u,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecureBufferInfo) return false
        if (this.guidBufferIdentifier != other.guidBufferIdentifier) return false
        if (this.cbBufferSize != other.cbBufferSize) return false
        if (this.cbCaptured != other.cbCaptured) return false
        if (!this.ullReserved.contentEquals(other.ullReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidBufferIdentifier.hashCode()
        result = 31 * result + this.cbBufferSize.hashCode()
        result = 31 * result + this.cbCaptured.hashCode()
        result = 31 * result + this.ullReserved.contentHashCode()
        return result
    }
}

public data class SounddetectorPatternheader(
    public var size: UInt = 0u,
    public var patternType: Guid = Guid(),
)

public data class Transportaudioparms(
    public var enableOutput: Int = 0,
    public var enableRecord: Int = 0,
    public var enableSelsync: Int = 0,
    public var input: Int = 0,
    public var monitorSource: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportaudioparms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportaudioparms> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Transportaudioparms =
                    Transportaudioparms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Transportaudioparms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.enableOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.enableRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.enableSelsync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.input)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.monitorSource)
                }
            }
    }
}

public class Transportbasicparms(
    public var timeFormat: Int = 0,
    public var timeReference: Int = 0,
    public var superimpose: Int = 0,
    public var endStopAction: Int = 0,
    public var recordFormat: Int = 0,
    public var stepFrames: Int = 0,
    public var setpField: Int = 0,
    public var preroll: Int = 0,
    public var recPreroll: Int = 0,
    public var postroll: Int = 0,
    public var editDelay: Int = 0,
    public var playTCDelay: Int = 0,
    public var recTCDelay: Int = 0,
    public var editField: Int = 0,
    public var frameServo: Int = 0,
    public var colorFrameServo: Int = 0,
    public var servoRef: Int = 0,
    public var warnGenlock: Int = 0,
    public var setTracking: Int = 0,
    public var volumeName: ByteArray = ByteArray(40),
    public var ballistic: IntArray = IntArray(20),
    public var speed: Int = 0,
    public var counterFormat: Int = 0,
    public var tunerChannel: Int = 0,
    public var tunerNumber: Int = 0,
    public var timerEvent: Int = 0,
    public var timerStartDay: Int = 0,
    public var timerStartTime: Int = 0,
    public var timerStopDay: Int = 0,
    public var timerStopTime: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportbasicparms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportbasicparms> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 232L
                override fun readNative(addr: Long): Transportbasicparms =
                    Transportbasicparms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                        ).readNative(addr + 76L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (20).toInt())
                        ).readNative(addr + 116L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 228L),
                    )
                override fun writeNative(addr: Long, value: Transportbasicparms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.timeFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.timeReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.superimpose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.endStopAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.recordFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.stepFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.setpField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.preroll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.recPreroll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.postroll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.editDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.playTCDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.recTCDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.editField)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.frameServo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.colorFrameServo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.servoRef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.warnGenlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.setTracking)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                    ).writeNative(addr + 76L, value.volumeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (20).toInt())
                    ).writeNative(addr + 116L, value.ballistic.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 196L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 200L, value.counterFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 204L, value.tunerChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 208L, value.tunerNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 212L, value.timerEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 216L, value.timerStartDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 220L, value.timerStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 224L, value.timerStopDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 228L, value.timerStopTime)
                }
            }
    }
}

public data class Transportstatus(
    public var mode: Int = 0,
    public var lastError: Int = 0,
    public var recordInhibit: Int = 0,
    public var servoLock: Int = 0,
    public var mediaPresent: Int = 0,
    public var mediaLength: Int = 0,
    public var mediaSize: Int = 0,
    public var mediaTrackCount: Int = 0,
    public var mediaTrackLength: Int = 0,
    public var mediaTrackSide: Int = 0,
    public var mediaType: Int = 0,
    public var linkMode: Int = 0,
    public var notifyOn: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Transportstatus =
                    Transportstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Transportstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lastError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.recordInhibit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.servoLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.mediaPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.mediaLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.mediaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.mediaTrackCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.mediaTrackLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.mediaTrackSide)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.linkMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.notifyOn)
                }
            }
    }
}

public data class Transportvideoparms(
    public var outputMode: Int = 0,
    public var input: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportvideoparms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Transportvideoparms> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Transportvideoparms =
                    Transportvideoparms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Transportvideoparms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.outputMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.input)
                }
            }
    }
}

public data class TransportState(
    public var mode: UInt = 0u,
    public var state: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TransportState =
                    TransportState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TransportState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.state)
                }
            }
    }
}

public data class TunerAnalogCapsS(
    public var mode: UInt = 0u,
    public var standardsSupported: UInt = 0u,
    public var minFrequency: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var tuningGranularity: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var scanSensingRange: UInt = 0u,
    public var fineTuneSensingRange: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TunerAnalogCapsS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TunerAnalogCapsS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TunerAnalogCapsS =
                    TunerAnalogCapsS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: TunerAnalogCapsS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.standardsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tuningGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.settlingTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.scanSensingRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.fineTuneSensingRange)
                }
            }
    }
}

public data class VbicapPropertiesProtectionS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var status: UInt = 0u,
)

public data class VbicodecfilteringCcSubstreams(
    public var substreamMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringCcSubstreams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringCcSubstreams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VbicodecfilteringCcSubstreams =
                    VbicodecfilteringCcSubstreams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringCcSubstreams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.substreamMask)
                }
            }
    }
}

public data class VbicodecfilteringNabtsSubstreams(
    public var substreamMask: UIntArray = UIntArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbicodecfilteringNabtsSubstreams) return false
        if (!this.substreamMask.contentEquals(other.substreamMask)) return false
        return true
    }

    override fun hashCode(): Int = this.substreamMask.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringNabtsSubstreams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringNabtsSubstreams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): VbicodecfilteringNabtsSubstreams =
                    VbicodecfilteringNabtsSubstreams(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (128).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringNabtsSubstreams) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (128).toInt())
                    ).writeNative(addr, value.substreamMask.toList())
                }
            }
    }
}

public data class VbicodecfilteringScanlines(
    public var dwordBitArray: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbicodecfilteringScanlines) return false
        if (!this.dwordBitArray.contentEquals(other.dwordBitArray)) return false
        return true
    }

    override fun hashCode(): Int = this.dwordBitArray.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringScanlines> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringScanlines> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): VbicodecfilteringScanlines =
                    VbicodecfilteringScanlines(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringScanlines) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr, value.dwordBitArray.toList())
                }
            }
    }
}

public data class VbicodecfilteringStatisticsCc(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsCc =
                    VbicodecfilteringStatisticsCc(
                        (VbicodecfilteringStatisticsCommon.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsCc) {
                    (VbicodecfilteringStatisticsCommon.typeLayout()).writeNative(addr, value.common)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsCcPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCcPin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCcPin> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsCcPin =
                    VbicodecfilteringStatisticsCcPin(
                        (VbicodecfilteringStatisticsCommonPin.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsCcPin) {
                    (VbicodecfilteringStatisticsCommonPin.typeLayout()).writeNative(addr, value.common)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsCommon(
    public var inputSRBsProcessed: UInt = 0u,
    public var outputSRBsProcessed: UInt = 0u,
    public var sRBsIgnored: UInt = 0u,
    public var inputSRBsMissing: UInt = 0u,
    public var outputSRBsMissing: UInt = 0u,
    public var outputFailures: UInt = 0u,
    public var internalErrors: UInt = 0u,
    public var externalErrors: UInt = 0u,
    public var inputDiscontinuities: UInt = 0u,
    public var dSPFailures: UInt = 0u,
    public var tvTunerChanges: UInt = 0u,
    public var vBIHeaderChanges: UInt = 0u,
    public var lineConfidenceAvg: UInt = 0u,
    public var bytesOutput: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCommon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCommon> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsCommon =
                    VbicodecfilteringStatisticsCommon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsCommon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inputSRBsProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outputSRBsProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sRBsIgnored)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.inputSRBsMissing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.outputSRBsMissing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.outputFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.internalErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.externalErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.inputDiscontinuities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dSPFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.tvTunerChanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.vBIHeaderChanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.lineConfidenceAvg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.bytesOutput)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsCommonPin(
    public var sRBsProcessed: UInt = 0u,
    public var sRBsIgnored: UInt = 0u,
    public var sRBsMissing: UInt = 0u,
    public var internalErrors: UInt = 0u,
    public var externalErrors: UInt = 0u,
    public var discontinuities: UInt = 0u,
    public var lineConfidenceAvg: UInt = 0u,
    public var bytesOutput: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCommonPin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsCommonPin> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsCommonPin =
                    VbicodecfilteringStatisticsCommonPin(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsCommonPin) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sRBsProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sRBsIgnored)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sRBsMissing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.internalErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.externalErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.discontinuities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.lineConfidenceAvg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bytesOutput)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsNabts(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
    public var fECBundleBadLines: UInt = 0u,
    public var fECQueueOverflows: UInt = 0u,
    public var fECCorrectedLines: UInt = 0u,
    public var fECUncorrectableLines: UInt = 0u,
    public var bundlesProcessed: UInt = 0u,
    public var bundlesSent2IP: UInt = 0u,
    public var filteredLines: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsNabts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsNabts> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsNabts =
                    VbicodecfilteringStatisticsNabts(
                        (VbicodecfilteringStatisticsCommon.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsNabts) {
                    (VbicodecfilteringStatisticsCommon.typeLayout()).writeNative(addr, value.common)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fECBundleBadLines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fECQueueOverflows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.fECCorrectedLines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.fECUncorrectableLines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.bundlesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.bundlesSent2IP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.filteredLines)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsNabtsPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsNabtsPin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsNabtsPin> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsNabtsPin =
                    VbicodecfilteringStatisticsNabtsPin(
                        (VbicodecfilteringStatisticsCommonPin.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsNabtsPin) {
                    (VbicodecfilteringStatisticsCommonPin.typeLayout()).writeNative(addr, value.common)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsTeletext(
    public var common: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsTeletext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsTeletext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsTeletext =
                    VbicodecfilteringStatisticsTeletext(
                        (VbicodecfilteringStatisticsCommon.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsTeletext) {
                    (VbicodecfilteringStatisticsCommon.typeLayout()).writeNative(addr, value.common)
                }
            }
    }
}

public data class VbicodecfilteringStatisticsTeletextPin(
    public var common: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsTeletextPin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbicodecfilteringStatisticsTeletextPin> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VbicodecfilteringStatisticsTeletextPin =
                    VbicodecfilteringStatisticsTeletextPin(
                        (VbicodecfilteringStatisticsCommonPin.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VbicodecfilteringStatisticsTeletextPin) {
                    (VbicodecfilteringStatisticsCommonPin.typeLayout()).writeNative(addr, value.common)
                }
            }
    }
}

public data class VramSurfaceInfo(
    public var hSurface: Int = 0,
    public var vramPhysicalAddress: Long = 0L,
    public var cbCaptured: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwLinearSize: UInt = 0u,
    public var lPitch: Int = 0,
    public var ullReserved: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VramSurfaceInfo) return false
        if (this.hSurface != other.hSurface) return false
        if (this.vramPhysicalAddress != other.vramPhysicalAddress) return false
        if (this.cbCaptured != other.cbCaptured) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwLinearSize != other.dwLinearSize) return false
        if (this.lPitch != other.lPitch) return false
        if (!this.ullReserved.contentEquals(other.ullReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSurface.hashCode()
        result = 31 * result + this.vramPhysicalAddress.hashCode()
        result = 31 * result + this.cbCaptured.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwLinearSize.hashCode()
        result = 31 * result + this.lPitch.hashCode()
        result = 31 * result + this.ullReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VramSurfaceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VramSurfaceInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): VramSurfaceInfo =
                    VramSurfaceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr + 40L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: VramSurfaceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.hSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.vramPhysicalAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbCaptured)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwLinearSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.lPitch)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr + 40L, value.ullReserved.toList())
                }
            }
    }
}

public class VramSurfaceInfoPropertyS internal constructor(
    public var property: Ksidentifier,
    pVramSurfaceInfoCtorArg: MutPtr<VramSurfaceInfo>,
) {
    public var pVramSurfaceInfo: MutPtr<VramSurfaceInfo> = pVramSurfaceInfoCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        pVramSurfaceInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): MutPtr<VramSurfaceInfo> = this.pVramSurfaceInfo

    public fun copy(property: Ksidentifier = this.property, pVramSurfaceInfo: MutPtr<VramSurfaceInfo> = this.pVramSurfaceInfo): VramSurfaceInfoPropertyS = VramSurfaceInfoPropertyS(property = property, pVramSurfaceInfoCtorArg = pVramSurfaceInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VramSurfaceInfoPropertyS) return false
        if (this.property != other.property) return false
        if (this.pVramSurfaceInfo != other.pVramSurfaceInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.pVramSurfaceInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            pVramSurfaceInfo: MutPtr<VramSurfaceInfo> = MutPtr(0L),
        ): VramSurfaceInfoPropertyS =
            VramSurfaceInfoPropertyS(
                property = property,
                pVramSurfaceInfoCtorArg = pVramSurfaceInfo,
            )
    }
}

public data class WnfKscameraStreamstateInfo(
    public var processId: UInt = 0u,
    public var sessionId: UInt = 0u,
    public var streamState: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnfKscameraStreamstateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnfKscameraStreamstateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WnfKscameraStreamstateInfo =
                    WnfKscameraStreamstateInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WnfKscameraStreamstateInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.streamState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class WstBuffer(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var wstLines: List<WstBufferLine> = List(17) { WstBufferLine() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WstBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WstBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 860L
                override fun readNative(addr: Long): WstBuffer =
                    WstBuffer(
                        (VbicodecfilteringScanlines.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WstBufferLine.typeLayout(), (17).toInt())
                        ).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: WstBuffer) {
                    (VbicodecfilteringScanlines.typeLayout()).writeNative(addr, value.scanlinesRequested)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WstBufferLine.typeLayout(), (17).toInt())
                    ).writeNative(addr + 128L, value.wstLines)
                }
            }
    }
}

public data class WstBufferLine(
    public var confidence: UByte = 0u,
    public var bytes: UByteArray = UByteArray(42),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WstBufferLine) return false
        if (this.confidence != other.confidence) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.confidence.hashCode()
        result = 31 * result + this.bytes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WstBufferLine> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WstBufferLine> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 43L
                override fun readNative(addr: Long): WstBufferLine =
                    WstBufferLine(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (42).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WstBufferLine) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.confidence)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (42).toInt())
                    ).writeNative(addr + 1L, value.bytes.toList())
                }
            }
    }
}
