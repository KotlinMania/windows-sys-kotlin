@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public class AAAccountingData internal constructor(
    userNameCtorArg: Bstr,
    clientNameCtorArg: Bstr,
    public var authType: AAAuthSchemes,
    resourceNameCtorArg: Bstr,
    public var portNumber: Int,
    protocolNameCtorArg: Bstr,
    public var numberOfBytesReceived: Int,
    public var numberOfBytesTransfered: Int,
    reasonForDisconnectCtorArg: Bstr,
    public var mainSessionId: Guid,
    public var subSessionId: Int,
) {
    public var userName: Bstr = userNameCtorArg
        internal set

    public var clientName: Bstr = clientNameCtorArg
        internal set

    public var resourceName: Bstr = resourceNameCtorArg
        internal set

    public var protocolName: Bstr = protocolNameCtorArg
        internal set

    public var reasonForDisconnect: Bstr = reasonForDisconnectCtorArg
        internal set

    public constructor() : this(
        userNameCtorArg = ConstPtr(0L),
        clientNameCtorArg = ConstPtr(0L),
        authType = 0,
        resourceNameCtorArg = ConstPtr(0L),
        portNumber = 0,
        protocolNameCtorArg = ConstPtr(0L),
        numberOfBytesReceived = 0,
        numberOfBytesTransfered = 0,
        reasonForDisconnectCtorArg = ConstPtr(0L),
        mainSessionId = Guid(),
        subSessionId = 0,
    )

    public operator fun component1(): Bstr = this.userName

    public operator fun component2(): Bstr = this.clientName

    public operator fun component3(): AAAuthSchemes = this.authType

    public operator fun component4(): Bstr = this.resourceName

    public operator fun component5(): Int = this.portNumber

    public operator fun component6(): Bstr = this.protocolName

    public operator fun component7(): Int = this.numberOfBytesReceived

    public operator fun component8(): Int = this.numberOfBytesTransfered

    public operator fun component9(): Bstr = this.reasonForDisconnect

    public operator fun component10(): Guid = this.mainSessionId

    public operator fun component11(): Int = this.subSessionId

    public fun copy(userName: Bstr = this.userName, clientName: Bstr = this.clientName, authType: AAAuthSchemes = this.authType, resourceName: Bstr = this.resourceName, portNumber: Int = this.portNumber, protocolName: Bstr = this.protocolName, numberOfBytesReceived: Int = this.numberOfBytesReceived, numberOfBytesTransfered: Int = this.numberOfBytesTransfered, reasonForDisconnect: Bstr = this.reasonForDisconnect, mainSessionId: Guid = this.mainSessionId, subSessionId: Int = this.subSessionId): AAAccountingData = AAAccountingData(userNameCtorArg = userName, clientNameCtorArg = clientName, authType = authType, resourceNameCtorArg = resourceName, portNumber = portNumber, protocolNameCtorArg = protocolName, numberOfBytesReceived = numberOfBytesReceived, numberOfBytesTransfered = numberOfBytesTransfered, reasonForDisconnectCtorArg = reasonForDisconnect, mainSessionId = mainSessionId, subSessionId = subSessionId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AAAccountingData) return false
        if (this.userName != other.userName) return false
        if (this.clientName != other.clientName) return false
        if (this.authType != other.authType) return false
        if (this.resourceName != other.resourceName) return false
        if (this.portNumber != other.portNumber) return false
        if (this.protocolName != other.protocolName) return false
        if (this.numberOfBytesReceived != other.numberOfBytesReceived) return false
        if (this.numberOfBytesTransfered != other.numberOfBytesTransfered) return false
        if (this.reasonForDisconnect != other.reasonForDisconnect) return false
        if (this.mainSessionId != other.mainSessionId) return false
        if (this.subSessionId != other.subSessionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.authType.hashCode()
        result = 31 * result + this.resourceName.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.protocolName.hashCode()
        result = 31 * result + this.numberOfBytesReceived.hashCode()
        result = 31 * result + this.numberOfBytesTransfered.hashCode()
        result = 31 * result + this.reasonForDisconnect.hashCode()
        result = 31 * result + this.mainSessionId.hashCode()
        result = 31 * result + this.subSessionId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userName: Bstr = ConstPtr(0L),
            clientName: Bstr = ConstPtr(0L),
            authType: AAAuthSchemes = 0,
            resourceName: Bstr = ConstPtr(0L),
            portNumber: Int = 0,
            protocolName: Bstr = ConstPtr(0L),
            numberOfBytesReceived: Int = 0,
            numberOfBytesTransfered: Int = 0,
            reasonForDisconnect: Bstr = ConstPtr(0L),
            mainSessionId: Guid = Guid(),
            subSessionId: Int = 0,
        ): AAAccountingData =
            AAAccountingData(
                userNameCtorArg = userName,
                clientNameCtorArg = clientName,
                authType = authType,
                resourceNameCtorArg = resourceName,
                portNumber = portNumber,
                protocolNameCtorArg = protocolName,
                numberOfBytesReceived = numberOfBytesReceived,
                numberOfBytesTransfered = numberOfBytesTransfered,
                reasonForDisconnectCtorArg = reasonForDisconnect,
                mainSessionId = mainSessionId,
                subSessionId = subSessionId,
            )
    }
}

public data class AeCurrentPosition(
    public var u64DevicePosition: ULong = 0uL,
    public var u64StreamPosition: ULong = 0uL,
    public var u64PaddingFrames: ULong = 0uL,
    public var hnsQPCPosition: Long = 0L,
    public var f32FramesPerSecond: Float = 0.0f,
    public var flag: AePositionFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeCurrentPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AeCurrentPosition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): AeCurrentPosition =
                    AeCurrentPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: AeCurrentPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.u64DevicePosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.u64StreamPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.u64PaddingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.hnsQPCPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.f32FramesPerSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.flag)
                }
            }
    }
}

public data class BitmapRendererStatistics(
    public var dwFramesDelivered: UInt = 0u,
    public var dwFramesDropped: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BitmapRendererStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BitmapRendererStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BitmapRendererStatistics =
                    BitmapRendererStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BitmapRendererStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFramesDelivered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFramesDropped)
                }
            }
    }
}

public data class ChannelDef(
    public var name: ByteArray = ByteArray(8),
    public var options: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChannelDef) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelDef> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelDef> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ChannelDef =
                    ChannelDef(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ChannelDef) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                }
            }
    }
}

public data class ChannelEntryPoints(
    public var cbSize: UInt = 0u,
    public var protocolVersion: UInt = 0u,
    public var pVirtualChannelInit: Pvirtualchannelinit = null,
    public var pVirtualChannelOpen: Pvirtualchannelopen = null,
    public var pVirtualChannelClose: Pvirtualchannelclose = null,
    public var pVirtualChannelWrite: Pvirtualchannelwrite = null,
)

public data class ChannelPduHeader(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelPduHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelPduHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ChannelPduHeader =
                    ChannelPduHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ChannelPduHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class ClientDisplay(
    public var horizontalResolution: UInt = 0u,
    public var verticalResolution: UInt = 0u,
    public var colorDepth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClientDisplay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClientDisplay> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClientDisplay =
                    ClientDisplay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClientDisplay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.horizontalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.verticalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.colorDepth)
                }
            }
    }
}

public data class ProductInfoa(
    public var companyName: ByteArray = ByteArray(256),
    public var productID: ByteArray = ByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProductInfoa) return false
        if (!this.companyName.contentEquals(other.companyName)) return false
        if (!this.productID.contentEquals(other.productID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.companyName.contentHashCode()
        result = 31 * result + this.productID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProductInfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProductInfoa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 260L
                override fun readNative(addr: Long): ProductInfoa =
                    ProductInfoa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 256L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProductInfoa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr, value.companyName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 256L, value.productID.toList())
                }
            }
    }
}

public data class ProductInfow(
    public var companyName: UShortArray = UShortArray(256),
    public var productID: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProductInfow) return false
        if (!this.companyName.contentEquals(other.companyName)) return false
        if (!this.productID.contentEquals(other.productID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.companyName.contentHashCode()
        result = 31 * result + this.productID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProductInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProductInfow> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): ProductInfow =
                    ProductInfow(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ProductInfow) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.companyName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 512L, value.productID.toList())
                }
            }
    }
}

public data class RfxGfxMonitorInfo(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
    public var physicalWidth: UInt = 0u,
    public var physicalHeight: UInt = 0u,
    public var orientation: UInt = 0u,
    public var primary: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMonitorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMonitorInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RfxGfxMonitorInfo =
                    RfxGfxMonitorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMonitorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.physicalWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.physicalHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.orientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.primary)
                }
            }
    }
}

public data class RfxGfxMsgClientDesktopInfoRequest(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgClientDesktopInfoRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgClientDesktopInfoRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RfxGfxMsgClientDesktopInfoRequest =
                    RfxGfxMsgClientDesktopInfoRequest(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgClientDesktopInfoRequest) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                }
            }
    }
}

public data class RfxGfxMsgClientDesktopInfoResponse(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var reserved: UInt = 0u,
    public var monitorCount: UInt = 0u,
    public var monitorData: List<RfxGfxMonitorInfo> = List(16) { RfxGfxMonitorInfo() },
    public var clientUniqueId: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RfxGfxMsgClientDesktopInfoResponse) return false
        if (this.channelHdr != other.channelHdr) return false
        if (this.reserved != other.reserved) return false
        if (this.monitorCount != other.monitorCount) return false
        if (this.monitorData != other.monitorData) return false
        if (!this.clientUniqueId.contentEquals(other.clientUniqueId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelHdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.monitorCount.hashCode()
        result = 31 * result + this.monitorData.hashCode()
        result = 31 * result + this.clientUniqueId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgClientDesktopInfoResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgClientDesktopInfoResponse> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 588L
                override fun readNative(addr: Long): RfxGfxMsgClientDesktopInfoResponse =
                    RfxGfxMsgClientDesktopInfoResponse(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RfxGfxMonitorInfo.typeLayout(), (16).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgClientDesktopInfoResponse) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.monitorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RfxGfxMonitorInfo.typeLayout(), (16).toInt())
                    ).writeNative(addr + 12L, value.monitorData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 524L, value.clientUniqueId.toList())
                }
            }
    }
}

public data class RfxGfxMsgDesktopConfigChangeConfirm(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopConfigChangeConfirm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopConfigChangeConfirm> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RfxGfxMsgDesktopConfigChangeConfirm =
                    RfxGfxMsgDesktopConfigChangeConfirm(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgDesktopConfigChangeConfirm) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                }
            }
    }
}

public data class RfxGfxMsgDesktopConfigChangeNotify(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
    public var ulBpp: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopConfigChangeNotify> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopConfigChangeNotify> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): RfxGfxMsgDesktopConfigChangeNotify =
                    RfxGfxMsgDesktopConfigChangeNotify(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgDesktopConfigChangeNotify) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulBpp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class RfxGfxMsgDesktopInputReset(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopInputReset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopInputReset> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RfxGfxMsgDesktopInputReset =
                    RfxGfxMsgDesktopInputReset(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgDesktopInputReset) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulHeight)
                }
            }
    }
}

public data class RfxGfxMsgDesktopResendRequest(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var redrawRect: RfxGfxRect = RfxGfxRect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopResendRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDesktopResendRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): RfxGfxMsgDesktopResendRequest =
                    RfxGfxMsgDesktopResendRequest(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (RfxGfxRect.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgDesktopResendRequest) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (RfxGfxRect.typeLayout()).writeNative(addr + 4L, value.redrawRect)
                }
            }
    }
}

public data class RfxGfxMsgDisconnectNotify(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var disconnectReason: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDisconnectNotify> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgDisconnectNotify> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RfxGfxMsgDisconnectNotify =
                    RfxGfxMsgDisconnectNotify(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgDisconnectNotify) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.disconnectReason)
                }
            }
    }
}

public data class RfxGfxMsgHeader(
    public var uMSGType: UShort = 0u,
    public var cbSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RfxGfxMsgHeader =
                    RfxGfxMsgHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uMSGType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cbSize)
                }
            }
    }
}

public data class RfxGfxMsgRdpData(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var rdpData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RfxGfxMsgRdpData) return false
        if (this.channelHdr != other.channelHdr) return false
        if (!this.rdpData.contentEquals(other.rdpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelHdr.hashCode()
        result = 31 * result + this.rdpData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgRdpData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxMsgRdpData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): RfxGfxMsgRdpData =
                    RfxGfxMsgRdpData(
                        (RfxGfxMsgHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RfxGfxMsgRdpData) {
                    (RfxGfxMsgHeader.typeLayout()).writeNative(addr, value.channelHdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.rdpData.toList())
                }
            }
    }
}

public data class RfxGfxRect(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RfxGfxRect> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RfxGfxRect =
                    RfxGfxRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RfxGfxRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bottom)
                }
            }
    }
}

public data class TssdConnectionPoint(
    public var serverAddressB: UByteArray = UByteArray(16),
    public var addressType: TssdAddrV46Type = 0,
    public var portNumber: UShort = 0u,
    public var addressScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TssdConnectionPoint) return false
        if (!this.serverAddressB.contentEquals(other.serverAddressB)) return false
        if (this.addressType != other.addressType) return false
        if (this.portNumber != other.portNumber) return false
        if (this.addressScope != other.addressScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serverAddressB.contentHashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.addressScope.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TssdConnectionPoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TssdConnectionPoint> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): TssdConnectionPoint =
                    TssdConnectionPoint(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TssdConnectionPoint) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.serverAddressB.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.addressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.addressScope)
                }
            }
    }
}

public data class VmNotifyEntry(
    public var vmName: UShortArray = UShortArray(128),
    public var vmHost: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmNotifyEntry) return false
        if (!this.vmName.contentEquals(other.vmName)) return false
        if (!this.vmHost.contentEquals(other.vmHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vmName.contentHashCode()
        result = 31 * result + this.vmHost.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmNotifyEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmNotifyEntry> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): VmNotifyEntry =
                    VmNotifyEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 256L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VmNotifyEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.vmName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 256L, value.vmHost.toList())
                }
            }
    }
}

public class VmNotifyInfo internal constructor(
    public var dwNumEntries: UInt,
    ppVmEntriesCtorArg: MutPtr,
) {
    public var ppVmEntries: MutPtr = ppVmEntriesCtorArg
        internal set

    public constructor() : this(
        dwNumEntries = 0u,
        ppVmEntriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumEntries

    public operator fun component2(): MutPtr = this.ppVmEntries

    public fun copy(dwNumEntries: UInt = this.dwNumEntries, ppVmEntries: MutPtr = this.ppVmEntries): VmNotifyInfo = VmNotifyInfo(dwNumEntries = dwNumEntries, ppVmEntriesCtorArg = ppVmEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmNotifyInfo) return false
        if (this.dwNumEntries != other.dwNumEntries) return false
        if (this.ppVmEntries != other.ppVmEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumEntries.hashCode()
        result = 31 * result + this.ppVmEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmNotifyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmNotifyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VmNotifyInfo =
                    VmNotifyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VmNotifyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ppVmEntries)
                }
            }

        public operator fun invoke(
            dwNumEntries: UInt = 0u,
            ppVmEntries: MutPtr = MutPtr(0L),
        ): VmNotifyInfo =
            VmNotifyInfo(
                dwNumEntries = dwNumEntries,
                ppVmEntriesCtorArg = ppVmEntries,
            )
    }
}

public class VmPatchInfo internal constructor(
    public var dwNumEntries: UInt,
    pVmNamesCtorArg: MutPtr,
) {
    public var pVmNames: MutPtr = pVmNamesCtorArg
        internal set

    public constructor() : this(
        dwNumEntries = 0u,
        pVmNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumEntries

    public operator fun component2(): MutPtr = this.pVmNames

    public fun copy(dwNumEntries: UInt = this.dwNumEntries, pVmNames: MutPtr = this.pVmNames): VmPatchInfo = VmPatchInfo(dwNumEntries = dwNumEntries, pVmNamesCtorArg = pVmNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmPatchInfo) return false
        if (this.dwNumEntries != other.dwNumEntries) return false
        if (this.pVmNames != other.pVmNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumEntries.hashCode()
        result = 31 * result + this.pVmNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmPatchInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmPatchInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VmPatchInfo =
                    VmPatchInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VmPatchInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pVmNames)
                }
            }

        public operator fun invoke(
            dwNumEntries: UInt = 0u,
            pVmNames: MutPtr = MutPtr(0L),
        ): VmPatchInfo =
            VmPatchInfo(
                dwNumEntries = dwNumEntries,
                pVmNamesCtorArg = pVmNames,
            )
    }
}

public data class WrdsConnectionSetting(
    public var wRdsConnectionSettings1: WrdsConnectionSettings1 = WrdsConnectionSettings1(),
)

public data class WrdsConnectionSettings(
    public var wRdsConnectionSettingLevel: WrdsConnectionSettingLevel = 0,
    public var wRdsConnectionSetting: WrdsConnectionSetting = WrdsConnectionSetting(),
)

public class WrdsConnectionSettings1 {
    public var fInheritInitialProgram: Boolean = false

    public var fInheritColorDepth: Boolean = false

    public var fHideTitleBar: Boolean = false

    public var fInheritAutoLogon: Boolean = false

    public var fMaximizeShell: Boolean = false

    public var fDisablePNP: Boolean = false

    public var fPasswordIsScPin: Boolean = false

    public var fPromptForPassword: Boolean = false

    public var fDisableCpm: Boolean = false

    public var fDisableCdm: Boolean = false

    public var fDisableCcm: Boolean = false

    public var fDisableLPT: Boolean = false

    public var fDisableClip: Boolean = false

    public var fResetBroken: Boolean = false

    public var fDisableEncryption: Boolean = false

    public var fDisableAutoReconnect: Boolean = false

    public var fDisableCtrlAltDel: Boolean = false

    public var fDoubleClickDetect: Boolean = false

    public var fEnableWindowsKey: Boolean = false

    public var fUsingSavedCreds: Boolean = false

    public var fMouse: Boolean = false

    public var fNoAudioPlayback: Boolean = false

    public var fRemoteConsoleAudio: Boolean = false

    public var encryptionLevel: UByte = 0u

    public var colorDepth: UShort = 0u

    public var protocolType: UShort = 0u

    public var hRes: UShort = 0u

    public var vRes: UShort = 0u

    public var clientProductId: UShort = 0u

    public var outBufCountHost: UShort = 0u

    public var outBufCountClient: UShort = 0u

    public var outBufLength: UShort = 0u

    public var keyboardLayout: UInt = 0u

    public var maxConnectionTime: UInt = 0u

    public var maxDisconnectionTime: UInt = 0u

    public var maxIdleTime: UInt = 0u

    public var performanceFlags: UInt = 0u

    public var keyboardType: UInt = 0u

    public var keyboardSubType: UInt = 0u

    public var keyboardFunctionKey: UInt = 0u

    public var activeInputLocale: UInt = 0u

    public var serialNumber: UInt = 0u

    public var clientAddressFamily: UInt = 0u

    public var clientBuildNumber: UInt = 0u

    public var clientSessionId: UInt = 0u

    public var workDirectory: UShortArray = UShortArray(257)

    public var initialProgram: UShortArray = UShortArray(257)

    public var userName: UShortArray = UShortArray(256)

    public var domain: UShortArray = UShortArray(256)

    public var password: UShortArray = UShortArray(256)

    public var protocolName: UShortArray = UShortArray(9)

    public var displayDriverName: UShortArray = UShortArray(9)

    public var displayDeviceName: UShortArray = UShortArray(20)

    public var imeFileName: UShortArray = UShortArray(33)

    public var audioDriverName: UShortArray = UShortArray(9)

    public var clientName: UShortArray = UShortArray(21)

    public var clientAddress: UShortArray = UShortArray(31)

    public var clientDirectory: UShortArray = UShortArray(257)

    public var clientDigProductId: UShortArray = UShortArray(33)

    public var clientSockAddress: WtsSockaddr = WtsSockaddr()

    public var clientTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation()

    public var wRdsListenerSettings: WrdsListenerSettings = WrdsListenerSettings()

    public var eventLogActivityId: Guid = Guid()

    public var contextSize: UInt = 0u

    public var contextData: MutPtr = MutPtr(0L)
        internal set
}

public data class WrdsDynamicTimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: WtsSystemtime = WtsSystemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: WtsSystemtime = WtsSystemtime(),
    public var daylightBias: Int = 0,
    public var timeZoneKeyName: UShortArray = UShortArray(128),
    public var dynamicDaylightTimeDisabled: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WrdsDynamicTimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        if (!this.timeZoneKeyName.contentEquals(other.timeZoneKeyName)) return false
        if (this.dynamicDaylightTimeDisabled != other.dynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        result = 31 * result + this.timeZoneKeyName.contentHashCode()
        result = 31 * result + this.dynamicDaylightTimeDisabled.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsDynamicTimeZoneInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsDynamicTimeZoneInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 432L
                override fun readNative(addr: Long): WrdsDynamicTimeZoneInformation =
                    WrdsDynamicTimeZoneInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (WtsSystemtime.typeLayout()).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 88L).toUShortArray(),
                        (WtsSystemtime.typeLayout()).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 168L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 172L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 428L),
                    )
                override fun writeNative(addr: Long, value: WrdsDynamicTimeZoneInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bias)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.standardName.toList())
                    (WtsSystemtime.typeLayout()).writeNative(addr + 68L, value.standardDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.standardBias)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 88L, value.daylightName.toList())
                    (WtsSystemtime.typeLayout()).writeNative(addr + 152L, value.daylightDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 168L, value.daylightBias)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 172L, value.timeZoneKeyName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 428L, value.dynamicDaylightTimeDisabled)
                }
            }
    }
}

public data class WrdsListenerSetting(
    public var wRdsListenerSettings1: WrdsListenerSettings1 = WrdsListenerSettings1(),
)

public data class WrdsListenerSettings(
    public var wRdsListenerSettingLevel: WrdsListenerSettingLevel = 0,
    public var wRdsListenerSetting: WrdsListenerSetting = WrdsListenerSetting(),
)

public class WrdsListenerSettings1 internal constructor(
    public var maxProtocolListenerConnectionCount: UInt,
    public var securityDescriptorSize: UInt,
    pSecurityDescriptorCtorArg: MutPtr,
) {
    public var pSecurityDescriptor: MutPtr = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        maxProtocolListenerConnectionCount = 0u,
        securityDescriptorSize = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.maxProtocolListenerConnectionCount

    public operator fun component2(): UInt = this.securityDescriptorSize

    public operator fun component3(): MutPtr = this.pSecurityDescriptor

    public fun copy(maxProtocolListenerConnectionCount: UInt = this.maxProtocolListenerConnectionCount, securityDescriptorSize: UInt = this.securityDescriptorSize, pSecurityDescriptor: MutPtr = this.pSecurityDescriptor): WrdsListenerSettings1 = WrdsListenerSettings1(maxProtocolListenerConnectionCount = maxProtocolListenerConnectionCount, securityDescriptorSize = securityDescriptorSize, pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WrdsListenerSettings1) return false
        if (this.maxProtocolListenerConnectionCount != other.maxProtocolListenerConnectionCount) return false
        if (this.securityDescriptorSize != other.securityDescriptorSize) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxProtocolListenerConnectionCount.hashCode()
        result = 31 * result + this.securityDescriptorSize.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsListenerSettings1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsListenerSettings1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WrdsListenerSettings1 =
                    WrdsListenerSettings1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WrdsListenerSettings1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxProtocolListenerConnectionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.securityDescriptorSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pSecurityDescriptor)
                }
            }

        public operator fun invoke(
            maxProtocolListenerConnectionCount: UInt = 0u,
            securityDescriptorSize: UInt = 0u,
            pSecurityDescriptor: MutPtr = MutPtr(0L),
        ): WrdsListenerSettings1 =
            WrdsListenerSettings1(
                maxProtocolListenerConnectionCount = maxProtocolListenerConnectionCount,
                securityDescriptorSize = securityDescriptorSize,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}

public data class WrdsSetting(
    public var wRdsSettings1: WrdsSettings1 = WrdsSettings1(),
)

public data class WrdsSettings(
    public var wRdsSettingType: WrdsSettingType = 0,
    public var wRdsSettingLevel: WrdsSettingLevel = 0,
    public var wRdsSetting: WrdsSetting = WrdsSetting(),
)

public class WrdsSettings1(
    public var wRdsDisableClipStatus: WrdsSettingStatus = 0,
    public var wRdsDisableClipValue: UInt = 0u,
    public var wRdsDisableLPTStatus: WrdsSettingStatus = 0,
    public var wRdsDisableLPTValue: UInt = 0u,
    public var wRdsDisableCcmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCcmValue: UInt = 0u,
    public var wRdsDisableCdmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCdmValue: UInt = 0u,
    public var wRdsDisableCpmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCpmValue: UInt = 0u,
    public var wRdsDisablePnpStatus: WrdsSettingStatus = 0,
    public var wRdsDisablePnpValue: UInt = 0u,
    public var wRdsEncryptionLevelStatus: WrdsSettingStatus = 0,
    public var wRdsEncryptionValue: UInt = 0u,
    public var wRdsColorDepthStatus: WrdsSettingStatus = 0,
    public var wRdsColorDepthValue: UInt = 0u,
    public var wRdsDisableAutoReconnecetStatus: WrdsSettingStatus = 0,
    public var wRdsDisableAutoReconnecetValue: UInt = 0u,
    public var wRdsDisableEncryptionStatus: WrdsSettingStatus = 0,
    public var wRdsDisableEncryptionValue: UInt = 0u,
    public var wRdsResetBrokenStatus: WrdsSettingStatus = 0,
    public var wRdsResetBrokenValue: UInt = 0u,
    public var wRdsMaxIdleTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxIdleTimeValue: UInt = 0u,
    public var wRdsMaxDisconnectTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxDisconnectTimeValue: UInt = 0u,
    public var wRdsMaxConnectTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxConnectTimeValue: UInt = 0u,
    public var wRdsKeepAliveStatus: WrdsSettingStatus = 0,
    public var wRdsKeepAliveStartValue: Boolean = false,
    public var wRdsKeepAliveIntervalValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsSettings1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WrdsSettings1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): WrdsSettings1 =
                    WrdsSettings1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: WrdsSettings1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wRdsDisableClipStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wRdsDisableClipValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.wRdsDisableLPTStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wRdsDisableLPTValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.wRdsDisableCcmStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.wRdsDisableCcmValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.wRdsDisableCdmStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.wRdsDisableCdmValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.wRdsDisableCpmStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.wRdsDisableCpmValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.wRdsDisablePnpStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.wRdsDisablePnpValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.wRdsEncryptionLevelStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.wRdsEncryptionValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.wRdsColorDepthStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.wRdsColorDepthValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.wRdsDisableAutoReconnecetStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.wRdsDisableAutoReconnecetValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.wRdsDisableEncryptionStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.wRdsDisableEncryptionValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.wRdsResetBrokenStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.wRdsResetBrokenValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.wRdsMaxIdleTimeStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.wRdsMaxIdleTimeValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.wRdsMaxDisconnectTimeStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.wRdsMaxDisconnectTimeValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.wRdsMaxConnectTimeStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.wRdsMaxConnectTimeValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.wRdsKeepAliveStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 116L, value.wRdsKeepAliveStartValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.wRdsKeepAliveIntervalValue)
                }
            }
    }
}

public class Wtsclienta(
    public var clientName: ByteArray = ByteArray(21),
    public var domain: ByteArray = ByteArray(18),
    public var userName: ByteArray = ByteArray(21),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
    public var encryptionLevel: UByte = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var clientDirectory: ByteArray = ByteArray(261),
    public var clientBuildNumber: UInt = 0u,
    public var clientHardwareId: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var deviceId: ByteArray = ByteArray(261),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsclienta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsclienta> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1200L
                override fun readNative(addr: Long): Wtsclienta =
                    Wtsclienta(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                        ).readNative(addr + 21L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr + 39L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 60L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 321L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 582L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 584L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (31).toInt())
                        ).readNative(addr + 588L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 650L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 652L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 654L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 656L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 920L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 924L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 928L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 930L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 932L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 934L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 936L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsclienta) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr, value.clientName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                    ).writeNative(addr + 21L, value.domain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr + 39L, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 60L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 321L, value.initialProgram.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 582L, value.encryptionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 584L, value.clientAddressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (31).toInt())
                    ).writeNative(addr + 588L, value.clientAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 650L, value.hRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 652L, value.vRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 654L, value.colorDepth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 656L, value.clientDirectory.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 920L, value.clientBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 924L, value.clientHardwareId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 928L, value.clientProductId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 930L, value.outBufCountHost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 932L, value.outBufCountClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 934L, value.outBufLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 936L, value.deviceId.toList())
                }
            }
    }
}

public class Wtsclientw(
    public var clientName: UShortArray = UShortArray(21),
    public var domain: UShortArray = UShortArray(18),
    public var userName: UShortArray = UShortArray(21),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
    public var encryptionLevel: UByte = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var clientDirectory: UShortArray = UShortArray(261),
    public var clientBuildNumber: UInt = 0u,
    public var clientHardwareId: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var deviceId: UShortArray = UShortArray(261),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsclientw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsclientw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 2304L
                override fun readNative(addr: Long): Wtsclientw =
                    Wtsclientw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                        ).readNative(addr + 42L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr + 78L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 120L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 642L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1168L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (31).toInt())
                        ).readNative(addr + 1172L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1234L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1236L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1238L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 1240L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1764L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1768L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1772L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1774L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1776L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1778L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 1780L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsclientw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr, value.clientName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                    ).writeNative(addr + 42L, value.domain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr + 78L, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 120L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 642L, value.initialProgram.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1164L, value.encryptionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1168L, value.clientAddressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (31).toInt())
                    ).writeNative(addr + 1172L, value.clientAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1234L, value.hRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1236L, value.vRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1238L, value.colorDepth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 1240L, value.clientDirectory.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1764L, value.clientBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1768L, value.clientHardwareId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1772L, value.clientProductId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1774L, value.outBufCountHost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1776L, value.outBufCountClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1778L, value.outBufLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 1780L, value.deviceId.toList())
                }
            }
    }
}

public data class Wtsconfiginfoa(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var logonUserName: ByteArray = ByteArray(21),
    public var logonDomain: ByteArray = ByteArray(18),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
    public var applicationName: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsconfiginfoa) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.shadowSettings != other.shadowSettings) return false
        if (!this.logonUserName.contentEquals(other.logonUserName)) return false
        if (!this.logonDomain.contentEquals(other.logonDomain)) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (!this.applicationName.contentEquals(other.applicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.shadowSettings.hashCode()
        result = 31 * result + this.logonUserName.contentHashCode()
        result = 31 * result + this.logonDomain.contentHashCode()
        result = 31 * result + this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.applicationName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsconfiginfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsconfiginfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 848L
                override fun readNative(addr: Long): Wtsconfiginfoa =
                    Wtsconfiginfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                        ).readNative(addr + 45L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 63L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 324L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 585L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsconfiginfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fConnectClientDrivesAtLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fConnectPrinterAtLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fDisablePrinterRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fDisableDefaultMainClientPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.shadowSettings)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr + 24L, value.logonUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                    ).writeNative(addr + 45L, value.logonDomain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 63L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 324L, value.initialProgram.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 585L, value.applicationName.toList())
                }
            }
    }
}

public data class Wtsconfiginfow(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var logonUserName: UShortArray = UShortArray(21),
    public var logonDomain: UShortArray = UShortArray(18),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
    public var applicationName: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsconfiginfow) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.shadowSettings != other.shadowSettings) return false
        if (!this.logonUserName.contentEquals(other.logonUserName)) return false
        if (!this.logonDomain.contentEquals(other.logonDomain)) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (!this.applicationName.contentEquals(other.applicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.shadowSettings.hashCode()
        result = 31 * result + this.logonUserName.contentHashCode()
        result = 31 * result + this.logonDomain.contentHashCode()
        result = 31 * result + this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.applicationName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsconfiginfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsconfiginfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1668L
                override fun readNative(addr: Long): Wtsconfiginfow =
                    Wtsconfiginfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                        ).readNative(addr + 66L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 102L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 624L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 1146L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsconfiginfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fConnectClientDrivesAtLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fConnectPrinterAtLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fDisablePrinterRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fDisableDefaultMainClientPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.shadowSettings)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr + 24L, value.logonUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                    ).writeNative(addr + 66L, value.logonDomain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 102L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 624L, value.initialProgram.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 1146L, value.applicationName.toList())
                }
            }
    }
}

public data class Wtsinfoa(
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBy: UInt = 0u,
    public var winStationName: ByteArray = ByteArray(32),
    public var domain: ByteArray = ByteArray(17),
    public var userName: ByteArray = ByteArray(21),
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var logonTime: Long = 0L,
    public var currentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsinfoa) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.incomingBytes != other.incomingBytes) return false
        if (this.outgoingBytes != other.outgoingBytes) return false
        if (this.incomingFrames != other.incomingFrames) return false
        if (this.outgoingFrames != other.outgoingFrames) return false
        if (this.incomingCompressedBytes != other.incomingCompressedBytes) return false
        if (this.outgoingCompressedBy != other.outgoingCompressedBy) return false
        if (!this.winStationName.contentEquals(other.winStationName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (this.connectTime != other.connectTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.lastInputTime != other.lastInputTime) return false
        if (this.logonTime != other.logonTime) return false
        if (this.currentTime != other.currentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.incomingBytes.hashCode()
        result = 31 * result + this.outgoingBytes.hashCode()
        result = 31 * result + this.incomingFrames.hashCode()
        result = 31 * result + this.outgoingFrames.hashCode()
        result = 31 * result + this.incomingCompressedBytes.hashCode()
        result = 31 * result + this.outgoingCompressedBy.hashCode()
        result = 31 * result + this.winStationName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.connectTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.lastInputTime.hashCode()
        result = 31 * result + this.logonTime.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsinfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsinfoa> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Wtsinfoa =
                    Wtsinfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 32L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 64L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr + 81L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: Wtsinfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.incomingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.outgoingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.incomingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.outgoingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.incomingCompressedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.outgoingCompressedBy)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 32L, value.winStationName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 64L, value.domain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr + 81L, value.userName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.connectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.disconnectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.lastInputTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.logonTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.currentTime)
                }
            }
    }
}

public data class Wtsinfoexa(
    public var level: UInt = 0u,
    public var data: WtsinfoexLevelA = WtsinfoexLevelA(),
)

public data class Wtsinfoexw(
    public var level: UInt = 0u,
    public var data: WtsinfoexLevelW = WtsinfoexLevelW(),
)

public class WtsinfoexLevel1A(
    public var sessionId: UInt = 0u,
    public var sessionState: WtsConnectstateClass = 0,
    public var sessionFlags: Int = 0,
    public var winStationName: ByteArray = ByteArray(33),
    public var userName: ByteArray = ByteArray(21),
    public var domainName: ByteArray = ByteArray(18),
    public var logonTime: Long = 0L,
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var currentTime: Long = 0L,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsinfoexLevel1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsinfoexLevel1A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): WtsinfoexLevel1A =
                    WtsinfoexLevel1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (33).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr + 45L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                        ).readNative(addr + 66L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                    )
                override fun writeNative(addr: Long, value: WtsinfoexLevel1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.sessionState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.sessionFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (33).toInt())
                    ).writeNative(addr + 12L, value.winStationName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr + 45L, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                    ).writeNative(addr + 66L, value.domainName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.logonTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.connectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.disconnectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.lastInputTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.currentTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.incomingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.outgoingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.incomingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.outgoingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.incomingCompressedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.outgoingCompressedBytes)
                }
            }
    }
}

public class WtsinfoexLevel1W(
    public var sessionId: UInt = 0u,
    public var sessionState: WtsConnectstateClass = 0,
    public var sessionFlags: Int = 0,
    public var winStationName: UShortArray = UShortArray(33),
    public var userName: UShortArray = UShortArray(21),
    public var domainName: UShortArray = UShortArray(18),
    public var logonTime: Long = 0L,
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var currentTime: Long = 0L,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsinfoexLevel1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsinfoexLevel1W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): WtsinfoexLevel1W =
                    WtsinfoexLevel1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr + 78L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                        ).readNative(addr + 120L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                    )
                override fun writeNative(addr: Long, value: WtsinfoexLevel1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.sessionState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.sessionFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 12L, value.winStationName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr + 78L, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                    ).writeNative(addr + 120L, value.domainName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.logonTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.connectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 176L, value.disconnectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.lastInputTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.currentTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.incomingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.outgoingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.incomingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.outgoingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.incomingCompressedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.outgoingCompressedBytes)
                }
            }
    }
}

public data class WtsinfoexLevelA(
    public var wTSInfoExLevel1: WtsinfoexLevel1A = WtsinfoexLevel1A(),
)

public data class WtsinfoexLevelW(
    public var wTSInfoExLevel1: WtsinfoexLevel1W = WtsinfoexLevel1W(),
)

public data class Wtsinfow(
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
    public var winStationName: UShortArray = UShortArray(32),
    public var domain: UShortArray = UShortArray(17),
    public var userName: UShortArray = UShortArray(21),
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var logonTime: Long = 0L,
    public var currentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsinfow) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.incomingBytes != other.incomingBytes) return false
        if (this.outgoingBytes != other.outgoingBytes) return false
        if (this.incomingFrames != other.incomingFrames) return false
        if (this.outgoingFrames != other.outgoingFrames) return false
        if (this.incomingCompressedBytes != other.incomingCompressedBytes) return false
        if (this.outgoingCompressedBytes != other.outgoingCompressedBytes) return false
        if (!this.winStationName.contentEquals(other.winStationName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (this.connectTime != other.connectTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.lastInputTime != other.lastInputTime) return false
        if (this.logonTime != other.logonTime) return false
        if (this.currentTime != other.currentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.incomingBytes.hashCode()
        result = 31 * result + this.outgoingBytes.hashCode()
        result = 31 * result + this.incomingFrames.hashCode()
        result = 31 * result + this.outgoingFrames.hashCode()
        result = 31 * result + this.incomingCompressedBytes.hashCode()
        result = 31 * result + this.outgoingCompressedBytes.hashCode()
        result = 31 * result + this.winStationName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.connectTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.lastInputTime.hashCode()
        result = 31 * result + this.logonTime.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsinfow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): Wtsinfow =
                    Wtsinfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 32L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 96L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr + 130L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 208L),
                    )
                override fun writeNative(addr: Long, value: Wtsinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.incomingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.outgoingBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.incomingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.outgoingFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.incomingCompressedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.outgoingCompressedBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 32L, value.winStationName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 96L, value.domain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr + 130L, value.userName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 176L, value.connectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.disconnectTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.lastInputTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 200L, value.logonTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 208L, value.currentTime)
                }
            }
    }
}

public class Wtslistenerconfiga(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var maxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var colorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var lanAdapter: UInt = 0u,
    public var portNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var timeoutSettingsConnection: UInt = 0u,
    public var timeoutSettingsDisconnection: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var securityLayer: UInt = 0u,
    public var minEncryptionLevel: UInt = 0u,
    public var userAuthentication: UInt = 0u,
    public var comment: ByteArray = ByteArray(61),
    public var logonUserName: ByteArray = ByteArray(21),
    public var logonDomain: ByteArray = ByteArray(18),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtslistenerconfiga> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtslistenerconfiga> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 728L
                override fun readNative(addr: Long): Wtslistenerconfiga =
                    Wtslistenerconfiga(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (61).toInt())
                        ).readNative(addr + 104L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                        ).readNative(addr + 165L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                        ).readNative(addr + 186L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 204L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 465L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Wtslistenerconfiga) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fEnableListener)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxConnectionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fPromptForPassword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fInheritColorDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.colorDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fInheritBrokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.brokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fDisablePrinterRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fDisableDriveRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fDisableComPortRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.fDisableLPTPortRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fDisableClipboardRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fDisableAudioRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fDisablePNPRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fDisableDefaultMainClientPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.lanAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.fInheritShadowSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.shadowSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.timeoutSettingsConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.timeoutSettingsDisconnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.timeoutSettingsIdle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.securityLayer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.minEncryptionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.userAuthentication)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (61).toInt())
                    ).writeNative(addr + 104L, value.comment.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (21).toInt())
                    ).writeNative(addr + 165L, value.logonUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (18).toInt())
                    ).writeNative(addr + 186L, value.logonDomain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 204L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 465L, value.initialProgram.toList())
                }
            }
    }
}

public class Wtslistenerconfigw(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var maxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var colorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var lanAdapter: UInt = 0u,
    public var portNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var timeoutSettingsConnection: UInt = 0u,
    public var timeoutSettingsDisconnection: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var securityLayer: UInt = 0u,
    public var minEncryptionLevel: UInt = 0u,
    public var userAuthentication: UInt = 0u,
    public var comment: UShortArray = UShortArray(61),
    public var logonUserName: UShortArray = UShortArray(21),
    public var logonDomain: UShortArray = UShortArray(18),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtslistenerconfigw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtslistenerconfigw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1348L
                override fun readNative(addr: Long): Wtslistenerconfigw =
                    Wtslistenerconfigw(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (61).toInt())
                        ).readNative(addr + 104L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                        ).readNative(addr + 226L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                        ).readNative(addr + 268L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 304L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 826L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Wtslistenerconfigw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fEnableListener)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxConnectionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fPromptForPassword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fInheritColorDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.colorDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fInheritBrokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.brokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fDisablePrinterRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fDisableDriveRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fDisableComPortRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.fDisableLPTPortRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fDisableClipboardRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fDisableAudioRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fDisablePNPRedirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fDisableDefaultMainClientPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.lanAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.fInheritShadowSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.shadowSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.timeoutSettingsConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.timeoutSettingsDisconnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.timeoutSettingsIdle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.securityLayer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.minEncryptionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.userAuthentication)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (61).toInt())
                    ).writeNative(addr + 104L, value.comment.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (21).toInt())
                    ).writeNative(addr + 226L, value.logonUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (18).toInt())
                    ).writeNative(addr + 268L, value.logonDomain.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 304L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 826L, value.initialProgram.toList())
                }
            }
    }
}

public data class WtssbxIpAddress(
    public var addressFamily: WtssbxAddressFamily = 0,
    public var address: UByteArray = UByteArray(16),
    public var portNumber: UShort = 0u,
    public var dwScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxIpAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.portNumber != other.portNumber) return false
        if (this.dwScope != other.dwScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.dwScope.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxIpAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxIpAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): WtssbxIpAddress =
                    WtssbxIpAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WtssbxIpAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.addressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwScope)
                }
            }
    }
}

public data class WtssbxMachineConnectInfo(
    public var wczMachineFQDN: UShortArray = UShortArray(257),
    public var wczMachineNetBiosName: UShortArray = UShortArray(17),
    public var dwNumOfIPAddr: UInt = 0u,
    public var iPaddr: List<WtssbxIpAddress> = List(12) { WtssbxIpAddress() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxMachineConnectInfo) return false
        if (!this.wczMachineFQDN.contentEquals(other.wczMachineFQDN)) return false
        if (!this.wczMachineNetBiosName.contentEquals(other.wczMachineNetBiosName)) return false
        if (this.dwNumOfIPAddr != other.dwNumOfIPAddr) return false
        if (this.iPaddr != other.iPaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wczMachineFQDN.contentHashCode()
        result = 31 * result + this.wczMachineNetBiosName.contentHashCode()
        result = 31 * result + this.dwNumOfIPAddr.hashCode()
        result = 31 * result + this.iPaddr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxMachineConnectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxMachineConnectInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 888L
                override fun readNative(addr: Long): WtssbxMachineConnectInfo =
                    WtssbxMachineConnectInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 514L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 548L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WtssbxIpAddress.typeLayout(), (12).toInt())
                        ).readNative(addr + 552L),
                    )
                override fun writeNative(addr: Long, value: WtssbxMachineConnectInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr, value.wczMachineFQDN.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 514L, value.wczMachineNetBiosName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 548L, value.dwNumOfIPAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WtssbxIpAddress.typeLayout(), (12).toInt())
                    ).writeNative(addr + 552L, value.iPaddr)
                }
            }
    }
}

public data class WtssbxMachineInfo(
    public var clientConnectInfo: WtssbxMachineConnectInfo = WtssbxMachineConnectInfo(),
    public var wczFarmName: UShortArray = UShortArray(257),
    public var internalIPAddress: WtssbxIpAddress = WtssbxIpAddress(),
    public var dwMaxSessionsLimit: UInt = 0u,
    public var serverWeight: UInt = 0u,
    public var singleSessionMode: WtssbxMachineSessionMode = 0,
    public var inDrain: WtssbxMachineDrain = 0,
    public var machineState: WtssbxMachineState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxMachineInfo) return false
        if (this.clientConnectInfo != other.clientConnectInfo) return false
        if (!this.wczFarmName.contentEquals(other.wczFarmName)) return false
        if (this.internalIPAddress != other.internalIPAddress) return false
        if (this.dwMaxSessionsLimit != other.dwMaxSessionsLimit) return false
        if (this.serverWeight != other.serverWeight) return false
        if (this.singleSessionMode != other.singleSessionMode) return false
        if (this.inDrain != other.inDrain) return false
        if (this.machineState != other.machineState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientConnectInfo.hashCode()
        result = 31 * result + this.wczFarmName.contentHashCode()
        result = 31 * result + this.internalIPAddress.hashCode()
        result = 31 * result + this.dwMaxSessionsLimit.hashCode()
        result = 31 * result + this.serverWeight.hashCode()
        result = 31 * result + this.singleSessionMode.hashCode()
        result = 31 * result + this.inDrain.hashCode()
        result = 31 * result + this.machineState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxMachineInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssbxMachineInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1452L
                override fun readNative(addr: Long): WtssbxMachineInfo =
                    WtssbxMachineInfo(
                        (WtssbxMachineConnectInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 888L).toUShortArray(),
                        (WtssbxIpAddress.typeLayout()).readNative(addr + 1404L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1432L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1436L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1440L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1444L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1448L),
                    )
                override fun writeNative(addr: Long, value: WtssbxMachineInfo) {
                    (WtssbxMachineConnectInfo.typeLayout()).writeNative(addr, value.clientConnectInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 888L, value.wczFarmName.toList())
                    (WtssbxIpAddress.typeLayout()).writeNative(addr + 1404L, value.internalIPAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1432L, value.dwMaxSessionsLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1436L, value.serverWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1440L, value.singleSessionMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1444L, value.inDrain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1448L, value.machineState)
                }
            }
    }
}

public data class WtssbxSessionInfo(
    public var wszUserName: UShortArray = UShortArray(105),
    public var wszDomainName: UShortArray = UShortArray(257),
    public var applicationType: UShortArray = UShortArray(257),
    public var dwSessionId: UInt = 0u,
    public var createTime: Filetime = Filetime(),
    public var disconnectTime: Filetime = Filetime(),
    public var sessionState: WtssbxSessionState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxSessionInfo) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszDomainName.contentEquals(other.wszDomainName)) return false
        if (!this.applicationType.contentEquals(other.applicationType)) return false
        if (this.dwSessionId != other.dwSessionId) return false
        if (this.createTime != other.createTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.sessionState != other.sessionState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszUserName.contentHashCode()
        result = 31 * result + this.wszDomainName.contentHashCode()
        result = 31 * result + this.applicationType.contentHashCode()
        result = 31 * result + this.dwSessionId.hashCode()
        result = 31 * result + this.createTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.sessionState.hashCode()
        return result
    }
}

public data class WtssessionNotification(
    public var cbSize: UInt = 0u,
    public var dwSessionId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssessionNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtssessionNotification> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WtssessionNotification =
                    WtssessionNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WtssessionNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSessionId)
                }
            }
    }
}

public class Wtsuserconfiga(
    public var source: UInt = 0u,
    public var inheritInitialProgram: UInt = 0u,
    public var allowLogonTerminalServer: UInt = 0u,
    public var timeoutSettingsConnections: UInt = 0u,
    public var timeoutSettingsDisconnections: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var deviceClientDrives: UInt = 0u,
    public var deviceClientPrinters: UInt = 0u,
    public var clientDefaultPrinter: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var reconnectSettings: UInt = 0u,
    public var shadowingSettings: UInt = 0u,
    public var terminalServerRemoteHomeDir: UInt = 0u,
    public var initialProgram: ByteArray = ByteArray(261),
    public var workDirectory: ByteArray = ByteArray(261),
    public var terminalServerProfilePath: ByteArray = ByteArray(261),
    public var terminalServerHomeDir: ByteArray = ByteArray(261),
    public var terminalServerHomeDirDrive: ByteArray = ByteArray(4),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsuserconfiga> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsuserconfiga> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1100L
                override fun readNative(addr: Long): Wtsuserconfiga =
                    Wtsuserconfiga(
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 52L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 313L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 574L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 835L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 1096L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsuserconfiga) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.source)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inheritInitialProgram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allowLogonTerminalServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeoutSettingsConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeoutSettingsDisconnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeoutSettingsIdle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.deviceClientDrives)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.deviceClientPrinters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.clientDefaultPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.brokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reconnectSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.shadowingSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.terminalServerRemoteHomeDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 52L, value.initialProgram.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 313L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 574L, value.terminalServerProfilePath.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 835L, value.terminalServerHomeDir.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 1096L, value.terminalServerHomeDirDrive.toList())
                }
            }
    }
}

public class Wtsuserconfigw(
    public var source: UInt = 0u,
    public var inheritInitialProgram: UInt = 0u,
    public var allowLogonTerminalServer: UInt = 0u,
    public var timeoutSettingsConnections: UInt = 0u,
    public var timeoutSettingsDisconnections: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var deviceClientDrives: UInt = 0u,
    public var deviceClientPrinters: UInt = 0u,
    public var clientDefaultPrinter: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var reconnectSettings: UInt = 0u,
    public var shadowingSettings: UInt = 0u,
    public var terminalServerRemoteHomeDir: UInt = 0u,
    public var initialProgram: UShortArray = UShortArray(261),
    public var workDirectory: UShortArray = UShortArray(261),
    public var terminalServerProfilePath: UShortArray = UShortArray(261),
    public var terminalServerHomeDir: UShortArray = UShortArray(261),
    public var terminalServerHomeDirDrive: UShortArray = UShortArray(4),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsuserconfigw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wtsuserconfigw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 2148L
                override fun readNative(addr: Long): Wtsuserconfigw =
                    Wtsuserconfigw(
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 52L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 574L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 1096L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 1618L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 2140L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Wtsuserconfigw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.source)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inheritInitialProgram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allowLogonTerminalServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeoutSettingsConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeoutSettingsDisconnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeoutSettingsIdle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.deviceClientDrives)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.deviceClientPrinters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.clientDefaultPrinter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.brokenTimeoutSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reconnectSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.shadowingSettings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.terminalServerRemoteHomeDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 52L, value.initialProgram.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 574L, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 1096L, value.terminalServerProfilePath.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 1618L, value.terminalServerHomeDir.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 2140L, value.terminalServerHomeDirDrive.toList())
                }
            }
    }
}

public data class WtsCacheStats(
    public var specific: UInt = 0u,
    public var data: WtsCacheStatsUn = WtsCacheStatsUn(),
    public var protocolType: UShort = 0u,
    public var length: UShort = 0u,
)

public data class WtsCacheStatsUn(
    public var protocolCache: List<WtsProtocolCache> = List(4) { WtsProtocolCache() },
    public var tShareCacheStats: UInt = 0u,
    public var reserved: UIntArray = UIntArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsCacheStatsUn) return false
        if (this.protocolCache != other.protocolCache) return false
        if (this.tShareCacheStats != other.tShareCacheStats) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocolCache.hashCode()
        result = 31 * result + this.tShareCacheStats.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WtsClientAddress(
    public var addressFamily: UInt = 0u,
    public var address: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsClientAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsClientAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsClientAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WtsClientAddress =
                    WtsClientAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WtsClientAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                }
            }
    }
}

public class WtsClientData(
    public var fDisableCtrlAltDel: Boolean = false,
    public var fDoubleClickDetect: Boolean = false,
    public var fEnableWindowsKey: Boolean = false,
    public var fHideTitleBar: Boolean = false,
    public var fInheritAutoLogon: Bool = 0,
    public var fPromptForPassword: Boolean = false,
    public var fUsingSavedCreds: Boolean = false,
    public var domain: UShortArray = UShortArray(256),
    public var userName: UShortArray = UShortArray(256),
    public var password: UShortArray = UShortArray(256),
    public var fPasswordIsScPin: Boolean = false,
    public var fInheritInitialProgram: Bool = 0,
    public var workDirectory: UShortArray = UShortArray(257),
    public var initialProgram: UShortArray = UShortArray(257),
    public var fMaximizeShell: Boolean = false,
    public var encryptionLevel: UByte = 0u,
    public var performanceFlags: UInt = 0u,
    public var protocolName: UShortArray = UShortArray(9),
    public var protocolType: UShort = 0u,
    public var fInheritColorDepth: Bool = 0,
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var displayDriverName: UShortArray = UShortArray(9),
    public var displayDeviceName: UShortArray = UShortArray(20),
    public var fMouse: Boolean = false,
    public var keyboardLayout: UInt = 0u,
    public var keyboardType: UInt = 0u,
    public var keyboardSubType: UInt = 0u,
    public var keyboardFunctionKey: UInt = 0u,
    public var imeFileName: UShortArray = UShortArray(33),
    public var activeInputLocale: UInt = 0u,
    public var fNoAudioPlayback: Boolean = false,
    public var fRemoteConsoleAudio: Boolean = false,
    public var audioDriverName: UShortArray = UShortArray(9),
    public var clientTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation(),
    public var clientName: UShortArray = UShortArray(21),
    public var serialNumber: UInt = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var clientSockAddress: WtsSockaddr = WtsSockaddr(),
    public var clientDirectory: UShortArray = UShortArray(257),
    public var clientBuildNumber: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var clientSessionId: UInt = 0u,
    public var clientDigProductId: UShortArray = UShortArray(33),
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNP: Boolean = false,
)

public data class WtsClientDisplay(
    public var horizontalResolution: UInt = 0u,
    public var verticalResolution: UInt = 0u,
    public var colorDepth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsClientDisplay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsClientDisplay> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): WtsClientDisplay =
                    WtsClientDisplay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WtsClientDisplay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.horizontalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.verticalResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.colorDepth)
                }
            }
    }
}

public data class WtsDisplayIoctl(
    public var pDisplayIOCtlData: UByteArray = UByteArray(256),
    public var cbDisplayIOCtlData: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsDisplayIoctl) return false
        if (!this.pDisplayIOCtlData.contentEquals(other.pDisplayIOCtlData)) return false
        if (this.cbDisplayIOCtlData != other.cbDisplayIOCtlData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDisplayIOCtlData.contentHashCode()
        result = 31 * result + this.cbDisplayIOCtlData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsDisplayIoctl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsDisplayIoctl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 260L
                override fun readNative(addr: Long): WtsDisplayIoctl =
                    WtsDisplayIoctl(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                    )
                override fun writeNative(addr: Long, value: WtsDisplayIoctl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr, value.pDisplayIOCtlData.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.cbDisplayIOCtlData)
                }
            }
    }
}

public data class WtsLicenseCapabilities(
    public var keyExchangeAlg: UInt = 0u,
    public var protocolVer: UInt = 0u,
    public var fAuthenticateServer: Bool = 0,
    public var certType: WtsCertType = 0,
    public var cbClientName: UInt = 0u,
    public var rgbClientName: UByteArray = UByteArray(42),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsLicenseCapabilities) return false
        if (this.keyExchangeAlg != other.keyExchangeAlg) return false
        if (this.protocolVer != other.protocolVer) return false
        if (this.fAuthenticateServer != other.fAuthenticateServer) return false
        if (this.certType != other.certType) return false
        if (this.cbClientName != other.cbClientName) return false
        if (!this.rgbClientName.contentEquals(other.rgbClientName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyExchangeAlg.hashCode()
        result = 31 * result + this.protocolVer.hashCode()
        result = 31 * result + this.fAuthenticateServer.hashCode()
        result = 31 * result + this.certType.hashCode()
        result = 31 * result + this.cbClientName.hashCode()
        result = 31 * result + this.rgbClientName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsLicenseCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsLicenseCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): WtsLicenseCapabilities =
                    WtsLicenseCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (42).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WtsLicenseCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.keyExchangeAlg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.protocolVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fAuthenticateServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.certType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbClientName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (42).toInt())
                    ).writeNative(addr + 20L, value.rgbClientName.toList())
                }
            }
    }
}

public data class WtsPolicyData(
    public var fDisableEncryption: Boolean = false,
    public var fDisableAutoReconnect: Boolean = false,
    public var colorDepth: UInt = 0u,
    public var minEncryptionLevel: UByte = 0u,
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNPRedir: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsPolicyData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsPolicyData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WtsPolicyData =
                    WtsPolicyData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: WtsPolicyData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.fDisableEncryption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.fDisableAutoReconnect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.colorDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.minEncryptionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.fDisableCpm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.fDisableCdm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.fDisableCcm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.fDisableLPT)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.fDisableClip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 14L, value.fDisablePNPRedir)
                }
            }
    }
}

public class WtsProcessInfoa internal constructor(
    public var sessionId: UInt,
    public var processId: UInt,
    pProcessNameCtorArg: Pstr,
    pUserSidCtorArg: Psid,
) {
    public var pProcessName: Pstr = pProcessNameCtorArg
        internal set

    public var pUserSid: Psid = pUserSidCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        processId = 0u,
        pProcessNameCtorArg = MutPtr(0L),
        pUserSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): Pstr = this.pProcessName

    public operator fun component4(): Psid = this.pUserSid

    public fun copy(sessionId: UInt = this.sessionId, processId: UInt = this.processId, pProcessName: Pstr = this.pProcessName, pUserSid: Psid = this.pUserSid): WtsProcessInfoa = WtsProcessInfoa(sessionId = sessionId, processId = processId, pProcessNameCtorArg = pProcessName, pUserSidCtorArg = pUserSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProcessInfoa) return false
        if (this.sessionId != other.sessionId) return false
        if (this.processId != other.processId) return false
        if (this.pProcessName != other.pProcessName) return false
        if (this.pUserSid != other.pUserSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.pProcessName.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            processId: UInt = 0u,
            pProcessName: Pstr = MutPtr(0L),
            pUserSid: Psid = MutPtr(0L),
        ): WtsProcessInfoa =
            WtsProcessInfoa(
                sessionId = sessionId,
                processId = processId,
                pProcessNameCtorArg = pProcessName,
                pUserSidCtorArg = pUserSid,
            )
    }
}

public class WtsProcessInfow internal constructor(
    public var sessionId: UInt,
    public var processId: UInt,
    pProcessNameCtorArg: Pwstr,
    pUserSidCtorArg: Psid,
) {
    public var pProcessName: Pwstr = pProcessNameCtorArg
        internal set

    public var pUserSid: Psid = pUserSidCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        processId = 0u,
        pProcessNameCtorArg = MutPtr(0L),
        pUserSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): Pwstr = this.pProcessName

    public operator fun component4(): Psid = this.pUserSid

    public fun copy(sessionId: UInt = this.sessionId, processId: UInt = this.processId, pProcessName: Pwstr = this.pProcessName, pUserSid: Psid = this.pUserSid): WtsProcessInfow = WtsProcessInfow(sessionId = sessionId, processId = processId, pProcessNameCtorArg = pProcessName, pUserSidCtorArg = pUserSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProcessInfow) return false
        if (this.sessionId != other.sessionId) return false
        if (this.processId != other.processId) return false
        if (this.pProcessName != other.pProcessName) return false
        if (this.pUserSid != other.pUserSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.pProcessName.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            processId: UInt = 0u,
            pProcessName: Pwstr = MutPtr(0L),
            pUserSid: Psid = MutPtr(0L),
        ): WtsProcessInfow =
            WtsProcessInfow(
                sessionId = sessionId,
                processId = processId,
                pProcessNameCtorArg = pProcessName,
                pUserSidCtorArg = pUserSid,
            )
    }
}

public class WtsProcessInfoExa internal constructor(
    public var sessionId: UInt,
    public var processId: UInt,
    pProcessNameCtorArg: Pstr,
    pUserSidCtorArg: Psid,
    public var numberOfThreads: UInt,
    public var handleCount: UInt,
    public var pagefileUsage: UInt,
    public var peakPagefileUsage: UInt,
    public var workingSetSize: UInt,
    public var peakWorkingSetSize: UInt,
    public var userTime: Long,
    public var kernelTime: Long,
) {
    public var pProcessName: Pstr = pProcessNameCtorArg
        internal set

    public var pUserSid: Psid = pUserSidCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        processId = 0u,
        pProcessNameCtorArg = MutPtr(0L),
        pUserSidCtorArg = MutPtr(0L),
        numberOfThreads = 0u,
        handleCount = 0u,
        pagefileUsage = 0u,
        peakPagefileUsage = 0u,
        workingSetSize = 0u,
        peakWorkingSetSize = 0u,
        userTime = 0L,
        kernelTime = 0L,
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): Pstr = this.pProcessName

    public operator fun component4(): Psid = this.pUserSid

    public operator fun component5(): UInt = this.numberOfThreads

    public operator fun component6(): UInt = this.handleCount

    public operator fun component7(): UInt = this.pagefileUsage

    public operator fun component8(): UInt = this.peakPagefileUsage

    public operator fun component9(): UInt = this.workingSetSize

    public operator fun component10(): UInt = this.peakWorkingSetSize

    public operator fun component11(): Long = this.userTime

    public operator fun component12(): Long = this.kernelTime

    public fun copy(sessionId: UInt = this.sessionId, processId: UInt = this.processId, pProcessName: Pstr = this.pProcessName, pUserSid: Psid = this.pUserSid, numberOfThreads: UInt = this.numberOfThreads, handleCount: UInt = this.handleCount, pagefileUsage: UInt = this.pagefileUsage, peakPagefileUsage: UInt = this.peakPagefileUsage, workingSetSize: UInt = this.workingSetSize, peakWorkingSetSize: UInt = this.peakWorkingSetSize, userTime: Long = this.userTime, kernelTime: Long = this.kernelTime): WtsProcessInfoExa = WtsProcessInfoExa(sessionId = sessionId, processId = processId, pProcessNameCtorArg = pProcessName, pUserSidCtorArg = pUserSid, numberOfThreads = numberOfThreads, handleCount = handleCount, pagefileUsage = pagefileUsage, peakPagefileUsage = peakPagefileUsage, workingSetSize = workingSetSize, peakWorkingSetSize = peakWorkingSetSize, userTime = userTime, kernelTime = kernelTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProcessInfoExa) return false
        if (this.sessionId != other.sessionId) return false
        if (this.processId != other.processId) return false
        if (this.pProcessName != other.pProcessName) return false
        if (this.pUserSid != other.pUserSid) return false
        if (this.numberOfThreads != other.numberOfThreads) return false
        if (this.handleCount != other.handleCount) return false
        if (this.pagefileUsage != other.pagefileUsage) return false
        if (this.peakPagefileUsage != other.peakPagefileUsage) return false
        if (this.workingSetSize != other.workingSetSize) return false
        if (this.peakWorkingSetSize != other.peakWorkingSetSize) return false
        if (this.userTime != other.userTime) return false
        if (this.kernelTime != other.kernelTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.pProcessName.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        result = 31 * result + this.numberOfThreads.hashCode()
        result = 31 * result + this.handleCount.hashCode()
        result = 31 * result + this.pagefileUsage.hashCode()
        result = 31 * result + this.peakPagefileUsage.hashCode()
        result = 31 * result + this.workingSetSize.hashCode()
        result = 31 * result + this.peakWorkingSetSize.hashCode()
        result = 31 * result + this.userTime.hashCode()
        result = 31 * result + this.kernelTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            processId: UInt = 0u,
            pProcessName: Pstr = MutPtr(0L),
            pUserSid: Psid = MutPtr(0L),
            numberOfThreads: UInt = 0u,
            handleCount: UInt = 0u,
            pagefileUsage: UInt = 0u,
            peakPagefileUsage: UInt = 0u,
            workingSetSize: UInt = 0u,
            peakWorkingSetSize: UInt = 0u,
            userTime: Long = 0L,
            kernelTime: Long = 0L,
        ): WtsProcessInfoExa =
            WtsProcessInfoExa(
                sessionId = sessionId,
                processId = processId,
                pProcessNameCtorArg = pProcessName,
                pUserSidCtorArg = pUserSid,
                numberOfThreads = numberOfThreads,
                handleCount = handleCount,
                pagefileUsage = pagefileUsage,
                peakPagefileUsage = peakPagefileUsage,
                workingSetSize = workingSetSize,
                peakWorkingSetSize = peakWorkingSetSize,
                userTime = userTime,
                kernelTime = kernelTime,
            )
    }
}

public class WtsProcessInfoExw internal constructor(
    public var sessionId: UInt,
    public var processId: UInt,
    pProcessNameCtorArg: Pwstr,
    pUserSidCtorArg: Psid,
    public var numberOfThreads: UInt,
    public var handleCount: UInt,
    public var pagefileUsage: UInt,
    public var peakPagefileUsage: UInt,
    public var workingSetSize: UInt,
    public var peakWorkingSetSize: UInt,
    public var userTime: Long,
    public var kernelTime: Long,
) {
    public var pProcessName: Pwstr = pProcessNameCtorArg
        internal set

    public var pUserSid: Psid = pUserSidCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        processId = 0u,
        pProcessNameCtorArg = MutPtr(0L),
        pUserSidCtorArg = MutPtr(0L),
        numberOfThreads = 0u,
        handleCount = 0u,
        pagefileUsage = 0u,
        peakPagefileUsage = 0u,
        workingSetSize = 0u,
        peakWorkingSetSize = 0u,
        userTime = 0L,
        kernelTime = 0L,
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): Pwstr = this.pProcessName

    public operator fun component4(): Psid = this.pUserSid

    public operator fun component5(): UInt = this.numberOfThreads

    public operator fun component6(): UInt = this.handleCount

    public operator fun component7(): UInt = this.pagefileUsage

    public operator fun component8(): UInt = this.peakPagefileUsage

    public operator fun component9(): UInt = this.workingSetSize

    public operator fun component10(): UInt = this.peakWorkingSetSize

    public operator fun component11(): Long = this.userTime

    public operator fun component12(): Long = this.kernelTime

    public fun copy(sessionId: UInt = this.sessionId, processId: UInt = this.processId, pProcessName: Pwstr = this.pProcessName, pUserSid: Psid = this.pUserSid, numberOfThreads: UInt = this.numberOfThreads, handleCount: UInt = this.handleCount, pagefileUsage: UInt = this.pagefileUsage, peakPagefileUsage: UInt = this.peakPagefileUsage, workingSetSize: UInt = this.workingSetSize, peakWorkingSetSize: UInt = this.peakWorkingSetSize, userTime: Long = this.userTime, kernelTime: Long = this.kernelTime): WtsProcessInfoExw = WtsProcessInfoExw(sessionId = sessionId, processId = processId, pProcessNameCtorArg = pProcessName, pUserSidCtorArg = pUserSid, numberOfThreads = numberOfThreads, handleCount = handleCount, pagefileUsage = pagefileUsage, peakPagefileUsage = peakPagefileUsage, workingSetSize = workingSetSize, peakWorkingSetSize = peakWorkingSetSize, userTime = userTime, kernelTime = kernelTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProcessInfoExw) return false
        if (this.sessionId != other.sessionId) return false
        if (this.processId != other.processId) return false
        if (this.pProcessName != other.pProcessName) return false
        if (this.pUserSid != other.pUserSid) return false
        if (this.numberOfThreads != other.numberOfThreads) return false
        if (this.handleCount != other.handleCount) return false
        if (this.pagefileUsage != other.pagefileUsage) return false
        if (this.peakPagefileUsage != other.peakPagefileUsage) return false
        if (this.workingSetSize != other.workingSetSize) return false
        if (this.peakWorkingSetSize != other.peakWorkingSetSize) return false
        if (this.userTime != other.userTime) return false
        if (this.kernelTime != other.kernelTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.pProcessName.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        result = 31 * result + this.numberOfThreads.hashCode()
        result = 31 * result + this.handleCount.hashCode()
        result = 31 * result + this.pagefileUsage.hashCode()
        result = 31 * result + this.peakPagefileUsage.hashCode()
        result = 31 * result + this.workingSetSize.hashCode()
        result = 31 * result + this.peakWorkingSetSize.hashCode()
        result = 31 * result + this.userTime.hashCode()
        result = 31 * result + this.kernelTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            processId: UInt = 0u,
            pProcessName: Pwstr = MutPtr(0L),
            pUserSid: Psid = MutPtr(0L),
            numberOfThreads: UInt = 0u,
            handleCount: UInt = 0u,
            pagefileUsage: UInt = 0u,
            peakPagefileUsage: UInt = 0u,
            workingSetSize: UInt = 0u,
            peakWorkingSetSize: UInt = 0u,
            userTime: Long = 0L,
            kernelTime: Long = 0L,
        ): WtsProcessInfoExw =
            WtsProcessInfoExw(
                sessionId = sessionId,
                processId = processId,
                pProcessNameCtorArg = pProcessName,
                pUserSidCtorArg = pUserSid,
                numberOfThreads = numberOfThreads,
                handleCount = handleCount,
                pagefileUsage = pagefileUsage,
                peakPagefileUsage = peakPagefileUsage,
                workingSetSize = workingSetSize,
                peakWorkingSetSize = peakWorkingSetSize,
                userTime = userTime,
                kernelTime = kernelTime,
            )
    }
}

public data class WtsPropertyValue(
    public var type: UShort = 0u,
    public var u: WtsPropertyValue0 = WtsPropertyValue0(),
)

public data class WtsPropertyValue0(
    public var ulVal: UInt = 0u,
    public var strVal: WtsPropertyValue00 = WtsPropertyValue00(),
    public var bVal: WtsPropertyValue01 = WtsPropertyValue01(),
    public var guidVal: Guid = Guid(),
)

public class WtsPropertyValue01 internal constructor(
    public var size: UInt,
    pbValCtorArg: Pstr,
) {
    public var pbVal: Pstr = pbValCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        pbValCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): Pstr = this.pbVal

    public fun copy(size: UInt = this.size, pbVal: Pstr = this.pbVal): WtsPropertyValue01 = WtsPropertyValue01(size = size, pbValCtorArg = pbVal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsPropertyValue01) return false
        if (this.size != other.size) return false
        if (this.pbVal != other.pbVal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pbVal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            pbVal: Pstr = MutPtr(0L),
        ): WtsPropertyValue01 =
            WtsPropertyValue01(
                size = size,
                pbValCtorArg = pbVal,
            )
    }
}

public class WtsPropertyValue00 internal constructor(
    public var size: UInt,
    pstrValCtorArg: Pwstr,
) {
    public var pstrVal: Pwstr = pstrValCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        pstrValCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): Pwstr = this.pstrVal

    public fun copy(size: UInt = this.size, pstrVal: Pwstr = this.pstrVal): WtsPropertyValue00 = WtsPropertyValue00(size = size, pstrValCtorArg = pstrVal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsPropertyValue00) return false
        if (this.size != other.size) return false
        if (this.pstrVal != other.pstrVal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pstrVal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            pstrVal: Pwstr = MutPtr(0L),
        ): WtsPropertyValue00 =
            WtsPropertyValue00(
                size = size,
                pstrValCtorArg = pstrVal,
            )
    }
}

public data class WtsProtocolCache(
    public var cacheReads: UInt = 0u,
    public var cacheHits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsProtocolCache> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsProtocolCache> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WtsProtocolCache =
                    WtsProtocolCache(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WtsProtocolCache) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cacheReads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cacheHits)
                }
            }
    }
}

public class WtsProtocolCounters(
    public var wdBytes: UInt = 0u,
    public var wdFrames: UInt = 0u,
    public var waitForOutBuf: UInt = 0u,
    public var frames: UInt = 0u,
    public var bytes: UInt = 0u,
    public var compressedBytes: UInt = 0u,
    public var compressFlushes: UInt = 0u,
    public var errors: UInt = 0u,
    public var timeouts: UInt = 0u,
    public var asyncFramingError: UInt = 0u,
    public var asyncOverrunError: UInt = 0u,
    public var asyncOverflowError: UInt = 0u,
    public var asyncParityError: UInt = 0u,
    public var tdErrors: UInt = 0u,
    public var protocolType: UShort = 0u,
    public var length: UShort = 0u,
    public var specific: UShort = 0u,
    public var reserved: UIntArray = UIntArray(100),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsProtocolCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsProtocolCounters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 464L
                override fun readNative(addr: Long): WtsProtocolCounters =
                    WtsProtocolCounters(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (100).toInt())
                        ).readNative(addr + 64L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: WtsProtocolCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wdBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wdFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.waitForOutBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.frames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.compressedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.compressFlushes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.errors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.timeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.asyncFramingError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.asyncOverrunError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.asyncOverflowError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.asyncParityError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.tdErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.specific)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (100).toInt())
                    ).writeNative(addr + 64L, value.reserved.toList())
                }
            }
    }
}

public data class WtsProtocolStatus(
    public var output: WtsProtocolCounters = WtsProtocolCounters(),
    public var input: WtsProtocolCounters = WtsProtocolCounters(),
    public var cache: WtsCacheStats = WtsCacheStats(),
    public var asyncSignal: UInt = 0u,
    public var asyncSignalMask: UInt = 0u,
    public var counters: LongArray = LongArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProtocolStatus) return false
        if (this.output != other.output) return false
        if (this.input != other.input) return false
        if (this.cache != other.cache) return false
        if (this.asyncSignal != other.asyncSignal) return false
        if (this.asyncSignalMask != other.asyncSignalMask) return false
        if (!this.counters.contentEquals(other.counters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.output.hashCode()
        result = 31 * result + this.input.hashCode()
        result = 31 * result + this.cache.hashCode()
        result = 31 * result + this.asyncSignal.hashCode()
        result = 31 * result + this.asyncSignalMask.hashCode()
        result = 31 * result + this.counters.contentHashCode()
        return result
    }
}

public class WtsServerInfoa internal constructor(
    pServerNameCtorArg: Pstr,
) {
    public var pServerName: Pstr = pServerNameCtorArg
        internal set

    public constructor() : this(
        pServerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pServerName

    public fun copy(pServerName: Pstr = this.pServerName): WtsServerInfoa = WtsServerInfoa(pServerNameCtorArg = pServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsServerInfoa) return false
        if (this.pServerName != other.pServerName) return false
        return true
    }

    override fun hashCode(): Int = this.pServerName.hashCode()

    public companion object {
        public operator fun invoke(
            pServerName: Pstr = MutPtr(0L),
        ): WtsServerInfoa =
            WtsServerInfoa(
                pServerNameCtorArg = pServerName,
            )
    }
}

public class WtsServerInfow internal constructor(
    pServerNameCtorArg: Pwstr,
) {
    public var pServerName: Pwstr = pServerNameCtorArg
        internal set

    public constructor() : this(
        pServerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pServerName

    public fun copy(pServerName: Pwstr = this.pServerName): WtsServerInfow = WtsServerInfow(pServerNameCtorArg = pServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsServerInfow) return false
        if (this.pServerName != other.pServerName) return false
        return true
    }

    override fun hashCode(): Int = this.pServerName.hashCode()

    public companion object {
        public operator fun invoke(
            pServerName: Pwstr = MutPtr(0L),
        ): WtsServerInfow =
            WtsServerInfow(
                pServerNameCtorArg = pServerName,
            )
    }
}

public data class WtsServiceState(
    public var rcmServiceState: WtsRcmServiceState = 0,
    public var rcmDrainState: WtsRcmDrainState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsServiceState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsServiceState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WtsServiceState =
                    WtsServiceState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WtsServiceState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rcmServiceState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.rcmDrainState)
                }
            }
    }
}

public data class WtsSessionAddress(
    public var addressFamily: UInt = 0u,
    public var address: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSessionAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSessionAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WtsSessionAddress =
                    WtsSessionAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WtsSessionAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                }
            }
    }
}

public data class WtsSessionId(
    public var sessionUniqueGuid: Guid = Guid(),
    public var sessionId: UInt = 0u,
)

public class WtsSessionInfoa internal constructor(
    public var sessionId: UInt,
    pWinStationNameCtorArg: Pstr,
    public var state: WtsConnectstateClass,
) {
    public var pWinStationName: Pstr = pWinStationNameCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        pWinStationNameCtorArg = MutPtr(0L),
        state = 0,
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): Pstr = this.pWinStationName

    public operator fun component3(): WtsConnectstateClass = this.state

    public fun copy(sessionId: UInt = this.sessionId, pWinStationName: Pstr = this.pWinStationName, state: WtsConnectstateClass = this.state): WtsSessionInfoa = WtsSessionInfoa(sessionId = sessionId, pWinStationNameCtorArg = pWinStationName, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionInfoa) return false
        if (this.sessionId != other.sessionId) return false
        if (this.pWinStationName != other.pWinStationName) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.pWinStationName.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            pWinStationName: Pstr = MutPtr(0L),
            state: WtsConnectstateClass = 0,
        ): WtsSessionInfoa =
            WtsSessionInfoa(
                sessionId = sessionId,
                pWinStationNameCtorArg = pWinStationName,
                state = state,
            )
    }
}

public class WtsSessionInfow internal constructor(
    public var sessionId: UInt,
    pWinStationNameCtorArg: Pwstr,
    public var state: WtsConnectstateClass,
) {
    public var pWinStationName: Pwstr = pWinStationNameCtorArg
        internal set

    public constructor() : this(
        sessionId = 0u,
        pWinStationNameCtorArg = MutPtr(0L),
        state = 0,
    )

    public operator fun component1(): UInt = this.sessionId

    public operator fun component2(): Pwstr = this.pWinStationName

    public operator fun component3(): WtsConnectstateClass = this.state

    public fun copy(sessionId: UInt = this.sessionId, pWinStationName: Pwstr = this.pWinStationName, state: WtsConnectstateClass = this.state): WtsSessionInfow = WtsSessionInfow(sessionId = sessionId, pWinStationNameCtorArg = pWinStationName, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionInfow) return false
        if (this.sessionId != other.sessionId) return false
        if (this.pWinStationName != other.pWinStationName) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.pWinStationName.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: UInt = 0u,
            pWinStationName: Pwstr = MutPtr(0L),
            state: WtsConnectstateClass = 0,
        ): WtsSessionInfow =
            WtsSessionInfow(
                sessionId = sessionId,
                pWinStationNameCtorArg = pWinStationName,
                state = state,
            )
    }
}

public class WtsSessionInfo1a internal constructor(
    public var execEnvId: UInt,
    public var state: WtsConnectstateClass,
    public var sessionId: UInt,
    pSessionNameCtorArg: Pstr,
    pHostNameCtorArg: Pstr,
    pUserNameCtorArg: Pstr,
    pDomainNameCtorArg: Pstr,
    pFarmNameCtorArg: Pstr,
) {
    public var pSessionName: Pstr = pSessionNameCtorArg
        internal set

    public var pHostName: Pstr = pHostNameCtorArg
        internal set

    public var pUserName: Pstr = pUserNameCtorArg
        internal set

    public var pDomainName: Pstr = pDomainNameCtorArg
        internal set

    public var pFarmName: Pstr = pFarmNameCtorArg
        internal set

    public constructor() : this(
        execEnvId = 0u,
        state = 0,
        sessionId = 0u,
        pSessionNameCtorArg = MutPtr(0L),
        pHostNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDomainNameCtorArg = MutPtr(0L),
        pFarmNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.execEnvId

    public operator fun component2(): WtsConnectstateClass = this.state

    public operator fun component3(): UInt = this.sessionId

    public operator fun component4(): Pstr = this.pSessionName

    public operator fun component5(): Pstr = this.pHostName

    public operator fun component6(): Pstr = this.pUserName

    public operator fun component7(): Pstr = this.pDomainName

    public operator fun component8(): Pstr = this.pFarmName

    public fun copy(execEnvId: UInt = this.execEnvId, state: WtsConnectstateClass = this.state, sessionId: UInt = this.sessionId, pSessionName: Pstr = this.pSessionName, pHostName: Pstr = this.pHostName, pUserName: Pstr = this.pUserName, pDomainName: Pstr = this.pDomainName, pFarmName: Pstr = this.pFarmName): WtsSessionInfo1a = WtsSessionInfo1a(execEnvId = execEnvId, state = state, sessionId = sessionId, pSessionNameCtorArg = pSessionName, pHostNameCtorArg = pHostName, pUserNameCtorArg = pUserName, pDomainNameCtorArg = pDomainName, pFarmNameCtorArg = pFarmName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionInfo1a) return false
        if (this.execEnvId != other.execEnvId) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.pSessionName != other.pSessionName) return false
        if (this.pHostName != other.pHostName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pDomainName != other.pDomainName) return false
        if (this.pFarmName != other.pFarmName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.execEnvId.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.pSessionName.hashCode()
        result = 31 * result + this.pHostName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pDomainName.hashCode()
        result = 31 * result + this.pFarmName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            execEnvId: UInt = 0u,
            state: WtsConnectstateClass = 0,
            sessionId: UInt = 0u,
            pSessionName: Pstr = MutPtr(0L),
            pHostName: Pstr = MutPtr(0L),
            pUserName: Pstr = MutPtr(0L),
            pDomainName: Pstr = MutPtr(0L),
            pFarmName: Pstr = MutPtr(0L),
        ): WtsSessionInfo1a =
            WtsSessionInfo1a(
                execEnvId = execEnvId,
                state = state,
                sessionId = sessionId,
                pSessionNameCtorArg = pSessionName,
                pHostNameCtorArg = pHostName,
                pUserNameCtorArg = pUserName,
                pDomainNameCtorArg = pDomainName,
                pFarmNameCtorArg = pFarmName,
            )
    }
}

public class WtsSessionInfo1w internal constructor(
    public var execEnvId: UInt,
    public var state: WtsConnectstateClass,
    public var sessionId: UInt,
    pSessionNameCtorArg: Pwstr,
    pHostNameCtorArg: Pwstr,
    pUserNameCtorArg: Pwstr,
    pDomainNameCtorArg: Pwstr,
    pFarmNameCtorArg: Pwstr,
) {
    public var pSessionName: Pwstr = pSessionNameCtorArg
        internal set

    public var pHostName: Pwstr = pHostNameCtorArg
        internal set

    public var pUserName: Pwstr = pUserNameCtorArg
        internal set

    public var pDomainName: Pwstr = pDomainNameCtorArg
        internal set

    public var pFarmName: Pwstr = pFarmNameCtorArg
        internal set

    public constructor() : this(
        execEnvId = 0u,
        state = 0,
        sessionId = 0u,
        pSessionNameCtorArg = MutPtr(0L),
        pHostNameCtorArg = MutPtr(0L),
        pUserNameCtorArg = MutPtr(0L),
        pDomainNameCtorArg = MutPtr(0L),
        pFarmNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.execEnvId

    public operator fun component2(): WtsConnectstateClass = this.state

    public operator fun component3(): UInt = this.sessionId

    public operator fun component4(): Pwstr = this.pSessionName

    public operator fun component5(): Pwstr = this.pHostName

    public operator fun component6(): Pwstr = this.pUserName

    public operator fun component7(): Pwstr = this.pDomainName

    public operator fun component8(): Pwstr = this.pFarmName

    public fun copy(execEnvId: UInt = this.execEnvId, state: WtsConnectstateClass = this.state, sessionId: UInt = this.sessionId, pSessionName: Pwstr = this.pSessionName, pHostName: Pwstr = this.pHostName, pUserName: Pwstr = this.pUserName, pDomainName: Pwstr = this.pDomainName, pFarmName: Pwstr = this.pFarmName): WtsSessionInfo1w = WtsSessionInfo1w(execEnvId = execEnvId, state = state, sessionId = sessionId, pSessionNameCtorArg = pSessionName, pHostNameCtorArg = pHostName, pUserNameCtorArg = pUserName, pDomainNameCtorArg = pDomainName, pFarmNameCtorArg = pFarmName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionInfo1w) return false
        if (this.execEnvId != other.execEnvId) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.pSessionName != other.pSessionName) return false
        if (this.pHostName != other.pHostName) return false
        if (this.pUserName != other.pUserName) return false
        if (this.pDomainName != other.pDomainName) return false
        if (this.pFarmName != other.pFarmName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.execEnvId.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.pSessionName.hashCode()
        result = 31 * result + this.pHostName.hashCode()
        result = 31 * result + this.pUserName.hashCode()
        result = 31 * result + this.pDomainName.hashCode()
        result = 31 * result + this.pFarmName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            execEnvId: UInt = 0u,
            state: WtsConnectstateClass = 0,
            sessionId: UInt = 0u,
            pSessionName: Pwstr = MutPtr(0L),
            pHostName: Pwstr = MutPtr(0L),
            pUserName: Pwstr = MutPtr(0L),
            pDomainName: Pwstr = MutPtr(0L),
            pFarmName: Pwstr = MutPtr(0L),
        ): WtsSessionInfo1w =
            WtsSessionInfo1w(
                execEnvId = execEnvId,
                state = state,
                sessionId = sessionId,
                pSessionNameCtorArg = pSessionName,
                pHostNameCtorArg = pHostName,
                pUserNameCtorArg = pUserName,
                pDomainNameCtorArg = pDomainName,
                pFarmNameCtorArg = pFarmName,
            )
    }
}

public data class WtsSmallRect(
    public var left: Short = 0,
    public var top: Short = 0,
    public var right: Short = 0,
    public var bottom: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSmallRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSmallRect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WtsSmallRect =
                    WtsSmallRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WtsSmallRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.bottom)
                }
            }
    }
}

public data class WtsSockaddr(
    public var sinFamily: UShort = 0u,
    public var u: WtsSockaddr0 = WtsSockaddr0(),
)

public data class WtsSockaddr0(
    public var ipv4: WtsSockaddr00 = WtsSockaddr00(),
    public var ipv6: WtsSockaddr01 = WtsSockaddr01(),
)

public data class WtsSockaddr00(
    public var sinPort: UShort = 0u,
    public var inAddr: UInt = 0u,
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSockaddr00) return false
        if (this.sinPort != other.sinPort) return false
        if (this.inAddr != other.inAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinPort.hashCode()
        result = 31 * result + this.inAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSockaddr00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSockaddr00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WtsSockaddr00 =
                    WtsSockaddr00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WtsSockaddr00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero.toList())
                }
            }
    }
}

public data class WtsSockaddr01(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSockaddr01) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSockaddr01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSockaddr01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): WtsSockaddr01 =
                    WtsSockaddr01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WtsSockaddr01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sin6Flowinfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 8L, value.sin6Addr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sin6ScopeId)
                }
            }
    }
}

public data class WtsSystemtime(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSystemtime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsSystemtime> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WtsSystemtime =
                    WtsSystemtime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: WtsSystemtime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wDayOfWeek)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wMinute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wMilliseconds)
                }
            }
    }
}

public data class WtsTimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: WtsSystemtime = WtsSystemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: WtsSystemtime = WtsSystemtime(),
    public var daylightBias: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsTimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsTimeZoneInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsTimeZoneInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 172L
                override fun readNative(addr: Long): WtsTimeZoneInformation =
                    WtsTimeZoneInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (WtsSystemtime.typeLayout()).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 88L).toUShortArray(),
                        (WtsSystemtime.typeLayout()).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 168L),
                    )
                override fun writeNative(addr: Long, value: WtsTimeZoneInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bias)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.standardName.toList())
                    (WtsSystemtime.typeLayout()).writeNative(addr + 68L, value.standardDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.standardBias)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 88L, value.daylightName.toList())
                    (WtsSystemtime.typeLayout()).writeNative(addr + 152L, value.daylightDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 168L, value.daylightBias)
                }
            }
    }
}

public data class WtsUserCredential(
    public var userName: UShortArray = UShortArray(256),
    public var password: UShortArray = UShortArray(256),
    public var domain: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsUserCredential) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (!this.password.contentEquals(other.password)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.contentHashCode()
        result = 31 * result + this.password.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsUserCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsUserCredential> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): WtsUserCredential =
                    WtsUserCredential(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1024L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WtsUserCredential) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 512L, value.password.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1024L, value.domain.toList())
                }
            }
    }
}

public data class WtsUserData(
    public var workDirectory: UShortArray = UShortArray(257),
    public var initialProgram: UShortArray = UShortArray(257),
    public var userTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsUserData) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (this.userTimeZone != other.userTimeZone) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.userTimeZone.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsUserData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsUserData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1200L
                override fun readNative(addr: Long): WtsUserData =
                    WtsUserData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 514L).toUShortArray(),
                        (WtsTimeZoneInformation.typeLayout()).readNative(addr + 1028L),
                    )
                override fun writeNative(addr: Long, value: WtsUserData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr, value.workDirectory.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 514L, value.initialProgram.toList())
                    (WtsTimeZoneInformation.typeLayout()).writeNative(addr + 1028L, value.userTimeZone)
                }
            }
    }
}

public data class WtsValidationInformationa(
    public var productInfo: ProductInfoa = ProductInfoa(),
    public var license: UByteArray = UByteArray(16384),
    public var licenseLength: UInt = 0u,
    public var hardwareID: UByteArray = UByteArray(20),
    public var hardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsValidationInformationa) return false
        if (this.productInfo != other.productInfo) return false
        if (!this.license.contentEquals(other.license)) return false
        if (this.licenseLength != other.licenseLength) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        if (this.hardwareIDLength != other.hardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productInfo.hashCode()
        result = 31 * result + this.license.contentHashCode()
        result = 31 * result + this.licenseLength.hashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        result = 31 * result + this.hardwareIDLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsValidationInformationa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsValidationInformationa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16672L
                override fun readNative(addr: Long): WtsValidationInformationa =
                    WtsValidationInformationa(
                        (ProductInfoa.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16384).toInt())
                        ).readNative(addr + 260L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16644L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16648L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16668L),
                    )
                override fun writeNative(addr: Long, value: WtsValidationInformationa) {
                    (ProductInfoa.typeLayout()).writeNative(addr, value.productInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16384).toInt())
                    ).writeNative(addr + 260L, value.license.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16644L, value.licenseLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16648L, value.hardwareID.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16668L, value.hardwareIDLength)
                }
            }
    }
}

public data class WtsValidationInformationw(
    public var productInfo: ProductInfow = ProductInfow(),
    public var license: UByteArray = UByteArray(16384),
    public var licenseLength: UInt = 0u,
    public var hardwareID: UByteArray = UByteArray(20),
    public var hardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsValidationInformationw) return false
        if (this.productInfo != other.productInfo) return false
        if (!this.license.contentEquals(other.license)) return false
        if (this.licenseLength != other.licenseLength) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        if (this.hardwareIDLength != other.hardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productInfo.hashCode()
        result = 31 * result + this.license.contentHashCode()
        result = 31 * result + this.licenseLength.hashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        result = 31 * result + this.hardwareIDLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsValidationInformationw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsValidationInformationw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16932L
                override fun readNative(addr: Long): WtsValidationInformationw =
                    WtsValidationInformationw(
                        (ProductInfow.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16384).toInt())
                        ).readNative(addr + 520L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16904L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16908L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16928L),
                    )
                override fun writeNative(addr: Long, value: WtsValidationInformationw) {
                    (ProductInfow.typeLayout()).writeNative(addr, value.productInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16384).toInt())
                    ).writeNative(addr + 520L, value.license.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16904L, value.licenseLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16908L, value.hardwareID.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16928L, value.hardwareIDLength)
                }
            }
    }
}

public class PluginResource internal constructor(
    public var alias: UShortArray,
    public var name: UShortArray,
    resourceFileContentsCtorArg: Pwstr,
    public var fileExtension: UShortArray,
    public var resourcePluginType: UShortArray,
    public var isDiscoverable: UByte,
    public var resourceType: Int,
    public var pceIconSize: UInt,
    iconContentsCtorArg: MutPtr,
    public var pcePluginBlobSize: UInt,
    blobContentsCtorArg: MutPtr,
) {
    public var resourceFileContents: Pwstr = resourceFileContentsCtorArg
        internal set

    public var iconContents: MutPtr = iconContentsCtorArg
        internal set

    public var blobContents: MutPtr = blobContentsCtorArg
        internal set

    public constructor() : this(
        alias = UShortArray(256),
        name = UShortArray(256),
        resourceFileContentsCtorArg = MutPtr(0L),
        fileExtension = UShortArray(256),
        resourcePluginType = UShortArray(256),
        isDiscoverable = 0u,
        resourceType = 0,
        pceIconSize = 0u,
        iconContentsCtorArg = MutPtr(0L),
        pcePluginBlobSize = 0u,
        blobContentsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.alias

    public operator fun component2(): UShortArray = this.name

    public operator fun component3(): Pwstr = this.resourceFileContents

    public operator fun component4(): UShortArray = this.fileExtension

    public operator fun component5(): UShortArray = this.resourcePluginType

    public operator fun component6(): UByte = this.isDiscoverable

    public operator fun component7(): Int = this.resourceType

    public operator fun component8(): UInt = this.pceIconSize

    public operator fun component9(): MutPtr = this.iconContents

    public operator fun component10(): UInt = this.pcePluginBlobSize

    public operator fun component11(): MutPtr = this.blobContents

    public fun copy(alias: UShortArray = this.alias, name: UShortArray = this.name, resourceFileContents: Pwstr = this.resourceFileContents, fileExtension: UShortArray = this.fileExtension, resourcePluginType: UShortArray = this.resourcePluginType, isDiscoverable: UByte = this.isDiscoverable, resourceType: Int = this.resourceType, pceIconSize: UInt = this.pceIconSize, iconContents: MutPtr = this.iconContents, pcePluginBlobSize: UInt = this.pcePluginBlobSize, blobContents: MutPtr = this.blobContents): PluginResource = PluginResource(alias = alias, name = name, resourceFileContentsCtorArg = resourceFileContents, fileExtension = fileExtension, resourcePluginType = resourcePluginType, isDiscoverable = isDiscoverable, resourceType = resourceType, pceIconSize = pceIconSize, iconContentsCtorArg = iconContents, pcePluginBlobSize = pcePluginBlobSize, blobContentsCtorArg = blobContents)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PluginResource) return false
        if (!this.alias.contentEquals(other.alias)) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.resourceFileContents != other.resourceFileContents) return false
        if (!this.fileExtension.contentEquals(other.fileExtension)) return false
        if (!this.resourcePluginType.contentEquals(other.resourcePluginType)) return false
        if (this.isDiscoverable != other.isDiscoverable) return false
        if (this.resourceType != other.resourceType) return false
        if (this.pceIconSize != other.pceIconSize) return false
        if (this.iconContents != other.iconContents) return false
        if (this.pcePluginBlobSize != other.pcePluginBlobSize) return false
        if (this.blobContents != other.blobContents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alias.contentHashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.resourceFileContents.hashCode()
        result = 31 * result + this.fileExtension.contentHashCode()
        result = 31 * result + this.resourcePluginType.contentHashCode()
        result = 31 * result + this.isDiscoverable.hashCode()
        result = 31 * result + this.resourceType.hashCode()
        result = 31 * result + this.pceIconSize.hashCode()
        result = 31 * result + this.iconContents.hashCode()
        result = 31 * result + this.pcePluginBlobSize.hashCode()
        result = 31 * result + this.blobContents.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            alias: UShortArray = UShortArray(256),
            name: UShortArray = UShortArray(256),
            resourceFileContents: Pwstr = MutPtr(0L),
            fileExtension: UShortArray = UShortArray(256),
            resourcePluginType: UShortArray = UShortArray(256),
            isDiscoverable: UByte = 0u,
            resourceType: Int = 0,
            pceIconSize: UInt = 0u,
            iconContents: MutPtr = MutPtr(0L),
            pcePluginBlobSize: UInt = 0u,
            blobContents: MutPtr = MutPtr(0L),
        ): PluginResource =
            PluginResource(
                alias = alias,
                name = name,
                resourceFileContentsCtorArg = resourceFileContents,
                fileExtension = fileExtension,
                resourcePluginType = resourcePluginType,
                isDiscoverable = isDiscoverable,
                resourceType = resourceType,
                pceIconSize = pceIconSize,
                iconContentsCtorArg = iconContents,
                pcePluginBlobSize = pcePluginBlobSize,
                blobContentsCtorArg = blobContents,
            )
    }
}

public class PluginResource2 internal constructor(
    public var resourceV1: PluginResource,
    public var pceFileAssocListSize: UInt,
    fileAssocListCtorArg: MutPtr,
    securityDescriptorCtorArg: Pwstr,
    public var pceFolderListSize: UInt,
    folderListCtorArg: MutPtr,
) {
    public var fileAssocList: MutPtr = fileAssocListCtorArg
        internal set

    public var securityDescriptor: Pwstr = securityDescriptorCtorArg
        internal set

    public var folderList: MutPtr = folderListCtorArg
        internal set

    public constructor() : this(
        resourceV1 = PluginResource(),
        pceFileAssocListSize = 0u,
        fileAssocListCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        pceFolderListSize = 0u,
        folderListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PluginResource = this.resourceV1

    public operator fun component2(): UInt = this.pceFileAssocListSize

    public operator fun component3(): MutPtr = this.fileAssocList

    public operator fun component4(): Pwstr = this.securityDescriptor

    public operator fun component5(): UInt = this.pceFolderListSize

    public operator fun component6(): MutPtr = this.folderList

    public fun copy(resourceV1: PluginResource = this.resourceV1, pceFileAssocListSize: UInt = this.pceFileAssocListSize, fileAssocList: MutPtr = this.fileAssocList, securityDescriptor: Pwstr = this.securityDescriptor, pceFolderListSize: UInt = this.pceFolderListSize, folderList: MutPtr = this.folderList): PluginResource2 = PluginResource2(resourceV1 = resourceV1, pceFileAssocListSize = pceFileAssocListSize, fileAssocListCtorArg = fileAssocList, securityDescriptorCtorArg = securityDescriptor, pceFolderListSize = pceFolderListSize, folderListCtorArg = folderList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PluginResource2) return false
        if (this.resourceV1 != other.resourceV1) return false
        if (this.pceFileAssocListSize != other.pceFileAssocListSize) return false
        if (this.fileAssocList != other.fileAssocList) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.pceFolderListSize != other.pceFolderListSize) return false
        if (this.folderList != other.folderList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceV1.hashCode()
        result = 31 * result + this.pceFileAssocListSize.hashCode()
        result = 31 * result + this.fileAssocList.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.pceFolderListSize.hashCode()
        result = 31 * result + this.folderList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            resourceV1: PluginResource = PluginResource(),
            pceFileAssocListSize: UInt = 0u,
            fileAssocList: MutPtr = MutPtr(0L),
            securityDescriptor: Pwstr = MutPtr(0L),
            pceFolderListSize: UInt = 0u,
            folderList: MutPtr = MutPtr(0L),
        ): PluginResource2 =
            PluginResource2(
                resourceV1 = resourceV1,
                pceFileAssocListSize = pceFileAssocListSize,
                fileAssocListCtorArg = fileAssocList,
                securityDescriptorCtorArg = securityDescriptor,
                pceFolderListSize = pceFolderListSize,
                folderListCtorArg = folderList,
            )
    }
}

public class PluginResource2FileAssociation internal constructor(
    public var extName: UShortArray,
    public var primaryHandler: UByte,
    public var pceIconSize: UInt,
    iconContentsCtorArg: MutPtr,
) {
    public var iconContents: MutPtr = iconContentsCtorArg
        internal set

    public constructor() : this(
        extName = UShortArray(256),
        primaryHandler = 0u,
        pceIconSize = 0u,
        iconContentsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.extName

    public operator fun component2(): UByte = this.primaryHandler

    public operator fun component3(): UInt = this.pceIconSize

    public operator fun component4(): MutPtr = this.iconContents

    public fun copy(extName: UShortArray = this.extName, primaryHandler: UByte = this.primaryHandler, pceIconSize: UInt = this.pceIconSize, iconContents: MutPtr = this.iconContents): PluginResource2FileAssociation = PluginResource2FileAssociation(extName = extName, primaryHandler = primaryHandler, pceIconSize = pceIconSize, iconContentsCtorArg = iconContents)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PluginResource2FileAssociation) return false
        if (!this.extName.contentEquals(other.extName)) return false
        if (this.primaryHandler != other.primaryHandler) return false
        if (this.pceIconSize != other.pceIconSize) return false
        if (this.iconContents != other.iconContents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extName.contentHashCode()
        result = 31 * result + this.primaryHandler.hashCode()
        result = 31 * result + this.pceIconSize.hashCode()
        result = 31 * result + this.iconContents.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PluginResource2FileAssociation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PluginResource2FileAssociation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): PluginResource2FileAssociation =
                    PluginResource2FileAssociation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: PluginResource2FileAssociation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.extName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 512L, value.primaryHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.pceIconSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 520L, value.iconContents)
                }
            }

        public operator fun invoke(
            extName: UShortArray = UShortArray(256),
            primaryHandler: UByte = 0u,
            pceIconSize: UInt = 0u,
            iconContents: MutPtr = MutPtr(0L),
        ): PluginResource2FileAssociation =
            PluginResource2FileAssociation(
                extName = extName,
                primaryHandler = primaryHandler,
                pceIconSize = pceIconSize,
                iconContentsCtorArg = iconContents,
            )
    }
}
