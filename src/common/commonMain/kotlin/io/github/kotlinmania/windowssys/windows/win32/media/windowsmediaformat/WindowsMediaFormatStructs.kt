@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader

public class AmWmtEventData internal constructor(
    public var hrStatus: Hresult,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        hrStatus = 0,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hresult = this.hrStatus

    public operator fun component2(): MutPtr = this.pData

    public fun copy(hrStatus: Hresult = this.hrStatus, pData: MutPtr = this.pData): AmWmtEventData = AmWmtEventData(hrStatus = hrStatus, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmWmtEventData) return false
        if (this.hrStatus != other.hrStatus) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hrStatus.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmWmtEventData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AmWmtEventData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AmWmtEventData =
                    AmWmtEventData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AmWmtEventData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hrStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            hrStatus: Hresult = 0,
            pData: MutPtr = MutPtr(0L),
        ): AmWmtEventData =
            AmWmtEventData(
                hrStatus = hrStatus,
                pDataCtorArg = pData,
            )
    }
}

public data class DrmCopyOpl(
    public var wMinimumCopyLevel: UShort = 0u,
    public var oplIdIncludes: DrmOplOutputIds = DrmOplOutputIds(),
    public var oplIdExcludes: DrmOplOutputIds = DrmOplOutputIds(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmCopyOpl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmCopyOpl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DrmCopyOpl =
                    DrmCopyOpl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (DrmOplOutputIds.typeLayout()).readNative(addr + 8L),
                        (DrmOplOutputIds.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DrmCopyOpl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMinimumCopyLevel)
                    (DrmOplOutputIds.typeLayout()).writeNative(addr + 8L, value.oplIdIncludes)
                    (DrmOplOutputIds.typeLayout()).writeNative(addr + 24L, value.oplIdExcludes)
                }
            }
    }
}

public data class DrmMinimumOutputProtectionLevels(
    public var wCompressedDigitalVideo: UShort = 0u,
    public var wUncompressedDigitalVideo: UShort = 0u,
    public var wAnalogVideo: UShort = 0u,
    public var wCompressedDigitalAudio: UShort = 0u,
    public var wUncompressedDigitalAudio: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmMinimumOutputProtectionLevels> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmMinimumOutputProtectionLevels> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): DrmMinimumOutputProtectionLevels =
                    DrmMinimumOutputProtectionLevels(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrmMinimumOutputProtectionLevels) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wCompressedDigitalVideo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wUncompressedDigitalVideo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wAnalogVideo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wCompressedDigitalAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wUncompressedDigitalAudio)
                }
            }
    }
}

public class DrmOplOutputIds internal constructor(
    public var cIds: UShort,
    rgIdsCtorArg: MutPtr,
) {
    public var rgIds: MutPtr = rgIdsCtorArg
        internal set

    public constructor() : this(
        cIds = 0u,
        rgIdsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cIds

    public operator fun component2(): MutPtr = this.rgIds

    public fun copy(cIds: UShort = this.cIds, rgIds: MutPtr = this.rgIds): DrmOplOutputIds = DrmOplOutputIds(cIds = cIds, rgIdsCtorArg = rgIds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmOplOutputIds) return false
        if (this.cIds != other.cIds) return false
        if (this.rgIds != other.rgIds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIds.hashCode()
        result = 31 * result + this.rgIds.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmOplOutputIds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmOplOutputIds> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DrmOplOutputIds =
                    DrmOplOutputIds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrmOplOutputIds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cIds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgIds)
                }
            }

        public operator fun invoke(
            cIds: UShort = 0u,
            rgIds: MutPtr = MutPtr(0L),
        ): DrmOplOutputIds =
            DrmOplOutputIds(
                cIds = cIds,
                rgIdsCtorArg = rgIds,
            )
    }
}

public data class DrmOutputProtection(
    public var guidId: Guid = Guid(),
    public var bConfigData: UByte = 0u,
)

public data class DrmPlayOpl(
    public var minOPL: DrmMinimumOutputProtectionLevels = DrmMinimumOutputProtectionLevels(),
    public var oplIdReserved: DrmOplOutputIds = DrmOplOutputIds(),
    public var vopi: DrmVideoOutputProtectionIds = DrmVideoOutputProtectionIds(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmPlayOpl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmPlayOpl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DrmPlayOpl =
                    DrmPlayOpl(
                        (DrmMinimumOutputProtectionLevels.typeLayout()).readNative(addr),
                        (DrmOplOutputIds.typeLayout()).readNative(addr + 16L),
                        (DrmVideoOutputProtectionIds.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DrmPlayOpl) {
                    (DrmMinimumOutputProtectionLevels.typeLayout()).writeNative(addr, value.minOPL)
                    (DrmOplOutputIds.typeLayout()).writeNative(addr + 16L, value.oplIdReserved)
                    (DrmVideoOutputProtectionIds.typeLayout()).writeNative(addr + 32L, value.vopi)
                }
            }
    }
}

public data class DrmVal16(
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmVal16) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmVal16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmVal16> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DrmVal16 =
                    DrmVal16(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DrmVal16) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public class DrmVideoOutputProtectionIds internal constructor(
    public var cEntries: UShort,
    rgVopCtorArg: MutPtr,
) {
    public var rgVop: MutPtr = rgVopCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        rgVopCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.cEntries

    public operator fun component2(): MutPtr = this.rgVop

    public fun copy(cEntries: UShort = this.cEntries, rgVop: MutPtr = this.rgVop): DrmVideoOutputProtectionIds = DrmVideoOutputProtectionIds(cEntries = cEntries, rgVopCtorArg = rgVop)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmVideoOutputProtectionIds) return false
        if (this.cEntries != other.cEntries) return false
        if (this.rgVop != other.rgVop) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.rgVop.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmVideoOutputProtectionIds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmVideoOutputProtectionIds> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DrmVideoOutputProtectionIds =
                    DrmVideoOutputProtectionIds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrmVideoOutputProtectionIds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgVop)
                }
            }

        public operator fun invoke(
            cEntries: UShort = 0u,
            rgVop: MutPtr = MutPtr(0L),
        ): DrmVideoOutputProtectionIds =
            DrmVideoOutputProtectionIds(
                cEntries = cEntries,
                rgVopCtorArg = rgVop,
            )
    }
}

public class WmdrmImportInitStruct internal constructor(
    public var dwVersion: UInt,
    public var cbEncryptedSessionKeyMessage: UInt,
    pbEncryptedSessionKeyMessageCtorArg: MutPtr,
    public var cbEncryptedKeyMessage: UInt,
    pbEncryptedKeyMessageCtorArg: MutPtr,
) {
    public var pbEncryptedSessionKeyMessage: MutPtr = pbEncryptedSessionKeyMessageCtorArg
        internal set

    public var pbEncryptedKeyMessage: MutPtr = pbEncryptedKeyMessageCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbEncryptedSessionKeyMessage = 0u,
        pbEncryptedSessionKeyMessageCtorArg = MutPtr(0L),
        cbEncryptedKeyMessage = 0u,
        pbEncryptedKeyMessageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbEncryptedSessionKeyMessage

    public operator fun component3(): MutPtr = this.pbEncryptedSessionKeyMessage

    public operator fun component4(): UInt = this.cbEncryptedKeyMessage

    public operator fun component5(): MutPtr = this.pbEncryptedKeyMessage

    public fun copy(dwVersion: UInt = this.dwVersion, cbEncryptedSessionKeyMessage: UInt = this.cbEncryptedSessionKeyMessage, pbEncryptedSessionKeyMessage: MutPtr = this.pbEncryptedSessionKeyMessage, cbEncryptedKeyMessage: UInt = this.cbEncryptedKeyMessage, pbEncryptedKeyMessage: MutPtr = this.pbEncryptedKeyMessage): WmdrmImportInitStruct = WmdrmImportInitStruct(dwVersion = dwVersion, cbEncryptedSessionKeyMessage = cbEncryptedSessionKeyMessage, pbEncryptedSessionKeyMessageCtorArg = pbEncryptedSessionKeyMessage, cbEncryptedKeyMessage = cbEncryptedKeyMessage, pbEncryptedKeyMessageCtorArg = pbEncryptedKeyMessage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmdrmImportInitStruct) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbEncryptedSessionKeyMessage != other.cbEncryptedSessionKeyMessage) return false
        if (this.pbEncryptedSessionKeyMessage != other.pbEncryptedSessionKeyMessage) return false
        if (this.cbEncryptedKeyMessage != other.cbEncryptedKeyMessage) return false
        if (this.pbEncryptedKeyMessage != other.pbEncryptedKeyMessage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbEncryptedSessionKeyMessage.hashCode()
        result = 31 * result + this.pbEncryptedSessionKeyMessage.hashCode()
        result = 31 * result + this.cbEncryptedKeyMessage.hashCode()
        result = 31 * result + this.pbEncryptedKeyMessage.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmdrmImportInitStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmdrmImportInitStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WmdrmImportInitStruct =
                    WmdrmImportInitStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WmdrmImportInitStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbEncryptedSessionKeyMessage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbEncryptedSessionKeyMessage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbEncryptedKeyMessage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pbEncryptedKeyMessage)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbEncryptedSessionKeyMessage: UInt = 0u,
            pbEncryptedSessionKeyMessage: MutPtr = MutPtr(0L),
            cbEncryptedKeyMessage: UInt = 0u,
            pbEncryptedKeyMessage: MutPtr = MutPtr(0L),
        ): WmdrmImportInitStruct =
            WmdrmImportInitStruct(
                dwVersion = dwVersion,
                cbEncryptedSessionKeyMessage = cbEncryptedSessionKeyMessage,
                pbEncryptedSessionKeyMessageCtorArg = pbEncryptedSessionKeyMessage,
                cbEncryptedKeyMessage = cbEncryptedKeyMessage,
                pbEncryptedKeyMessageCtorArg = pbEncryptedKeyMessage,
            )
    }
}

public data class Wmmpeg2videoinfo(
    public var hdr: Wmvideoinfoheader2 = Wmvideoinfoheader2(),
    public var dwStartTimeCode: UInt = 0u,
    public var cbSequenceHeader: UInt = 0u,
    public var dwProfile: UInt = 0u,
    public var dwLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSequenceHeader: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wmmpeg2videoinfo) return false
        if (this.hdr != other.hdr) return false
        if (this.dwStartTimeCode != other.dwStartTimeCode) return false
        if (this.cbSequenceHeader != other.cbSequenceHeader) return false
        if (this.dwProfile != other.dwProfile) return false
        if (this.dwLevel != other.dwLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwSequenceHeader.contentEquals(other.dwSequenceHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwStartTimeCode.hashCode()
        result = 31 * result + this.cbSequenceHeader.hashCode()
        result = 31 * result + this.dwProfile.hashCode()
        result = 31 * result + this.dwLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSequenceHeader.contentHashCode()
        return result
    }
}

public data class Wmscriptformat(
    public var scriptType: Guid = Guid(),
)

public class WmtBufferSegment internal constructor(
    pBufferCtorArg: MutPtr,
    public var cbOffset: UInt,
    public var cbLength: UInt,
) {
    public var pBuffer: MutPtr = pBufferCtorArg
        internal set

    public constructor() : this(
        pBufferCtorArg = MutPtr(0L),
        cbOffset = 0u,
        cbLength = 0u,
    )

    public operator fun component1(): MutPtr = this.pBuffer

    public operator fun component2(): UInt = this.cbOffset

    public operator fun component3(): UInt = this.cbLength

    public fun copy(pBuffer: MutPtr = this.pBuffer, cbOffset: UInt = this.cbOffset, cbLength: UInt = this.cbLength): WmtBufferSegment = WmtBufferSegment(pBufferCtorArg = pBuffer, cbOffset = cbOffset, cbLength = cbLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmtBufferSegment) return false
        if (this.pBuffer != other.pBuffer) return false
        if (this.cbOffset != other.cbOffset) return false
        if (this.cbLength != other.cbLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pBuffer.hashCode()
        result = 31 * result + this.cbOffset.hashCode()
        result = 31 * result + this.cbLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtBufferSegment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtBufferSegment> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WmtBufferSegment =
                    WmtBufferSegment(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WmtBufferSegment) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbLength)
                }
            }

        public operator fun invoke(
            pBuffer: MutPtr = MutPtr(0L),
            cbOffset: UInt = 0u,
            cbLength: UInt = 0u,
        ): WmtBufferSegment =
            WmtBufferSegment(
                pBufferCtorArg = pBuffer,
                cbOffset = cbOffset,
                cbLength = cbLength,
            )
    }
}

public data class WmtColorspaceinfoExtensionData(
    public var ucColorPrimaries: UByte = 0u,
    public var ucColorTransferChar: UByte = 0u,
    public var ucColorMatrixCoef: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtColorspaceinfoExtensionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtColorspaceinfoExtensionData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): WmtColorspaceinfoExtensionData =
                    WmtColorspaceinfoExtensionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WmtColorspaceinfoExtensionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ucColorPrimaries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ucColorTransferChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ucColorMatrixCoef)
                }
            }
    }
}

public class WmtFilesinkDataUnit internal constructor(
    public var packetHeaderBuffer: WmtBufferSegment,
    public var cPayloads: UInt,
    pPayloadHeaderBuffersCtorArg: MutPtr,
    public var cPayloadDataFragments: UInt,
    pPayloadDataFragmentsCtorArg: MutPtr,
) {
    public var pPayloadHeaderBuffers: MutPtr = pPayloadHeaderBuffersCtorArg
        internal set

    public var pPayloadDataFragments: MutPtr = pPayloadDataFragmentsCtorArg
        internal set

    public constructor() : this(
        packetHeaderBuffer = WmtBufferSegment(),
        cPayloads = 0u,
        pPayloadHeaderBuffersCtorArg = MutPtr(0L),
        cPayloadDataFragments = 0u,
        pPayloadDataFragmentsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WmtBufferSegment = this.packetHeaderBuffer

    public operator fun component2(): UInt = this.cPayloads

    public operator fun component3(): MutPtr = this.pPayloadHeaderBuffers

    public operator fun component4(): UInt = this.cPayloadDataFragments

    public operator fun component5(): MutPtr = this.pPayloadDataFragments

    public fun copy(packetHeaderBuffer: WmtBufferSegment = this.packetHeaderBuffer, cPayloads: UInt = this.cPayloads, pPayloadHeaderBuffers: MutPtr = this.pPayloadHeaderBuffers, cPayloadDataFragments: UInt = this.cPayloadDataFragments, pPayloadDataFragments: MutPtr = this.pPayloadDataFragments): WmtFilesinkDataUnit = WmtFilesinkDataUnit(packetHeaderBuffer = packetHeaderBuffer, cPayloads = cPayloads, pPayloadHeaderBuffersCtorArg = pPayloadHeaderBuffers, cPayloadDataFragments = cPayloadDataFragments, pPayloadDataFragmentsCtorArg = pPayloadDataFragments)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmtFilesinkDataUnit) return false
        if (this.packetHeaderBuffer != other.packetHeaderBuffer) return false
        if (this.cPayloads != other.cPayloads) return false
        if (this.pPayloadHeaderBuffers != other.pPayloadHeaderBuffers) return false
        if (this.cPayloadDataFragments != other.cPayloadDataFragments) return false
        if (this.pPayloadDataFragments != other.pPayloadDataFragments) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packetHeaderBuffer.hashCode()
        result = 31 * result + this.cPayloads.hashCode()
        result = 31 * result + this.pPayloadHeaderBuffers.hashCode()
        result = 31 * result + this.cPayloadDataFragments.hashCode()
        result = 31 * result + this.pPayloadDataFragments.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtFilesinkDataUnit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtFilesinkDataUnit> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): WmtFilesinkDataUnit =
                    WmtFilesinkDataUnit(
                        (WmtBufferSegment.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WmtFilesinkDataUnit) {
                    (WmtBufferSegment.typeLayout()).writeNative(addr, value.packetHeaderBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cPayloads)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pPayloadHeaderBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cPayloadDataFragments)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pPayloadDataFragments)
                }
            }

        public operator fun invoke(
            packetHeaderBuffer: WmtBufferSegment = WmtBufferSegment(),
            cPayloads: UInt = 0u,
            pPayloadHeaderBuffers: MutPtr = MutPtr(0L),
            cPayloadDataFragments: UInt = 0u,
            pPayloadDataFragments: MutPtr = MutPtr(0L),
        ): WmtFilesinkDataUnit =
            WmtFilesinkDataUnit(
                packetHeaderBuffer = packetHeaderBuffer,
                cPayloads = cPayloads,
                pPayloadHeaderBuffersCtorArg = pPayloadHeaderBuffers,
                cPayloadDataFragments = cPayloadDataFragments,
                pPayloadDataFragmentsCtorArg = pPayloadDataFragments,
            )
    }
}

public data class WmtPayloadFragment(
    public var dwPayloadIndex: UInt = 0u,
    public var segmentData: WmtBufferSegment = WmtBufferSegment(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtPayloadFragment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtPayloadFragment> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WmtPayloadFragment =
                    WmtPayloadFragment(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WmtBufferSegment.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WmtPayloadFragment) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPayloadIndex)
                    (WmtBufferSegment.typeLayout()).writeNative(addr + 8L, value.segmentData)
                }
            }
    }
}

public data class WmtTimecodeExtensionData(
    public var wRange: UShort = 0u,
    public var dwTimecode: UInt = 0u,
    public var dwUserbits: UInt = 0u,
    public var dwAmFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtTimecodeExtensionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtTimecodeExtensionData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): WmtTimecodeExtensionData =
                    WmtTimecodeExtensionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: WmtTimecodeExtensionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.dwTimecode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.dwUserbits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 10L, value.dwAmFlags)
                }
            }
    }
}

public class WmtVideoimageSample(
    public var dwMagic: UInt = 0u,
    public var cbStruct: UInt = 0u,
    public var dwControlFlags: UInt = 0u,
    public var dwInputFlagsCur: UInt = 0u,
    public var lCurMotionXtoX: Int = 0,
    public var lCurMotionYtoX: Int = 0,
    public var lCurMotionXoffset: Int = 0,
    public var lCurMotionXtoY: Int = 0,
    public var lCurMotionYtoY: Int = 0,
    public var lCurMotionYoffset: Int = 0,
    public var lCurBlendCoef1: Int = 0,
    public var lCurBlendCoef2: Int = 0,
    public var dwInputFlagsPrev: UInt = 0u,
    public var lPrevMotionXtoX: Int = 0,
    public var lPrevMotionYtoX: Int = 0,
    public var lPrevMotionXoffset: Int = 0,
    public var lPrevMotionXtoY: Int = 0,
    public var lPrevMotionYtoY: Int = 0,
    public var lPrevMotionYoffset: Int = 0,
    public var lPrevBlendCoef1: Int = 0,
    public var lPrevBlendCoef2: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtVideoimageSample> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtVideoimageSample> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): WmtVideoimageSample =
                    WmtVideoimageSample(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: WmtVideoimageSample) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwControlFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInputFlagsCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lCurMotionXtoX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lCurMotionYtoX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lCurMotionXoffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.lCurMotionXtoY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.lCurMotionYtoY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.lCurMotionYoffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.lCurBlendCoef1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.lCurBlendCoef2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwInputFlagsPrev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.lPrevMotionXtoX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.lPrevMotionYtoX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.lPrevMotionXoffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.lPrevMotionXtoY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.lPrevMotionYtoY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.lPrevMotionYoffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.lPrevBlendCoef1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.lPrevBlendCoef2)
                }
            }
    }
}

public class WmtVideoimageSample2(
    public var dwMagic: UInt = 0u,
    public var dwStructSize: UInt = 0u,
    public var dwControlFlags: UInt = 0u,
    public var dwViewportWidth: UInt = 0u,
    public var dwViewportHeight: UInt = 0u,
    public var dwCurrImageWidth: UInt = 0u,
    public var dwCurrImageHeight: UInt = 0u,
    public var fCurrRegionX0: Float = 0.0f,
    public var fCurrRegionY0: Float = 0.0f,
    public var fCurrRegionWidth: Float = 0.0f,
    public var fCurrRegionHeight: Float = 0.0f,
    public var fCurrBlendCoef: Float = 0.0f,
    public var dwPrevImageWidth: UInt = 0u,
    public var dwPrevImageHeight: UInt = 0u,
    public var fPrevRegionX0: Float = 0.0f,
    public var fPrevRegionY0: Float = 0.0f,
    public var fPrevRegionWidth: Float = 0.0f,
    public var fPrevRegionHeight: Float = 0.0f,
    public var fPrevBlendCoef: Float = 0.0f,
    public var dwEffectType: UInt = 0u,
    public var dwNumEffectParas: UInt = 0u,
    public var fEffectPara0: Float = 0.0f,
    public var fEffectPara1: Float = 0.0f,
    public var fEffectPara2: Float = 0.0f,
    public var fEffectPara3: Float = 0.0f,
    public var fEffectPara4: Float = 0.0f,
    public var bKeepPrevImage: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtVideoimageSample2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtVideoimageSample2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): WmtVideoimageSample2 =
                    WmtVideoimageSample2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: WmtVideoimageSample2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwControlFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwViewportWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwViewportHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCurrImageWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwCurrImageHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.fCurrRegionX0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.fCurrRegionY0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 36L, value.fCurrRegionWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 40L, value.fCurrRegionHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 44L, value.fCurrBlendCoef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwPrevImageWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwPrevImageHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.fPrevRegionX0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.fPrevRegionY0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 64L, value.fPrevRegionWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 68L, value.fPrevRegionHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 72L, value.fPrevBlendCoef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwEffectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwNumEffectParas)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 84L, value.fEffectPara0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 88L, value.fEffectPara1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 92L, value.fEffectPara2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 96L, value.fEffectPara3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 100L, value.fEffectPara4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.bKeepPrevImage)
                }
            }
    }
}

public class WmtWatermarkEntry internal constructor(
    public var wmetType: WmtWatermarkEntryType,
    public var clsid: Guid,
    public var cbDisplayName: UInt,
    pwszDisplayNameCtorArg: Pwstr,
) {
    public var pwszDisplayName: Pwstr = pwszDisplayNameCtorArg
        internal set

    public constructor() : this(
        wmetType = 0,
        clsid = Guid(),
        cbDisplayName = 0u,
        pwszDisplayNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WmtWatermarkEntryType = this.wmetType

    public operator fun component2(): Guid = this.clsid

    public operator fun component3(): UInt = this.cbDisplayName

    public operator fun component4(): Pwstr = this.pwszDisplayName

    public fun copy(wmetType: WmtWatermarkEntryType = this.wmetType, clsid: Guid = this.clsid, cbDisplayName: UInt = this.cbDisplayName, pwszDisplayName: Pwstr = this.pwszDisplayName): WmtWatermarkEntry = WmtWatermarkEntry(wmetType = wmetType, clsid = clsid, cbDisplayName = cbDisplayName, pwszDisplayNameCtorArg = pwszDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmtWatermarkEntry) return false
        if (this.wmetType != other.wmetType) return false
        if (this.clsid != other.clsid) return false
        if (this.cbDisplayName != other.cbDisplayName) return false
        if (this.pwszDisplayName != other.pwszDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wmetType.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.cbDisplayName.hashCode()
        result = 31 * result + this.pwszDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wmetType: WmtWatermarkEntryType = 0,
            clsid: Guid = Guid(),
            cbDisplayName: UInt = 0u,
            pwszDisplayName: Pwstr = MutPtr(0L),
        ): WmtWatermarkEntry =
            WmtWatermarkEntry(
                wmetType = wmetType,
                clsid = clsid,
                cbDisplayName = cbDisplayName,
                pwszDisplayNameCtorArg = pwszDisplayName,
            )
    }
}

public data class WmtWebstreamFormat(
    public var cbSize: UShort = 0u,
    public var cbSampleHeaderFixedData: UShort = 0u,
    public var wVersion: UShort = 0u,
    public var wReserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtWebstreamFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtWebstreamFormat> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WmtWebstreamFormat =
                    WmtWebstreamFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WmtWebstreamFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cbSampleHeaderFixedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wReserved)
                }
            }
    }
}

public data class WmtWebstreamSampleHeader(
    public var cbLength: UShort = 0u,
    public var wPart: UShort = 0u,
    public var cTotalParts: UShort = 0u,
    public var wSampleType: UShort = 0u,
    public var wszURL: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmtWebstreamSampleHeader) return false
        if (this.cbLength != other.cbLength) return false
        if (this.wPart != other.wPart) return false
        if (this.cTotalParts != other.cTotalParts) return false
        if (this.wSampleType != other.wSampleType) return false
        if (!this.wszURL.contentEquals(other.wszURL)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.wPart.hashCode()
        result = 31 * result + this.cTotalParts.hashCode()
        result = 31 * result + this.wSampleType.hashCode()
        result = 31 * result + this.wszURL.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtWebstreamSampleHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmtWebstreamSampleHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): WmtWebstreamSampleHeader =
                    WmtWebstreamSampleHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WmtWebstreamSampleHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cTotalParts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wSampleType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.wszURL.toList())
                }
            }
    }
}

public data class Wmvideoinfoheader(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
)

public data class Wmvideoinfoheader2(
    public var rcSource: Rect = Rect(),
    public var rcTarget: Rect = Rect(),
    public var dwBitRate: UInt = 0u,
    public var dwBitErrorRate: UInt = 0u,
    public var avgTimePerFrame: Long = 0L,
    public var dwInterlaceFlags: UInt = 0u,
    public var dwCopyProtectFlags: UInt = 0u,
    public var dwPictAspectRatioX: UInt = 0u,
    public var dwPictAspectRatioY: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
)

public data class WmAddressAccessentry(
    public var dwIPAddress: UInt = 0u,
    public var dwMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmAddressAccessentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmAddressAccessentry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WmAddressAccessentry =
                    WmAddressAccessentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WmAddressAccessentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                }
            }
    }
}

public data class WmClientProperties(
    public var dwIPAddress: UInt = 0u,
    public var dwPort: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmClientProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmClientProperties> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WmClientProperties =
                    WmClientProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WmClientProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPort)
                }
            }
    }
}

public class WmClientPropertiesEx internal constructor(
    public var cbSize: UInt,
    pwszIPAddressCtorArg: Pcwstr,
    pwszPortCtorArg: Pcwstr,
    pwszDNSNameCtorArg: Pcwstr,
) {
    public var pwszIPAddress: Pcwstr = pwszIPAddressCtorArg
        internal set

    public var pwszPort: Pcwstr = pwszPortCtorArg
        internal set

    public var pwszDNSName: Pcwstr = pwszDNSNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwszIPAddressCtorArg = ConstPtr(0L),
        pwszPortCtorArg = ConstPtr(0L),
        pwszDNSNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pwszIPAddress

    public operator fun component3(): Pcwstr = this.pwszPort

    public operator fun component4(): Pcwstr = this.pwszDNSName

    public fun copy(cbSize: UInt = this.cbSize, pwszIPAddress: Pcwstr = this.pwszIPAddress, pwszPort: Pcwstr = this.pwszPort, pwszDNSName: Pcwstr = this.pwszDNSName): WmClientPropertiesEx = WmClientPropertiesEx(cbSize = cbSize, pwszIPAddressCtorArg = pwszIPAddress, pwszPortCtorArg = pwszPort, pwszDNSNameCtorArg = pwszDNSName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmClientPropertiesEx) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwszIPAddress != other.pwszIPAddress) return false
        if (this.pwszPort != other.pwszPort) return false
        if (this.pwszDNSName != other.pwszDNSName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwszIPAddress.hashCode()
        result = 31 * result + this.pwszPort.hashCode()
        result = 31 * result + this.pwszDNSName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwszIPAddress: Pcwstr = ConstPtr(0L),
            pwszPort: Pcwstr = ConstPtr(0L),
            pwszDNSName: Pcwstr = ConstPtr(0L),
        ): WmClientPropertiesEx =
            WmClientPropertiesEx(
                cbSize = cbSize,
                pwszIPAddressCtorArg = pwszIPAddress,
                pwszPortCtorArg = pwszPort,
                pwszDNSNameCtorArg = pwszDNSName,
            )
    }
}

public data class WmLeakyBucketPair(
    public var dwBitrate: UInt = 0u,
    public var msBufferWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmLeakyBucketPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmLeakyBucketPair> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WmLeakyBucketPair =
                    WmLeakyBucketPair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WmLeakyBucketPair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBitrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.msBufferWindow)
                }
            }
    }
}

public class WmMediaType internal constructor(
    public var majortype: Guid,
    public var subtype: Guid,
    public var bFixedSizeSamples: Bool,
    public var bTemporalCompression: Bool,
    public var lSampleSize: UInt,
    public var formattype: Guid,
    pUnkCtorArg: MutPtr,
    public var cbFormat: UInt,
    pbFormatCtorArg: MutPtr,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public var pbFormat: MutPtr = pbFormatCtorArg
        internal set

    public constructor() : this(
        majortype = Guid(),
        subtype = Guid(),
        bFixedSizeSamples = 0,
        bTemporalCompression = 0,
        lSampleSize = 0u,
        formattype = Guid(),
        pUnkCtorArg = MutPtr(0L),
        cbFormat = 0u,
        pbFormatCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.majortype

    public operator fun component2(): Guid = this.subtype

    public operator fun component3(): Bool = this.bFixedSizeSamples

    public operator fun component4(): Bool = this.bTemporalCompression

    public operator fun component5(): UInt = this.lSampleSize

    public operator fun component6(): Guid = this.formattype

    public operator fun component7(): MutPtr = this.pUnk

    public operator fun component8(): UInt = this.cbFormat

    public operator fun component9(): MutPtr = this.pbFormat

    public fun copy(majortype: Guid = this.majortype, subtype: Guid = this.subtype, bFixedSizeSamples: Bool = this.bFixedSizeSamples, bTemporalCompression: Bool = this.bTemporalCompression, lSampleSize: UInt = this.lSampleSize, formattype: Guid = this.formattype, pUnk: MutPtr = this.pUnk, cbFormat: UInt = this.cbFormat, pbFormat: MutPtr = this.pbFormat): WmMediaType = WmMediaType(majortype = majortype, subtype = subtype, bFixedSizeSamples = bFixedSizeSamples, bTemporalCompression = bTemporalCompression, lSampleSize = lSampleSize, formattype = formattype, pUnkCtorArg = pUnk, cbFormat = cbFormat, pbFormatCtorArg = pbFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmMediaType) return false
        if (this.majortype != other.majortype) return false
        if (this.subtype != other.subtype) return false
        if (this.bFixedSizeSamples != other.bFixedSizeSamples) return false
        if (this.bTemporalCompression != other.bTemporalCompression) return false
        if (this.lSampleSize != other.lSampleSize) return false
        if (this.formattype != other.formattype) return false
        if (this.pUnk != other.pUnk) return false
        if (this.cbFormat != other.cbFormat) return false
        if (this.pbFormat != other.pbFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majortype.hashCode()
        result = 31 * result + this.subtype.hashCode()
        result = 31 * result + this.bFixedSizeSamples.hashCode()
        result = 31 * result + this.bTemporalCompression.hashCode()
        result = 31 * result + this.lSampleSize.hashCode()
        result = 31 * result + this.formattype.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        result = 31 * result + this.cbFormat.hashCode()
        result = 31 * result + this.pbFormat.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            majortype: Guid = Guid(),
            subtype: Guid = Guid(),
            bFixedSizeSamples: Bool = 0,
            bTemporalCompression: Bool = 0,
            lSampleSize: UInt = 0u,
            formattype: Guid = Guid(),
            pUnk: MutPtr = MutPtr(0L),
            cbFormat: UInt = 0u,
            pbFormat: MutPtr = MutPtr(0L),
        ): WmMediaType =
            WmMediaType(
                majortype = majortype,
                subtype = subtype,
                bFixedSizeSamples = bFixedSizeSamples,
                bTemporalCompression = bTemporalCompression,
                lSampleSize = lSampleSize,
                formattype = formattype,
                pUnkCtorArg = pUnk,
                cbFormat = cbFormat,
                pbFormatCtorArg = pbFormat,
            )
    }
}

public class WmPicture internal constructor(
    pwszMIMETypeCtorArg: Pwstr,
    public var bPictureType: UByte,
    pwszDescriptionCtorArg: Pwstr,
    public var dwDataLen: UInt,
    pbDataCtorArg: MutPtr,
) {
    public var pwszMIMEType: Pwstr = pwszMIMETypeCtorArg
        internal set

    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        pwszMIMETypeCtorArg = MutPtr(0L),
        bPictureType = 0u,
        pwszDescriptionCtorArg = MutPtr(0L),
        dwDataLen = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszMIMEType

    public operator fun component2(): UByte = this.bPictureType

    public operator fun component3(): Pwstr = this.pwszDescription

    public operator fun component4(): UInt = this.dwDataLen

    public operator fun component5(): MutPtr = this.pbData

    public fun copy(pwszMIMEType: Pwstr = this.pwszMIMEType, bPictureType: UByte = this.bPictureType, pwszDescription: Pwstr = this.pwszDescription, dwDataLen: UInt = this.dwDataLen, pbData: MutPtr = this.pbData): WmPicture = WmPicture(pwszMIMETypeCtorArg = pwszMIMEType, bPictureType = bPictureType, pwszDescriptionCtorArg = pwszDescription, dwDataLen = dwDataLen, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmPicture) return false
        if (this.pwszMIMEType != other.pwszMIMEType) return false
        if (this.bPictureType != other.bPictureType) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.dwDataLen != other.dwDataLen) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszMIMEType.hashCode()
        result = 31 * result + this.bPictureType.hashCode()
        result = 31 * result + this.pwszDescription.hashCode()
        result = 31 * result + this.dwDataLen.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszMIMEType: Pwstr = MutPtr(0L),
            bPictureType: UByte = 0u,
            pwszDescription: Pwstr = MutPtr(0L),
            dwDataLen: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
        ): WmPicture =
            WmPicture(
                pwszMIMETypeCtorArg = pwszMIMEType,
                bPictureType = bPictureType,
                pwszDescriptionCtorArg = pwszDescription,
                dwDataLen = dwDataLen,
                pbDataCtorArg = pbData,
            )
    }
}

public data class WmPortNumberRange(
    public var wPortBegin: UShort = 0u,
    public var wPortEnd: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmPortNumberRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmPortNumberRange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WmPortNumberRange =
                    WmPortNumberRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WmPortNumberRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wPortBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPortEnd)
                }
            }
    }
}

public class WmReaderClientinfo internal constructor(
    public var cbSize: UInt,
    wszLangCtorArg: Pwstr,
    wszBrowserUserAgentCtorArg: Pwstr,
    wszBrowserWebPageCtorArg: Pwstr,
    public var qwReserved: ULong,
    pReservedCtorArg: MutPtr,
    wszHostExeCtorArg: Pwstr,
    public var qwHostVersion: ULong,
    wszPlayerUserAgentCtorArg: Pwstr,
) {
    public var wszLang: Pwstr = wszLangCtorArg
        internal set

    public var wszBrowserUserAgent: Pwstr = wszBrowserUserAgentCtorArg
        internal set

    public var wszBrowserWebPage: Pwstr = wszBrowserWebPageCtorArg
        internal set

    public var pReserved: MutPtr = pReservedCtorArg
        internal set

    public var wszHostExe: Pwstr = wszHostExeCtorArg
        internal set

    public var wszPlayerUserAgent: Pwstr = wszPlayerUserAgentCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszLangCtorArg = MutPtr(0L),
        wszBrowserUserAgentCtorArg = MutPtr(0L),
        wszBrowserWebPageCtorArg = MutPtr(0L),
        qwReserved = 0uL,
        pReservedCtorArg = MutPtr(0L),
        wszHostExeCtorArg = MutPtr(0L),
        qwHostVersion = 0uL,
        wszPlayerUserAgentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.wszLang

    public operator fun component3(): Pwstr = this.wszBrowserUserAgent

    public operator fun component4(): Pwstr = this.wszBrowserWebPage

    public operator fun component5(): ULong = this.qwReserved

    public operator fun component6(): MutPtr = this.pReserved

    public operator fun component7(): Pwstr = this.wszHostExe

    public operator fun component8(): ULong = this.qwHostVersion

    public operator fun component9(): Pwstr = this.wszPlayerUserAgent

    public fun copy(cbSize: UInt = this.cbSize, wszLang: Pwstr = this.wszLang, wszBrowserUserAgent: Pwstr = this.wszBrowserUserAgent, wszBrowserWebPage: Pwstr = this.wszBrowserWebPage, qwReserved: ULong = this.qwReserved, pReserved: MutPtr = this.pReserved, wszHostExe: Pwstr = this.wszHostExe, qwHostVersion: ULong = this.qwHostVersion, wszPlayerUserAgent: Pwstr = this.wszPlayerUserAgent): WmReaderClientinfo = WmReaderClientinfo(cbSize = cbSize, wszLangCtorArg = wszLang, wszBrowserUserAgentCtorArg = wszBrowserUserAgent, wszBrowserWebPageCtorArg = wszBrowserWebPage, qwReserved = qwReserved, pReservedCtorArg = pReserved, wszHostExeCtorArg = wszHostExe, qwHostVersion = qwHostVersion, wszPlayerUserAgentCtorArg = wszPlayerUserAgent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmReaderClientinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszLang != other.wszLang) return false
        if (this.wszBrowserUserAgent != other.wszBrowserUserAgent) return false
        if (this.wszBrowserWebPage != other.wszBrowserWebPage) return false
        if (this.qwReserved != other.qwReserved) return false
        if (this.pReserved != other.pReserved) return false
        if (this.wszHostExe != other.wszHostExe) return false
        if (this.qwHostVersion != other.qwHostVersion) return false
        if (this.wszPlayerUserAgent != other.wszPlayerUserAgent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszLang.hashCode()
        result = 31 * result + this.wszBrowserUserAgent.hashCode()
        result = 31 * result + this.wszBrowserWebPage.hashCode()
        result = 31 * result + this.qwReserved.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        result = 31 * result + this.wszHostExe.hashCode()
        result = 31 * result + this.qwHostVersion.hashCode()
        result = 31 * result + this.wszPlayerUserAgent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszLang: Pwstr = MutPtr(0L),
            wszBrowserUserAgent: Pwstr = MutPtr(0L),
            wszBrowserWebPage: Pwstr = MutPtr(0L),
            qwReserved: ULong = 0uL,
            pReserved: MutPtr = MutPtr(0L),
            wszHostExe: Pwstr = MutPtr(0L),
            qwHostVersion: ULong = 0uL,
            wszPlayerUserAgent: Pwstr = MutPtr(0L),
        ): WmReaderClientinfo =
            WmReaderClientinfo(
                cbSize = cbSize,
                wszLangCtorArg = wszLang,
                wszBrowserUserAgentCtorArg = wszBrowserUserAgent,
                wszBrowserWebPageCtorArg = wszBrowserWebPage,
                qwReserved = qwReserved,
                pReservedCtorArg = pReserved,
                wszHostExeCtorArg = wszHostExe,
                qwHostVersion = qwHostVersion,
                wszPlayerUserAgentCtorArg = wszPlayerUserAgent,
            )
    }
}

public data class WmReaderStatistics(
    public var cbSize: UInt = 0u,
    public var dwBandwidth: UInt = 0u,
    public var cPacketsReceived: UInt = 0u,
    public var cPacketsRecovered: UInt = 0u,
    public var cPacketsLost: UInt = 0u,
    public var wQuality: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmReaderStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmReaderStatistics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WmReaderStatistics =
                    WmReaderStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WmReaderStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cPacketsRecovered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cPacketsLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.wQuality)
                }
            }
    }
}

public data class WmStreamPriorityRecord(
    public var wStreamNumber: UShort = 0u,
    public var fMandatory: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmStreamPriorityRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmStreamPriorityRecord> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): WmStreamPriorityRecord =
                    WmStreamPriorityRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WmStreamPriorityRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wStreamNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 2L, value.fMandatory)
                }
            }
    }
}

public data class WmStreamTypeInfo(
    public var guidMajorType: Guid = Guid(),
    public var cbFormat: UInt = 0u,
)

public class WmSynchronisedLyrics internal constructor(
    public var bTimeStampFormat: UByte,
    public var bContentType: UByte,
    pwszContentDescriptorCtorArg: Pwstr,
    public var dwLyricsLen: UInt,
    pbLyricsCtorArg: MutPtr,
) {
    public var pwszContentDescriptor: Pwstr = pwszContentDescriptorCtorArg
        internal set

    public var pbLyrics: MutPtr = pbLyricsCtorArg
        internal set

    public constructor() : this(
        bTimeStampFormat = 0u,
        bContentType = 0u,
        pwszContentDescriptorCtorArg = MutPtr(0L),
        dwLyricsLen = 0u,
        pbLyricsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.bTimeStampFormat

    public operator fun component2(): UByte = this.bContentType

    public operator fun component3(): Pwstr = this.pwszContentDescriptor

    public operator fun component4(): UInt = this.dwLyricsLen

    public operator fun component5(): MutPtr = this.pbLyrics

    public fun copy(bTimeStampFormat: UByte = this.bTimeStampFormat, bContentType: UByte = this.bContentType, pwszContentDescriptor: Pwstr = this.pwszContentDescriptor, dwLyricsLen: UInt = this.dwLyricsLen, pbLyrics: MutPtr = this.pbLyrics): WmSynchronisedLyrics = WmSynchronisedLyrics(bTimeStampFormat = bTimeStampFormat, bContentType = bContentType, pwszContentDescriptorCtorArg = pwszContentDescriptor, dwLyricsLen = dwLyricsLen, pbLyricsCtorArg = pbLyrics)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmSynchronisedLyrics) return false
        if (this.bTimeStampFormat != other.bTimeStampFormat) return false
        if (this.bContentType != other.bContentType) return false
        if (this.pwszContentDescriptor != other.pwszContentDescriptor) return false
        if (this.dwLyricsLen != other.dwLyricsLen) return false
        if (this.pbLyrics != other.pbLyrics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bTimeStampFormat.hashCode()
        result = 31 * result + this.bContentType.hashCode()
        result = 31 * result + this.pwszContentDescriptor.hashCode()
        result = 31 * result + this.dwLyricsLen.hashCode()
        result = 31 * result + this.pbLyrics.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bTimeStampFormat: UByte = 0u,
            bContentType: UByte = 0u,
            pwszContentDescriptor: Pwstr = MutPtr(0L),
            dwLyricsLen: UInt = 0u,
            pbLyrics: MutPtr = MutPtr(0L),
        ): WmSynchronisedLyrics =
            WmSynchronisedLyrics(
                bTimeStampFormat = bTimeStampFormat,
                bContentType = bContentType,
                pwszContentDescriptorCtorArg = pwszContentDescriptor,
                dwLyricsLen = dwLyricsLen,
                pbLyricsCtorArg = pbLyrics,
            )
    }
}

public class WmUserText internal constructor(
    pwszDescriptionCtorArg: Pwstr,
    pwszTextCtorArg: Pwstr,
) {
    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public var pwszText: Pwstr = pwszTextCtorArg
        internal set

    public constructor() : this(
        pwszDescriptionCtorArg = MutPtr(0L),
        pwszTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszDescription

    public operator fun component2(): Pwstr = this.pwszText

    public fun copy(pwszDescription: Pwstr = this.pwszDescription, pwszText: Pwstr = this.pwszText): WmUserText = WmUserText(pwszDescriptionCtorArg = pwszDescription, pwszTextCtorArg = pwszText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmUserText) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.pwszText != other.pwszText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDescription.hashCode()
        result = 31 * result + this.pwszText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDescription: Pwstr = MutPtr(0L),
            pwszText: Pwstr = MutPtr(0L),
        ): WmUserText =
            WmUserText(
                pwszDescriptionCtorArg = pwszDescription,
                pwszTextCtorArg = pwszText,
            )
    }
}

public class WmUserWebUrl internal constructor(
    pwszDescriptionCtorArg: Pwstr,
    pwszURLCtorArg: Pwstr,
) {
    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public var pwszURL: Pwstr = pwszURLCtorArg
        internal set

    public constructor() : this(
        pwszDescriptionCtorArg = MutPtr(0L),
        pwszURLCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszDescription

    public operator fun component2(): Pwstr = this.pwszURL

    public fun copy(pwszDescription: Pwstr = this.pwszDescription, pwszURL: Pwstr = this.pwszURL): WmUserWebUrl = WmUserWebUrl(pwszDescriptionCtorArg = pwszDescription, pwszURLCtorArg = pwszURL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WmUserWebUrl) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.pwszURL != other.pwszURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDescription.hashCode()
        result = 31 * result + this.pwszURL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDescription: Pwstr = MutPtr(0L),
            pwszURL: Pwstr = MutPtr(0L),
        ): WmUserWebUrl =
            WmUserWebUrl(
                pwszDescriptionCtorArg = pwszDescription,
                pwszURLCtorArg = pwszURL,
            )
    }
}

public data class WmWriterStatistics(
    public var qwSampleCount: ULong = 0uL,
    public var qwByteCount: ULong = 0uL,
    public var qwDroppedSampleCount: ULong = 0uL,
    public var qwDroppedByteCount: ULong = 0uL,
    public var dwCurrentBitrate: UInt = 0u,
    public var dwAverageBitrate: UInt = 0u,
    public var dwExpectedBitrate: UInt = 0u,
    public var dwCurrentSampleRate: UInt = 0u,
    public var dwAverageSampleRate: UInt = 0u,
    public var dwExpectedSampleRate: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmWriterStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmWriterStatistics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): WmWriterStatistics =
                    WmWriterStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: WmWriterStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.qwSampleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.qwByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.qwDroppedSampleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.qwDroppedByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwCurrentBitrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwAverageBitrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwExpectedBitrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwCurrentSampleRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwAverageSampleRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwExpectedSampleRate)
                }
            }
    }
}

public data class WmWriterStatisticsEx(
    public var dwBitratePlusOverhead: UInt = 0u,
    public var dwCurrentSampleDropRateInQueue: UInt = 0u,
    public var dwCurrentSampleDropRateInCodec: UInt = 0u,
    public var dwCurrentSampleDropRateInMultiplexer: UInt = 0u,
    public var dwTotalSampleDropsInQueue: UInt = 0u,
    public var dwTotalSampleDropsInCodec: UInt = 0u,
    public var dwTotalSampleDropsInMultiplexer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmWriterStatisticsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmWriterStatisticsEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): WmWriterStatisticsEx =
                    WmWriterStatisticsEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WmWriterStatisticsEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBitratePlusOverhead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCurrentSampleDropRateInQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCurrentSampleDropRateInCodec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCurrentSampleDropRateInMultiplexer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTotalSampleDropsInQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwTotalSampleDropsInCodec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTotalSampleDropsInMultiplexer)
                }
            }
    }
}
