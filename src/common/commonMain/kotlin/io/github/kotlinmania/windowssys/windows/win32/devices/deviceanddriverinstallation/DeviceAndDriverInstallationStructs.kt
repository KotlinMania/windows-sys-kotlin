@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.VerPlatform
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ProcessorArchitecture
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

public data class BusnumberDes(
    public var busdCount: UInt = 0u,
    public var busdType: UInt = 0u,
    public var busdFlags: UInt = 0u,
    public var busdAllocBase: UInt = 0u,
    public var busdAllocEnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): BusnumberDes =
                    BusnumberDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BusnumberDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.busdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.busdFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.busdAllocBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.busdAllocEnd)
                }
            }
    }
}

public data class BusnumberRange(
    public var busrMin: UInt = 0u,
    public var busrMax: UInt = 0u,
    public var busrNBusNumbers: UInt = 0u,
    public var busrFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BusnumberRange =
                    BusnumberRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BusnumberRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busrMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.busrMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.busrNBusNumbers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.busrFlags)
                }
            }
    }
}

public data class BusnumberResource(
    public var busNumberHeader: BusnumberDes = BusnumberDes(),
    public var busNumberData: List<BusnumberRange> = List(1) { BusnumberRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BusnumberResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): BusnumberResource =
                    BusnumberResource(
                        (BusnumberDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BusnumberRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: BusnumberResource) {
                    (BusnumberDes.typeLayout()).writeNative(addr, value.busNumberHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BusnumberRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 20L, value.busNumberData)
                }
            }
    }
}

public class CabinetInfoA internal constructor(
    cabinetPathCtorArg: Pcstr,
    cabinetFileCtorArg: Pcstr,
    diskNameCtorArg: Pcstr,
    public var setId: UShort,
    public var cabinetNumber: UShort,
) {
    public var cabinetPath: Pcstr = cabinetPathCtorArg
        internal set

    public var cabinetFile: Pcstr = cabinetFileCtorArg
        internal set

    public var diskName: Pcstr = diskNameCtorArg
        internal set

    public constructor() : this(
        cabinetPathCtorArg = ConstPtr(0L),
        cabinetFileCtorArg = ConstPtr(0L),
        diskNameCtorArg = ConstPtr(0L),
        setId = 0u,
        cabinetNumber = 0u,
    )

    public operator fun component1(): Pcstr = this.cabinetPath

    public operator fun component2(): Pcstr = this.cabinetFile

    public operator fun component3(): Pcstr = this.diskName

    public operator fun component4(): UShort = this.setId

    public operator fun component5(): UShort = this.cabinetNumber

    public fun copy(cabinetPath: Pcstr = this.cabinetPath, cabinetFile: Pcstr = this.cabinetFile, diskName: Pcstr = this.diskName, setId: UShort = this.setId, cabinetNumber: UShort = this.cabinetNumber): CabinetInfoA = CabinetInfoA(cabinetPathCtorArg = cabinetPath, cabinetFileCtorArg = cabinetFile, diskNameCtorArg = diskName, setId = setId, cabinetNumber = cabinetNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CabinetInfoA) return false
        if (this.cabinetPath != other.cabinetPath) return false
        if (this.cabinetFile != other.cabinetFile) return false
        if (this.diskName != other.diskName) return false
        if (this.setId != other.setId) return false
        if (this.cabinetNumber != other.cabinetNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cabinetPath.hashCode()
        result = 31 * result + this.cabinetFile.hashCode()
        result = 31 * result + this.diskName.hashCode()
        result = 31 * result + this.setId.hashCode()
        result = 31 * result + this.cabinetNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cabinetPath: Pcstr = ConstPtr(0L),
            cabinetFile: Pcstr = ConstPtr(0L),
            diskName: Pcstr = ConstPtr(0L),
            setId: UShort = 0u,
            cabinetNumber: UShort = 0u,
        ): CabinetInfoA =
            CabinetInfoA(
                cabinetPathCtorArg = cabinetPath,
                cabinetFileCtorArg = cabinetFile,
                diskNameCtorArg = diskName,
                setId = setId,
                cabinetNumber = cabinetNumber,
            )
    }
}

public class CabinetInfoW internal constructor(
    cabinetPathCtorArg: Pcwstr,
    cabinetFileCtorArg: Pcwstr,
    diskNameCtorArg: Pcwstr,
    public var setId: UShort,
    public var cabinetNumber: UShort,
) {
    public var cabinetPath: Pcwstr = cabinetPathCtorArg
        internal set

    public var cabinetFile: Pcwstr = cabinetFileCtorArg
        internal set

    public var diskName: Pcwstr = diskNameCtorArg
        internal set

    public constructor() : this(
        cabinetPathCtorArg = ConstPtr(0L),
        cabinetFileCtorArg = ConstPtr(0L),
        diskNameCtorArg = ConstPtr(0L),
        setId = 0u,
        cabinetNumber = 0u,
    )

    public operator fun component1(): Pcwstr = this.cabinetPath

    public operator fun component2(): Pcwstr = this.cabinetFile

    public operator fun component3(): Pcwstr = this.diskName

    public operator fun component4(): UShort = this.setId

    public operator fun component5(): UShort = this.cabinetNumber

    public fun copy(cabinetPath: Pcwstr = this.cabinetPath, cabinetFile: Pcwstr = this.cabinetFile, diskName: Pcwstr = this.diskName, setId: UShort = this.setId, cabinetNumber: UShort = this.cabinetNumber): CabinetInfoW = CabinetInfoW(cabinetPathCtorArg = cabinetPath, cabinetFileCtorArg = cabinetFile, diskNameCtorArg = diskName, setId = setId, cabinetNumber = cabinetNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CabinetInfoW) return false
        if (this.cabinetPath != other.cabinetPath) return false
        if (this.cabinetFile != other.cabinetFile) return false
        if (this.diskName != other.diskName) return false
        if (this.setId != other.setId) return false
        if (this.cabinetNumber != other.cabinetNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cabinetPath.hashCode()
        result = 31 * result + this.cabinetFile.hashCode()
        result = 31 * result + this.diskName.hashCode()
        result = 31 * result + this.setId.hashCode()
        result = 31 * result + this.cabinetNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cabinetPath: Pcwstr = ConstPtr(0L),
            cabinetFile: Pcwstr = ConstPtr(0L),
            diskName: Pcwstr = ConstPtr(0L),
            setId: UShort = 0u,
            cabinetNumber: UShort = 0u,
        ): CabinetInfoW =
            CabinetInfoW(
                cabinetPathCtorArg = cabinetPath,
                cabinetFileCtorArg = cabinetFile,
                diskNameCtorArg = diskName,
                setId = setId,
                cabinetNumber = cabinetNumber,
            )
    }
}

public data class CmNotifyEventData(
    public var filterType: CmNotifyFilterType = 0,
    public var reserved: UInt = 0u,
    public var u: CmNotifyEventData0 = CmNotifyEventData0(),
)

public data class CmNotifyEventData0(
    public var deviceInterface: CmNotifyEventData00 = CmNotifyEventData00(),
    public var deviceHandle: CmNotifyEventData01 = CmNotifyEventData01(),
    public var deviceInstance: CmNotifyEventData02 = CmNotifyEventData02(),
)

public data class CmNotifyEventData01(
    public var eventGuid: Guid = Guid(),
    public var nameOffset: Int = 0,
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData01) return false
        if (this.eventGuid != other.eventGuid) return false
        if (this.nameOffset != other.nameOffset) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventGuid.hashCode()
        result = 31 * result + this.nameOffset.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class CmNotifyEventData02(
    public var instanceId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData02) return false
        if (!this.instanceId.contentEquals(other.instanceId)) return false
        return true
    }

    override fun hashCode(): Int = this.instanceId.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmNotifyEventData02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmNotifyEventData02> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): CmNotifyEventData02 =
                    CmNotifyEventData02(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CmNotifyEventData02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.instanceId.toList())
                }
            }
    }
}

public data class CmNotifyEventData00(
    public var classGuid: Guid = Guid(),
    public var symbolicLink: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData00) return false
        if (this.classGuid != other.classGuid) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classGuid.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }
}

public data class CmNotifyFilter(
    public var cbSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var filterType: CmNotifyFilterType = 0,
    public var reserved: UInt = 0u,
    public var u: CmNotifyFilter0 = CmNotifyFilter0(),
)

public data class CmNotifyFilter0(
    public var deviceInterface: CmNotifyFilter00 = CmNotifyFilter00(),
    public var deviceHandle: CmNotifyFilter01 = CmNotifyFilter01(),
    public var deviceInstance: CmNotifyFilter02 = CmNotifyFilter02(),
)

public class CmNotifyFilter01 internal constructor(
    hTargetCtorArg: Handle,
) {
    public var hTarget: Handle = hTargetCtorArg
        internal set

    public constructor() : this(
        hTargetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hTarget

    public fun copy(hTarget: Handle = this.hTarget): CmNotifyFilter01 = CmNotifyFilter01(hTargetCtorArg = hTarget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyFilter01) return false
        if (this.hTarget != other.hTarget) return false
        return true
    }

    override fun hashCode(): Int = this.hTarget.hashCode()

    public companion object {
        public operator fun invoke(
            hTarget: Handle = MutPtr(0L),
        ): CmNotifyFilter01 =
            CmNotifyFilter01(
                hTargetCtorArg = hTarget,
            )
    }
}

public data class CmNotifyFilter02(
    public var instanceId: UShortArray = UShortArray(200),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyFilter02) return false
        if (!this.instanceId.contentEquals(other.instanceId)) return false
        return true
    }

    override fun hashCode(): Int = this.instanceId.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmNotifyFilter02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmNotifyFilter02> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 400L
                override fun readNative(addr: Long): CmNotifyFilter02 =
                    CmNotifyFilter02(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (200).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CmNotifyFilter02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (200).toInt())
                    ).writeNative(addr, value.instanceId.toList())
                }
            }
    }
}

public data class CmNotifyFilter00(
    public var classGuid: Guid = Guid(),
)

public class CoinstallerContextData internal constructor(
    public var postProcessing: Bool,
    public var installResult: UInt,
    privateDataCtorArg: MutPtr<CVoid>,
) {
    public var privateData: MutPtr<CVoid> = privateDataCtorArg
        internal set

    public constructor() : this(
        postProcessing = 0,
        installResult = 0u,
        privateDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.postProcessing

    public operator fun component2(): UInt = this.installResult

    public operator fun component3(): MutPtr<CVoid> = this.privateData

    public fun copy(postProcessing: Bool = this.postProcessing, installResult: UInt = this.installResult, privateData: MutPtr<CVoid> = this.privateData): CoinstallerContextData = CoinstallerContextData(postProcessing = postProcessing, installResult = installResult, privateDataCtorArg = privateData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CoinstallerContextData) return false
        if (this.postProcessing != other.postProcessing) return false
        if (this.installResult != other.installResult) return false
        if (this.privateData != other.privateData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.postProcessing.hashCode()
        result = 31 * result + this.installResult.hashCode()
        result = 31 * result + this.privateData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoinstallerContextData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CoinstallerContextData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CoinstallerContextData =
                    CoinstallerContextData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CoinstallerContextData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.postProcessing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.installResult)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.privateData)
                }
            }

        public operator fun invoke(
            postProcessing: Bool = 0,
            installResult: UInt = 0u,
            privateData: MutPtr<CVoid> = MutPtr(0L),
        ): CoinstallerContextData =
            CoinstallerContextData(
                postProcessing = postProcessing,
                installResult = installResult,
                privateDataCtorArg = privateData,
            )
    }
}

public data class ConflictDetailsA(
    public var cdUlSize: UInt = 0u,
    public var cdUlMask: CmCdmask = 0u,
    public var cdDnDevInst: UInt = 0u,
    public var cdRdResDes: Int = 0,
    public var cdUlFlags: CmCdflags = 0u,
    public var cdSzDescription: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConflictDetailsA) return false
        if (this.cdUlSize != other.cdUlSize) return false
        if (this.cdUlMask != other.cdUlMask) return false
        if (this.cdDnDevInst != other.cdDnDevInst) return false
        if (this.cdRdResDes != other.cdRdResDes) return false
        if (this.cdUlFlags != other.cdUlFlags) return false
        if (!this.cdSzDescription.contentEquals(other.cdSzDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdUlSize.hashCode()
        result = 31 * result + this.cdUlMask.hashCode()
        result = 31 * result + this.cdDnDevInst.hashCode()
        result = 31 * result + this.cdRdResDes.hashCode()
        result = 31 * result + this.cdUlFlags.hashCode()
        result = 31 * result + this.cdSzDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConflictDetailsA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConflictDetailsA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 288L
                override fun readNative(addr: Long): ConflictDetailsA =
                    ConflictDetailsA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ConflictDetailsA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cdUlSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cdUlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdDnDevInst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.cdRdResDes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cdUlFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 28L, value.cdSzDescription.toList())
                }
            }
    }
}

public data class ConflictDetailsW(
    public var cdUlSize: UInt = 0u,
    public var cdUlMask: CmCdmask = 0u,
    public var cdDnDevInst: UInt = 0u,
    public var cdRdResDes: Int = 0,
    public var cdUlFlags: CmCdflags = 0u,
    public var cdSzDescription: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConflictDetailsW) return false
        if (this.cdUlSize != other.cdUlSize) return false
        if (this.cdUlMask != other.cdUlMask) return false
        if (this.cdDnDevInst != other.cdDnDevInst) return false
        if (this.cdRdResDes != other.cdRdResDes) return false
        if (this.cdUlFlags != other.cdUlFlags) return false
        if (!this.cdSzDescription.contentEquals(other.cdSzDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdUlSize.hashCode()
        result = 31 * result + this.cdUlMask.hashCode()
        result = 31 * result + this.cdDnDevInst.hashCode()
        result = 31 * result + this.cdRdResDes.hashCode()
        result = 31 * result + this.cdUlFlags.hashCode()
        result = 31 * result + this.cdSzDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConflictDetailsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConflictDetailsW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 552L
                override fun readNative(addr: Long): ConflictDetailsW =
                    ConflictDetailsW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ConflictDetailsW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cdUlSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cdUlMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdDnDevInst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.cdRdResDes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cdUlFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 28L, value.cdSzDescription.toList())
                }
            }
    }
}

public data class ConnectionDes(
    public var condType: UInt = 0u,
    public var condFlags: UInt = 0u,
    public var condClass: UByte = 0u,
    public var condClassType: UByte = 0u,
    public var condReserved1: UByte = 0u,
    public var condReserved2: UByte = 0u,
    public var condId: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ConnectionDes =
                    ConnectionDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ConnectionDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.condType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.condFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.condClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.condClassType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.condReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.condReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 12L, value.condId)
                }
            }
    }
}

public data class ConnectionResource(
    public var connectionHeader: ConnectionDes = ConnectionDes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ConnectionResource =
                    ConnectionResource(
                        (ConnectionDes.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ConnectionResource) {
                    (ConnectionDes.typeLayout()).writeNative(addr, value.connectionHeader)
                }
            }
    }
}

public data class CsDes(
    public var csdSignatureLength: UInt = 0u,
    public var csdLegacyDataOffset: UInt = 0u,
    public var csdLegacyDataSize: UInt = 0u,
    public var csdFlags: UInt = 0u,
    public var csdClassGuid: Guid = Guid(),
    public var csdSignature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsDes) return false
        if (this.csdSignatureLength != other.csdSignatureLength) return false
        if (this.csdLegacyDataOffset != other.csdLegacyDataOffset) return false
        if (this.csdLegacyDataSize != other.csdLegacyDataSize) return false
        if (this.csdFlags != other.csdFlags) return false
        if (this.csdClassGuid != other.csdClassGuid) return false
        if (!this.csdSignature.contentEquals(other.csdSignature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.csdSignatureLength.hashCode()
        result = 31 * result + this.csdLegacyDataOffset.hashCode()
        result = 31 * result + this.csdLegacyDataSize.hashCode()
        result = 31 * result + this.csdFlags.hashCode()
        result = 31 * result + this.csdClassGuid.hashCode()
        result = 31 * result + this.csdSignature.contentHashCode()
        return result
    }
}

public data class CsResource(
    public var csHeader: CsDes = CsDes(),
)

public data class DevprivateDes(
    public var pdCount: UInt = 0u,
    public var pdType: UInt = 0u,
    public var pdData1: UInt = 0u,
    public var pdData2: UInt = 0u,
    public var pdData3: UInt = 0u,
    public var pdFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DevprivateDes =
                    DevprivateDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DevprivateDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pdData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pdData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pdData3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pdFlags)
                }
            }
    }
}

public data class DevprivateRange(
    public var prData1: UInt = 0u,
    public var prData2: UInt = 0u,
    public var prData3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DevprivateRange =
                    DevprivateRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DevprivateRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.prData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.prData3)
                }
            }
    }
}

public data class DevprivateResource(
    public var prvHeader: DevprivateDes = DevprivateDes(),
    public var prvData: List<DevprivateRange> = List(1) { DevprivateRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevprivateResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): DevprivateResource =
                    DevprivateResource(
                        (DevprivateDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DevprivateRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DevprivateResource) {
                    (DevprivateDes.typeLayout()).writeNative(addr, value.prvHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DevprivateRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.prvData)
                }
            }
    }
}

public data class DmaDes(
    public var ddCount: UInt = 0u,
    public var ddType: UInt = 0u,
    public var ddFlags: DdFlags = 0u,
    public var ddAllocChan: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DmaDes =
                    DmaDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DmaDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ddCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ddType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ddFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ddAllocChan)
                }
            }
    }
}

public data class DmaRange(
    public var drMin: UInt = 0u,
    public var drMax: UInt = 0u,
    public var drFlags: DdFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DmaRange =
                    DmaRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DmaRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.drMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.drMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.drFlags)
                }
            }
    }
}

public data class DmaResource(
    public var dmaHeader: DmaDes = DmaDes(),
    public var dmaData: List<DmaRange> = List(1) { DmaRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmaResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DmaResource =
                    DmaResource(
                        (DmaDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DmaRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DmaResource) {
                    (DmaDes.typeLayout()).writeNative(addr, value.dmaHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DmaRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.dmaData)
                }
            }
    }
}

public class FilepathsA internal constructor(
    targetCtorArg: Pcstr,
    sourceCtorArg: Pcstr,
    public var win32Error: UInt,
    public var flags: UInt,
) {
    public var target: Pcstr = targetCtorArg
        internal set

    public var source: Pcstr = sourceCtorArg
        internal set

    public constructor() : this(
        targetCtorArg = ConstPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        win32Error = 0u,
        flags = 0u,
    )

    public operator fun component1(): Pcstr = this.target

    public operator fun component2(): Pcstr = this.source

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.flags

    public fun copy(target: Pcstr = this.target, source: Pcstr = this.source, win32Error: UInt = this.win32Error, flags: UInt = this.flags): FilepathsA = FilepathsA(targetCtorArg = target, sourceCtorArg = source, win32Error = win32Error, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilepathsA) return false
        if (this.target != other.target) return false
        if (this.source != other.source) return false
        if (this.win32Error != other.win32Error) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.target.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            target: Pcstr = ConstPtr(0L),
            source: Pcstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            flags: UInt = 0u,
        ): FilepathsA =
            FilepathsA(
                targetCtorArg = target,
                sourceCtorArg = source,
                win32Error = win32Error,
                flags = flags,
            )
    }
}

public class FilepathsSignerinfoA internal constructor(
    targetCtorArg: Pcstr,
    sourceCtorArg: Pcstr,
    public var win32Error: UInt,
    public var flags: UInt,
    digitalSignerCtorArg: Pcstr,
    versionCtorArg: Pcstr,
    catalogFileCtorArg: Pcstr,
) {
    public var target: Pcstr = targetCtorArg
        internal set

    public var source: Pcstr = sourceCtorArg
        internal set

    public var digitalSigner: Pcstr = digitalSignerCtorArg
        internal set

    public var version: Pcstr = versionCtorArg
        internal set

    public var catalogFile: Pcstr = catalogFileCtorArg
        internal set

    public constructor() : this(
        targetCtorArg = ConstPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        win32Error = 0u,
        flags = 0u,
        digitalSignerCtorArg = ConstPtr(0L),
        versionCtorArg = ConstPtr(0L),
        catalogFileCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcstr = this.target

    public operator fun component2(): Pcstr = this.source

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): Pcstr = this.digitalSigner

    public operator fun component6(): Pcstr = this.version

    public operator fun component7(): Pcstr = this.catalogFile

    public fun copy(target: Pcstr = this.target, source: Pcstr = this.source, win32Error: UInt = this.win32Error, flags: UInt = this.flags, digitalSigner: Pcstr = this.digitalSigner, version: Pcstr = this.version, catalogFile: Pcstr = this.catalogFile): FilepathsSignerinfoA = FilepathsSignerinfoA(targetCtorArg = target, sourceCtorArg = source, win32Error = win32Error, flags = flags, digitalSignerCtorArg = digitalSigner, versionCtorArg = version, catalogFileCtorArg = catalogFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilepathsSignerinfoA) return false
        if (this.target != other.target) return false
        if (this.source != other.source) return false
        if (this.win32Error != other.win32Error) return false
        if (this.flags != other.flags) return false
        if (this.digitalSigner != other.digitalSigner) return false
        if (this.version != other.version) return false
        if (this.catalogFile != other.catalogFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.target.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.digitalSigner.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.catalogFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            target: Pcstr = ConstPtr(0L),
            source: Pcstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            flags: UInt = 0u,
            digitalSigner: Pcstr = ConstPtr(0L),
            version: Pcstr = ConstPtr(0L),
            catalogFile: Pcstr = ConstPtr(0L),
        ): FilepathsSignerinfoA =
            FilepathsSignerinfoA(
                targetCtorArg = target,
                sourceCtorArg = source,
                win32Error = win32Error,
                flags = flags,
                digitalSignerCtorArg = digitalSigner,
                versionCtorArg = version,
                catalogFileCtorArg = catalogFile,
            )
    }
}

public class FilepathsSignerinfoW internal constructor(
    targetCtorArg: Pcwstr,
    sourceCtorArg: Pcwstr,
    public var win32Error: UInt,
    public var flags: UInt,
    digitalSignerCtorArg: Pcwstr,
    versionCtorArg: Pcwstr,
    catalogFileCtorArg: Pcwstr,
) {
    public var target: Pcwstr = targetCtorArg
        internal set

    public var source: Pcwstr = sourceCtorArg
        internal set

    public var digitalSigner: Pcwstr = digitalSignerCtorArg
        internal set

    public var version: Pcwstr = versionCtorArg
        internal set

    public var catalogFile: Pcwstr = catalogFileCtorArg
        internal set

    public constructor() : this(
        targetCtorArg = ConstPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        win32Error = 0u,
        flags = 0u,
        digitalSignerCtorArg = ConstPtr(0L),
        versionCtorArg = ConstPtr(0L),
        catalogFileCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.target

    public operator fun component2(): Pcwstr = this.source

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): Pcwstr = this.digitalSigner

    public operator fun component6(): Pcwstr = this.version

    public operator fun component7(): Pcwstr = this.catalogFile

    public fun copy(target: Pcwstr = this.target, source: Pcwstr = this.source, win32Error: UInt = this.win32Error, flags: UInt = this.flags, digitalSigner: Pcwstr = this.digitalSigner, version: Pcwstr = this.version, catalogFile: Pcwstr = this.catalogFile): FilepathsSignerinfoW = FilepathsSignerinfoW(targetCtorArg = target, sourceCtorArg = source, win32Error = win32Error, flags = flags, digitalSignerCtorArg = digitalSigner, versionCtorArg = version, catalogFileCtorArg = catalogFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilepathsSignerinfoW) return false
        if (this.target != other.target) return false
        if (this.source != other.source) return false
        if (this.win32Error != other.win32Error) return false
        if (this.flags != other.flags) return false
        if (this.digitalSigner != other.digitalSigner) return false
        if (this.version != other.version) return false
        if (this.catalogFile != other.catalogFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.target.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.digitalSigner.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.catalogFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            target: Pcwstr = ConstPtr(0L),
            source: Pcwstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            flags: UInt = 0u,
            digitalSigner: Pcwstr = ConstPtr(0L),
            version: Pcwstr = ConstPtr(0L),
            catalogFile: Pcwstr = ConstPtr(0L),
        ): FilepathsSignerinfoW =
            FilepathsSignerinfoW(
                targetCtorArg = target,
                sourceCtorArg = source,
                win32Error = win32Error,
                flags = flags,
                digitalSignerCtorArg = digitalSigner,
                versionCtorArg = version,
                catalogFileCtorArg = catalogFile,
            )
    }
}

public class FilepathsW internal constructor(
    targetCtorArg: Pcwstr,
    sourceCtorArg: Pcwstr,
    public var win32Error: UInt,
    public var flags: UInt,
) {
    public var target: Pcwstr = targetCtorArg
        internal set

    public var source: Pcwstr = sourceCtorArg
        internal set

    public constructor() : this(
        targetCtorArg = ConstPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        win32Error = 0u,
        flags = 0u,
    )

    public operator fun component1(): Pcwstr = this.target

    public operator fun component2(): Pcwstr = this.source

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.flags

    public fun copy(target: Pcwstr = this.target, source: Pcwstr = this.source, win32Error: UInt = this.win32Error, flags: UInt = this.flags): FilepathsW = FilepathsW(targetCtorArg = target, sourceCtorArg = source, win32Error = win32Error, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilepathsW) return false
        if (this.target != other.target) return false
        if (this.source != other.source) return false
        if (this.win32Error != other.win32Error) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.target.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            target: Pcwstr = ConstPtr(0L),
            source: Pcwstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            flags: UInt = 0u,
        ): FilepathsW =
            FilepathsW(
                targetCtorArg = target,
                sourceCtorArg = source,
                win32Error = win32Error,
                flags = flags,
            )
    }
}

public class FileInCabinetInfoA internal constructor(
    nameInCabinetCtorArg: Pcstr,
    public var fileSize: UInt,
    public var win32Error: UInt,
    public var dosDate: UShort,
    public var dosTime: UShort,
    public var dosAttribs: UShort,
    public var fullTargetName: ByteArray,
) {
    public var nameInCabinet: Pcstr = nameInCabinetCtorArg
        internal set

    public constructor() : this(
        nameInCabinetCtorArg = ConstPtr(0L),
        fileSize = 0u,
        win32Error = 0u,
        dosDate = 0u,
        dosTime = 0u,
        dosAttribs = 0u,
        fullTargetName = ByteArray(260),
    )

    public operator fun component1(): Pcstr = this.nameInCabinet

    public operator fun component2(): UInt = this.fileSize

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UShort = this.dosDate

    public operator fun component5(): UShort = this.dosTime

    public operator fun component6(): UShort = this.dosAttribs

    public operator fun component7(): ByteArray = this.fullTargetName

    public fun copy(nameInCabinet: Pcstr = this.nameInCabinet, fileSize: UInt = this.fileSize, win32Error: UInt = this.win32Error, dosDate: UShort = this.dosDate, dosTime: UShort = this.dosTime, dosAttribs: UShort = this.dosAttribs, fullTargetName: ByteArray = this.fullTargetName): FileInCabinetInfoA = FileInCabinetInfoA(nameInCabinetCtorArg = nameInCabinet, fileSize = fileSize, win32Error = win32Error, dosDate = dosDate, dosTime = dosTime, dosAttribs = dosAttribs, fullTargetName = fullTargetName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileInCabinetInfoA) return false
        if (this.nameInCabinet != other.nameInCabinet) return false
        if (this.fileSize != other.fileSize) return false
        if (this.win32Error != other.win32Error) return false
        if (this.dosDate != other.dosDate) return false
        if (this.dosTime != other.dosTime) return false
        if (this.dosAttribs != other.dosAttribs) return false
        if (!this.fullTargetName.contentEquals(other.fullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameInCabinet.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.dosDate.hashCode()
        result = 31 * result + this.dosTime.hashCode()
        result = 31 * result + this.dosAttribs.hashCode()
        result = 31 * result + this.fullTargetName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nameInCabinet: Pcstr = ConstPtr(0L),
            fileSize: UInt = 0u,
            win32Error: UInt = 0u,
            dosDate: UShort = 0u,
            dosTime: UShort = 0u,
            dosAttribs: UShort = 0u,
            fullTargetName: ByteArray = ByteArray(260),
        ): FileInCabinetInfoA =
            FileInCabinetInfoA(
                nameInCabinetCtorArg = nameInCabinet,
                fileSize = fileSize,
                win32Error = win32Error,
                dosDate = dosDate,
                dosTime = dosTime,
                dosAttribs = dosAttribs,
                fullTargetName = fullTargetName,
            )
    }
}

public class FileInCabinetInfoW internal constructor(
    nameInCabinetCtorArg: Pcwstr,
    public var fileSize: UInt,
    public var win32Error: UInt,
    public var dosDate: UShort,
    public var dosTime: UShort,
    public var dosAttribs: UShort,
    public var fullTargetName: UShortArray,
) {
    public var nameInCabinet: Pcwstr = nameInCabinetCtorArg
        internal set

    public constructor() : this(
        nameInCabinetCtorArg = ConstPtr(0L),
        fileSize = 0u,
        win32Error = 0u,
        dosDate = 0u,
        dosTime = 0u,
        dosAttribs = 0u,
        fullTargetName = UShortArray(260),
    )

    public operator fun component1(): Pcwstr = this.nameInCabinet

    public operator fun component2(): UInt = this.fileSize

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UShort = this.dosDate

    public operator fun component5(): UShort = this.dosTime

    public operator fun component6(): UShort = this.dosAttribs

    public operator fun component7(): UShortArray = this.fullTargetName

    public fun copy(nameInCabinet: Pcwstr = this.nameInCabinet, fileSize: UInt = this.fileSize, win32Error: UInt = this.win32Error, dosDate: UShort = this.dosDate, dosTime: UShort = this.dosTime, dosAttribs: UShort = this.dosAttribs, fullTargetName: UShortArray = this.fullTargetName): FileInCabinetInfoW = FileInCabinetInfoW(nameInCabinetCtorArg = nameInCabinet, fileSize = fileSize, win32Error = win32Error, dosDate = dosDate, dosTime = dosTime, dosAttribs = dosAttribs, fullTargetName = fullTargetName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileInCabinetInfoW) return false
        if (this.nameInCabinet != other.nameInCabinet) return false
        if (this.fileSize != other.fileSize) return false
        if (this.win32Error != other.win32Error) return false
        if (this.dosDate != other.dosDate) return false
        if (this.dosTime != other.dosTime) return false
        if (this.dosAttribs != other.dosAttribs) return false
        if (!this.fullTargetName.contentEquals(other.fullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameInCabinet.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.dosDate.hashCode()
        result = 31 * result + this.dosTime.hashCode()
        result = 31 * result + this.dosAttribs.hashCode()
        result = 31 * result + this.fullTargetName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nameInCabinet: Pcwstr = ConstPtr(0L),
            fileSize: UInt = 0u,
            win32Error: UInt = 0u,
            dosDate: UShort = 0u,
            dosTime: UShort = 0u,
            dosAttribs: UShort = 0u,
            fullTargetName: UShortArray = UShortArray(260),
        ): FileInCabinetInfoW =
            FileInCabinetInfoW(
                nameInCabinetCtorArg = nameInCabinet,
                fileSize = fileSize,
                win32Error = win32Error,
                dosDate = dosDate,
                dosTime = dosTime,
                dosAttribs = dosAttribs,
                fullTargetName = fullTargetName,
            )
    }
}

public data class HwprofileinfoA(
    public var hwpiUlHwprofile: UInt = 0u,
    public var hwpiSzFriendlyName: ByteArray = ByteArray(80),
    public var hwpiDwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwprofileinfoA) return false
        if (this.hwpiUlHwprofile != other.hwpiUlHwprofile) return false
        if (!this.hwpiSzFriendlyName.contentEquals(other.hwpiSzFriendlyName)) return false
        if (this.hwpiDwFlags != other.hwpiDwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwpiUlHwprofile.hashCode()
        result = 31 * result + this.hwpiSzFriendlyName.contentHashCode()
        result = 31 * result + this.hwpiDwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwprofileinfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwprofileinfoA> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): HwprofileinfoA =
                    HwprofileinfoA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: HwprofileinfoA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hwpiUlHwprofile)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr + 4L, value.hwpiSzFriendlyName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.hwpiDwFlags)
                }
            }
    }
}

public data class HwprofileinfoW(
    public var hwpiUlHwprofile: UInt = 0u,
    public var hwpiSzFriendlyName: UShortArray = UShortArray(80),
    public var hwpiDwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwprofileinfoW) return false
        if (this.hwpiUlHwprofile != other.hwpiUlHwprofile) return false
        if (!this.hwpiSzFriendlyName.contentEquals(other.hwpiSzFriendlyName)) return false
        if (this.hwpiDwFlags != other.hwpiDwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwpiUlHwprofile.hashCode()
        result = 31 * result + this.hwpiSzFriendlyName.contentHashCode()
        result = 31 * result + this.hwpiDwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwprofileinfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HwprofileinfoW> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): HwprofileinfoW =
                    HwprofileinfoW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                    )
                override fun writeNative(addr: Long, value: HwprofileinfoW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hwpiUlHwprofile)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                    ).writeNative(addr + 4L, value.hwpiSzFriendlyName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.hwpiDwFlags)
                }
            }
    }
}

public class Infcontext internal constructor(
    infCtorArg: MutPtr<CVoid>,
    currentInfCtorArg: MutPtr<CVoid>,
    public var section: UInt,
    public var line: UInt,
) {
    public var inf: MutPtr<CVoid> = infCtorArg
        internal set

    public var currentInf: MutPtr<CVoid> = currentInfCtorArg
        internal set

    public constructor() : this(
        infCtorArg = MutPtr(0L),
        currentInfCtorArg = MutPtr(0L),
        section = 0u,
        line = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.inf

    public operator fun component2(): MutPtr<CVoid> = this.currentInf

    public operator fun component3(): UInt = this.section

    public operator fun component4(): UInt = this.line

    public fun copy(inf: MutPtr<CVoid> = this.inf, currentInf: MutPtr<CVoid> = this.currentInf, section: UInt = this.section, line: UInt = this.line): Infcontext = Infcontext(infCtorArg = inf, currentInfCtorArg = currentInf, section = section, line = line)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Infcontext) return false
        if (this.inf != other.inf) return false
        if (this.currentInf != other.currentInf) return false
        if (this.section != other.section) return false
        if (this.line != other.line) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inf.hashCode()
        result = 31 * result + this.currentInf.hashCode()
        result = 31 * result + this.section.hashCode()
        result = 31 * result + this.line.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Infcontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Infcontext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Infcontext =
                    Infcontext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Infcontext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.inf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.currentInf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.section)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.line)
                }
            }

        public operator fun invoke(
            inf: MutPtr<CVoid> = MutPtr(0L),
            currentInf: MutPtr<CVoid> = MutPtr(0L),
            section: UInt = 0u,
            line: UInt = 0u,
        ): Infcontext =
            Infcontext(
                infCtorArg = inf,
                currentInfCtorArg = currentInf,
                section = section,
                line = line,
            )
    }
}

public data class IoDes(
    public var iodCount: UInt = 0u,
    public var iodType: UInt = 0u,
    public var iodAllocBase: ULong = 0uL,
    public var iodAllocEnd: ULong = 0uL,
    public var iodDesFlags: IodDesflags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): IoDes =
                    IoDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IoDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iodCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.iodType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.iodAllocBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.iodAllocEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.iodDesFlags)
                }
            }
    }
}

public data class IoRange(
    public var iorAlign: ULong = 0uL,
    public var iorNPorts: UInt = 0u,
    public var iorMin: ULong = 0uL,
    public var iorMax: ULong = 0uL,
    public var iorRangeFlags: IodDesflags = 0u,
    public var iorAlias: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IoRange =
                    IoRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IoRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.iorAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iorNPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 12L, value.iorMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 20L, value.iorMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.iorRangeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.iorAlias)
                }
            }
    }
}

public data class IoResource(
    public var ioHeader: IoDes = IoDes(),
    public var ioData: List<IoRange> = List(1) { IoRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): IoResource =
                    IoResource(
                        (IoDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IoRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: IoResource) {
                    (IoDes.typeLayout()).writeNative(addr, value.ioHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IoRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 28L, value.ioData)
                }
            }
    }
}

public data class IrqDes32(
    public var irqdCount: UInt = 0u,
    public var irqdType: UInt = 0u,
    public var irqdFlags: IrqdFlags = 0u,
    public var irqdAllocNum: UInt = 0u,
    public var irqdAffinity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqDes32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqDes32> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): IrqDes32 =
                    IrqDes32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IrqDes32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.irqdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.irqdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.irqdFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.irqdAllocNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.irqdAffinity)
                }
            }
    }
}

public data class IrqDes64(
    public var irqdCount: UInt = 0u,
    public var irqdType: UInt = 0u,
    public var irqdFlags: IrqdFlags = 0u,
    public var irqdAllocNum: UInt = 0u,
    public var irqdAffinity: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqDes64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqDes64> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IrqDes64 =
                    IrqDes64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IrqDes64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.irqdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.irqdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.irqdFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.irqdAllocNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.irqdAffinity)
                }
            }
    }
}

public data class IrqRange(
    public var irqrMin: UInt = 0u,
    public var irqrMax: UInt = 0u,
    public var irqrFlags: IrqdFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IrqRange =
                    IrqRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IrqRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.irqrMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.irqrMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.irqrFlags)
                }
            }
    }
}

public data class IrqResource32(
    public var irqHeader: IrqDes32 = IrqDes32(),
    public var irqData: List<IrqRange> = List(1) { IrqRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqResource32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqResource32> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IrqResource32 =
                    IrqResource32(
                        (IrqDes32.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IrqRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IrqResource32) {
                    (IrqDes32.typeLayout()).writeNative(addr, value.irqHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IrqRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 20L, value.irqData)
                }
            }
    }
}

public data class IrqResource64(
    public var irqHeader: IrqDes64 = IrqDes64(),
    public var irqData: List<IrqRange> = List(1) { IrqRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqResource64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IrqResource64> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): IrqResource64 =
                    IrqResource64(
                        (IrqDes64.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IrqRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IrqResource64) {
                    (IrqDes64.typeLayout()).writeNative(addr, value.irqHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IrqRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.irqData)
                }
            }
    }
}

public data class MemDes(
    public var mdCount: UInt = 0u,
    public var mdType: UInt = 0u,
    public var mdAllocBase: ULong = 0uL,
    public var mdAllocEnd: ULong = 0uL,
    public var mdFlags: MdFlags = 0u,
    public var mdReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MemDes =
                    MemDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MemDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mdAllocBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mdAllocEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mdFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mdReserved)
                }
            }
    }
}

public data class MemLargeDes(
    public var mldCount: UInt = 0u,
    public var mldType: UInt = 0u,
    public var mldAllocBase: ULong = 0uL,
    public var mldAllocEnd: ULong = 0uL,
    public var mldFlags: UInt = 0u,
    public var mldReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MemLargeDes =
                    MemLargeDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MemLargeDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mldCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mldType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mldAllocBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mldAllocEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mldFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mldReserved)
                }
            }
    }
}

public data class MemLargeRange(
    public var mlrAlign: ULong = 0uL,
    public var mlrNBytes: ULong = 0uL,
    public var mlrMin: ULong = 0uL,
    public var mlrMax: ULong = 0uL,
    public var mlrFlags: UInt = 0u,
    public var mlrReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): MemLargeRange =
                    MemLargeRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: MemLargeRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mlrAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mlrNBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mlrMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.mlrMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.mlrFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.mlrReserved)
                }
            }
    }
}

public data class MemLargeResource(
    public var memLargeHeader: MemLargeDes = MemLargeDes(),
    public var memLargeData: List<MemLargeRange> = List(1) { MemLargeRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemLargeResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MemLargeResource =
                    MemLargeResource(
                        (MemLargeDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MemLargeRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MemLargeResource) {
                    (MemLargeDes.typeLayout()).writeNative(addr, value.memLargeHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MemLargeRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 32L, value.memLargeData)
                }
            }
    }
}

public data class MemRange(
    public var mrAlign: ULong = 0uL,
    public var mrNBytes: UInt = 0u,
    public var mrMin: ULong = 0uL,
    public var mrMax: ULong = 0uL,
    public var mrFlags: MdFlags = 0u,
    public var mrReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): MemRange =
                    MemRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MemRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mrAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mrNBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 12L, value.mrMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 20L, value.mrMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mrFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.mrReserved)
                }
            }
    }
}

public data class MemResource(
    public var memHeader: MemDes = MemDes(),
    public var memData: List<MemRange> = List(1) { MemRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): MemResource =
                    MemResource(
                        (MemDes.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MemRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MemResource) {
                    (MemDes.typeLayout()).writeNative(addr, value.memHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MemRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 32L, value.memData)
                }
            }
    }
}

public data class MfcardDes(
    public var pmfCount: UInt = 0u,
    public var pmfType: UInt = 0u,
    public var pmfFlags: PmfFlags = 0u,
    public var pmfConfigOptions: UByte = 0u,
    public var pmfIoResourceIndex: UByte = 0u,
    public var pmfReserved: UByteArray = UByteArray(2),
    public var pmfConfigRegisterBase: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MfcardDes) return false
        if (this.pmfCount != other.pmfCount) return false
        if (this.pmfType != other.pmfType) return false
        if (this.pmfFlags != other.pmfFlags) return false
        if (this.pmfConfigOptions != other.pmfConfigOptions) return false
        if (this.pmfIoResourceIndex != other.pmfIoResourceIndex) return false
        if (!this.pmfReserved.contentEquals(other.pmfReserved)) return false
        if (this.pmfConfigRegisterBase != other.pmfConfigRegisterBase) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pmfCount.hashCode()
        result = 31 * result + this.pmfType.hashCode()
        result = 31 * result + this.pmfFlags.hashCode()
        result = 31 * result + this.pmfConfigOptions.hashCode()
        result = 31 * result + this.pmfIoResourceIndex.hashCode()
        result = 31 * result + this.pmfReserved.contentHashCode()
        result = 31 * result + this.pmfConfigRegisterBase.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfcardDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfcardDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MfcardDes =
                    MfcardDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MfcardDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pmfCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pmfType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pmfFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.pmfConfigOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.pmfIoResourceIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.pmfReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pmfConfigRegisterBase)
                }
            }
    }
}

public data class MfcardResource(
    public var mfCardHeader: MfcardDes = MfcardDes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfcardResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfcardResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MfcardResource =
                    MfcardResource(
                        (MfcardDes.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MfcardResource) {
                    (MfcardDes.typeLayout()).writeNative(addr, value.mfCardHeader)
                }
            }
    }
}

public data class PccardDes(
    public var pcdCount: UInt = 0u,
    public var pcdType: UInt = 0u,
    public var pcdFlags: PcdFlags = 0u,
    public var pcdConfigIndex: UByte = 0u,
    public var pcdReserved: UByteArray = UByteArray(3),
    public var pcdMemoryCardBase1: UInt = 0u,
    public var pcdMemoryCardBase2: UInt = 0u,
    public var pcdMemoryCardBase: UIntArray = UIntArray(2),
    public var pcdMemoryFlags: UShortArray = UShortArray(2),
    public var pcdIoFlags: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PccardDes) return false
        if (this.pcdCount != other.pcdCount) return false
        if (this.pcdType != other.pcdType) return false
        if (this.pcdFlags != other.pcdFlags) return false
        if (this.pcdConfigIndex != other.pcdConfigIndex) return false
        if (!this.pcdReserved.contentEquals(other.pcdReserved)) return false
        if (this.pcdMemoryCardBase1 != other.pcdMemoryCardBase1) return false
        if (this.pcdMemoryCardBase2 != other.pcdMemoryCardBase2) return false
        if (!this.pcdMemoryCardBase.contentEquals(other.pcdMemoryCardBase)) return false
        if (!this.pcdMemoryFlags.contentEquals(other.pcdMemoryFlags)) return false
        if (!this.pcdIoFlags.contentEquals(other.pcdIoFlags)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcdCount.hashCode()
        result = 31 * result + this.pcdType.hashCode()
        result = 31 * result + this.pcdFlags.hashCode()
        result = 31 * result + this.pcdConfigIndex.hashCode()
        result = 31 * result + this.pcdReserved.contentHashCode()
        result = 31 * result + this.pcdMemoryCardBase1.hashCode()
        result = 31 * result + this.pcdMemoryCardBase2.hashCode()
        result = 31 * result + this.pcdMemoryCardBase.contentHashCode()
        result = 31 * result + this.pcdMemoryFlags.contentHashCode()
        result = 31 * result + this.pcdIoFlags.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PccardDes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PccardDes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 38L
                override fun readNative(addr: Long): PccardDes =
                    PccardDes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 32L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PccardDes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pcdCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pcdType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pcdFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.pcdConfigIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.pcdReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pcdMemoryCardBase1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pcdMemoryCardBase2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 24L, value.pcdMemoryCardBase.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 32L, value.pcdMemoryFlags.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 36L, value.pcdIoFlags.toList())
                }
            }
    }
}

public data class PccardResource(
    public var pcCardHeader: PccardDes = PccardDes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PccardResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PccardResource> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 38L
                override fun readNative(addr: Long): PccardResource =
                    PccardResource(
                        (PccardDes.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PccardResource) {
                    (PccardDes.typeLayout()).writeNative(addr, value.pcCardHeader)
                }
            }
    }
}

public class SourceMediaA internal constructor(
    reservedCtorArg: Pcstr,
    tagfileCtorArg: Pcstr,
    descriptionCtorArg: Pcstr,
    sourcePathCtorArg: Pcstr,
    sourceFileCtorArg: Pcstr,
    public var flags: UInt,
) {
    public var reserved: Pcstr = reservedCtorArg
        internal set

    public var tagfile: Pcstr = tagfileCtorArg
        internal set

    public var description: Pcstr = descriptionCtorArg
        internal set

    public var sourcePath: Pcstr = sourcePathCtorArg
        internal set

    public var sourceFile: Pcstr = sourceFileCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = ConstPtr(0L),
        tagfileCtorArg = ConstPtr(0L),
        descriptionCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        sourceFileCtorArg = ConstPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): Pcstr = this.reserved

    public operator fun component2(): Pcstr = this.tagfile

    public operator fun component3(): Pcstr = this.description

    public operator fun component4(): Pcstr = this.sourcePath

    public operator fun component5(): Pcstr = this.sourceFile

    public operator fun component6(): UInt = this.flags

    public fun copy(reserved: Pcstr = this.reserved, tagfile: Pcstr = this.tagfile, description: Pcstr = this.description, sourcePath: Pcstr = this.sourcePath, sourceFile: Pcstr = this.sourceFile, flags: UInt = this.flags): SourceMediaA = SourceMediaA(reservedCtorArg = reserved, tagfileCtorArg = tagfile, descriptionCtorArg = description, sourcePathCtorArg = sourcePath, sourceFileCtorArg = sourceFile, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SourceMediaA) return false
        if (this.reserved != other.reserved) return false
        if (this.tagfile != other.tagfile) return false
        if (this.description != other.description) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.sourceFile != other.sourceFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.tagfile.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.sourceFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved: Pcstr = ConstPtr(0L),
            tagfile: Pcstr = ConstPtr(0L),
            description: Pcstr = ConstPtr(0L),
            sourcePath: Pcstr = ConstPtr(0L),
            sourceFile: Pcstr = ConstPtr(0L),
            flags: UInt = 0u,
        ): SourceMediaA =
            SourceMediaA(
                reservedCtorArg = reserved,
                tagfileCtorArg = tagfile,
                descriptionCtorArg = description,
                sourcePathCtorArg = sourcePath,
                sourceFileCtorArg = sourceFile,
                flags = flags,
            )
    }
}

public class SourceMediaW internal constructor(
    reservedCtorArg: Pcwstr,
    tagfileCtorArg: Pcwstr,
    descriptionCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
    sourceFileCtorArg: Pcwstr,
    public var flags: UInt,
) {
    public var reserved: Pcwstr = reservedCtorArg
        internal set

    public var tagfile: Pcwstr = tagfileCtorArg
        internal set

    public var description: Pcwstr = descriptionCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public var sourceFile: Pcwstr = sourceFileCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = ConstPtr(0L),
        tagfileCtorArg = ConstPtr(0L),
        descriptionCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        sourceFileCtorArg = ConstPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): Pcwstr = this.reserved

    public operator fun component2(): Pcwstr = this.tagfile

    public operator fun component3(): Pcwstr = this.description

    public operator fun component4(): Pcwstr = this.sourcePath

    public operator fun component5(): Pcwstr = this.sourceFile

    public operator fun component6(): UInt = this.flags

    public fun copy(reserved: Pcwstr = this.reserved, tagfile: Pcwstr = this.tagfile, description: Pcwstr = this.description, sourcePath: Pcwstr = this.sourcePath, sourceFile: Pcwstr = this.sourceFile, flags: UInt = this.flags): SourceMediaW = SourceMediaW(reservedCtorArg = reserved, tagfileCtorArg = tagfile, descriptionCtorArg = description, sourcePathCtorArg = sourcePath, sourceFileCtorArg = sourceFile, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SourceMediaW) return false
        if (this.reserved != other.reserved) return false
        if (this.tagfile != other.tagfile) return false
        if (this.description != other.description) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.sourceFile != other.sourceFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.tagfile.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.sourceFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reserved: Pcwstr = ConstPtr(0L),
            tagfile: Pcwstr = ConstPtr(0L),
            description: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
            sourceFile: Pcwstr = ConstPtr(0L),
            flags: UInt = 0u,
        ): SourceMediaW =
            SourceMediaW(
                reservedCtorArg = reserved,
                tagfileCtorArg = tagfile,
                descriptionCtorArg = description,
                sourcePathCtorArg = sourcePath,
                sourceFileCtorArg = sourceFile,
                flags = flags,
            )
    }
}

public data class SpAltplatformInfoV1(
    public var cbSize: UInt = 0u,
    public var platform: VerPlatform = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpAltplatformInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpAltplatformInfoV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SpAltplatformInfoV1 =
                    SpAltplatformInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: SpAltplatformInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.platform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.processorArchitecture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.reserved)
                }
            }
    }
}

public data class SpAltplatformInfoV2(
    public var cbSize: UInt = 0u,
    public var platform: VerPlatform = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: ProcessorArchitecture = 0u,
    public var anonymous: SpAltplatformInfoV20 = SpAltplatformInfoV20(),
    public var firstValidatedMajorVersion: UInt = 0u,
    public var firstValidatedMinorVersion: UInt = 0u,
)

public data class SpAltplatformInfoV20(
    public var reserved: UShort = 0u,
    public var flags: UShort = 0u,
)

public data class SpAltplatformInfoV3(
    public var cbSize: UInt = 0u,
    public var platform: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: UShort = 0u,
    public var anonymous: SpAltplatformInfoV30 = SpAltplatformInfoV30(),
    public var firstValidatedMajorVersion: UInt = 0u,
    public var firstValidatedMinorVersion: UInt = 0u,
    public var productType: UByte = 0u,
    public var suiteMask: UShort = 0u,
    public var buildNumber: UInt = 0u,
)

public data class SpAltplatformInfoV30(
    public var reserved: UShort = 0u,
    public var flags: UShort = 0u,
)

public data class SpBackupQueueParamsV1A(
    public var cbSize: UInt = 0u,
    public var fullInfPath: ByteArray = ByteArray(260),
    public var filenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV1A> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): SpBackupQueueParamsV1A =
                    SpBackupQueueParamsV1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: SpBackupQueueParamsV1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 4L, value.fullInfPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 264L, value.filenameOffset)
                }
            }
    }
}

public data class SpBackupQueueParamsV1W(
    public var cbSize: UInt = 0u,
    public var fullInfPath: UShortArray = UShortArray(260),
    public var filenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV1W> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): SpBackupQueueParamsV1W =
                    SpBackupQueueParamsV1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 524L),
                    )
                override fun writeNative(addr: Long, value: SpBackupQueueParamsV1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.fullInfPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 524L, value.filenameOffset)
                }
            }
    }
}

public data class SpBackupQueueParamsV2A(
    public var cbSize: UInt = 0u,
    public var fullInfPath: ByteArray = ByteArray(260),
    public var filenameOffset: Int = 0,
    public var reinstallInstance: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        if (!this.reinstallInstance.contentEquals(other.reinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        result = 31 * result + this.reinstallInstance.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV2A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV2A> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): SpBackupQueueParamsV2A =
                    SpBackupQueueParamsV2A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 264L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 268L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpBackupQueueParamsV2A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 4L, value.fullInfPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 264L, value.filenameOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 268L, value.reinstallInstance.toList())
                }
            }
    }
}

public data class SpBackupQueueParamsV2W(
    public var cbSize: UInt = 0u,
    public var fullInfPath: UShortArray = UShortArray(260),
    public var filenameOffset: Int = 0,
    public var reinstallInstance: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        if (!this.reinstallInstance.contentEquals(other.reinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        result = 31 * result + this.reinstallInstance.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV2W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpBackupQueueParamsV2W> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1048L
                override fun readNative(addr: Long): SpBackupQueueParamsV2W =
                    SpBackupQueueParamsV2W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 524L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 528L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpBackupQueueParamsV2W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.fullInfPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 524L, value.filenameOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 528L, value.reinstallInstance.toList())
                }
            }
    }
}

public data class SpClassimagelistData(
    public var cbSize: UInt = 0u,
    public var imageList: Himagelist = 0L,
    public var reserved: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpClassimagelistData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpClassimagelistData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SpClassimagelistData =
                    SpClassimagelistData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SpClassimagelistData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.imageList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class SpClassinstallHeader(
    public var cbSize: UInt = 0u,
    public var installFunction: DiFunction = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpClassinstallHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpClassinstallHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SpClassinstallHeader =
                    SpClassinstallHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SpClassinstallHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.installFunction)
                }
            }
    }
}

public class SpDetectdeviceParams internal constructor(
    public var classInstallHeader: SpClassinstallHeader,
    public var detectProgressNotify: PdetectProgressNotify,
    progressNotifyParamCtorArg: MutPtr<CVoid>,
) {
    public var progressNotifyParam: MutPtr<CVoid> = progressNotifyParamCtorArg
        internal set

    public constructor() : this(
        classInstallHeader = SpClassinstallHeader(),
        detectProgressNotify = null,
        progressNotifyParamCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SpClassinstallHeader = this.classInstallHeader

    public operator fun component2(): PdetectProgressNotify = this.detectProgressNotify

    public operator fun component3(): MutPtr<CVoid> = this.progressNotifyParam

    public fun copy(classInstallHeader: SpClassinstallHeader = this.classInstallHeader, detectProgressNotify: PdetectProgressNotify = this.detectProgressNotify, progressNotifyParam: MutPtr<CVoid> = this.progressNotifyParam): SpDetectdeviceParams = SpDetectdeviceParams(classInstallHeader = classInstallHeader, detectProgressNotify = detectProgressNotify, progressNotifyParamCtorArg = progressNotifyParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDetectdeviceParams) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (this.detectProgressNotify != other.detectProgressNotify) return false
        if (this.progressNotifyParam != other.progressNotifyParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.detectProgressNotify.hashCode()
        result = 31 * result + this.progressNotifyParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
            detectProgressNotify: PdetectProgressNotify = null,
            progressNotifyParam: MutPtr<CVoid> = MutPtr(0L),
        ): SpDetectdeviceParams =
            SpDetectdeviceParams(
                classInstallHeader = classInstallHeader,
                detectProgressNotify = detectProgressNotify,
                progressNotifyParamCtorArg = progressNotifyParam,
            )
    }
}

public data class SpDeviceInterfaceData(
    public var cbSize: UInt = 0u,
    public var interfaceClassGuid: Guid = Guid(),
    public var flags: UInt = 0u,
    public var reserved: Int = 0,
)

public data class SpDeviceInterfaceDetailDataA(
    public var cbSize: UInt = 0u,
    public var devicePath: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDeviceInterfaceDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.devicePath.contentEquals(other.devicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.devicePath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDeviceInterfaceDetailDataA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDeviceInterfaceDetailDataA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SpDeviceInterfaceDetailDataA =
                    SpDeviceInterfaceDetailDataA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpDeviceInterfaceDetailDataA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 4L, value.devicePath.toList())
                }
            }
    }
}

public data class SpDeviceInterfaceDetailDataW(
    public var cbSize: UInt = 0u,
    public var devicePath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDeviceInterfaceDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.devicePath.contentEquals(other.devicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.devicePath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDeviceInterfaceDetailDataW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDeviceInterfaceDetailDataW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SpDeviceInterfaceDetailDataW =
                    SpDeviceInterfaceDetailDataW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpDeviceInterfaceDetailDataW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.devicePath.toList())
                }
            }
    }
}

public data class SpDevinfoData(
    public var cbSize: UInt = 0u,
    public var classGuid: Guid = Guid(),
    public var devInst: UInt = 0u,
    public var reserved: Int = 0,
)

public class SpDevinfoListDetailDataA internal constructor(
    public var cbSize: UInt,
    public var classGuid: Guid,
    remoteMachineHandleCtorArg: Handle,
    public var remoteMachineName: ByteArray,
) {
    public var remoteMachineHandle: Handle = remoteMachineHandleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        classGuid = Guid(),
        remoteMachineHandleCtorArg = MutPtr(0L),
        remoteMachineName = ByteArray(263),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Guid = this.classGuid

    public operator fun component3(): Handle = this.remoteMachineHandle

    public operator fun component4(): ByteArray = this.remoteMachineName

    public fun copy(cbSize: UInt = this.cbSize, classGuid: Guid = this.classGuid, remoteMachineHandle: Handle = this.remoteMachineHandle, remoteMachineName: ByteArray = this.remoteMachineName): SpDevinfoListDetailDataA = SpDevinfoListDetailDataA(cbSize = cbSize, classGuid = classGuid, remoteMachineHandleCtorArg = remoteMachineHandle, remoteMachineName = remoteMachineName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinfoListDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.classGuid != other.classGuid) return false
        if (this.remoteMachineHandle != other.remoteMachineHandle) return false
        if (!this.remoteMachineName.contentEquals(other.remoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.classGuid.hashCode()
        result = 31 * result + this.remoteMachineHandle.hashCode()
        result = 31 * result + this.remoteMachineName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            classGuid: Guid = Guid(),
            remoteMachineHandle: Handle = MutPtr(0L),
            remoteMachineName: ByteArray = ByteArray(263),
        ): SpDevinfoListDetailDataA =
            SpDevinfoListDetailDataA(
                cbSize = cbSize,
                classGuid = classGuid,
                remoteMachineHandleCtorArg = remoteMachineHandle,
                remoteMachineName = remoteMachineName,
            )
    }
}

public class SpDevinfoListDetailDataW internal constructor(
    public var cbSize: UInt,
    public var classGuid: Guid,
    remoteMachineHandleCtorArg: Handle,
    public var remoteMachineName: UShortArray,
) {
    public var remoteMachineHandle: Handle = remoteMachineHandleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        classGuid = Guid(),
        remoteMachineHandleCtorArg = MutPtr(0L),
        remoteMachineName = UShortArray(263),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Guid = this.classGuid

    public operator fun component3(): Handle = this.remoteMachineHandle

    public operator fun component4(): UShortArray = this.remoteMachineName

    public fun copy(cbSize: UInt = this.cbSize, classGuid: Guid = this.classGuid, remoteMachineHandle: Handle = this.remoteMachineHandle, remoteMachineName: UShortArray = this.remoteMachineName): SpDevinfoListDetailDataW = SpDevinfoListDetailDataW(cbSize = cbSize, classGuid = classGuid, remoteMachineHandleCtorArg = remoteMachineHandle, remoteMachineName = remoteMachineName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinfoListDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.classGuid != other.classGuid) return false
        if (this.remoteMachineHandle != other.remoteMachineHandle) return false
        if (!this.remoteMachineName.contentEquals(other.remoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.classGuid.hashCode()
        result = 31 * result + this.remoteMachineHandle.hashCode()
        result = 31 * result + this.remoteMachineName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            classGuid: Guid = Guid(),
            remoteMachineHandle: Handle = MutPtr(0L),
            remoteMachineName: UShortArray = UShortArray(263),
        ): SpDevinfoListDetailDataW =
            SpDevinfoListDetailDataW(
                cbSize = cbSize,
                classGuid = classGuid,
                remoteMachineHandleCtorArg = remoteMachineHandle,
                remoteMachineName = remoteMachineName,
            )
    }
}

public class SpDevinstallParamsA internal constructor(
    public var cbSize: UInt,
    public var flags: SetupDiDeviceInstallFlags,
    public var flagsEx: SetupDiDeviceInstallFlagsEx,
    hwndParentCtorArg: Hwnd,
    public var installMsgHandler: PspFileCallbackA,
    installMsgHandlerContextCtorArg: MutPtr<CVoid>,
    fileQueueCtorArg: MutPtr<CVoid>,
    public var classInstallReserved: Int,
    public var reserved: UInt,
    public var driverPath: ByteArray,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var installMsgHandlerContext: MutPtr<CVoid> = installMsgHandlerContextCtorArg
        internal set

    public var fileQueue: MutPtr<CVoid> = fileQueueCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        flagsEx = 0u,
        hwndParentCtorArg = MutPtr(0L),
        installMsgHandler = null,
        installMsgHandlerContextCtorArg = MutPtr(0L),
        fileQueueCtorArg = MutPtr(0L),
        classInstallReserved = 0,
        reserved = 0u,
        driverPath = ByteArray(260),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SetupDiDeviceInstallFlags = this.flags

    public operator fun component3(): SetupDiDeviceInstallFlagsEx = this.flagsEx

    public operator fun component4(): Hwnd = this.hwndParent

    public operator fun component5(): PspFileCallbackA = this.installMsgHandler

    public operator fun component6(): MutPtr<CVoid> = this.installMsgHandlerContext

    public operator fun component7(): MutPtr<CVoid> = this.fileQueue

    public operator fun component8(): Int = this.classInstallReserved

    public operator fun component9(): UInt = this.reserved

    public operator fun component10(): ByteArray = this.driverPath

    public fun copy(cbSize: UInt = this.cbSize, flags: SetupDiDeviceInstallFlags = this.flags, flagsEx: SetupDiDeviceInstallFlagsEx = this.flagsEx, hwndParent: Hwnd = this.hwndParent, installMsgHandler: PspFileCallbackA = this.installMsgHandler, installMsgHandlerContext: MutPtr<CVoid> = this.installMsgHandlerContext, fileQueue: MutPtr<CVoid> = this.fileQueue, classInstallReserved: Int = this.classInstallReserved, reserved: UInt = this.reserved, driverPath: ByteArray = this.driverPath): SpDevinstallParamsA = SpDevinstallParamsA(cbSize = cbSize, flags = flags, flagsEx = flagsEx, hwndParentCtorArg = hwndParent, installMsgHandler = installMsgHandler, installMsgHandlerContextCtorArg = installMsgHandlerContext, fileQueueCtorArg = fileQueue, classInstallReserved = classInstallReserved, reserved = reserved, driverPath = driverPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinstallParamsA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.flagsEx != other.flagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.installMsgHandler != other.installMsgHandler) return false
        if (this.installMsgHandlerContext != other.installMsgHandlerContext) return false
        if (this.fileQueue != other.fileQueue) return false
        if (this.classInstallReserved != other.classInstallReserved) return false
        if (this.reserved != other.reserved) return false
        if (!this.driverPath.contentEquals(other.driverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.flagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.installMsgHandler.hashCode()
        result = 31 * result + this.installMsgHandlerContext.hashCode()
        result = 31 * result + this.fileQueue.hashCode()
        result = 31 * result + this.classInstallReserved.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.driverPath.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flags: SetupDiDeviceInstallFlags = 0u,
            flagsEx: SetupDiDeviceInstallFlagsEx = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            installMsgHandler: PspFileCallbackA = null,
            installMsgHandlerContext: MutPtr<CVoid> = MutPtr(0L),
            fileQueue: MutPtr<CVoid> = MutPtr(0L),
            classInstallReserved: Int = 0,
            reserved: UInt = 0u,
            driverPath: ByteArray = ByteArray(260),
        ): SpDevinstallParamsA =
            SpDevinstallParamsA(
                cbSize = cbSize,
                flags = flags,
                flagsEx = flagsEx,
                hwndParentCtorArg = hwndParent,
                installMsgHandler = installMsgHandler,
                installMsgHandlerContextCtorArg = installMsgHandlerContext,
                fileQueueCtorArg = fileQueue,
                classInstallReserved = classInstallReserved,
                reserved = reserved,
                driverPath = driverPath,
            )
    }
}

public class SpDevinstallParamsW internal constructor(
    public var cbSize: UInt,
    public var flags: SetupDiDeviceInstallFlags,
    public var flagsEx: SetupDiDeviceInstallFlagsEx,
    hwndParentCtorArg: Hwnd,
    public var installMsgHandler: PspFileCallbackW,
    installMsgHandlerContextCtorArg: MutPtr<CVoid>,
    fileQueueCtorArg: MutPtr<CVoid>,
    public var classInstallReserved: Int,
    public var reserved: UInt,
    public var driverPath: UShortArray,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var installMsgHandlerContext: MutPtr<CVoid> = installMsgHandlerContextCtorArg
        internal set

    public var fileQueue: MutPtr<CVoid> = fileQueueCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        flags = 0u,
        flagsEx = 0u,
        hwndParentCtorArg = MutPtr(0L),
        installMsgHandler = null,
        installMsgHandlerContextCtorArg = MutPtr(0L),
        fileQueueCtorArg = MutPtr(0L),
        classInstallReserved = 0,
        reserved = 0u,
        driverPath = UShortArray(260),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SetupDiDeviceInstallFlags = this.flags

    public operator fun component3(): SetupDiDeviceInstallFlagsEx = this.flagsEx

    public operator fun component4(): Hwnd = this.hwndParent

    public operator fun component5(): PspFileCallbackW = this.installMsgHandler

    public operator fun component6(): MutPtr<CVoid> = this.installMsgHandlerContext

    public operator fun component7(): MutPtr<CVoid> = this.fileQueue

    public operator fun component8(): Int = this.classInstallReserved

    public operator fun component9(): UInt = this.reserved

    public operator fun component10(): UShortArray = this.driverPath

    public fun copy(cbSize: UInt = this.cbSize, flags: SetupDiDeviceInstallFlags = this.flags, flagsEx: SetupDiDeviceInstallFlagsEx = this.flagsEx, hwndParent: Hwnd = this.hwndParent, installMsgHandler: PspFileCallbackW = this.installMsgHandler, installMsgHandlerContext: MutPtr<CVoid> = this.installMsgHandlerContext, fileQueue: MutPtr<CVoid> = this.fileQueue, classInstallReserved: Int = this.classInstallReserved, reserved: UInt = this.reserved, driverPath: UShortArray = this.driverPath): SpDevinstallParamsW = SpDevinstallParamsW(cbSize = cbSize, flags = flags, flagsEx = flagsEx, hwndParentCtorArg = hwndParent, installMsgHandler = installMsgHandler, installMsgHandlerContextCtorArg = installMsgHandlerContext, fileQueueCtorArg = fileQueue, classInstallReserved = classInstallReserved, reserved = reserved, driverPath = driverPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinstallParamsW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.flagsEx != other.flagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.installMsgHandler != other.installMsgHandler) return false
        if (this.installMsgHandlerContext != other.installMsgHandlerContext) return false
        if (this.fileQueue != other.fileQueue) return false
        if (this.classInstallReserved != other.classInstallReserved) return false
        if (this.reserved != other.reserved) return false
        if (!this.driverPath.contentEquals(other.driverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.flagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.installMsgHandler.hashCode()
        result = 31 * result + this.installMsgHandlerContext.hashCode()
        result = 31 * result + this.fileQueue.hashCode()
        result = 31 * result + this.classInstallReserved.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.driverPath.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            flags: SetupDiDeviceInstallFlags = 0u,
            flagsEx: SetupDiDeviceInstallFlagsEx = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            installMsgHandler: PspFileCallbackW = null,
            installMsgHandlerContext: MutPtr<CVoid> = MutPtr(0L),
            fileQueue: MutPtr<CVoid> = MutPtr(0L),
            classInstallReserved: Int = 0,
            reserved: UInt = 0u,
            driverPath: UShortArray = UShortArray(260),
        ): SpDevinstallParamsW =
            SpDevinstallParamsW(
                cbSize = cbSize,
                flags = flags,
                flagsEx = flagsEx,
                hwndParentCtorArg = hwndParent,
                installMsgHandler = installMsgHandler,
                installMsgHandlerContextCtorArg = installMsgHandlerContext,
                fileQueueCtorArg = fileQueue,
                classInstallReserved = classInstallReserved,
                reserved = reserved,
                driverPath = driverPath,
            )
    }
}

public data class SpDrvinfoDataV1A(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: ByteArray = ByteArray(256),
    public var mfgName: ByteArray = ByteArray(256),
    public var providerName: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinfoDataV1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinfoDataV1A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 784L
                override fun readNative(addr: Long): SpDrvinfoDataV1A =
                    SpDrvinfoDataV1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 16L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 272L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 528L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpDrvinfoDataV1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.driverType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 16L, value.description.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 272L, value.mfgName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 528L, value.providerName.toList())
                }
            }
    }
}

public data class SpDrvinfoDataV1W(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: UShortArray = UShortArray(256),
    public var mfgName: UShortArray = UShortArray(256),
    public var providerName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinfoDataV1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinfoDataV1W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1552L
                override fun readNative(addr: Long): SpDrvinfoDataV1W =
                    SpDrvinfoDataV1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 528L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1040L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpDrvinfoDataV1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.driverType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 16L, value.description.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 528L, value.mfgName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1040L, value.providerName.toList())
                }
            }
    }
}

public data class SpDrvinfoDataV2A(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: ByteArray = ByteArray(256),
    public var mfgName: ByteArray = ByteArray(256),
    public var providerName: ByteArray = ByteArray(256),
    public var driverDate: Filetime = Filetime(),
    public var driverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (this.driverDate != other.driverDate) return false
        if (this.driverVersion != other.driverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.driverDate.hashCode()
        result = 31 * result + this.driverVersion.hashCode()
        return result
    }
}

public data class SpDrvinfoDataV2W(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: UShortArray = UShortArray(256),
    public var mfgName: UShortArray = UShortArray(256),
    public var providerName: UShortArray = UShortArray(256),
    public var driverDate: Filetime = Filetime(),
    public var driverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (this.driverDate != other.driverDate) return false
        if (this.driverVersion != other.driverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.driverDate.hashCode()
        result = 31 * result + this.driverVersion.hashCode()
        return result
    }
}

public data class SpDrvinfoDetailDataA(
    public var cbSize: UInt = 0u,
    public var infDate: Filetime = Filetime(),
    public var compatIDsOffset: UInt = 0u,
    public var compatIDsLength: UInt = 0u,
    public var reserved: Int = 0,
    public var sectionName: ByteArray = ByteArray(256),
    public var infFileName: ByteArray = ByteArray(260),
    public var drvDescription: ByteArray = ByteArray(256),
    public var hardwareID: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.infDate != other.infDate) return false
        if (this.compatIDsOffset != other.compatIDsOffset) return false
        if (this.compatIDsLength != other.compatIDsLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.sectionName.contentEquals(other.sectionName)) return false
        if (!this.infFileName.contentEquals(other.infFileName)) return false
        if (!this.drvDescription.contentEquals(other.drvDescription)) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.infDate.hashCode()
        result = 31 * result + this.compatIDsOffset.hashCode()
        result = 31 * result + this.compatIDsLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.sectionName.contentHashCode()
        result = 31 * result + this.infFileName.contentHashCode()
        result = 31 * result + this.drvDescription.contentHashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        return result
    }
}

public data class SpDrvinfoDetailDataW(
    public var cbSize: UInt = 0u,
    public var infDate: Filetime = Filetime(),
    public var compatIDsOffset: UInt = 0u,
    public var compatIDsLength: UInt = 0u,
    public var reserved: Int = 0,
    public var sectionName: UShortArray = UShortArray(256),
    public var infFileName: UShortArray = UShortArray(260),
    public var drvDescription: UShortArray = UShortArray(256),
    public var hardwareID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.infDate != other.infDate) return false
        if (this.compatIDsOffset != other.compatIDsOffset) return false
        if (this.compatIDsLength != other.compatIDsLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.sectionName.contentEquals(other.sectionName)) return false
        if (!this.infFileName.contentEquals(other.infFileName)) return false
        if (!this.drvDescription.contentEquals(other.drvDescription)) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.infDate.hashCode()
        result = 31 * result + this.compatIDsOffset.hashCode()
        result = 31 * result + this.compatIDsLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.sectionName.contentHashCode()
        result = 31 * result + this.infFileName.contentHashCode()
        result = 31 * result + this.drvDescription.contentHashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        return result
    }
}

public data class SpDrvinstallParams(
    public var cbSize: UInt = 0u,
    public var rank: UInt = 0u,
    public var flags: SetupDiDriverInstallFlags = 0u,
    public var privateData: Int = 0,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinstallParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpDrvinstallParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SpDrvinstallParams =
                    SpDrvinstallParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SpDrvinstallParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rank)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.privateData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved)
                }
            }
    }
}

public data class SpEnableclassParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var classGuid: Guid = Guid(),
    public var enableMessage: UInt = 0u,
)

public class SpFileCopyParamsA internal constructor(
    public var cbSize: UInt,
    queueHandleCtorArg: MutPtr<CVoid>,
    sourceRootPathCtorArg: Pcstr,
    sourcePathCtorArg: Pcstr,
    sourceFilenameCtorArg: Pcstr,
    sourceDescriptionCtorArg: Pcstr,
    sourceTagfileCtorArg: Pcstr,
    targetDirectoryCtorArg: Pcstr,
    targetFilenameCtorArg: Pcstr,
    public var copyStyle: UInt,
    layoutInfCtorArg: MutPtr<CVoid>,
    securityDescriptorCtorArg: Pcstr,
) {
    public var queueHandle: MutPtr<CVoid> = queueHandleCtorArg
        internal set

    public var sourceRootPath: Pcstr = sourceRootPathCtorArg
        internal set

    public var sourcePath: Pcstr = sourcePathCtorArg
        internal set

    public var sourceFilename: Pcstr = sourceFilenameCtorArg
        internal set

    public var sourceDescription: Pcstr = sourceDescriptionCtorArg
        internal set

    public var sourceTagfile: Pcstr = sourceTagfileCtorArg
        internal set

    public var targetDirectory: Pcstr = targetDirectoryCtorArg
        internal set

    public var targetFilename: Pcstr = targetFilenameCtorArg
        internal set

    public var layoutInf: MutPtr<CVoid> = layoutInfCtorArg
        internal set

    public var securityDescriptor: Pcstr = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        queueHandleCtorArg = MutPtr(0L),
        sourceRootPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        sourceFilenameCtorArg = ConstPtr(0L),
        sourceDescriptionCtorArg = ConstPtr(0L),
        sourceTagfileCtorArg = ConstPtr(0L),
        targetDirectoryCtorArg = ConstPtr(0L),
        targetFilenameCtorArg = ConstPtr(0L),
        copyStyle = 0u,
        layoutInfCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CVoid> = this.queueHandle

    public operator fun component3(): Pcstr = this.sourceRootPath

    public operator fun component4(): Pcstr = this.sourcePath

    public operator fun component5(): Pcstr = this.sourceFilename

    public operator fun component6(): Pcstr = this.sourceDescription

    public operator fun component7(): Pcstr = this.sourceTagfile

    public operator fun component8(): Pcstr = this.targetDirectory

    public operator fun component9(): Pcstr = this.targetFilename

    public operator fun component10(): UInt = this.copyStyle

    public operator fun component11(): MutPtr<CVoid> = this.layoutInf

    public operator fun component12(): Pcstr = this.securityDescriptor

    public fun copy(cbSize: UInt = this.cbSize, queueHandle: MutPtr<CVoid> = this.queueHandle, sourceRootPath: Pcstr = this.sourceRootPath, sourcePath: Pcstr = this.sourcePath, sourceFilename: Pcstr = this.sourceFilename, sourceDescription: Pcstr = this.sourceDescription, sourceTagfile: Pcstr = this.sourceTagfile, targetDirectory: Pcstr = this.targetDirectory, targetFilename: Pcstr = this.targetFilename, copyStyle: UInt = this.copyStyle, layoutInf: MutPtr<CVoid> = this.layoutInf, securityDescriptor: Pcstr = this.securityDescriptor): SpFileCopyParamsA = SpFileCopyParamsA(cbSize = cbSize, queueHandleCtorArg = queueHandle, sourceRootPathCtorArg = sourceRootPath, sourcePathCtorArg = sourcePath, sourceFilenameCtorArg = sourceFilename, sourceDescriptionCtorArg = sourceDescription, sourceTagfileCtorArg = sourceTagfile, targetDirectoryCtorArg = targetDirectory, targetFilenameCtorArg = targetFilename, copyStyle = copyStyle, layoutInfCtorArg = layoutInf, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpFileCopyParamsA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.queueHandle != other.queueHandle) return false
        if (this.sourceRootPath != other.sourceRootPath) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.sourceFilename != other.sourceFilename) return false
        if (this.sourceDescription != other.sourceDescription) return false
        if (this.sourceTagfile != other.sourceTagfile) return false
        if (this.targetDirectory != other.targetDirectory) return false
        if (this.targetFilename != other.targetFilename) return false
        if (this.copyStyle != other.copyStyle) return false
        if (this.layoutInf != other.layoutInf) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.queueHandle.hashCode()
        result = 31 * result + this.sourceRootPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.sourceFilename.hashCode()
        result = 31 * result + this.sourceDescription.hashCode()
        result = 31 * result + this.sourceTagfile.hashCode()
        result = 31 * result + this.targetDirectory.hashCode()
        result = 31 * result + this.targetFilename.hashCode()
        result = 31 * result + this.copyStyle.hashCode()
        result = 31 * result + this.layoutInf.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            queueHandle: MutPtr<CVoid> = MutPtr(0L),
            sourceRootPath: Pcstr = ConstPtr(0L),
            sourcePath: Pcstr = ConstPtr(0L),
            sourceFilename: Pcstr = ConstPtr(0L),
            sourceDescription: Pcstr = ConstPtr(0L),
            sourceTagfile: Pcstr = ConstPtr(0L),
            targetDirectory: Pcstr = ConstPtr(0L),
            targetFilename: Pcstr = ConstPtr(0L),
            copyStyle: UInt = 0u,
            layoutInf: MutPtr<CVoid> = MutPtr(0L),
            securityDescriptor: Pcstr = ConstPtr(0L),
        ): SpFileCopyParamsA =
            SpFileCopyParamsA(
                cbSize = cbSize,
                queueHandleCtorArg = queueHandle,
                sourceRootPathCtorArg = sourceRootPath,
                sourcePathCtorArg = sourcePath,
                sourceFilenameCtorArg = sourceFilename,
                sourceDescriptionCtorArg = sourceDescription,
                sourceTagfileCtorArg = sourceTagfile,
                targetDirectoryCtorArg = targetDirectory,
                targetFilenameCtorArg = targetFilename,
                copyStyle = copyStyle,
                layoutInfCtorArg = layoutInf,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class SpFileCopyParamsW internal constructor(
    public var cbSize: UInt,
    queueHandleCtorArg: MutPtr<CVoid>,
    sourceRootPathCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
    sourceFilenameCtorArg: Pcwstr,
    sourceDescriptionCtorArg: Pcwstr,
    sourceTagfileCtorArg: Pcwstr,
    targetDirectoryCtorArg: Pcwstr,
    targetFilenameCtorArg: Pcwstr,
    public var copyStyle: UInt,
    layoutInfCtorArg: MutPtr<CVoid>,
    securityDescriptorCtorArg: Pcwstr,
) {
    public var queueHandle: MutPtr<CVoid> = queueHandleCtorArg
        internal set

    public var sourceRootPath: Pcwstr = sourceRootPathCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public var sourceFilename: Pcwstr = sourceFilenameCtorArg
        internal set

    public var sourceDescription: Pcwstr = sourceDescriptionCtorArg
        internal set

    public var sourceTagfile: Pcwstr = sourceTagfileCtorArg
        internal set

    public var targetDirectory: Pcwstr = targetDirectoryCtorArg
        internal set

    public var targetFilename: Pcwstr = targetFilenameCtorArg
        internal set

    public var layoutInf: MutPtr<CVoid> = layoutInfCtorArg
        internal set

    public var securityDescriptor: Pcwstr = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        queueHandleCtorArg = MutPtr(0L),
        sourceRootPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        sourceFilenameCtorArg = ConstPtr(0L),
        sourceDescriptionCtorArg = ConstPtr(0L),
        sourceTagfileCtorArg = ConstPtr(0L),
        targetDirectoryCtorArg = ConstPtr(0L),
        targetFilenameCtorArg = ConstPtr(0L),
        copyStyle = 0u,
        layoutInfCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr<CVoid> = this.queueHandle

    public operator fun component3(): Pcwstr = this.sourceRootPath

    public operator fun component4(): Pcwstr = this.sourcePath

    public operator fun component5(): Pcwstr = this.sourceFilename

    public operator fun component6(): Pcwstr = this.sourceDescription

    public operator fun component7(): Pcwstr = this.sourceTagfile

    public operator fun component8(): Pcwstr = this.targetDirectory

    public operator fun component9(): Pcwstr = this.targetFilename

    public operator fun component10(): UInt = this.copyStyle

    public operator fun component11(): MutPtr<CVoid> = this.layoutInf

    public operator fun component12(): Pcwstr = this.securityDescriptor

    public fun copy(cbSize: UInt = this.cbSize, queueHandle: MutPtr<CVoid> = this.queueHandle, sourceRootPath: Pcwstr = this.sourceRootPath, sourcePath: Pcwstr = this.sourcePath, sourceFilename: Pcwstr = this.sourceFilename, sourceDescription: Pcwstr = this.sourceDescription, sourceTagfile: Pcwstr = this.sourceTagfile, targetDirectory: Pcwstr = this.targetDirectory, targetFilename: Pcwstr = this.targetFilename, copyStyle: UInt = this.copyStyle, layoutInf: MutPtr<CVoid> = this.layoutInf, securityDescriptor: Pcwstr = this.securityDescriptor): SpFileCopyParamsW = SpFileCopyParamsW(cbSize = cbSize, queueHandleCtorArg = queueHandle, sourceRootPathCtorArg = sourceRootPath, sourcePathCtorArg = sourcePath, sourceFilenameCtorArg = sourceFilename, sourceDescriptionCtorArg = sourceDescription, sourceTagfileCtorArg = sourceTagfile, targetDirectoryCtorArg = targetDirectory, targetFilenameCtorArg = targetFilename, copyStyle = copyStyle, layoutInfCtorArg = layoutInf, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpFileCopyParamsW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.queueHandle != other.queueHandle) return false
        if (this.sourceRootPath != other.sourceRootPath) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.sourceFilename != other.sourceFilename) return false
        if (this.sourceDescription != other.sourceDescription) return false
        if (this.sourceTagfile != other.sourceTagfile) return false
        if (this.targetDirectory != other.targetDirectory) return false
        if (this.targetFilename != other.targetFilename) return false
        if (this.copyStyle != other.copyStyle) return false
        if (this.layoutInf != other.layoutInf) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.queueHandle.hashCode()
        result = 31 * result + this.sourceRootPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.sourceFilename.hashCode()
        result = 31 * result + this.sourceDescription.hashCode()
        result = 31 * result + this.sourceTagfile.hashCode()
        result = 31 * result + this.targetDirectory.hashCode()
        result = 31 * result + this.targetFilename.hashCode()
        result = 31 * result + this.copyStyle.hashCode()
        result = 31 * result + this.layoutInf.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            queueHandle: MutPtr<CVoid> = MutPtr(0L),
            sourceRootPath: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
            sourceFilename: Pcwstr = ConstPtr(0L),
            sourceDescription: Pcwstr = ConstPtr(0L),
            sourceTagfile: Pcwstr = ConstPtr(0L),
            targetDirectory: Pcwstr = ConstPtr(0L),
            targetFilename: Pcwstr = ConstPtr(0L),
            copyStyle: UInt = 0u,
            layoutInf: MutPtr<CVoid> = MutPtr(0L),
            securityDescriptor: Pcwstr = ConstPtr(0L),
        ): SpFileCopyParamsW =
            SpFileCopyParamsW(
                cbSize = cbSize,
                queueHandleCtorArg = queueHandle,
                sourceRootPathCtorArg = sourceRootPath,
                sourcePathCtorArg = sourcePath,
                sourceFilenameCtorArg = sourceFilename,
                sourceDescriptionCtorArg = sourceDescription,
                sourceTagfileCtorArg = sourceTagfile,
                targetDirectoryCtorArg = targetDirectory,
                targetFilenameCtorArg = targetFilename,
                copyStyle = copyStyle,
                layoutInfCtorArg = layoutInf,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public data class SpInfInformation(
    public var infStyle: InfStyle = 0u,
    public var infCount: UInt = 0u,
    public var versionData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfInformation) return false
        if (this.infStyle != other.infStyle) return false
        if (this.infCount != other.infCount) return false
        if (!this.versionData.contentEquals(other.versionData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infStyle.hashCode()
        result = 31 * result + this.infCount.hashCode()
        result = 31 * result + this.versionData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SpInfInformation =
                    SpInfInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpInfInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.infStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.infCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.versionData.toList())
                }
            }
    }
}

public data class SpInfSignerInfoV1A(
    public var cbSize: UInt = 0u,
    public var catalogFile: ByteArray = ByteArray(260),
    public var digitalSigner: ByteArray = ByteArray(260),
    public var digitalSignerVersion: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV1A> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 784L
                override fun readNative(addr: Long): SpInfSignerInfoV1A =
                    SpInfSignerInfoV1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 264L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 524L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpInfSignerInfoV1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 4L, value.catalogFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 264L, value.digitalSigner.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 524L, value.digitalSignerVersion.toList())
                }
            }
    }
}

public data class SpInfSignerInfoV1W(
    public var cbSize: UInt = 0u,
    public var catalogFile: UShortArray = UShortArray(260),
    public var digitalSigner: UShortArray = UShortArray(260),
    public var digitalSignerVersion: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV1W> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1564L
                override fun readNative(addr: Long): SpInfSignerInfoV1W =
                    SpInfSignerInfoV1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1044L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpInfSignerInfoV1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.catalogFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 524L, value.digitalSigner.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1044L, value.digitalSignerVersion.toList())
                }
            }
    }
}

public data class SpInfSignerInfoV2A(
    public var cbSize: UInt = 0u,
    public var catalogFile: ByteArray = ByteArray(260),
    public var digitalSigner: ByteArray = ByteArray(260),
    public var digitalSignerVersion: ByteArray = ByteArray(260),
    public var signerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        if (this.signerScore != other.signerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        result = 31 * result + this.signerScore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV2A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV2A> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 788L
                override fun readNative(addr: Long): SpInfSignerInfoV2A =
                    SpInfSignerInfoV2A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 264L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 524L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 784L),
                    )
                override fun writeNative(addr: Long, value: SpInfSignerInfoV2A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 4L, value.catalogFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 264L, value.digitalSigner.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 524L, value.digitalSignerVersion.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 784L, value.signerScore)
                }
            }
    }
}

public data class SpInfSignerInfoV2W(
    public var cbSize: UInt = 0u,
    public var catalogFile: UShortArray = UShortArray(260),
    public var digitalSigner: UShortArray = UShortArray(260),
    public var digitalSignerVersion: UShortArray = UShortArray(260),
    public var signerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        if (this.signerScore != other.signerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        result = 31 * result + this.signerScore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV2W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpInfSignerInfoV2W> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1568L
                override fun readNative(addr: Long): SpInfSignerInfoV2W =
                    SpInfSignerInfoV2W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1044L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1564L),
                    )
                override fun writeNative(addr: Long, value: SpInfSignerInfoV2W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.catalogFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 524L, value.digitalSigner.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1044L, value.digitalSignerVersion.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1564L, value.signerScore)
                }
            }
    }
}

public class SpInstallwizardData internal constructor(
    public var classInstallHeader: SpClassinstallHeader,
    public var flags: UInt,
    dynamicPagesCtorArg: List<Hpropsheetpage>,
    public var numDynamicPages: UInt,
    public var dynamicPageFlags: UInt,
    public var privateFlags: UInt,
    public var privateData: Lparam,
    hwndWizardDlgCtorArg: Hwnd,
) {
    public var dynamicPages: List<Hpropsheetpage> = dynamicPagesCtorArg
        internal set

    public var hwndWizardDlg: Hwnd = hwndWizardDlgCtorArg
        internal set

    public constructor() : this(
        classInstallHeader = SpClassinstallHeader(),
        flags = 0u,
        dynamicPagesCtorArg = List(20) { MutPtr(0L) },
        numDynamicPages = 0u,
        dynamicPageFlags = 0u,
        privateFlags = 0u,
        privateData = 0L,
        hwndWizardDlgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SpClassinstallHeader = this.classInstallHeader

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): List<Hpropsheetpage> = this.dynamicPages

    public operator fun component4(): UInt = this.numDynamicPages

    public operator fun component5(): UInt = this.dynamicPageFlags

    public operator fun component6(): UInt = this.privateFlags

    public operator fun component7(): Lparam = this.privateData

    public operator fun component8(): Hwnd = this.hwndWizardDlg

    public fun copy(classInstallHeader: SpClassinstallHeader = this.classInstallHeader, flags: UInt = this.flags, dynamicPages: List<Hpropsheetpage> = this.dynamicPages, numDynamicPages: UInt = this.numDynamicPages, dynamicPageFlags: UInt = this.dynamicPageFlags, privateFlags: UInt = this.privateFlags, privateData: Lparam = this.privateData, hwndWizardDlg: Hwnd = this.hwndWizardDlg): SpInstallwizardData = SpInstallwizardData(classInstallHeader = classInstallHeader, flags = flags, dynamicPagesCtorArg = dynamicPages, numDynamicPages = numDynamicPages, dynamicPageFlags = dynamicPageFlags, privateFlags = privateFlags, privateData = privateData, hwndWizardDlgCtorArg = hwndWizardDlg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInstallwizardData) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (this.flags != other.flags) return false
        if (this.dynamicPages != other.dynamicPages) return false
        if (this.numDynamicPages != other.numDynamicPages) return false
        if (this.dynamicPageFlags != other.dynamicPageFlags) return false
        if (this.privateFlags != other.privateFlags) return false
        if (this.privateData != other.privateData) return false
        if (this.hwndWizardDlg != other.hwndWizardDlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dynamicPages.hashCode()
        result = 31 * result + this.numDynamicPages.hashCode()
        result = 31 * result + this.dynamicPageFlags.hashCode()
        result = 31 * result + this.privateFlags.hashCode()
        result = 31 * result + this.privateData.hashCode()
        result = 31 * result + this.hwndWizardDlg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
            flags: UInt = 0u,
            dynamicPages: List<Hpropsheetpage> = List(20) { MutPtr(0L) },
            numDynamicPages: UInt = 0u,
            dynamicPageFlags: UInt = 0u,
            privateFlags: UInt = 0u,
            privateData: Lparam = 0L,
            hwndWizardDlg: Hwnd = MutPtr(0L),
        ): SpInstallwizardData =
            SpInstallwizardData(
                classInstallHeader = classInstallHeader,
                flags = flags,
                dynamicPagesCtorArg = dynamicPages,
                numDynamicPages = numDynamicPages,
                dynamicPageFlags = dynamicPageFlags,
                privateFlags = privateFlags,
                privateData = privateData,
                hwndWizardDlgCtorArg = hwndWizardDlg,
            )
    }
}

public class SpNewdevicewizardData internal constructor(
    public var classInstallHeader: SpClassinstallHeader,
    public var flags: UInt,
    dynamicPagesCtorArg: List<Hpropsheetpage>,
    public var numDynamicPages: UInt,
    hwndWizardDlgCtorArg: Hwnd,
) {
    public var dynamicPages: List<Hpropsheetpage> = dynamicPagesCtorArg
        internal set

    public var hwndWizardDlg: Hwnd = hwndWizardDlgCtorArg
        internal set

    public constructor() : this(
        classInstallHeader = SpClassinstallHeader(),
        flags = 0u,
        dynamicPagesCtorArg = List(20) { MutPtr(0L) },
        numDynamicPages = 0u,
        hwndWizardDlgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SpClassinstallHeader = this.classInstallHeader

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): List<Hpropsheetpage> = this.dynamicPages

    public operator fun component4(): UInt = this.numDynamicPages

    public operator fun component5(): Hwnd = this.hwndWizardDlg

    public fun copy(classInstallHeader: SpClassinstallHeader = this.classInstallHeader, flags: UInt = this.flags, dynamicPages: List<Hpropsheetpage> = this.dynamicPages, numDynamicPages: UInt = this.numDynamicPages, hwndWizardDlg: Hwnd = this.hwndWizardDlg): SpNewdevicewizardData = SpNewdevicewizardData(classInstallHeader = classInstallHeader, flags = flags, dynamicPagesCtorArg = dynamicPages, numDynamicPages = numDynamicPages, hwndWizardDlgCtorArg = hwndWizardDlg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpNewdevicewizardData) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (this.flags != other.flags) return false
        if (this.dynamicPages != other.dynamicPages) return false
        if (this.numDynamicPages != other.numDynamicPages) return false
        if (this.hwndWizardDlg != other.hwndWizardDlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dynamicPages.hashCode()
        result = 31 * result + this.numDynamicPages.hashCode()
        result = 31 * result + this.hwndWizardDlg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
            flags: UInt = 0u,
            dynamicPages: List<Hpropsheetpage> = List(20) { MutPtr(0L) },
            numDynamicPages: UInt = 0u,
            hwndWizardDlg: Hwnd = MutPtr(0L),
        ): SpNewdevicewizardData =
            SpNewdevicewizardData(
                classInstallHeader = classInstallHeader,
                flags = flags,
                dynamicPagesCtorArg = dynamicPages,
                numDynamicPages = numDynamicPages,
                hwndWizardDlgCtorArg = hwndWizardDlg,
            )
    }
}

public data class SpOriginalFileInfoA(
    public var cbSize: UInt = 0u,
    public var originalInfName: ByteArray = ByteArray(260),
    public var originalCatalogName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpOriginalFileInfoA) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.originalInfName.contentEquals(other.originalInfName)) return false
        if (!this.originalCatalogName.contentEquals(other.originalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.originalInfName.contentHashCode()
        result = 31 * result + this.originalCatalogName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpOriginalFileInfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpOriginalFileInfoA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): SpOriginalFileInfoA =
                    SpOriginalFileInfoA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 264L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpOriginalFileInfoA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 4L, value.originalInfName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 264L, value.originalCatalogName.toList())
                }
            }
    }
}

public data class SpOriginalFileInfoW(
    public var cbSize: UInt = 0u,
    public var originalInfName: UShortArray = UShortArray(260),
    public var originalCatalogName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpOriginalFileInfoW) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.originalInfName.contentEquals(other.originalInfName)) return false
        if (!this.originalCatalogName.contentEquals(other.originalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.originalInfName.contentHashCode()
        result = 31 * result + this.originalCatalogName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpOriginalFileInfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpOriginalFileInfoW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1044L
                override fun readNative(addr: Long): SpOriginalFileInfoW =
                    SpOriginalFileInfoW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpOriginalFileInfoW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.originalInfName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 524L, value.originalCatalogName.toList())
                }
            }
    }
}

public data class SpPowermessagewakeParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var powerMessageWake: ByteArray = ByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpPowermessagewakeParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.powerMessageWake.contentEquals(other.powerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.powerMessageWake.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPowermessagewakeParamsA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPowermessagewakeParamsA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): SpPowermessagewakeParamsA =
                    SpPowermessagewakeParamsA(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (512).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpPowermessagewakeParamsA) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (512).toInt())
                    ).writeNative(addr + 8L, value.powerMessageWake.toList())
                }
            }
    }
}

public data class SpPowermessagewakeParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var powerMessageWake: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpPowermessagewakeParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.powerMessageWake.contentEquals(other.powerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.powerMessageWake.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPowermessagewakeParamsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPowermessagewakeParamsW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1032L
                override fun readNative(addr: Long): SpPowermessagewakeParamsW =
                    SpPowermessagewakeParamsW(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (512).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpPowermessagewakeParamsW) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (512).toInt())
                    ).writeNative(addr + 8L, value.powerMessageWake.toList())
                }
            }
    }
}

public data class SpPropchangeParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var stateChange: SetupDiStateChange = 0u,
    public var scope: SetupDiPropertyChangeScope = 0u,
    public var hwProfile: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPropchangeParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPropchangeParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SpPropchangeParams =
                    SpPropchangeParams(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SpPropchangeParams) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hwProfile)
                }
            }
    }
}

public class SpPropsheetpageRequest internal constructor(
    public var cbSize: UInt,
    public var pageRequested: UInt,
    public var deviceInfoSet: Hdevinfo,
    deviceInfoDataCtorArg: MutPtr<SpDevinfoData>,
) {
    public var deviceInfoData: MutPtr<SpDevinfoData> = deviceInfoDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pageRequested = 0u,
        deviceInfoSet = 0L,
        deviceInfoDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.pageRequested

    public operator fun component3(): Hdevinfo = this.deviceInfoSet

    public operator fun component4(): MutPtr<SpDevinfoData> = this.deviceInfoData

    public fun copy(cbSize: UInt = this.cbSize, pageRequested: UInt = this.pageRequested, deviceInfoSet: Hdevinfo = this.deviceInfoSet, deviceInfoData: MutPtr<SpDevinfoData> = this.deviceInfoData): SpPropsheetpageRequest = SpPropsheetpageRequest(cbSize = cbSize, pageRequested = pageRequested, deviceInfoSet = deviceInfoSet, deviceInfoDataCtorArg = deviceInfoData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpPropsheetpageRequest) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pageRequested != other.pageRequested) return false
        if (this.deviceInfoSet != other.deviceInfoSet) return false
        if (this.deviceInfoData != other.deviceInfoData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pageRequested.hashCode()
        result = 31 * result + this.deviceInfoSet.hashCode()
        result = 31 * result + this.deviceInfoData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPropsheetpageRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpPropsheetpageRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SpPropsheetpageRequest =
                    SpPropsheetpageRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SpDevinfoData>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SpPropsheetpageRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.deviceInfoSet)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SpDevinfoData>(64)
                    ).writeNative(addr + 16L, value.deviceInfoData)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pageRequested: UInt = 0u,
            deviceInfoSet: Hdevinfo = 0L,
            deviceInfoData: MutPtr<SpDevinfoData> = MutPtr(0L),
        ): SpPropsheetpageRequest =
            SpPropsheetpageRequest(
                cbSize = cbSize,
                pageRequested = pageRequested,
                deviceInfoSet = deviceInfoSet,
                deviceInfoDataCtorArg = deviceInfoData,
            )
    }
}

public class SpRegisterControlStatusa internal constructor(
    public var cbSize: UInt,
    fileNameCtorArg: Pcstr,
    public var win32Error: UInt,
    public var failureCode: UInt,
) {
    public var fileName: Pcstr = fileNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fileNameCtorArg = ConstPtr(0L),
        win32Error = 0u,
        failureCode = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcstr = this.fileName

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.failureCode

    public fun copy(cbSize: UInt = this.cbSize, fileName: Pcstr = this.fileName, win32Error: UInt = this.win32Error, failureCode: UInt = this.failureCode): SpRegisterControlStatusa = SpRegisterControlStatusa(cbSize = cbSize, fileNameCtorArg = fileName, win32Error = win32Error, failureCode = failureCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpRegisterControlStatusa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fileName != other.fileName) return false
        if (this.win32Error != other.win32Error) return false
        if (this.failureCode != other.failureCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.failureCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fileName: Pcstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            failureCode: UInt = 0u,
        ): SpRegisterControlStatusa =
            SpRegisterControlStatusa(
                cbSize = cbSize,
                fileNameCtorArg = fileName,
                win32Error = win32Error,
                failureCode = failureCode,
            )
    }
}

public class SpRegisterControlStatusw internal constructor(
    public var cbSize: UInt,
    fileNameCtorArg: Pcwstr,
    public var win32Error: UInt,
    public var failureCode: UInt,
) {
    public var fileName: Pcwstr = fileNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fileNameCtorArg = ConstPtr(0L),
        win32Error = 0u,
        failureCode = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.fileName

    public operator fun component3(): UInt = this.win32Error

    public operator fun component4(): UInt = this.failureCode

    public fun copy(cbSize: UInt = this.cbSize, fileName: Pcwstr = this.fileName, win32Error: UInt = this.win32Error, failureCode: UInt = this.failureCode): SpRegisterControlStatusw = SpRegisterControlStatusw(cbSize = cbSize, fileNameCtorArg = fileName, win32Error = win32Error, failureCode = failureCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpRegisterControlStatusw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fileName != other.fileName) return false
        if (this.win32Error != other.win32Error) return false
        if (this.failureCode != other.failureCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.failureCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fileName: Pcwstr = ConstPtr(0L),
            win32Error: UInt = 0u,
            failureCode: UInt = 0u,
        ): SpRegisterControlStatusw =
            SpRegisterControlStatusw(
                cbSize = cbSize,
                fileNameCtorArg = fileName,
                win32Error = win32Error,
                failureCode = failureCode,
            )
    }
}

public data class SpRemovedeviceParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var scope: SetupDiRemoveDeviceScope = 0u,
    public var hwProfile: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpRemovedeviceParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpRemovedeviceParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SpRemovedeviceParams =
                    SpRemovedeviceParams(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SpRemovedeviceParams) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hwProfile)
                }
            }
    }
}

public data class SpSelectdeviceParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var title: ByteArray = ByteArray(60),
    public var instructions: ByteArray = ByteArray(256),
    public var listLabel: ByteArray = ByteArray(30),
    public var subTitle: ByteArray = ByteArray(256),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpSelectdeviceParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.title.contentEquals(other.title)) return false
        if (!this.instructions.contentEquals(other.instructions)) return false
        if (!this.listLabel.contentEquals(other.listLabel)) return false
        if (!this.subTitle.contentEquals(other.subTitle)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.title.contentHashCode()
        result = 31 * result + this.instructions.contentHashCode()
        result = 31 * result + this.listLabel.contentHashCode()
        result = 31 * result + this.subTitle.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpSelectdeviceParamsA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpSelectdeviceParamsA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 612L
                override fun readNative(addr: Long): SpSelectdeviceParamsA =
                    SpSelectdeviceParamsA(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (60).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 68L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                        ).readNative(addr + 324L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 354L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 610L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpSelectdeviceParamsA) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (60).toInt())
                    ).writeNative(addr + 8L, value.title.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 68L, value.instructions.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                    ).writeNative(addr + 324L, value.listLabel.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 354L, value.subTitle.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 610L, value.reserved.toList())
                }
            }
    }
}

public data class SpSelectdeviceParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var title: UShortArray = UShortArray(60),
    public var instructions: UShortArray = UShortArray(256),
    public var listLabel: UShortArray = UShortArray(30),
    public var subTitle: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpSelectdeviceParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.title.contentEquals(other.title)) return false
        if (!this.instructions.contentEquals(other.instructions)) return false
        if (!this.listLabel.contentEquals(other.listLabel)) return false
        if (!this.subTitle.contentEquals(other.subTitle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.title.contentHashCode()
        result = 31 * result + this.instructions.contentHashCode()
        result = 31 * result + this.listLabel.contentHashCode()
        result = 31 * result + this.subTitle.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpSelectdeviceParamsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpSelectdeviceParamsW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1212L
                override fun readNative(addr: Long): SpSelectdeviceParamsW =
                    SpSelectdeviceParamsW(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (60).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 128L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (30).toInt())
                        ).readNative(addr + 640L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 700L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpSelectdeviceParamsW) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (60).toInt())
                    ).writeNative(addr + 8L, value.title.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 128L, value.instructions.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (30).toInt())
                    ).writeNative(addr + 640L, value.listLabel.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 700L, value.subTitle.toList())
                }
            }
    }
}

public data class SpTroubleshooterParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var chmFile: ByteArray = ByteArray(260),
    public var htmlTroubleShooter: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpTroubleshooterParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.chmFile.contentEquals(other.chmFile)) return false
        if (!this.htmlTroubleShooter.contentEquals(other.htmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.chmFile.contentHashCode()
        result = 31 * result + this.htmlTroubleShooter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpTroubleshooterParamsA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpTroubleshooterParamsA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): SpTroubleshooterParamsA =
                    SpTroubleshooterParamsA(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 268L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SpTroubleshooterParamsA) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 8L, value.chmFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 268L, value.htmlTroubleShooter.toList())
                }
            }
    }
}

public data class SpTroubleshooterParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var chmFile: UShortArray = UShortArray(260),
    public var htmlTroubleShooter: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpTroubleshooterParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.chmFile.contentEquals(other.chmFile)) return false
        if (!this.htmlTroubleShooter.contentEquals(other.htmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.chmFile.contentHashCode()
        result = 31 * result + this.htmlTroubleShooter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpTroubleshooterParamsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpTroubleshooterParamsW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1048L
                override fun readNative(addr: Long): SpTroubleshooterParamsW =
                    SpTroubleshooterParamsW(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 528L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SpTroubleshooterParamsW) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 8L, value.chmFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 528L, value.htmlTroubleShooter.toList())
                }
            }
    }
}

public data class SpUnremovedeviceParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var scope: UInt = 0u,
    public var hwProfile: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpUnremovedeviceParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpUnremovedeviceParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SpUnremovedeviceParams =
                    SpUnremovedeviceParams(
                        (SpClassinstallHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SpUnremovedeviceParams) {
                    (SpClassinstallHeader.typeLayout()).writeNative(addr, value.classInstallHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hwProfile)
                }
            }
    }
}
