@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DmaSpeed
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DmaWidth
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Ktimer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Flowspec
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfDirectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaConnectState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaDuplexState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfOperStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetLuidLh

public class BinaryData internal constructor(
    public var length: UShort,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public fun copy(length: UShort = this.length, buffer: MutPtr<CVoid> = this.buffer): BinaryData = BinaryData(length = length, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BinaryData) return false
        if (this.length != other.length) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): BinaryData =
                    BinaryData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinaryData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): BinaryData =
            BinaryData(
                length = length,
                bufferCtorArg = buffer,
            )
    }
}

public data class BssidInfo(
    public var bssid: UByteArray = UByteArray(6),
    public var pmkid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BssidInfo) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BssidInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BssidInfo> {
                override val sizeBytes: Long = 22L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): BssidInfo =
                    BssidInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: BssidInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 6L, value.pmkid)
                }
            }
    }
}

public data class CoAddress(
    public var addressSize: UInt = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoAddress) return false
        if (this.addressSize != other.addressSize) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressSize.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddress> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CoAddress =
                    CoAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CoAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.address)
                }
            }
    }
}

public data class CoAddressFamily(
    public var addressFamily: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddressFamily> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddressFamily> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CoAddressFamily =
                    CoAddressFamily(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoAddressFamily) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minorVersion)
                }
            }
    }
}

public data class CoAddressList(
    public var numberOfAddressesAvailable: UInt = 0u,
    public var numberOfAddresses: UInt = 0u,
    public var addressList: CoAddress = CoAddress(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddressList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoAddressList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CoAddressList =
                    CoAddressList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (CoAddress.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoAddressList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfAddressesAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfAddresses)
                    (CoAddress.typeLayout()).writeNative(addr + 8L, value.addressList)
                }
            }
    }
}

public data class CoCallManagerParameters(
    public var transmit: Flowspec = Flowspec(),
    public var receive: Flowspec = Flowspec(),
    public var callMgrSpecific: CoSpecificParameters = CoSpecificParameters(),
)

public class CoPvc internal constructor(
    ndisAfHandleCtorArg: MutPtr<CVoid>,
    public var pvcParameters: CoSpecificParameters,
) {
    public var ndisAfHandle: MutPtr<CVoid> = ndisAfHandleCtorArg
        internal set

    public constructor() : this(
        ndisAfHandleCtorArg = MutPtr(0L),
        pvcParameters = CoSpecificParameters(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ndisAfHandle

    public operator fun component2(): CoSpecificParameters = this.pvcParameters

    public fun copy(ndisAfHandle: MutPtr<CVoid> = this.ndisAfHandle, pvcParameters: CoSpecificParameters = this.pvcParameters): CoPvc = CoPvc(ndisAfHandleCtorArg = ndisAfHandle, pvcParameters = pvcParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoPvc) return false
        if (this.ndisAfHandle != other.ndisAfHandle) return false
        if (this.pvcParameters != other.pvcParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ndisAfHandle.hashCode()
        result = 31 * result + this.pvcParameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoPvc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoPvc> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CoPvc =
                    CoPvc(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (CoSpecificParameters.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoPvc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ndisAfHandle)
                    (CoSpecificParameters.typeLayout()).writeNative(addr + 8L, value.pvcParameters)
                }
            }

        public operator fun invoke(
            ndisAfHandle: MutPtr<CVoid> = MutPtr(0L),
            pvcParameters: CoSpecificParameters = CoSpecificParameters(),
        ): CoPvc =
            CoPvc(
                ndisAfHandleCtorArg = ndisAfHandle,
                pvcParameters = pvcParameters,
            )
    }
}

public data class CoSap(
    public var sapType: UInt = 0u,
    public var sapLength: UInt = 0u,
    public var sap: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoSap) return false
        if (this.sapType != other.sapType) return false
        if (this.sapLength != other.sapLength) return false
        if (!this.sap.contentEquals(other.sap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sapType.hashCode()
        result = 31 * result + this.sapLength.hashCode()
        result = 31 * result + this.sap.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoSap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoSap> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CoSap =
                    CoSap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoSap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sapLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.sap)
                }
            }
    }
}

public data class CoSpecificParameters(
    public var paramType: UInt = 0u,
    public var length: UInt = 0u,
    public var parameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoSpecificParameters) return false
        if (this.paramType != other.paramType) return false
        if (this.length != other.length) return false
        if (!this.parameters.contentEquals(other.parameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.paramType.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.parameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoSpecificParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoSpecificParameters> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CoSpecificParameters =
                    CoSpecificParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoSpecificParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.paramType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.parameters)
                }
            }
    }
}

public class Filterdbs internal constructor(
    public var anonymous: Filterdbs0,
    trDBCtorArg: MutPtr<Int>,
    yyydbCtorArg: MutPtr<CVoid>,
    xxxdbCtorArg: MutPtr<CVoid>,
) {
    public var trDB: MutPtr<Int> = trDBCtorArg
        internal set

    public var yyydb: MutPtr<CVoid> = yyydbCtorArg
        internal set

    public var xxxdb: MutPtr<CVoid> = xxxdbCtorArg
        internal set

    public constructor() : this(
        anonymous = Filterdbs0(),
        trDBCtorArg = MutPtr(0L),
        yyydbCtorArg = MutPtr(0L),
        xxxdbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Filterdbs0 = this.anonymous

    public operator fun component2(): MutPtr<Int> = this.trDB

    public operator fun component3(): MutPtr<CVoid> = this.yyydb

    public operator fun component4(): MutPtr<CVoid> = this.xxxdb

    public fun copy(anonymous: Filterdbs0 = this.anonymous, trDB: MutPtr<Int> = this.trDB, yyydb: MutPtr<CVoid> = this.yyydb, xxxdb: MutPtr<CVoid> = this.xxxdb): Filterdbs = Filterdbs(anonymous = anonymous, trDBCtorArg = trDB, yyydbCtorArg = yyydb, xxxdbCtorArg = xxxdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filterdbs) return false
        if (this.anonymous != other.anonymous) return false
        if (this.trDB != other.trDB) return false
        if (this.yyydb != other.yyydb) return false
        if (this.xxxdb != other.xxxdb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.trDB.hashCode()
        result = 31 * result + this.yyydb.hashCode()
        result = 31 * result + this.xxxdb.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: Filterdbs0 = Filterdbs0(),
            trDB: MutPtr<Int> = MutPtr(0L),
            yyydb: MutPtr<CVoid> = MutPtr(0L),
            xxxdb: MutPtr<CVoid> = MutPtr(0L),
        ): Filterdbs =
            Filterdbs(
                anonymous = anonymous,
                trDBCtorArg = trDB,
                yyydbCtorArg = yyydb,
                xxxdbCtorArg = xxxdb,
            )
    }
}

public class Filterdbs0 internal constructor(
    ethDBCtorArg: MutPtr<EthFilter>,
    nullDBCtorArg: MutPtr<Int>,
) {
    public var ethDB: MutPtr<EthFilter> = ethDBCtorArg
        internal set

    public var nullDB: MutPtr<Int> = nullDBCtorArg
        internal set

    public constructor() : this(
        ethDBCtorArg = MutPtr(0L),
        nullDBCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<EthFilter> = this.ethDB

    public operator fun component2(): MutPtr<Int> = this.nullDB

    public fun copy(ethDB: MutPtr<EthFilter> = this.ethDB, nullDB: MutPtr<Int> = this.nullDB): Filterdbs0 = Filterdbs0(ethDBCtorArg = ethDB, nullDBCtorArg = nullDB)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filterdbs0) return false
        if (this.ethDB != other.ethDB) return false
        if (this.nullDB != other.nullDB) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ethDB.hashCode()
        result = 31 * result + this.nullDB.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ethDB: MutPtr<EthFilter> = MutPtr(0L),
            nullDB: MutPtr<Int> = MutPtr(0L),
        ): Filterdbs0 =
            Filterdbs0(
                ethDBCtorArg = ethDB,
                nullDBCtorArg = nullDB,
            )
    }
}

public data class GenGetNetcardTime(
    public var readTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetNetcardTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetNetcardTime> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GenGetNetcardTime =
                    GenGetNetcardTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GenGetNetcardTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.readTime)
                }
            }
    }
}

public data class GenGetTimeCaps(
    public var flags: UInt = 0u,
    public var clockPrecision: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetTimeCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenGetTimeCaps> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GenGetTimeCaps =
                    GenGetTimeCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GenGetTimeCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clockPrecision)
                }
            }
    }
}

public data class LockState(
    public var lockState: UShort = 0u,
    public var oldIrql: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LockState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LockState> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): LockState =
                    LockState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: LockState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.lockState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.oldIrql)
                }
            }
    }
}

public data class MediaSpecificInformation(
    public var nextEntryOffset: UInt = 0u,
    public var classId: NdisClassId = 0,
    public var size: UInt = 0u,
    public var classInformation: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MediaSpecificInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.classId != other.classId) return false
        if (this.size != other.size) return false
        if (!this.classInformation.contentEquals(other.classInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.classId.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.classInformation.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediaSpecificInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediaSpecificInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MediaSpecificInformation =
                    MediaSpecificInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MediaSpecificInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.classId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.classInformation)
                }
            }
    }
}

public data class Ndis80211AiReqfi(
    public var capabilities: UShort = 0u,
    public var listenInterval: UShort = 0u,
    public var currentAPAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AiReqfi) return false
        if (this.capabilities != other.capabilities) return false
        if (this.listenInterval != other.listenInterval) return false
        if (!this.currentAPAddress.contentEquals(other.currentAPAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.listenInterval.hashCode()
        result = 31 * result + this.currentAPAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiReqfi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiReqfi> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ndis80211AiReqfi =
                    Ndis80211AiReqfi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AiReqfi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.listenInterval)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.currentAPAddress)
                }
            }
    }
}

public data class Ndis80211AiResfi(
    public var capabilities: UShort = 0u,
    public var statusCode: UShort = 0u,
    public var associationId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiResfi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AiResfi> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ndis80211AiResfi =
                    Ndis80211AiResfi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AiResfi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.statusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.associationId)
                }
            }
    }
}

public data class Ndis80211AssociationInformation(
    public var length: UInt = 0u,
    public var availableRequestFixedIEs: UShort = 0u,
    public var requestFixedIEs: Ndis80211AiReqfi = Ndis80211AiReqfi(),
    public var requestIELength: UInt = 0u,
    public var offsetRequestIEs: UInt = 0u,
    public var availableResponseFixedIEs: UShort = 0u,
    public var responseFixedIEs: Ndis80211AiResfi = Ndis80211AiResfi(),
    public var responseIELength: UInt = 0u,
    public var offsetResponseIEs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AssociationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AssociationInformation> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211AssociationInformation =
                    Ndis80211AssociationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (Ndis80211AiReqfi.typeLayout()).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (Ndis80211AiResfi.typeLayout()).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AssociationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.availableRequestFixedIEs)
                    (Ndis80211AiReqfi.typeLayout()).writeNative(addr + 6L, value.requestFixedIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.requestIELength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offsetRequestIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.availableResponseFixedIEs)
                    (Ndis80211AiResfi.typeLayout()).writeNative(addr + 26L, value.responseFixedIEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.responseIELength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.offsetResponseIEs)
                }
            }
    }
}

public data class Ndis80211AuthenticationEncryption(
    public var authModeSupported: Ndis80211AuthenticationMode = 0,
    public var encryptStatusSupported: Ndis80211WepStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEncryption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEncryption> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211AuthenticationEncryption =
                    Ndis80211AuthenticationEncryption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationEncryption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authModeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.encryptStatusSupported)
                }
            }
    }
}

public data class Ndis80211AuthenticationEvent(
    public var status: Ndis80211StatusIndication = Ndis80211StatusIndication(),
    public var request: List<Ndis80211AuthenticationRequest> = List(1) { Ndis80211AuthenticationRequest() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationEvent> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211AuthenticationEvent =
                    Ndis80211AuthenticationEvent(
                        (Ndis80211StatusIndication.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211AuthenticationRequest.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationEvent) {
                    (Ndis80211StatusIndication.typeLayout()).writeNative(addr, value.status)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211AuthenticationRequest.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.request)
                }
            }
    }
}

public data class Ndis80211AuthenticationRequest(
    public var length: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211AuthenticationRequest) return false
        if (this.length != other.length) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211AuthenticationRequest> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211AuthenticationRequest =
                    Ndis80211AuthenticationRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211AuthenticationRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                }
            }
    }
}

public data class Ndis80211BssidList(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssid> = List(1) { NdisWlanBssid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidList> {
                override val sizeBytes: Long = 108L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211BssidList =
                    Ndis80211BssidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisWlanBssid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211BssidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisWlanBssid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.bssid)
                }
            }
    }
}

public data class Ndis80211BssidListEx(
    public var numberOfItems: UInt = 0u,
    public var bssid: List<NdisWlanBssidEx> = List(1) { NdisWlanBssidEx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidListEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211BssidListEx> {
                override val sizeBytes: Long = 124L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211BssidListEx =
                    Ndis80211BssidListEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NdisWlanBssidEx.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211BssidListEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NdisWlanBssidEx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.bssid)
                }
            }
    }
}

public data class Ndis80211Capability(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var noOfPMKIDs: UInt = 0u,
    public var noOfAuthEncryptPairsSupported: UInt = 0u,
    public var authenticationEncryptionSupported: List<Ndis80211AuthenticationEncryption> = List(1) { Ndis80211AuthenticationEncryption() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Capability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Capability> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211Capability =
                    Ndis80211Capability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211AuthenticationEncryption.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Capability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.noOfPMKIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.noOfAuthEncryptPairsSupported)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211AuthenticationEncryption.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.authenticationEncryptionSupported)
                }
            }
    }
}

public data class Ndis80211Configuration(
    public var length: UInt = 0u,
    public var beaconPeriod: UInt = 0u,
    public var aTIMWindow: UInt = 0u,
    public var dSConfig: UInt = 0u,
    public var fHConfig: Ndis80211ConfigurationFh = Ndis80211ConfigurationFh(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Configuration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Configuration> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211Configuration =
                    Ndis80211Configuration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (Ndis80211ConfigurationFh.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Configuration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.beaconPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aTIMWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dSConfig)
                    (Ndis80211ConfigurationFh.typeLayout()).writeNative(addr + 16L, value.fHConfig)
                }
            }
    }
}

public data class Ndis80211ConfigurationFh(
    public var length: UInt = 0u,
    public var hopPattern: UInt = 0u,
    public var hopSet: UInt = 0u,
    public var dwellTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211ConfigurationFh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211ConfigurationFh> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211ConfigurationFh =
                    Ndis80211ConfigurationFh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211ConfigurationFh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hopPattern)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hopSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwellTime)
                }
            }
    }
}

public data class Ndis80211FixedIes(
    public var timestamp: UByteArray = UByteArray(8),
    public var beaconInterval: UShort = 0u,
    public var capabilities: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211FixedIes) return false
        if (!this.timestamp.contentEquals(other.timestamp)) return false
        if (this.beaconInterval != other.beaconInterval) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timestamp.contentHashCode()
        result = 31 * result + this.beaconInterval.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211FixedIes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211FixedIes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ndis80211FixedIes =
                    Ndis80211FixedIes(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211FixedIes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.timestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.beaconInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.capabilities)
                }
            }
    }
}

public data class Ndis80211Key(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
    public var keyRSC: ULong = 0uL,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Key) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.keyRSC != other.keyRSC) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.keyRSC.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Key> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Key> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Ndis80211Key =
                    Ndis80211Key(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Key) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.keyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.keyRSC)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.keyMaterial)
                }
            }
    }
}

public data class Ndis80211NetworkTypeList(
    public var numberOfItems: UInt = 0u,
    public var networkType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211NetworkTypeList) return false
        if (this.numberOfItems != other.numberOfItems) return false
        if (!this.networkType.contentEquals(other.networkType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfItems.hashCode()
        result = 31 * result + this.networkType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NetworkTypeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NetworkTypeList> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211NetworkTypeList =
                    Ndis80211NetworkTypeList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211NetworkTypeList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                    ).writeNative(addr + 4L, value.networkType)
                }
            }
    }
}

public data class Ndis80211NonBcastSsidList(
    public var numberOfItems: UInt = 0u,
    public var nonBcastSsid: List<Ndis80211Ssid> = List(1) { Ndis80211Ssid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NonBcastSsidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211NonBcastSsidList> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211NonBcastSsidList =
                    Ndis80211NonBcastSsidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Ndis80211Ssid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211NonBcastSsidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Ndis80211Ssid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.nonBcastSsid)
                }
            }
    }
}

public data class Ndis80211Pmkid(
    public var length: UInt = 0u,
    public var bSSIDInfoCount: UInt = 0u,
    public var bSSIDInfo: List<BssidInfo> = List(1) { BssidInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Pmkid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Pmkid> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211Pmkid =
                    Ndis80211Pmkid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BssidInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Pmkid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bSSIDInfoCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BssidInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.bSSIDInfo)
                }
            }
    }
}

public data class Ndis80211PmkidCandidateList(
    public var version: UInt = 0u,
    public var numCandidates: UInt = 0u,
    public var candidateList: List<PmkidCandidate> = List(1) { PmkidCandidate() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211PmkidCandidateList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211PmkidCandidateList> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211PmkidCandidateList =
                    Ndis80211PmkidCandidateList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PmkidCandidate.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211PmkidCandidateList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numCandidates)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PmkidCandidate.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.candidateList)
                }
            }
    }
}

public data class Ndis80211RemoveKey(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var bssid: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211RemoveKey) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211RemoveKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211RemoveKey> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211RemoveKey =
                    Ndis80211RemoveKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211RemoveKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 8L, value.bssid)
                }
            }
    }
}

public data class Ndis80211Ssid(
    public var ssidLength: UInt = 0u,
    public var ssid: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Ssid) return false
        if (this.ssidLength != other.ssidLength) return false
        if (!this.ssid.contentEquals(other.ssid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssidLength.hashCode()
        result = 31 * result + this.ssid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Ssid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Ssid> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211Ssid =
                    Ndis80211Ssid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Ssid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssidLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.ssid)
                }
            }
    }
}

public class Ndis80211Statistics(
    public var length: UInt = 0u,
    public var transmittedFragmentCount: Long = 0L,
    public var multicastTransmittedFrameCount: Long = 0L,
    public var failedCount: Long = 0L,
    public var retryCount: Long = 0L,
    public var multipleRetryCount: Long = 0L,
    public var rTSSuccessCount: Long = 0L,
    public var rTSFailureCount: Long = 0L,
    public var aCKFailureCount: Long = 0L,
    public var frameDuplicateCount: Long = 0L,
    public var receivedFragmentCount: Long = 0L,
    public var multicastReceivedFrameCount: Long = 0L,
    public var fCSErrorCount: Long = 0L,
    public var tKIPLocalMICFailures: Long = 0L,
    public var tKIPICVErrorCount: Long = 0L,
    public var tKIPCounterMeasuresInvoked: Long = 0L,
    public var tKIPReplays: Long = 0L,
    public var cCMPFormatErrors: Long = 0L,
    public var cCMPReplays: Long = 0L,
    public var cCMPDecryptErrors: Long = 0L,
    public var fourWayHandshakeFailures: Long = 0L,
    public var wEPUndecryptableCount: Long = 0L,
    public var wEPICVErrorCount: Long = 0L,
    public var decryptSuccessCount: Long = 0L,
    public var decryptFailureCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Statistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Statistics> {
                override val sizeBytes: Long = 200L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Ndis80211Statistics =
                    Ndis80211Statistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Statistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.transmittedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.multicastTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.failedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.retryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.multipleRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.rTSSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.rTSFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.aCKFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.frameDuplicateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.receivedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.multicastReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.fCSErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.tKIPLocalMICFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.tKIPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.tKIPCounterMeasuresInvoked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.tKIPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.cCMPFormatErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.cCMPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 152L, value.cCMPDecryptErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.fourWayHandshakeFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.wEPUndecryptableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 176L, value.wEPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.decryptSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.decryptFailureCount)
                }
            }
    }
}

public data class Ndis80211StatusIndication(
    public var statusType: Ndis80211StatusType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211StatusIndication> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211StatusIndication> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211StatusIndication =
                    Ndis80211StatusIndication(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndis80211StatusIndication) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.statusType)
                }
            }
    }
}

public data class Ndis80211Test(
    public var length: UInt = 0u,
    public var type: UInt = 0u,
    public var anonymous: Ndis80211Test0 = Ndis80211Test0(),
)

public data class Ndis80211Test0(
    public var authenticationEvent: Ndis80211AuthenticationEvent = Ndis80211AuthenticationEvent(),
    public var rssiTrigger: Int = 0,
)

public data class Ndis80211VariableIes(
    public var elementID: UByte = 0u,
    public var length: UByte = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211VariableIes) return false
        if (this.elementID != other.elementID) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementID.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211VariableIes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211VariableIes> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ndis80211VariableIes =
                    Ndis80211VariableIes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211VariableIes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.elementID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.data)
                }
            }
    }
}

public data class Ndis80211Wep(
    public var length: UInt = 0u,
    public var keyIndex: UInt = 0u,
    public var keyLength: UInt = 0u,
    public var keyMaterial: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndis80211Wep) return false
        if (this.length != other.length) return false
        if (this.keyIndex != other.keyIndex) return false
        if (this.keyLength != other.keyLength) return false
        if (!this.keyMaterial.contentEquals(other.keyMaterial)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.keyIndex.hashCode()
        result = 31 * result + this.keyLength.hashCode()
        result = 31 * result + this.keyMaterial.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Wep> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndis80211Wep> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ndis80211Wep =
                    Ndis80211Wep(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndis80211Wep) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.keyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.keyMaterial)
                }
            }
    }
}

public data class NdisConfigurationParameter(
    public var parameterType: NdisParameterType = 0,
    public var parameterData: NdisConfigurationParameter0 = NdisConfigurationParameter0(),
)

public data class NdisConfigurationParameter0(
    public var integerData: UInt = 0u,
    public var stringData: UnicodeString = UnicodeString(),
    public var binaryData: BinaryData = BinaryData(),
)

public class NdisCoDeviceProfile(
    public var deviceDescription: NdisVarDataDesc = NdisVarDataDesc(),
    public var devSpecificInfo: NdisVarDataDesc = NdisVarDataDesc(),
    public var ulTAPISupplementaryPassThru: UInt = 0u,
    public var ulAddressModes: UInt = 0u,
    public var ulNumAddresses: UInt = 0u,
    public var ulBearerModes: UInt = 0u,
    public var ulMaxTxRate: UInt = 0u,
    public var ulMinTxRate: UInt = 0u,
    public var ulMaxRxRate: UInt = 0u,
    public var ulMinRxRate: UInt = 0u,
    public var ulMediaModes: UInt = 0u,
    public var ulGenerateToneModes: UInt = 0u,
    public var ulGenerateToneMaxNumFreq: UInt = 0u,
    public var ulGenerateDigitModes: UInt = 0u,
    public var ulMonitorToneMaxNumFreq: UInt = 0u,
    public var ulMonitorToneMaxNumEntries: UInt = 0u,
    public var ulMonitorDigitModes: UInt = 0u,
    public var ulGatherDigitsMinTimeout: UInt = 0u,
    public var ulGatherDigitsMaxTimeout: UInt = 0u,
    public var ulDevCapFlags: UInt = 0u,
    public var ulMaxNumActiveCalls: UInt = 0u,
    public var ulAnswerMode: UInt = 0u,
    public var ulUUIAcceptSize: UInt = 0u,
    public var ulUUIAnswerSize: UInt = 0u,
    public var ulUUIMakeCallSize: UInt = 0u,
    public var ulUUIDropSize: UInt = 0u,
    public var ulUUISendUserUserInfoSize: UInt = 0u,
    public var ulUUICallInfoSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoDeviceProfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoDeviceProfile> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisCoDeviceProfile =
                    NdisCoDeviceProfile(
                        (NdisVarDataDesc.typeLayout()).readNative(addr),
                        (NdisVarDataDesc.typeLayout()).readNative(addr + 16L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: NdisCoDeviceProfile) {
                    (NdisVarDataDesc.typeLayout()).writeNative(addr, value.deviceDescription)
                    (NdisVarDataDesc.typeLayout()).writeNative(addr + 16L, value.devSpecificInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulTAPISupplementaryPassThru)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulAddressModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulNumAddresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulBearerModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulMaxTxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ulMinTxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ulMaxRxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulMinRxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ulMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ulGenerateToneModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.ulGenerateToneMaxNumFreq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.ulGenerateDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ulMonitorToneMaxNumFreq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.ulMonitorToneMaxNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.ulMonitorDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.ulGatherDigitsMinTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.ulGatherDigitsMaxTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.ulDevCapFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.ulMaxNumActiveCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.ulAnswerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.ulUUIAcceptSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.ulUUIAnswerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.ulUUIMakeCallSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.ulUUIDropSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.ulUUISendUserUserInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.ulUUICallInfoSize)
                }
            }
    }
}

public data class NdisCoLinkSpeed(
    public var outbound: UInt = 0u,
    public var inbound: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoLinkSpeed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisCoLinkSpeed> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisCoLinkSpeed =
                    NdisCoLinkSpeed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisCoLinkSpeed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inbound)
                }
            }
    }
}

public class NdisDmaBlock internal constructor(
    mapRegisterBaseCtorArg: MutPtr<CVoid>,
    public var allocationEvent: Kevent,
    systemAdapterObjectCtorArg: MutPtr<CVoid>,
    miniportCtorArg: MutPtr<CVoid>,
    public var inProgress: Boolean,
) {
    public var mapRegisterBase: MutPtr<CVoid> = mapRegisterBaseCtorArg
        internal set

    public var systemAdapterObject: MutPtr<CVoid> = systemAdapterObjectCtorArg
        internal set

    public var miniport: MutPtr<CVoid> = miniportCtorArg
        internal set

    public constructor() : this(
        mapRegisterBaseCtorArg = MutPtr(0L),
        allocationEvent = Kevent(),
        systemAdapterObjectCtorArg = MutPtr(0L),
        miniportCtorArg = MutPtr(0L),
        inProgress = false,
    )

    public operator fun component1(): MutPtr<CVoid> = this.mapRegisterBase

    public operator fun component2(): Kevent = this.allocationEvent

    public operator fun component3(): MutPtr<CVoid> = this.systemAdapterObject

    public operator fun component4(): MutPtr<CVoid> = this.miniport

    public operator fun component5(): Boolean = this.inProgress

    public fun copy(mapRegisterBase: MutPtr<CVoid> = this.mapRegisterBase, allocationEvent: Kevent = this.allocationEvent, systemAdapterObject: MutPtr<CVoid> = this.systemAdapterObject, miniport: MutPtr<CVoid> = this.miniport, inProgress: Boolean = this.inProgress): NdisDmaBlock = NdisDmaBlock(mapRegisterBaseCtorArg = mapRegisterBase, allocationEvent = allocationEvent, systemAdapterObjectCtorArg = systemAdapterObject, miniportCtorArg = miniport, inProgress = inProgress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisDmaBlock) return false
        if (this.mapRegisterBase != other.mapRegisterBase) return false
        if (this.allocationEvent != other.allocationEvent) return false
        if (this.systemAdapterObject != other.systemAdapterObject) return false
        if (this.miniport != other.miniport) return false
        if (this.inProgress != other.inProgress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mapRegisterBase.hashCode()
        result = 31 * result + this.allocationEvent.hashCode()
        result = 31 * result + this.systemAdapterObject.hashCode()
        result = 31 * result + this.miniport.hashCode()
        result = 31 * result + this.inProgress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mapRegisterBase: MutPtr<CVoid> = MutPtr(0L),
            allocationEvent: Kevent = Kevent(),
            systemAdapterObject: MutPtr<CVoid> = MutPtr(0L),
            miniport: MutPtr<CVoid> = MutPtr(0L),
            inProgress: Boolean = false,
        ): NdisDmaBlock =
            NdisDmaBlock(
                mapRegisterBaseCtorArg = mapRegisterBase,
                allocationEvent = allocationEvent,
                systemAdapterObjectCtorArg = systemAdapterObject,
                miniportCtorArg = miniport,
                inProgress = inProgress,
            )
    }
}

public data class NdisDmaDescription(
    public var demandMode: Boolean = false,
    public var autoInitialize: Boolean = false,
    public var dmaChannelSpecified: Boolean = false,
    public var dmaWidth: DmaWidth = 0,
    public var dmaSpeed: DmaSpeed = 0,
    public var dmaPort: UInt = 0u,
    public var dmaChannel: UInt = 0u,
)

public data class NdisEvent(
    public var event: Kevent = Kevent(),
)

public data class NdisGuid(
    public var guid: Guid = Guid(),
    public var anonymous: NdisGuid0 = NdisGuid0(),
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class NdisGuid0(
    public var oid: UInt = 0u,
    public var status: Int = 0,
)

public data class NdisHardwareCrosstimestamp(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var systemTimestamp1: ULong = 0uL,
    public var hardwareClockTimestamp: ULong = 0uL,
    public var systemTimestamp2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisHardwareCrosstimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisHardwareCrosstimestamp> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisHardwareCrosstimestamp =
                    NdisHardwareCrosstimestamp(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisHardwareCrosstimestamp) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.systemTimestamp1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.hardwareClockTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.systemTimestamp2)
                }
            }
    }
}

public data class NdisInterruptModerationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var interruptModeration: NdisInterruptModeration = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterruptModerationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisInterruptModerationParameters> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisInterruptModerationParameters =
                    NdisInterruptModerationParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisInterruptModerationParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.interruptModeration)
                }
            }
    }
}

public data class NdisIpsecOffloadV1(
    public var supported: NdisIpsecOffloadV10 = NdisIpsecOffloadV10(),
    public var iPv4AH: NdisIpsecOffloadV11 = NdisIpsecOffloadV11(),
    public var iPv4ESP: NdisIpsecOffloadV12 = NdisIpsecOffloadV12(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV1> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV1 =
                    NdisIpsecOffloadV1(
                        (NdisIpsecOffloadV10.typeLayout()).readNative(addr),
                        (NdisIpsecOffloadV11.typeLayout()).readNative(addr + 20L),
                        (NdisIpsecOffloadV12.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV1) {
                    (NdisIpsecOffloadV10.typeLayout()).writeNative(addr, value.supported)
                    (NdisIpsecOffloadV11.typeLayout()).writeNative(addr + 20L, value.iPv4AH)
                    (NdisIpsecOffloadV12.typeLayout()).writeNative(addr + 24L, value.iPv4ESP)
                }
            }
    }
}

public data class NdisIpsecOffloadV11(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV11> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV11 =
                    NdisIpsecOffloadV11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisIpsecOffloadV12(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV12> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV12 =
                    NdisIpsecOffloadV12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIpsecOffloadV10> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisIpsecOffloadV10 =
                    NdisIpsecOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisIpsecOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ahEspCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transportTunnelCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisIpOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var ipOperationalStatus: NdisIpOperStatus = NdisIpOperStatus(),
)

public data class NdisIpOperStatus(
    public var addressFamily: UInt = 0u,
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
)

public data class NdisIpOperStatusInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var numberofAddressFamiliesReturned: UInt = 0u,
    public var ipOperationalStatus: List<NdisIpOperStatus> = List(32) { NdisIpOperStatus() },
)

public data class NdisIrdaPacketInfo(
    public var extraBOFs: UInt = 0u,
    public var minTurnAroundTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIrdaPacketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisIrdaPacketInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisIrdaPacketInfo =
                    NdisIrdaPacketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisIrdaPacketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extraBOFs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minTurnAroundTime)
                }
            }
    }
}

public data class NdisLinkParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
)

public data class NdisLinkSpeed(
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkSpeed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisLinkSpeed> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisLinkSpeed =
                    NdisLinkSpeed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisLinkSpeed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.xmitLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rcvLinkSpeed)
                }
            }
    }
}

public data class NdisLinkState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var mediaDuplexState: NetIfMediaDuplexState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var pauseFunctions: NdisSupportedPauseFunctions = 0,
    public var autoNegotiationFlags: UInt = 0u,
)

public class NdisMiniportTimer internal constructor(
    public var timer: Ktimer,
    public var dpc: Kdpc,
    public var miniportTimerFunction: PndisTimerFunction,
    miniportTimerContextCtorArg: MutPtr<CVoid>,
    miniportCtorArg: MutPtr<NdisMiniportBlock>,
    nextTimerCtorArg: MutPtr<NdisMiniportTimer>,
) {
    public var miniportTimerContext: MutPtr<CVoid> = miniportTimerContextCtorArg
        internal set

    public var miniport: MutPtr<NdisMiniportBlock> = miniportCtorArg
        internal set

    public var nextTimer: MutPtr<NdisMiniportTimer> = nextTimerCtorArg
        internal set

    public constructor() : this(
        timer = Ktimer(),
        dpc = Kdpc(),
        miniportTimerFunction = null,
        miniportTimerContextCtorArg = MutPtr(0L),
        miniportCtorArg = MutPtr(0L),
        nextTimerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ktimer = this.timer

    public operator fun component2(): Kdpc = this.dpc

    public operator fun component3(): PndisTimerFunction = this.miniportTimerFunction

    public operator fun component4(): MutPtr<CVoid> = this.miniportTimerContext

    public operator fun component5(): MutPtr<NdisMiniportBlock> = this.miniport

    public operator fun component6(): MutPtr<NdisMiniportTimer> = this.nextTimer

    public fun copy(timer: Ktimer = this.timer, dpc: Kdpc = this.dpc, miniportTimerFunction: PndisTimerFunction = this.miniportTimerFunction, miniportTimerContext: MutPtr<CVoid> = this.miniportTimerContext, miniport: MutPtr<NdisMiniportBlock> = this.miniport, nextTimer: MutPtr<NdisMiniportTimer> = this.nextTimer): NdisMiniportTimer = NdisMiniportTimer(timer = timer, dpc = dpc, miniportTimerFunction = miniportTimerFunction, miniportTimerContextCtorArg = miniportTimerContext, miniportCtorArg = miniport, nextTimerCtorArg = nextTimer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisMiniportTimer) return false
        if (this.timer != other.timer) return false
        if (this.dpc != other.dpc) return false
        if (this.miniportTimerFunction != other.miniportTimerFunction) return false
        if (this.miniportTimerContext != other.miniportTimerContext) return false
        if (this.miniport != other.miniport) return false
        if (this.nextTimer != other.nextTimer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timer.hashCode()
        result = 31 * result + this.dpc.hashCode()
        result = 31 * result + this.miniportTimerFunction.hashCode()
        result = 31 * result + this.miniportTimerContext.hashCode()
        result = 31 * result + this.miniport.hashCode()
        result = 31 * result + this.nextTimer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timer: Ktimer = Ktimer(),
            dpc: Kdpc = Kdpc(),
            miniportTimerFunction: PndisTimerFunction = null,
            miniportTimerContext: MutPtr<CVoid> = MutPtr(0L),
            miniport: MutPtr<NdisMiniportBlock> = MutPtr(0L),
            nextTimer: MutPtr<NdisMiniportTimer> = MutPtr(0L),
        ): NdisMiniportTimer =
            NdisMiniportTimer(
                timer = timer,
                dpc = dpc,
                miniportTimerFunction = miniportTimerFunction,
                miniportTimerContextCtorArg = miniportTimerContext,
                miniportCtorArg = miniport,
                nextTimerCtorArg = nextTimer,
            )
    }
}

public data class NdisObjectHeader(
    public var type: UByte = 0u,
    public var revision: UByte = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisObjectHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisObjectHeader> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NdisObjectHeader =
                    NdisObjectHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NdisObjectHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public data class NdisOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisTcpIpChecksumOffload = NdisTcpIpChecksumOffload(),
    public var lsoV1: NdisTcpLargeSendOffloadV1 = NdisTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisIpsecOffloadV1 = NdisIpsecOffloadV1(),
    public var lsoV2: NdisTcpLargeSendOffloadV2 = NdisTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffload> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisOffload =
                    NdisOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (NdisTcpIpChecksumOffload.typeLayout()).readNative(addr + 4L),
                        (NdisTcpLargeSendOffloadV1.typeLayout()).readNative(addr + 36L),
                        (NdisIpsecOffloadV1.typeLayout()).readNative(addr + 52L),
                        (NdisTcpLargeSendOffloadV2.typeLayout()).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: NdisOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (NdisTcpIpChecksumOffload.typeLayout()).writeNative(addr + 4L, value.checksum)
                    (NdisTcpLargeSendOffloadV1.typeLayout()).writeNative(addr + 36L, value.lsoV1)
                    (NdisIpsecOffloadV1.typeLayout()).writeNative(addr + 52L, value.iPsecV1)
                    (NdisTcpLargeSendOffloadV2.typeLayout()).writeNative(addr + 80L, value.lsoV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.flags)
                }
            }
    }
}

public data class NdisOffloadParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var iPv4Checksum: UByte = 0u,
    public var tCPIPv4Checksum: UByte = 0u,
    public var uDPIPv4Checksum: UByte = 0u,
    public var tCPIPv6Checksum: UByte = 0u,
    public var uDPIPv6Checksum: UByte = 0u,
    public var lsoV1: UByte = 0u,
    public var iPsecV1: UByte = 0u,
    public var lsoV2IPv4: UByte = 0u,
    public var lsoV2IPv6: UByte = 0u,
    public var tcpConnectionIPv4: UByte = 0u,
    public var tcpConnectionIPv6: UByte = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffloadParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisOffloadParameters> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisOffloadParameters =
                    NdisOffloadParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisOffloadParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.iPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tCPIPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.uDPIPv4Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tCPIPv6Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.uDPIPv6Checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.lsoV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.iPsecV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.lsoV2IPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.lsoV2IPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.tcpConnectionIPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.tcpConnectionIPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisOperState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var operationalStatus: NetIfOperStatus = 0,
    public var operationalStatusFlags: UInt = 0u,
)

public data class NdisPacket8021qInfo(
    public var anonymous: NdisPacket8021qInfo0 = NdisPacket8021qInfo0(),
)

public class NdisPacket8021qInfo0 internal constructor(
    public var tagHeader: NdisPacket8021qInfo00,
    valueCtorArg: MutPtr<CVoid>,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        tagHeader = NdisPacket8021qInfo00(),
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NdisPacket8021qInfo00 = this.tagHeader

    public operator fun component2(): MutPtr<CVoid> = this.value

    public fun copy(tagHeader: NdisPacket8021qInfo00 = this.tagHeader, value: MutPtr<CVoid> = this.value): NdisPacket8021qInfo0 = NdisPacket8021qInfo0(tagHeader = tagHeader, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisPacket8021qInfo0) return false
        if (this.tagHeader != other.tagHeader) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tagHeader.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tagHeader: NdisPacket8021qInfo00 = NdisPacket8021qInfo00(),
            value: MutPtr<CVoid> = MutPtr(0L),
        ): NdisPacket8021qInfo0 =
            NdisPacket8021qInfo0(
                tagHeader = tagHeader,
                valueCtorArg = value,
            )
    }
}

public data class NdisPacket8021qInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPacket8021qInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPacket8021qInfo00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPacket8021qInfo00 =
                    NdisPacket8021qInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisPacket8021qInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisPciDeviceCustomProperties(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var deviceType: UInt = 0u,
    public var currentSpeedAndMode: UInt = 0u,
    public var currentPayloadSize: UInt = 0u,
    public var maxPayloadSize: UInt = 0u,
    public var maxReadRequestSize: UInt = 0u,
    public var currentLinkSpeed: UInt = 0u,
    public var currentLinkWidth: UInt = 0u,
    public var maxLinkSpeed: UInt = 0u,
    public var maxLinkWidth: UInt = 0u,
    public var pciExpressVersion: UInt = 0u,
    public var interruptType: UInt = 0u,
    public var maxInterruptMessages: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPciDeviceCustomProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPciDeviceCustomProperties> {
                override val sizeBytes: Long = 52L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPciDeviceCustomProperties =
                    NdisPciDeviceCustomProperties(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
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
                    )
                override fun writeNative(addr: Long, value: NdisPciDeviceCustomProperties) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.currentSpeedAndMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.currentPayloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxPayloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxReadRequestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.currentLinkWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maxLinkSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxLinkWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.pciExpressVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.interruptType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.maxInterruptMessages)
                }
            }
    }
}

public data class NdisPhysicalAddressUnit(
    public var physicalAddress: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPhysicalAddressUnit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPhysicalAddressUnit> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisPhysicalAddressUnit =
                    NdisPhysicalAddressUnit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisPhysicalAddressUnit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.physicalAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class NdisPmPacketPattern(
    public var priority: UInt = 0u,
    public var reserved: UInt = 0u,
    public var maskSize: UInt = 0u,
    public var patternOffset: UInt = 0u,
    public var patternSize: UInt = 0u,
    public var patternFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmPacketPattern> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmPacketPattern> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPmPacketPattern =
                    NdisPmPacketPattern(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisPmPacketPattern) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maskSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.patternOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.patternSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.patternFlags)
                }
            }
    }
}

public data class NdisPmWakeUpCapabilities(
    public var minMagicPacketWakeUp: NdisDevicePowerState = 0,
    public var minPatternWakeUp: NdisDevicePowerState = 0,
    public var minLinkChangeWakeUp: NdisDevicePowerState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmWakeUpCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPmWakeUpCapabilities> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPmWakeUpCapabilities =
                    NdisPmWakeUpCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisPmWakeUpCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.minMagicPacketWakeUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minPatternWakeUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.minLinkChangeWakeUp)
                }
            }
    }
}

public data class NdisPnpCapabilities(
    public var flags: UInt = 0u,
    public var wakeUpCapabilities: NdisPmWakeUpCapabilities = NdisPmWakeUpCapabilities(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPnpCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPnpCapabilities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPnpCapabilities =
                    NdisPnpCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (NdisPmWakeUpCapabilities.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisPnpCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (NdisPmWakeUpCapabilities.typeLayout()).writeNative(addr + 4L, value.wakeUpCapabilities)
                }
            }
    }
}

public class NdisPort internal constructor(
    nextCtorArg: MutPtr<NdisPort>,
    ndisReservedCtorArg: MutPtr<CVoid>,
    miniportReservedCtorArg: MutPtr<CVoid>,
    protocolReservedCtorArg: MutPtr<CVoid>,
    public var portCharacteristics: NdisPortCharacteristics,
) {
    public var next: MutPtr<NdisPort> = nextCtorArg
        internal set

    public var ndisReserved: MutPtr<CVoid> = ndisReservedCtorArg
        internal set

    public var miniportReserved: MutPtr<CVoid> = miniportReservedCtorArg
        internal set

    public var protocolReserved: MutPtr<CVoid> = protocolReservedCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        ndisReservedCtorArg = MutPtr(0L),
        miniportReservedCtorArg = MutPtr(0L),
        protocolReservedCtorArg = MutPtr(0L),
        portCharacteristics = NdisPortCharacteristics(),
    )

    public operator fun component1(): MutPtr<NdisPort> = this.next

    public operator fun component2(): MutPtr<CVoid> = this.ndisReserved

    public operator fun component3(): MutPtr<CVoid> = this.miniportReserved

    public operator fun component4(): MutPtr<CVoid> = this.protocolReserved

    public operator fun component5(): NdisPortCharacteristics = this.portCharacteristics

    public fun copy(next: MutPtr<NdisPort> = this.next, ndisReserved: MutPtr<CVoid> = this.ndisReserved, miniportReserved: MutPtr<CVoid> = this.miniportReserved, protocolReserved: MutPtr<CVoid> = this.protocolReserved, portCharacteristics: NdisPortCharacteristics = this.portCharacteristics): NdisPort = NdisPort(nextCtorArg = next, ndisReservedCtorArg = ndisReserved, miniportReservedCtorArg = miniportReserved, protocolReservedCtorArg = protocolReserved, portCharacteristics = portCharacteristics)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisPort) return false
        if (this.next != other.next) return false
        if (this.ndisReserved != other.ndisReserved) return false
        if (this.miniportReserved != other.miniportReserved) return false
        if (this.protocolReserved != other.protocolReserved) return false
        if (this.portCharacteristics != other.portCharacteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.ndisReserved.hashCode()
        result = 31 * result + this.miniportReserved.hashCode()
        result = 31 * result + this.protocolReserved.hashCode()
        result = 31 * result + this.portCharacteristics.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr<NdisPort> = MutPtr(0L),
            ndisReserved: MutPtr<CVoid> = MutPtr(0L),
            miniportReserved: MutPtr<CVoid> = MutPtr(0L),
            protocolReserved: MutPtr<CVoid> = MutPtr(0L),
            portCharacteristics: NdisPortCharacteristics = NdisPortCharacteristics(),
        ): NdisPort =
            NdisPort(
                nextCtorArg = next,
                ndisReservedCtorArg = ndisReserved,
                miniportReservedCtorArg = miniportReserved,
                protocolReservedCtorArg = protocolReserved,
                portCharacteristics = portCharacteristics,
            )
    }
}

public data class NdisPortArray(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var numberOfPorts: UInt = 0u,
    public var offsetFirstPort: UInt = 0u,
    public var elementSize: UInt = 0u,
    public var ports: List<NdisPortCharacteristics> = List(1) { NdisPortCharacteristics() },
)

public data class NdisPortAuthenticationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortAuthenticationParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisPortAuthenticationParameters> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisPortAuthenticationParameters =
                    NdisPortAuthenticationParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisPortAuthenticationParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.sendControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rcvControlState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.sendAuthorizationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.rcvAuthorizationState)
                }
            }
    }
}

public data class NdisPortCharacteristics(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var type: NdisPortType = 0,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
)

public data class NdisPortState(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var xmitLinkSpeed: ULong = 0uL,
    public var rcvLinkSpeed: ULong = 0uL,
    public var direction: NetIfDirectionType = 0,
    public var sendControlState: NdisPortControlState = 0,
    public var rcvControlState: NdisPortControlState = 0,
    public var sendAuthorizationState: NdisPortAuthorizationState = 0,
    public var rcvAuthorizationState: NdisPortAuthorizationState = 0,
    public var flags: UInt = 0u,
)

public data class NdisReceiveHashParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var hashInformation: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveHashParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveHashParameters> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisReceiveHashParameters =
                    NdisReceiveHashParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveHashParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hashInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.hashSecretKeySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hashSecretKeyOffset)
                }
            }
    }
}

public data class NdisReceiveScaleCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var capabilitiesFlags: UInt = 0u,
    public var numberOfInterruptMessages: UInt = 0u,
    public var numberOfReceiveQueues: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleCapabilities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisReceiveScaleCapabilities =
                    NdisReceiveScaleCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveScaleCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capabilitiesFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfInterruptMessages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfReceiveQueues)
                }
            }
    }
}

public data class NdisReceiveScaleParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UShort = 0u,
    public var baseCpuNumber: UShort = 0u,
    public var hashInformation: UInt = 0u,
    public var indirectionTableSize: UShort = 0u,
    public var indirectionTableOffset: UInt = 0u,
    public var hashSecretKeySize: UShort = 0u,
    public var hashSecretKeyOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisReceiveScaleParameters> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisReceiveScaleParameters =
                    NdisReceiveScaleParameters(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisReceiveScaleParameters) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.baseCpuNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hashInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.indirectionTableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.indirectionTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.hashSecretKeySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.hashSecretKeyOffset)
                }
            }
    }
}

public data class NdisRwLock(
    public var anonymous1: NdisRwLock0 = NdisRwLock0(),
    public var anonymous2: NdisRwLock1 = NdisRwLock1(),
)

public data class NdisRwLock0(
    public var anonymous: NdisRwLock00 = NdisRwLock00(),
    public var reserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLock0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class NdisRwLock00 internal constructor(
    public var spinLock: Int,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        spinLock = 0,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.spinLock

    public operator fun component2(): MutPtr<CVoid> = this.context

    public fun copy(spinLock: Int = this.spinLock, context: MutPtr<CVoid> = this.context): NdisRwLock00 = NdisRwLock00(spinLock = spinLock, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLock00) return false
        if (this.spinLock != other.spinLock) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.spinLock.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisRwLock00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisRwLock00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisRwLock00 =
                    NdisRwLock00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisRwLock00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.spinLock)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.context)
                }
            }

        public operator fun invoke(
            spinLock: Int = 0,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): NdisRwLock00 =
            NdisRwLock00(
                spinLock = spinLock,
                contextCtorArg = context,
            )
    }
}

public data class NdisRwLock1(
    public var refCount: List<NdisRwLockRefcount> = List(32) { NdisRwLockRefcount() },
    public var refCountEx: UIntArray = UIntArray(128),
    public var anonymous: NdisRwLock10 = NdisRwLock10(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLock1) return false
        if (this.refCount != other.refCount) return false
        if (!this.refCountEx.contentEquals(other.refCountEx)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refCount.hashCode()
        result = 31 * result + this.refCountEx.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class NdisRwLock10(
    public var refCountLock: Int = 0,
    public var sharedRefCount: UInt = 0u,
    public var writerWaiting: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisRwLock10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisRwLock10> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisRwLock10 =
                    NdisRwLock10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisRwLock10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.refCountLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sharedRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.writerWaiting)
                }
            }
    }
}

public data class NdisRwLockRefcount(
    public var refCount: UInt = 0u,
    public var cacheLine: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisRwLockRefcount) return false
        if (this.refCount != other.refCount) return false
        if (!this.cacheLine.contentEquals(other.cacheLine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refCount.hashCode()
        result = 31 * result + this.cacheLine.contentHashCode()
        return result
    }
}

public data class NdisSpinLock(
    public var spinLock: Int = 0,
    public var oldIrql: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisSpinLock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisSpinLock> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisSpinLock =
                    NdisSpinLock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisSpinLock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.spinLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.oldIrql)
                }
            }
    }
}

public class NdisStatisticsInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var supportedStatistics: UInt = 0u,
    public var ifInDiscards: ULong = 0uL,
    public var ifInErrors: ULong = 0uL,
    public var ifHCInOctets: ULong = 0uL,
    public var ifHCInUcastPkts: ULong = 0uL,
    public var ifHCInMulticastPkts: ULong = 0uL,
    public var ifHCInBroadcastPkts: ULong = 0uL,
    public var ifHCOutOctets: ULong = 0uL,
    public var ifHCOutUcastPkts: ULong = 0uL,
    public var ifHCOutMulticastPkts: ULong = 0uL,
    public var ifHCOutBroadcastPkts: ULong = 0uL,
    public var ifOutErrors: ULong = 0uL,
    public var ifOutDiscards: ULong = 0uL,
    public var ifHCInUcastOctets: ULong = 0uL,
    public var ifHCInMulticastOctets: ULong = 0uL,
    public var ifHCInBroadcastOctets: ULong = 0uL,
    public var ifHCOutUcastOctets: ULong = 0uL,
    public var ifHCOutMulticastOctets: ULong = 0uL,
    public var ifHCOutBroadcastOctets: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsInfo> {
                override val sizeBytes: Long = 152L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisStatisticsInfo =
                    NdisStatisticsInfo(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsInfo) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.supportedStatistics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ifInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ifInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ifHCInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ifHCInUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ifHCInMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ifHCInBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ifHCOutOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ifHCOutUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ifHCOutMulticastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ifHCOutBroadcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ifOutErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ifOutDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ifHCInUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ifHCInMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ifHCInBroadcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ifHCOutUcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ifHCOutMulticastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.ifHCOutBroadcastOctets)
                }
            }
    }
}

public data class NdisStatisticsValue(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValue) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValue> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisStatisticsValue =
                    NdisStatisticsValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class NdisStatisticsValueEx(
    public var oid: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisStatisticsValueEx) return false
        if (this.oid != other.oid) return false
        if (this.dataLength != other.dataLength) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oid.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValueEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisStatisticsValueEx> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisStatisticsValueEx =
                    NdisStatisticsValueEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisStatisticsValueEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data)
                }
            }
    }
}

public data class NdisTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpConnectionOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpConnectionOffload> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpConnectionOffload =
                    NdisTcpConnectionOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpConnectionOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpConnectionOffloadCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload(
    public var iPv4Transmit: NdisTcpIpChecksumOffload0 = NdisTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisTcpIpChecksumOffload1 = NdisTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisTcpIpChecksumOffload2 = NdisTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisTcpIpChecksumOffload3 = NdisTcpIpChecksumOffload3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload =
                    NdisTcpIpChecksumOffload(
                        (NdisTcpIpChecksumOffload0.typeLayout()).readNative(addr),
                        (NdisTcpIpChecksumOffload1.typeLayout()).readNative(addr + 8L),
                        (NdisTcpIpChecksumOffload2.typeLayout()).readNative(addr + 16L),
                        (NdisTcpIpChecksumOffload3.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload) {
                    (NdisTcpIpChecksumOffload0.typeLayout()).writeNative(addr, value.iPv4Transmit)
                    (NdisTcpIpChecksumOffload1.typeLayout()).writeNative(addr + 8L, value.iPv4Receive)
                    (NdisTcpIpChecksumOffload2.typeLayout()).writeNative(addr + 16L, value.iPv6Transmit)
                    (NdisTcpIpChecksumOffload3.typeLayout()).writeNative(addr + 24L, value.iPv6Receive)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload1> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload1 =
                    NdisTcpIpChecksumOffload1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload0 =
                    NdisTcpIpChecksumOffload0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload3> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload3 =
                    NdisTcpIpChecksumOffload3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumOffload2> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumOffload2 =
                    NdisTcpIpChecksumOffload2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumOffload2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumPacketInfo(
    public var anonymous: NdisTcpIpChecksumPacketInfo0 = NdisTcpIpChecksumPacketInfo0(),
)

public data class NdisTcpIpChecksumPacketInfo0(
    public var transmit: NdisTcpIpChecksumPacketInfo00 = NdisTcpIpChecksumPacketInfo00(),
    public var receive: NdisTcpIpChecksumPacketInfo01 = NdisTcpIpChecksumPacketInfo01(),
    public var value: UInt = 0u,
)

public data class NdisTcpIpChecksumPacketInfo01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumPacketInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumPacketInfo01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumPacketInfo01 =
                    NdisTcpIpChecksumPacketInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumPacketInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisTcpIpChecksumPacketInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumPacketInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpIpChecksumPacketInfo00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpIpChecksumPacketInfo00 =
                    NdisTcpIpChecksumPacketInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisTcpIpChecksumPacketInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV1(
    public var iPv4: NdisTcpLargeSendOffloadV10 = NdisTcpLargeSendOffloadV10(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV1> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV1 =
                    NdisTcpLargeSendOffloadV1(
                        (NdisTcpLargeSendOffloadV10.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV1) {
                    (NdisTcpLargeSendOffloadV10.typeLayout()).writeNative(addr, value.iPv4)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV10> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV10 =
                    NdisTcpLargeSendOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV2(
    public var iPv4: NdisTcpLargeSendOffloadV20 = NdisTcpLargeSendOffloadV20(),
    public var iPv6: NdisTcpLargeSendOffloadV21 = NdisTcpLargeSendOffloadV21(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV2> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV2 =
                    NdisTcpLargeSendOffloadV2(
                        (NdisTcpLargeSendOffloadV20.typeLayout()).readNative(addr),
                        (NdisTcpLargeSendOffloadV21.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV2) {
                    (NdisTcpLargeSendOffloadV20.typeLayout()).writeNative(addr, value.iPv4)
                    (NdisTcpLargeSendOffloadV21.typeLayout()).writeNative(addr + 12L, value.iPv6)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV20> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV20 =
                    NdisTcpLargeSendOffloadV20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                }
            }
    }
}

public data class NdisTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTcpLargeSendOffloadV21> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTcpLargeSendOffloadV21 =
                    NdisTcpLargeSendOffloadV21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTcpLargeSendOffloadV21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield)
                }
            }
    }
}

public data class NdisTimeoutDpcRequestCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var timeoutArrayLength: UInt = 0u,
    public var timeoutArray: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisTimeoutDpcRequestCapabilities) return false
        if (this.header != other.header) return false
        if (this.flags != other.flags) return false
        if (this.timeoutArrayLength != other.timeoutArrayLength) return false
        if (!this.timeoutArray.contentEquals(other.timeoutArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.timeoutArrayLength.hashCode()
        result = 31 * result + this.timeoutArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimeoutDpcRequestCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimeoutDpcRequestCapabilities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisTimeoutDpcRequestCapabilities =
                    NdisTimeoutDpcRequestCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisTimeoutDpcRequestCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeoutArrayLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.timeoutArray)
                }
            }
    }
}

public data class NdisTimer(
    public var timer: Ktimer = Ktimer(),
    public var dpc: Kdpc = Kdpc(),
)

public data class NdisTimestampCapabilities(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var hardwareClockFrequencyHz: ULong = 0uL,
    public var crossTimestamp: Boolean = false,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var timestampFlags: NdisTimestampCapabilityFlags = NdisTimestampCapabilityFlags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilities> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisTimestampCapabilities =
                    NdisTimestampCapabilities(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (NdisTimestampCapabilityFlags.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: NdisTimestampCapabilities) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hardwareClockFrequencyHz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.crossTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.reserved2)
                    (NdisTimestampCapabilityFlags.typeLayout()).writeNative(addr + 40L, value.timestampFlags)
                }
            }
    }
}

public data class NdisTimestampCapabilityFlags(
    public var ptpV2OverUdpIPv4EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv4EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv4AllMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgReceiveHw: Boolean = false,
    public var ptpV2OverUdpIPv6EventMsgTransmitHw: Boolean = false,
    public var ptpV2OverUdpIPv6AllMsgTransmitHw: Boolean = false,
    public var allReceiveHw: Boolean = false,
    public var allTransmitHw: Boolean = false,
    public var taggedTransmitHw: Boolean = false,
    public var allReceiveSw: Boolean = false,
    public var allTransmitSw: Boolean = false,
    public var taggedTransmitSw: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilityFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisTimestampCapabilityFlags> {
                override val sizeBytes: Long = 14L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdisTimestampCapabilityFlags =
                    NdisTimestampCapabilityFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: NdisTimestampCapabilityFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ptpV2OverUdpIPv4EventMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.ptpV2OverUdpIPv4AllMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.ptpV2OverUdpIPv4EventMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.ptpV2OverUdpIPv4AllMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.ptpV2OverUdpIPv6EventMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.ptpV2OverUdpIPv6AllMsgReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.ptpV2OverUdpIPv6EventMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.ptpV2OverUdpIPv6AllMsgTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.allReceiveHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.allTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.taggedTransmitHw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.allReceiveSw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.allTransmitSw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.taggedTransmitSw)
                }
            }
    }
}

public data class NdisVarDataDesc(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var offset: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisVarDataDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisVarDataDesc> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NdisVarDataDesc =
                    NdisVarDataDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisVarDataDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public data class NdisWanFragment(
    public var remoteAddress: UByteArray = UByteArray(6),
    public var localAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanFragment) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanFragment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanFragment> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdisWanFragment =
                    NdisWanFragment(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NdisWanFragment) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.remoteAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 6L, value.localAddress)
                }
            }
    }
}

public data class NdisWanGetStats(
    public var localAddress: UByteArray = UByteArray(6),
    public var bytesSent: UInt = 0u,
    public var bytesRcvd: UInt = 0u,
    public var framesSent: UInt = 0u,
    public var framesRcvd: UInt = 0u,
    public var cRCErrors: UInt = 0u,
    public var timeoutErrors: UInt = 0u,
    public var alignmentErrors: UInt = 0u,
    public var serialOverrunErrors: UInt = 0u,
    public var framingErrors: UInt = 0u,
    public var bufferOverrunErrors: UInt = 0u,
    public var bytesTransmittedUncompressed: UInt = 0u,
    public var bytesReceivedUncompressed: UInt = 0u,
    public var bytesTransmittedCompressed: UInt = 0u,
    public var bytesReceivedCompressed: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanGetStats) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        if (this.bytesSent != other.bytesSent) return false
        if (this.bytesRcvd != other.bytesRcvd) return false
        if (this.framesSent != other.framesSent) return false
        if (this.framesRcvd != other.framesRcvd) return false
        if (this.cRCErrors != other.cRCErrors) return false
        if (this.timeoutErrors != other.timeoutErrors) return false
        if (this.alignmentErrors != other.alignmentErrors) return false
        if (this.serialOverrunErrors != other.serialOverrunErrors) return false
        if (this.framingErrors != other.framingErrors) return false
        if (this.bufferOverrunErrors != other.bufferOverrunErrors) return false
        if (this.bytesTransmittedUncompressed != other.bytesTransmittedUncompressed) return false
        if (this.bytesReceivedUncompressed != other.bytesReceivedUncompressed) return false
        if (this.bytesTransmittedCompressed != other.bytesTransmittedCompressed) return false
        if (this.bytesReceivedCompressed != other.bytesReceivedCompressed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localAddress.contentHashCode()
        result = 31 * result + this.bytesSent.hashCode()
        result = 31 * result + this.bytesRcvd.hashCode()
        result = 31 * result + this.framesSent.hashCode()
        result = 31 * result + this.framesRcvd.hashCode()
        result = 31 * result + this.cRCErrors.hashCode()
        result = 31 * result + this.timeoutErrors.hashCode()
        result = 31 * result + this.alignmentErrors.hashCode()
        result = 31 * result + this.serialOverrunErrors.hashCode()
        result = 31 * result + this.framingErrors.hashCode()
        result = 31 * result + this.bufferOverrunErrors.hashCode()
        result = 31 * result + this.bytesTransmittedUncompressed.hashCode()
        result = 31 * result + this.bytesReceivedUncompressed.hashCode()
        result = 31 * result + this.bytesTransmittedCompressed.hashCode()
        result = 31 * result + this.bytesReceivedCompressed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanGetStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanGetStats> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWanGetStats =
                    NdisWanGetStats(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
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
                    )
                override fun writeNative(addr: Long, value: NdisWanGetStats) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.localAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bytesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.framesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.framesRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cRCErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.timeoutErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.alignmentErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.serialOverrunErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.framingErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.bufferOverrunErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.bytesTransmittedUncompressed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.bytesReceivedUncompressed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bytesTransmittedCompressed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.bytesReceivedCompressed)
                }
            }
    }
}

public data class NdisWanLineDown(
    public var remoteAddress: UByteArray = UByteArray(6),
    public var localAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanLineDown) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanLineDown> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanLineDown> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdisWanLineDown =
                    NdisWanLineDown(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NdisWanLineDown) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.remoteAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 6L, value.localAddress)
                }
            }
    }
}

public class NdisWanLineUp internal constructor(
    public var linkSpeed: UInt,
    public var maximumTotalSize: UInt,
    public var quality: NdisWanQuality,
    public var sendWindow: UShort,
    public var remoteAddress: UByteArray,
    public var localAddress: UByteArray,
    public var protocolBufferLength: UInt,
    protocolBufferCtorArg: MutPtr<UByte>,
    public var protocolType: UShort,
    public var deviceName: UnicodeString,
) {
    public var protocolBuffer: MutPtr<UByte> = protocolBufferCtorArg
        internal set

    public constructor() : this(
        linkSpeed = 0u,
        maximumTotalSize = 0u,
        quality = 0,
        sendWindow = 0u,
        remoteAddress = UByteArray(6),
        localAddress = UByteArray(6),
        protocolBufferLength = 0u,
        protocolBufferCtorArg = MutPtr(0L),
        protocolType = 0u,
        deviceName = UnicodeString(),
    )

    public operator fun component1(): UInt = this.linkSpeed

    public operator fun component2(): UInt = this.maximumTotalSize

    public operator fun component3(): NdisWanQuality = this.quality

    public operator fun component4(): UShort = this.sendWindow

    public operator fun component5(): UByteArray = this.remoteAddress

    public operator fun component6(): UByteArray = this.localAddress

    public operator fun component7(): UInt = this.protocolBufferLength

    public operator fun component8(): MutPtr<UByte> = this.protocolBuffer

    public operator fun component9(): UShort = this.protocolType

    public operator fun component10(): UnicodeString = this.deviceName

    public fun copy(linkSpeed: UInt = this.linkSpeed, maximumTotalSize: UInt = this.maximumTotalSize, quality: NdisWanQuality = this.quality, sendWindow: UShort = this.sendWindow, remoteAddress: UByteArray = this.remoteAddress, localAddress: UByteArray = this.localAddress, protocolBufferLength: UInt = this.protocolBufferLength, protocolBuffer: MutPtr<UByte> = this.protocolBuffer, protocolType: UShort = this.protocolType, deviceName: UnicodeString = this.deviceName): NdisWanLineUp = NdisWanLineUp(linkSpeed = linkSpeed, maximumTotalSize = maximumTotalSize, quality = quality, sendWindow = sendWindow, remoteAddress = remoteAddress, localAddress = localAddress, protocolBufferLength = protocolBufferLength, protocolBufferCtorArg = protocolBuffer, protocolType = protocolType, deviceName = deviceName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWanLineUp) return false
        if (this.linkSpeed != other.linkSpeed) return false
        if (this.maximumTotalSize != other.maximumTotalSize) return false
        if (this.quality != other.quality) return false
        if (this.sendWindow != other.sendWindow) return false
        if (!this.remoteAddress.contentEquals(other.remoteAddress)) return false
        if (!this.localAddress.contentEquals(other.localAddress)) return false
        if (this.protocolBufferLength != other.protocolBufferLength) return false
        if (this.protocolBuffer != other.protocolBuffer) return false
        if (this.protocolType != other.protocolType) return false
        if (this.deviceName != other.deviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.linkSpeed.hashCode()
        result = 31 * result + this.maximumTotalSize.hashCode()
        result = 31 * result + this.quality.hashCode()
        result = 31 * result + this.sendWindow.hashCode()
        result = 31 * result + this.remoteAddress.contentHashCode()
        result = 31 * result + this.localAddress.contentHashCode()
        result = 31 * result + this.protocolBufferLength.hashCode()
        result = 31 * result + this.protocolBuffer.hashCode()
        result = 31 * result + this.protocolType.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            linkSpeed: UInt = 0u,
            maximumTotalSize: UInt = 0u,
            quality: NdisWanQuality = 0,
            sendWindow: UShort = 0u,
            remoteAddress: UByteArray = UByteArray(6),
            localAddress: UByteArray = UByteArray(6),
            protocolBufferLength: UInt = 0u,
            protocolBuffer: MutPtr<UByte> = MutPtr(0L),
            protocolType: UShort = 0u,
            deviceName: UnicodeString = UnicodeString(),
        ): NdisWanLineUp =
            NdisWanLineUp(
                linkSpeed = linkSpeed,
                maximumTotalSize = maximumTotalSize,
                quality = quality,
                sendWindow = sendWindow,
                remoteAddress = remoteAddress,
                localAddress = localAddress,
                protocolBufferLength = protocolBufferLength,
                protocolBufferCtorArg = protocolBuffer,
                protocolType = protocolType,
                deviceName = deviceName,
            )
    }
}

public data class NdisWanProtocolCaps(
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanProtocolCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWanProtocolCaps> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWanProtocolCaps =
                    NdisWanProtocolCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdisWanProtocolCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class NdisWlanBssid(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssid) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssid> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWlanBssid =
                    NdisWlanBssid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L),
                        (Ndis80211Ssid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (Ndis80211Configuration.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: NdisWlanBssid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.macAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved)
                    (Ndis80211Ssid.typeLayout()).writeNative(addr + 12L, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.privacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.rssi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.networkTypeInUse)
                    (Ndis80211Configuration.typeLayout()).writeNative(addr + 60L, value.configuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.infrastructureMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 96L, value.supportedRates)
                }
            }
    }
}

public data class NdisWlanBssidEx(
    public var length: UInt = 0u,
    public var macAddress: UByteArray = UByteArray(6),
    public var reserved: UByteArray = UByteArray(2),
    public var ssid: Ndis80211Ssid = Ndis80211Ssid(),
    public var privacy: UInt = 0u,
    public var rssi: Int = 0,
    public var networkTypeInUse: Ndis80211NetworkType = 0,
    public var configuration: Ndis80211Configuration = Ndis80211Configuration(),
    public var infrastructureMode: Ndis80211NetworkInfrastructure = 0,
    public var supportedRates: UByteArray = UByteArray(16),
    public var iELength: UInt = 0u,
    public var iEs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWlanBssidEx) return false
        if (this.length != other.length) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ssid != other.ssid) return false
        if (this.privacy != other.privacy) return false
        if (this.rssi != other.rssi) return false
        if (this.networkTypeInUse != other.networkTypeInUse) return false
        if (this.configuration != other.configuration) return false
        if (this.infrastructureMode != other.infrastructureMode) return false
        if (!this.supportedRates.contentEquals(other.supportedRates)) return false
        if (this.iELength != other.iELength) return false
        if (!this.iEs.contentEquals(other.iEs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.macAddress.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.privacy.hashCode()
        result = 31 * result + this.rssi.hashCode()
        result = 31 * result + this.networkTypeInUse.hashCode()
        result = 31 * result + this.configuration.hashCode()
        result = 31 * result + this.infrastructureMode.hashCode()
        result = 31 * result + this.supportedRates.contentHashCode()
        result = 31 * result + this.iELength.hashCode()
        result = 31 * result + this.iEs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssidEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWlanBssidEx> {
                override val sizeBytes: Long = 120L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWlanBssidEx =
                    NdisWlanBssidEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L),
                        (Ndis80211Ssid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (Ndis80211Configuration.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 116L),
                    )
                override fun writeNative(addr: Long, value: NdisWlanBssidEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.macAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved)
                    (Ndis80211Ssid.typeLayout()).writeNative(addr + 12L, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.privacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.rssi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.networkTypeInUse)
                    (Ndis80211Configuration.typeLayout()).writeNative(addr + 60L, value.configuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.infrastructureMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 96L, value.supportedRates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.iELength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 116L, value.iEs)
                }
            }
    }
}

public data class NdisWmiEnumAdapter(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var deviceNameLength: UShort = 0u,
    public var deviceName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEnumAdapter) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }
}

public data class NdisWmiEventHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ifIndex: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var portNumber: UInt = 0u,
    public var deviceNameLength: UInt = 0u,
    public var deviceNameOffset: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiEventHeader) return false
        if (this.header != other.header) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.portNumber != other.portNumber) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (this.deviceNameOffset != other.deviceNameOffset) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.ifIndex.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceNameOffset.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiIpsecOffloadV1(
    public var supported: NdisWmiIpsecOffloadV10 = NdisWmiIpsecOffloadV10(),
    public var iPv4AH: NdisWmiIpsecOffloadV11 = NdisWmiIpsecOffloadV11(),
    public var iPv4ESP: NdisWmiIpsecOffloadV12 = NdisWmiIpsecOffloadV12(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV1> {
                override val sizeBytes: Long = 76L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV1 =
                    NdisWmiIpsecOffloadV1(
                        (NdisWmiIpsecOffloadV10.typeLayout()).readNative(addr),
                        (NdisWmiIpsecOffloadV11.typeLayout()).readNative(addr + 20L),
                        (NdisWmiIpsecOffloadV12.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV1) {
                    (NdisWmiIpsecOffloadV10.typeLayout()).writeNative(addr, value.supported)
                    (NdisWmiIpsecOffloadV11.typeLayout()).writeNative(addr + 20L, value.iPv4AH)
                    (NdisWmiIpsecOffloadV12.typeLayout()).writeNative(addr + 44L, value.iPv4ESP)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV11(
    public var md5: UInt = 0u,
    public var sha1: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV11> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV11 =
                    NdisWmiIpsecOffloadV11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.md5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sha1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tunnel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.send)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.receive)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV12(
    public var des: UInt = 0u,
    public var reserved: UInt = 0u,
    public var tripleDes: UInt = 0u,
    public var nullEsp: UInt = 0u,
    public var transport: UInt = 0u,
    public var tunnel: UInt = 0u,
    public var send: UInt = 0u,
    public var receive: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV12> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV12 =
                    NdisWmiIpsecOffloadV12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.des)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tripleDes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nullEsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.transport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tunnel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.send)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.receive)
                }
            }
    }
}

public data class NdisWmiIpsecOffloadV10(
    public var encapsulation: UInt = 0u,
    public var ahEspCombined: UInt = 0u,
    public var transportTunnelCombined: UInt = 0u,
    public var iPv4Options: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiIpsecOffloadV10> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiIpsecOffloadV10 =
                    NdisWmiIpsecOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiIpsecOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ahEspCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transportTunnelCombined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class NdisWmiMethodHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiMethodHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var checksum: NdisWmiTcpIpChecksumOffload = NdisWmiTcpIpChecksumOffload(),
    public var lsoV1: NdisWmiTcpLargeSendOffloadV1 = NdisWmiTcpLargeSendOffloadV1(),
    public var iPsecV1: NdisWmiIpsecOffloadV1 = NdisWmiIpsecOffloadV1(),
    public var lsoV2: NdisWmiTcpLargeSendOffloadV2 = NdisWmiTcpLargeSendOffloadV2(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOffload> {
                override val sizeBytes: Long = 224L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiOffload =
                    NdisWmiOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (NdisWmiTcpIpChecksumOffload.typeLayout()).readNative(addr + 4L),
                        (NdisWmiTcpLargeSendOffloadV1.typeLayout()).readNative(addr + 92L),
                        (NdisWmiIpsecOffloadV1.typeLayout()).readNative(addr + 112L),
                        (NdisWmiTcpLargeSendOffloadV2.typeLayout()).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (NdisWmiTcpIpChecksumOffload.typeLayout()).writeNative(addr + 4L, value.checksum)
                    (NdisWmiTcpLargeSendOffloadV1.typeLayout()).writeNative(addr + 92L, value.lsoV1)
                    (NdisWmiIpsecOffloadV1.typeLayout()).writeNative(addr + 112L, value.iPsecV1)
                    (NdisWmiTcpLargeSendOffloadV2.typeLayout()).writeNative(addr + 188L, value.lsoV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.flags)
                }
            }
    }
}

public data class NdisWmiOutputInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var flags: UInt = 0u,
    public var supportedRevision: UByte = 0u,
    public var dataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOutputInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiOutputInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiOutputInfo =
                    NdisWmiOutputInfo(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiOutputInfo) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.supportedRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataOffset)
                }
            }
    }
}

public data class NdisWmiSetHeader(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var portNumber: UInt = 0u,
    public var netLuid: NetLuidLh = NetLuidLh(),
    public var requestId: ULong = 0uL,
    public var timeout: UInt = 0u,
    public var padding: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWmiSetHeader) return false
        if (this.header != other.header) return false
        if (this.portNumber != other.portNumber) return false
        if (this.netLuid != other.netLuid) return false
        if (this.requestId != other.requestId) return false
        if (this.timeout != other.timeout) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.netLuid.hashCode()
        result = 31 * result + this.requestId.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class NdisWmiTcpConnectionOffload(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var encapsulation: UInt = 0u,
    public var supportIPv4: UInt = 0u,
    public var supportIPv6: UInt = 0u,
    public var supportIPv6ExtensionHeaders: UInt = 0u,
    public var supportSack: UInt = 0u,
    public var tcpConnectionOffloadCapacity: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpConnectionOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpConnectionOffload> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpConnectionOffload =
                    NdisWmiTcpConnectionOffload(
                        (NdisObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpConnectionOffload) {
                    (NdisObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.supportIPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.supportIPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.supportIPv6ExtensionHeaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.supportSack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tcpConnectionOffloadCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.flags)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload(
    public var iPv4Transmit: NdisWmiTcpIpChecksumOffload0 = NdisWmiTcpIpChecksumOffload0(),
    public var iPv4Receive: NdisWmiTcpIpChecksumOffload1 = NdisWmiTcpIpChecksumOffload1(),
    public var iPv6Transmit: NdisWmiTcpIpChecksumOffload2 = NdisWmiTcpIpChecksumOffload2(),
    public var iPv6Receive: NdisWmiTcpIpChecksumOffload3 = NdisWmiTcpIpChecksumOffload3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload =
                    NdisWmiTcpIpChecksumOffload(
                        (NdisWmiTcpIpChecksumOffload0.typeLayout()).readNative(addr),
                        (NdisWmiTcpIpChecksumOffload1.typeLayout()).readNative(addr + 24L),
                        (NdisWmiTcpIpChecksumOffload2.typeLayout()).readNative(addr + 48L),
                        (NdisWmiTcpIpChecksumOffload3.typeLayout()).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload) {
                    (NdisWmiTcpIpChecksumOffload0.typeLayout()).writeNative(addr, value.iPv4Transmit)
                    (NdisWmiTcpIpChecksumOffload1.typeLayout()).writeNative(addr + 24L, value.iPv4Receive)
                    (NdisWmiTcpIpChecksumOffload2.typeLayout()).writeNative(addr + 48L, value.iPv6Transmit)
                    (NdisWmiTcpIpChecksumOffload3.typeLayout()).writeNative(addr + 68L, value.iPv6Receive)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload1(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload1 =
                    NdisWmiTcpIpChecksumOffload1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ipChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload0(
    public var encapsulation: UInt = 0u,
    public var ipOptionsSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
    public var ipChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload0 =
                    NdisWmiTcpIpChecksumOffload0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ipChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload3(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload3> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload3 =
                    NdisWmiTcpIpChecksumOffload3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                }
            }
    }
}

public data class NdisWmiTcpIpChecksumOffload2(
    public var encapsulation: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
    public var tcpChecksum: UInt = 0u,
    public var udpChecksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpIpChecksumOffload2> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpIpChecksumOffload2 =
                    NdisWmiTcpIpChecksumOffload2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpIpChecksumOffload2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpOptionsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpChecksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.udpChecksum)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV1(
    public var iPv4: NdisWmiTcpLargeSendOffloadV10 = NdisWmiTcpLargeSendOffloadV10(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV1> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV1 =
                    NdisWmiTcpLargeSendOffloadV1(
                        (NdisWmiTcpLargeSendOffloadV10.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV1) {
                    (NdisWmiTcpLargeSendOffloadV10.typeLayout()).writeNative(addr, value.iPv4)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV10(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var tcpOptions: UInt = 0u,
    public var ipOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV10> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV10 =
                    NdisWmiTcpLargeSendOffloadV10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ipOptions)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV2(
    public var iPv4: NdisWmiTcpLargeSendOffloadV20 = NdisWmiTcpLargeSendOffloadV20(),
    public var iPv6: NdisWmiTcpLargeSendOffloadV21 = NdisWmiTcpLargeSendOffloadV21(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV2> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV2 =
                    NdisWmiTcpLargeSendOffloadV2(
                        (NdisWmiTcpLargeSendOffloadV20.typeLayout()).readNative(addr),
                        (NdisWmiTcpLargeSendOffloadV21.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV2) {
                    (NdisWmiTcpLargeSendOffloadV20.typeLayout()).writeNative(addr, value.iPv4)
                    (NdisWmiTcpLargeSendOffloadV21.typeLayout()).writeNative(addr + 12L, value.iPv6)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV20(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV20> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV20 =
                    NdisWmiTcpLargeSendOffloadV20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                }
            }
    }
}

public data class NdisWmiTcpLargeSendOffloadV21(
    public var encapsulation: UInt = 0u,
    public var maxOffLoadSize: UInt = 0u,
    public var minSegmentCount: UInt = 0u,
    public var ipExtensionHeadersSupported: UInt = 0u,
    public var tcpOptionsSupported: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdisWmiTcpLargeSendOffloadV21> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdisWmiTcpLargeSendOffloadV21 =
                    NdisWmiTcpLargeSendOffloadV21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdisWmiTcpLargeSendOffloadV21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encapsulation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxOffLoadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minSegmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ipExtensionHeadersSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tcpOptionsSupported)
                }
            }
    }
}

public class NdisWorkItem internal constructor(
    contextCtorArg: MutPtr<CVoid>,
    public var routine: NdisProc,
    public var wrapperReserved: UByteArray,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        routine = null,
        wrapperReserved = UByteArray(32),
    )

    public operator fun component1(): MutPtr<CVoid> = this.context

    public operator fun component2(): NdisProc = this.routine

    public operator fun component3(): UByteArray = this.wrapperReserved

    public fun copy(context: MutPtr<CVoid> = this.context, routine: NdisProc = this.routine, wrapperReserved: UByteArray = this.wrapperReserved): NdisWorkItem = NdisWorkItem(contextCtorArg = context, routine = routine, wrapperReserved = wrapperReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdisWorkItem) return false
        if (this.context != other.context) return false
        if (this.routine != other.routine) return false
        if (!this.wrapperReserved.contentEquals(other.wrapperReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.routine.hashCode()
        result = 31 * result + this.wrapperReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            context: MutPtr<CVoid> = MutPtr(0L),
            routine: NdisProc = null,
            wrapperReserved: UByteArray = UByteArray(32),
        ): NdisWorkItem =
            NdisWorkItem(
                contextCtorArg = context,
                routine = routine,
                wrapperReserved = wrapperReserved,
            )
    }
}

public data class NetworkAddress(
    public var addressLength: UShort = 0u,
    public var addressType: UShort = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddress) return false
        if (this.addressLength != other.addressLength) return false
        if (this.addressType != other.addressType) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressLength.hashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddress> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NetworkAddress =
                    NetworkAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.addressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.addressType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.address)
                }
            }
    }
}

public data class NetworkAddressIp(
    public var sinPort: UShort = 0u,
    public var inAddr: UInt = 0u,
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkAddressIp =
                    NetworkAddressIp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero)
                }
            }
    }
}

public data class NetworkAddressIp6(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIp6) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIp6> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkAddressIp6 =
                    NetworkAddressIp6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIp6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sin6Flowinfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 8L, value.sin6Addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sin6ScopeId)
                }
            }
    }
}

public data class NetworkAddressIpx(
    public var networkAddress: UInt = 0u,
    public var nodeAddress: UByteArray = UByteArray(6),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetworkAddressIpx) return false
        if (this.networkAddress != other.networkAddress) return false
        if (!this.nodeAddress.contentEquals(other.nodeAddress)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.networkAddress.hashCode()
        result = 31 * result + this.nodeAddress.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIpx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressIpx> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkAddressIpx =
                    NetworkAddressIpx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressIpx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.networkAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.nodeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.socket)
                }
            }
    }
}

public data class NetworkAddressList(
    public var addressCount: Int = 0,
    public var addressType: UShort = 0u,
    public var address: List<NetworkAddress> = List(1) { NetworkAddress() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAddressList> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkAddressList =
                    NetworkAddressList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NetworkAddress.typeLayout(), (1).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NetworkAddressList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.addressCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.addressType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NetworkAddress.typeLayout(), (1).toInt())
                    ).writeNative(addr + 6L, value.address)
                }
            }
    }
}

public data class OffloadAlgoInfo(
    public var algoIdentifier: UInt = 0u,
    public var algoKeylen: UInt = 0u,
    public var algoRounds: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadAlgoInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadAlgoInfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OffloadAlgoInfo =
                    OffloadAlgoInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: OffloadAlgoInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.algoIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algoKeylen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.algoRounds)
                }
            }
    }
}

public class OffloadIpsecAddSa internal constructor(
    public var srcAddr: UInt,
    public var srcMask: UInt,
    public var destAddr: UInt,
    public var destMask: UInt,
    public var protocol: UInt,
    public var srcPort: UShort,
    public var destPort: UShort,
    public var srcTunnelAddr: UInt,
    public var destTunnelAddr: UInt,
    public var flags: UShort,
    public var numSAs: Short,
    public var secAssoc: List<OffloadSecurityAssociation>,
    offloadHandleCtorArg: Handle,
    public var keyLen: UInt,
    public var keyMat: UByteArray,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public constructor() : this(
        srcAddr = 0u,
        srcMask = 0u,
        destAddr = 0u,
        destMask = 0u,
        protocol = 0u,
        srcPort = 0u,
        destPort = 0u,
        srcTunnelAddr = 0u,
        destTunnelAddr = 0u,
        flags = 0u,
        numSAs = 0,
        secAssoc = List(3) { OffloadSecurityAssociation() },
        offloadHandleCtorArg = MutPtr(0L),
        keyLen = 0u,
        keyMat = UByteArray(1),
    )

    public operator fun component1(): UInt = this.srcAddr

    public operator fun component2(): UInt = this.srcMask

    public operator fun component3(): UInt = this.destAddr

    public operator fun component4(): UInt = this.destMask

    public operator fun component5(): UInt = this.protocol

    public operator fun component6(): UShort = this.srcPort

    public operator fun component7(): UShort = this.destPort

    public operator fun component8(): UInt = this.srcTunnelAddr

    public operator fun component9(): UInt = this.destTunnelAddr

    public operator fun component10(): UShort = this.flags

    public operator fun component11(): Short = this.numSAs

    public operator fun component12(): List<OffloadSecurityAssociation> = this.secAssoc

    public operator fun component13(): Handle = this.offloadHandle

    public operator fun component14(): UInt = this.keyLen

    public operator fun component15(): UByteArray = this.keyMat

    public fun copy(srcAddr: UInt = this.srcAddr, srcMask: UInt = this.srcMask, destAddr: UInt = this.destAddr, destMask: UInt = this.destMask, protocol: UInt = this.protocol, srcPort: UShort = this.srcPort, destPort: UShort = this.destPort, srcTunnelAddr: UInt = this.srcTunnelAddr, destTunnelAddr: UInt = this.destTunnelAddr, flags: UShort = this.flags, numSAs: Short = this.numSAs, secAssoc: List<OffloadSecurityAssociation> = this.secAssoc, offloadHandle: Handle = this.offloadHandle, keyLen: UInt = this.keyLen, keyMat: UByteArray = this.keyMat): OffloadIpsecAddSa = OffloadIpsecAddSa(srcAddr = srcAddr, srcMask = srcMask, destAddr = destAddr, destMask = destMask, protocol = protocol, srcPort = srcPort, destPort = destPort, srcTunnelAddr = srcTunnelAddr, destTunnelAddr = destTunnelAddr, flags = flags, numSAs = numSAs, secAssoc = secAssoc, offloadHandleCtorArg = offloadHandle, keyLen = keyLen, keyMat = keyMat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecAddSa) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.srcMask != other.srcMask) return false
        if (this.destAddr != other.destAddr) return false
        if (this.destMask != other.destMask) return false
        if (this.protocol != other.protocol) return false
        if (this.srcPort != other.srcPort) return false
        if (this.destPort != other.destPort) return false
        if (this.srcTunnelAddr != other.srcTunnelAddr) return false
        if (this.destTunnelAddr != other.destTunnelAddr) return false
        if (this.flags != other.flags) return false
        if (this.numSAs != other.numSAs) return false
        if (this.secAssoc != other.secAssoc) return false
        if (this.offloadHandle != other.offloadHandle) return false
        if (this.keyLen != other.keyLen) return false
        if (!this.keyMat.contentEquals(other.keyMat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srcAddr.hashCode()
        result = 31 * result + this.srcMask.hashCode()
        result = 31 * result + this.destAddr.hashCode()
        result = 31 * result + this.destMask.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.srcPort.hashCode()
        result = 31 * result + this.destPort.hashCode()
        result = 31 * result + this.srcTunnelAddr.hashCode()
        result = 31 * result + this.destTunnelAddr.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numSAs.hashCode()
        result = 31 * result + this.secAssoc.hashCode()
        result = 31 * result + this.offloadHandle.hashCode()
        result = 31 * result + this.keyLen.hashCode()
        result = 31 * result + this.keyMat.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            srcAddr: UInt = 0u,
            srcMask: UInt = 0u,
            destAddr: UInt = 0u,
            destMask: UInt = 0u,
            protocol: UInt = 0u,
            srcPort: UShort = 0u,
            destPort: UShort = 0u,
            srcTunnelAddr: UInt = 0u,
            destTunnelAddr: UInt = 0u,
            flags: UShort = 0u,
            numSAs: Short = 0,
            secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
            offloadHandle: Handle = MutPtr(0L),
            keyLen: UInt = 0u,
            keyMat: UByteArray = UByteArray(1),
        ): OffloadIpsecAddSa =
            OffloadIpsecAddSa(
                srcAddr = srcAddr,
                srcMask = srcMask,
                destAddr = destAddr,
                destMask = destMask,
                protocol = protocol,
                srcPort = srcPort,
                destPort = destPort,
                srcTunnelAddr = srcTunnelAddr,
                destTunnelAddr = destTunnelAddr,
                flags = flags,
                numSAs = numSAs,
                secAssoc = secAssoc,
                offloadHandleCtorArg = offloadHandle,
                keyLen = keyLen,
                keyMat = keyMat,
            )
    }
}

public class OffloadIpsecAddUdpespSa internal constructor(
    public var srcAddr: UInt,
    public var srcMask: UInt,
    public var dstAddr: UInt,
    public var dstMask: UInt,
    public var protocol: UInt,
    public var srcPort: UShort,
    public var dstPort: UShort,
    public var srcTunnelAddr: UInt,
    public var dstTunnelAddr: UInt,
    public var flags: UShort,
    public var numSAs: Short,
    public var secAssoc: List<OffloadSecurityAssociation>,
    offloadHandleCtorArg: Handle,
    public var encapTypeEntry: OffloadIpsecUdpespEncaptypeEntry,
    encapTypeEntryOffldHandleCtorArg: Handle,
    public var keyLen: UInt,
    public var keyMat: UByteArray,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public var encapTypeEntryOffldHandle: Handle = encapTypeEntryOffldHandleCtorArg
        internal set

    public constructor() : this(
        srcAddr = 0u,
        srcMask = 0u,
        dstAddr = 0u,
        dstMask = 0u,
        protocol = 0u,
        srcPort = 0u,
        dstPort = 0u,
        srcTunnelAddr = 0u,
        dstTunnelAddr = 0u,
        flags = 0u,
        numSAs = 0,
        secAssoc = List(3) { OffloadSecurityAssociation() },
        offloadHandleCtorArg = MutPtr(0L),
        encapTypeEntry = OffloadIpsecUdpespEncaptypeEntry(),
        encapTypeEntryOffldHandleCtorArg = MutPtr(0L),
        keyLen = 0u,
        keyMat = UByteArray(1),
    )

    public companion object {
        public operator fun invoke(
            srcAddr: UInt = 0u,
            srcMask: UInt = 0u,
            dstAddr: UInt = 0u,
            dstMask: UInt = 0u,
            protocol: UInt = 0u,
            srcPort: UShort = 0u,
            dstPort: UShort = 0u,
            srcTunnelAddr: UInt = 0u,
            dstTunnelAddr: UInt = 0u,
            flags: UShort = 0u,
            numSAs: Short = 0,
            secAssoc: List<OffloadSecurityAssociation> = List(3) { OffloadSecurityAssociation() },
            offloadHandle: Handle = MutPtr(0L),
            encapTypeEntry: OffloadIpsecUdpespEncaptypeEntry = OffloadIpsecUdpespEncaptypeEntry(),
            encapTypeEntryOffldHandle: Handle = MutPtr(0L),
            keyLen: UInt = 0u,
            keyMat: UByteArray = UByteArray(1),
        ): OffloadIpsecAddUdpespSa =
            OffloadIpsecAddUdpespSa(
                srcAddr = srcAddr,
                srcMask = srcMask,
                dstAddr = dstAddr,
                dstMask = dstMask,
                protocol = protocol,
                srcPort = srcPort,
                dstPort = dstPort,
                srcTunnelAddr = srcTunnelAddr,
                dstTunnelAddr = dstTunnelAddr,
                flags = flags,
                numSAs = numSAs,
                secAssoc = secAssoc,
                offloadHandleCtorArg = offloadHandle,
                encapTypeEntry = encapTypeEntry,
                encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle,
                keyLen = keyLen,
                keyMat = keyMat,
            )
    }
}

public class OffloadIpsecDeleteSa internal constructor(
    offloadHandleCtorArg: Handle,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public constructor() : this(
        offloadHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.offloadHandle

    public fun copy(offloadHandle: Handle = this.offloadHandle): OffloadIpsecDeleteSa = OffloadIpsecDeleteSa(offloadHandleCtorArg = offloadHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecDeleteSa) return false
        if (this.offloadHandle != other.offloadHandle) return false
        return true
    }

    override fun hashCode(): Int = this.offloadHandle.hashCode()

    public companion object {
        public operator fun invoke(
            offloadHandle: Handle = MutPtr(0L),
        ): OffloadIpsecDeleteSa =
            OffloadIpsecDeleteSa(
                offloadHandleCtorArg = offloadHandle,
            )
    }
}

public class OffloadIpsecDeleteUdpespSa internal constructor(
    offloadHandleCtorArg: Handle,
    encapTypeEntryOffldHandleCtorArg: Handle,
) {
    public var offloadHandle: Handle = offloadHandleCtorArg
        internal set

    public var encapTypeEntryOffldHandle: Handle = encapTypeEntryOffldHandleCtorArg
        internal set

    public constructor() : this(
        offloadHandleCtorArg = MutPtr(0L),
        encapTypeEntryOffldHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.offloadHandle

    public operator fun component2(): Handle = this.encapTypeEntryOffldHandle

    public fun copy(offloadHandle: Handle = this.offloadHandle, encapTypeEntryOffldHandle: Handle = this.encapTypeEntryOffldHandle): OffloadIpsecDeleteUdpespSa = OffloadIpsecDeleteUdpespSa(offloadHandleCtorArg = offloadHandle, encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadIpsecDeleteUdpespSa) return false
        if (this.offloadHandle != other.offloadHandle) return false
        if (this.encapTypeEntryOffldHandle != other.encapTypeEntryOffldHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offloadHandle.hashCode()
        result = 31 * result + this.encapTypeEntryOffldHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            offloadHandle: Handle = MutPtr(0L),
            encapTypeEntryOffldHandle: Handle = MutPtr(0L),
        ): OffloadIpsecDeleteUdpespSa =
            OffloadIpsecDeleteUdpespSa(
                offloadHandleCtorArg = offloadHandle,
                encapTypeEntryOffldHandleCtorArg = encapTypeEntryOffldHandle,
            )
    }
}

public data class OffloadIpsecUdpespEncaptypeEntry(
    public var udpEncapType: UdpEncapType = 0,
    public var dstEncapPort: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadIpsecUdpespEncaptypeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadIpsecUdpespEncaptypeEntry> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OffloadIpsecUdpespEncaptypeEntry =
                    OffloadIpsecUdpespEncaptypeEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OffloadIpsecUdpespEncaptypeEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.udpEncapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.dstEncapPort)
                }
            }
    }
}

public data class OffloadSecurityAssociation(
    public var operation: OffloadOperationE = 0,
    public var spi: UInt = 0u,
    public var integrityAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var confAlgo: OffloadAlgoInfo = OffloadAlgoInfo(),
    public var reserved: OffloadAlgoInfo = OffloadAlgoInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadSecurityAssociation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadSecurityAssociation> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OffloadSecurityAssociation =
                    OffloadSecurityAssociation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 8L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 20L),
                        (OffloadAlgoInfo.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: OffloadSecurityAssociation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.spi)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 8L, value.integrityAlgo)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 20L, value.confAlgo)
                    (OffloadAlgoInfo.typeLayout()).writeNative(addr + 32L, value.reserved)
                }
            }
    }
}

public data class PmkidCandidate(
    public var bssid: UByteArray = UByteArray(6),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmkidCandidate) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmkidCandidate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PmkidCandidate> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PmkidCandidate =
                    PmkidCandidate(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PmkidCandidate) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class Reference(
    public var spinLock: Int = 0,
    public var referenceCount: UShort = 0u,
    public var closing: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reference> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Reference> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Reference =
                    Reference(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Reference) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.spinLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.referenceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.closing)
                }
            }
    }
}

public data class TransportHeaderOffset(
    public var protocolType: UShort = 0u,
    public var headerOffset: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportHeaderOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportHeaderOffset> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): TransportHeaderOffset =
                    TransportHeaderOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TransportHeaderOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.protocolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.headerOffset)
                }
            }
    }
}

public data class VarString(
    public var ulTotalSize: UInt = 0u,
    public var ulNeededSize: UInt = 0u,
    public var ulUsedSize: UInt = 0u,
    public var ulStringFormat: UInt = 0u,
    public var ulStringSize: UInt = 0u,
    public var ulStringOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VarString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VarString> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VarString =
                    VarString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: VarString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulStringFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStringSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulStringOffset)
                }
            }
    }
}
