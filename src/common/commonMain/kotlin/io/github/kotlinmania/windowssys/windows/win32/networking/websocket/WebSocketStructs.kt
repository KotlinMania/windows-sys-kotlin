package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pstr

public data class WebSocketBuffer(
    public var data: WebSocketBuffer0 = WebSocketBuffer0(),
    public var closeStatus: WebSocketBuffer1 = WebSocketBuffer1(),
)

public class WebSocketBuffer1 internal constructor(
    pbReasonCtorArg: MutPtr,
    public var ulReasonLength: UInt,
    public var usStatus: UShort,
) {
    public var pbReason: MutPtr = pbReasonCtorArg
        internal set

    public constructor() : this(
        pbReasonCtorArg = MutPtr(0L),
        ulReasonLength = 0u,
        usStatus = 0u,
    )

    public operator fun component1(): MutPtr = this.pbReason

    public operator fun component2(): UInt = this.ulReasonLength

    public operator fun component3(): UShort = this.usStatus

    public fun copy(pbReason: MutPtr = this.pbReason, ulReasonLength: UInt = this.ulReasonLength, usStatus: UShort = this.usStatus): WebSocketBuffer1 = WebSocketBuffer1(pbReasonCtorArg = pbReason, ulReasonLength = ulReasonLength, usStatus = usStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebSocketBuffer1) return false
        if (this.pbReason != other.pbReason) return false
        if (this.ulReasonLength != other.ulReasonLength) return false
        if (this.usStatus != other.usStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pbReason.hashCode()
        result = 31 * result + this.ulReasonLength.hashCode()
        result = 31 * result + this.usStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketBuffer1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketBuffer1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WebSocketBuffer1 =
                    WebSocketBuffer1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WebSocketBuffer1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pbReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulReasonLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.usStatus)
                }
            }

        public operator fun invoke(
            pbReason: MutPtr = MutPtr(0L),
            ulReasonLength: UInt = 0u,
            usStatus: UShort = 0u,
        ): WebSocketBuffer1 =
            WebSocketBuffer1(
                pbReasonCtorArg = pbReason,
                ulReasonLength = ulReasonLength,
                usStatus = usStatus,
            )
    }
}

public class WebSocketBuffer0 internal constructor(
    pbBufferCtorArg: MutPtr,
    public var ulBufferLength: UInt,
) {
    public var pbBuffer: MutPtr = pbBufferCtorArg
        internal set

    public constructor() : this(
        pbBufferCtorArg = MutPtr(0L),
        ulBufferLength = 0u,
    )

    public operator fun component1(): MutPtr = this.pbBuffer

    public operator fun component2(): UInt = this.ulBufferLength

    public fun copy(pbBuffer: MutPtr = this.pbBuffer, ulBufferLength: UInt = this.ulBufferLength): WebSocketBuffer0 = WebSocketBuffer0(pbBufferCtorArg = pbBuffer, ulBufferLength = ulBufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebSocketBuffer0) return false
        if (this.pbBuffer != other.pbBuffer) return false
        if (this.ulBufferLength != other.ulBufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pbBuffer.hashCode()
        result = 31 * result + this.ulBufferLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketBuffer0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WebSocketBuffer0 =
                    WebSocketBuffer0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebSocketBuffer0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pbBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulBufferLength)
                }
            }

        public operator fun invoke(
            pbBuffer: MutPtr = MutPtr(0L),
            ulBufferLength: UInt = 0u,
        ): WebSocketBuffer0 =
            WebSocketBuffer0(
                pbBufferCtorArg = pbBuffer,
                ulBufferLength = ulBufferLength,
            )
    }
}

public class WebSocketHttpHeader internal constructor(
    pcNameCtorArg: Pstr,
    public var ulNameLength: UInt,
    pcValueCtorArg: Pstr,
    public var ulValueLength: UInt,
) {
    public var pcName: Pstr = pcNameCtorArg
        internal set

    public var pcValue: Pstr = pcValueCtorArg
        internal set

    public constructor() : this(
        pcNameCtorArg = MutPtr(0L),
        ulNameLength = 0u,
        pcValueCtorArg = MutPtr(0L),
        ulValueLength = 0u,
    )

    public operator fun component1(): Pstr = this.pcName

    public operator fun component2(): UInt = this.ulNameLength

    public operator fun component3(): Pstr = this.pcValue

    public operator fun component4(): UInt = this.ulValueLength

    public fun copy(pcName: Pstr = this.pcName, ulNameLength: UInt = this.ulNameLength, pcValue: Pstr = this.pcValue, ulValueLength: UInt = this.ulValueLength): WebSocketHttpHeader = WebSocketHttpHeader(pcNameCtorArg = pcName, ulNameLength = ulNameLength, pcValueCtorArg = pcValue, ulValueLength = ulValueLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebSocketHttpHeader) return false
        if (this.pcName != other.pcName) return false
        if (this.ulNameLength != other.ulNameLength) return false
        if (this.pcValue != other.pcValue) return false
        if (this.ulValueLength != other.ulValueLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcName.hashCode()
        result = 31 * result + this.ulNameLength.hashCode()
        result = 31 * result + this.pcValue.hashCode()
        result = 31 * result + this.ulValueLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pcName: Pstr = MutPtr(0L),
            ulNameLength: UInt = 0u,
            pcValue: Pstr = MutPtr(0L),
            ulValueLength: UInt = 0u,
        ): WebSocketHttpHeader =
            WebSocketHttpHeader(
                pcNameCtorArg = pcName,
                ulNameLength = ulNameLength,
                pcValueCtorArg = pcValue,
                ulValueLength = ulValueLength,
            )
    }
}

public class WebSocketProperty internal constructor(
    public var type: WebSocketPropertyType,
    pvValueCtorArg: MutPtr,
    public var ulValueSize: UInt,
) {
    public var pvValue: MutPtr = pvValueCtorArg
        internal set

    public constructor() : this(
        type = 0,
        pvValueCtorArg = MutPtr(0L),
        ulValueSize = 0u,
    )

    public operator fun component1(): WebSocketPropertyType = this.type

    public operator fun component2(): MutPtr = this.pvValue

    public operator fun component3(): UInt = this.ulValueSize

    public fun copy(type: WebSocketPropertyType = this.type, pvValue: MutPtr = this.pvValue, ulValueSize: UInt = this.ulValueSize): WebSocketProperty = WebSocketProperty(type = type, pvValueCtorArg = pvValue, ulValueSize = ulValueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebSocketProperty) return false
        if (this.type != other.type) return false
        if (this.pvValue != other.pvValue) return false
        if (this.ulValueSize != other.ulValueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.pvValue.hashCode()
        result = 31 * result + this.ulValueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebSocketProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WebSocketProperty =
                    WebSocketProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WebSocketProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulValueSize)
                }
            }

        public operator fun invoke(
            type: WebSocketPropertyType = 0,
            pvValue: MutPtr = MutPtr(0L),
            ulValueSize: UInt = 0u,
        ): WebSocketProperty =
            WebSocketProperty(
                type = type,
                pvValueCtorArg = pvValue,
                ulValueSize = ulValueSize,
            )
    }
}
