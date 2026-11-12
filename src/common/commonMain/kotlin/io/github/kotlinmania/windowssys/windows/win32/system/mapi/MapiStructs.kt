package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class MapiFileDesc internal constructor(
    public var ulReserved: UInt,
    public var flFlags: UInt,
    public var nPosition: UInt,
    lpszPathNameCtorArg: Pstr,
    lpszFileNameCtorArg: Pstr,
    lpFileTypeCtorArg: MutPtr<CVoid>,
) {
    public var lpszPathName: Pstr = lpszPathNameCtorArg
        internal set

    public var lpszFileName: Pstr = lpszFileNameCtorArg
        internal set

    public var lpFileType: MutPtr<CVoid> = lpFileTypeCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        flFlags = 0u,
        nPosition = 0u,
        lpszPathNameCtorArg = MutPtr(0L),
        lpszFileNameCtorArg = MutPtr(0L),
        lpFileTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): UInt = this.flFlags

    public operator fun component3(): UInt = this.nPosition

    public operator fun component4(): Pstr = this.lpszPathName

    public operator fun component5(): Pstr = this.lpszFileName

    public operator fun component6(): MutPtr<CVoid> = this.lpFileType

    public fun copy(ulReserved: UInt = this.ulReserved, flFlags: UInt = this.flFlags, nPosition: UInt = this.nPosition, lpszPathName: Pstr = this.lpszPathName, lpszFileName: Pstr = this.lpszFileName, lpFileType: MutPtr<CVoid> = this.lpFileType): MapiFileDesc = MapiFileDesc(ulReserved = ulReserved, flFlags = flFlags, nPosition = nPosition, lpszPathNameCtorArg = lpszPathName, lpszFileNameCtorArg = lpszFileName, lpFileTypeCtorArg = lpFileType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiFileDesc) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.flFlags != other.flFlags) return false
        if (this.nPosition != other.nPosition) return false
        if (this.lpszPathName != other.lpszPathName) return false
        if (this.lpszFileName != other.lpszFileName) return false
        if (this.lpFileType != other.lpFileType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.flFlags.hashCode()
        result = 31 * result + this.nPosition.hashCode()
        result = 31 * result + this.lpszPathName.hashCode()
        result = 31 * result + this.lpszFileName.hashCode()
        result = 31 * result + this.lpFileType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            flFlags: UInt = 0u,
            nPosition: UInt = 0u,
            lpszPathName: Pstr = MutPtr(0L),
            lpszFileName: Pstr = MutPtr(0L),
            lpFileType: MutPtr<CVoid> = MutPtr(0L),
        ): MapiFileDesc =
            MapiFileDesc(
                ulReserved = ulReserved,
                flFlags = flFlags,
                nPosition = nPosition,
                lpszPathNameCtorArg = lpszPathName,
                lpszFileNameCtorArg = lpszFileName,
                lpFileTypeCtorArg = lpFileType,
            )
    }
}

public class MapiFileDescW internal constructor(
    public var ulReserved: UInt,
    public var flFlags: UInt,
    public var nPosition: UInt,
    lpszPathNameCtorArg: Pwstr,
    lpszFileNameCtorArg: Pwstr,
    lpFileTypeCtorArg: MutPtr<CVoid>,
) {
    public var lpszPathName: Pwstr = lpszPathNameCtorArg
        internal set

    public var lpszFileName: Pwstr = lpszFileNameCtorArg
        internal set

    public var lpFileType: MutPtr<CVoid> = lpFileTypeCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        flFlags = 0u,
        nPosition = 0u,
        lpszPathNameCtorArg = MutPtr(0L),
        lpszFileNameCtorArg = MutPtr(0L),
        lpFileTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): UInt = this.flFlags

    public operator fun component3(): UInt = this.nPosition

    public operator fun component4(): Pwstr = this.lpszPathName

    public operator fun component5(): Pwstr = this.lpszFileName

    public operator fun component6(): MutPtr<CVoid> = this.lpFileType

    public fun copy(ulReserved: UInt = this.ulReserved, flFlags: UInt = this.flFlags, nPosition: UInt = this.nPosition, lpszPathName: Pwstr = this.lpszPathName, lpszFileName: Pwstr = this.lpszFileName, lpFileType: MutPtr<CVoid> = this.lpFileType): MapiFileDescW = MapiFileDescW(ulReserved = ulReserved, flFlags = flFlags, nPosition = nPosition, lpszPathNameCtorArg = lpszPathName, lpszFileNameCtorArg = lpszFileName, lpFileTypeCtorArg = lpFileType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiFileDescW) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.flFlags != other.flFlags) return false
        if (this.nPosition != other.nPosition) return false
        if (this.lpszPathName != other.lpszPathName) return false
        if (this.lpszFileName != other.lpszFileName) return false
        if (this.lpFileType != other.lpFileType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.flFlags.hashCode()
        result = 31 * result + this.nPosition.hashCode()
        result = 31 * result + this.lpszPathName.hashCode()
        result = 31 * result + this.lpszFileName.hashCode()
        result = 31 * result + this.lpFileType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            flFlags: UInt = 0u,
            nPosition: UInt = 0u,
            lpszPathName: Pwstr = MutPtr(0L),
            lpszFileName: Pwstr = MutPtr(0L),
            lpFileType: MutPtr<CVoid> = MutPtr(0L),
        ): MapiFileDescW =
            MapiFileDescW(
                ulReserved = ulReserved,
                flFlags = flFlags,
                nPosition = nPosition,
                lpszPathNameCtorArg = lpszPathName,
                lpszFileNameCtorArg = lpszFileName,
                lpFileTypeCtorArg = lpFileType,
            )
    }
}

public class MapiFileTagExt internal constructor(
    public var ulReserved: UInt,
    public var cbTag: UInt,
    lpTagCtorArg: MutPtr<UByte>,
    public var cbEncoding: UInt,
    lpEncodingCtorArg: MutPtr<UByte>,
) {
    public var lpTag: MutPtr<UByte> = lpTagCtorArg
        internal set

    public var lpEncoding: MutPtr<UByte> = lpEncodingCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        cbTag = 0u,
        lpTagCtorArg = MutPtr(0L),
        cbEncoding = 0u,
        lpEncodingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): UInt = this.cbTag

    public operator fun component3(): MutPtr<UByte> = this.lpTag

    public operator fun component4(): UInt = this.cbEncoding

    public operator fun component5(): MutPtr<UByte> = this.lpEncoding

    public fun copy(ulReserved: UInt = this.ulReserved, cbTag: UInt = this.cbTag, lpTag: MutPtr<UByte> = this.lpTag, cbEncoding: UInt = this.cbEncoding, lpEncoding: MutPtr<UByte> = this.lpEncoding): MapiFileTagExt = MapiFileTagExt(ulReserved = ulReserved, cbTag = cbTag, lpTagCtorArg = lpTag, cbEncoding = cbEncoding, lpEncodingCtorArg = lpEncoding)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiFileTagExt) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.cbTag != other.cbTag) return false
        if (this.lpTag != other.lpTag) return false
        if (this.cbEncoding != other.cbEncoding) return false
        if (this.lpEncoding != other.lpEncoding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.cbTag.hashCode()
        result = 31 * result + this.lpTag.hashCode()
        result = 31 * result + this.cbEncoding.hashCode()
        result = 31 * result + this.lpEncoding.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MapiFileTagExt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MapiFileTagExt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MapiFileTagExt =
                    MapiFileTagExt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MapiFileTagExt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.lpTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbEncoding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.lpEncoding)
                }
            }

        public operator fun invoke(
            ulReserved: UInt = 0u,
            cbTag: UInt = 0u,
            lpTag: MutPtr<UByte> = MutPtr(0L),
            cbEncoding: UInt = 0u,
            lpEncoding: MutPtr<UByte> = MutPtr(0L),
        ): MapiFileTagExt =
            MapiFileTagExt(
                ulReserved = ulReserved,
                cbTag = cbTag,
                lpTagCtorArg = lpTag,
                cbEncoding = cbEncoding,
                lpEncodingCtorArg = lpEncoding,
            )
    }
}

public class MapiMessage internal constructor(
    public var ulReserved: UInt,
    lpszSubjectCtorArg: Pstr,
    lpszNoteTextCtorArg: Pstr,
    lpszMessageTypeCtorArg: Pstr,
    lpszDateReceivedCtorArg: Pstr,
    lpszConversationIDCtorArg: Pstr,
    public var flFlags: UInt,
    lpOriginatorCtorArg: MutPtr<MapiRecipDesc>,
    public var nRecipCount: UInt,
    lpRecipsCtorArg: MutPtr<MapiRecipDesc>,
    public var nFileCount: UInt,
    lpFilesCtorArg: MutPtr<MapiFileDesc>,
) {
    public var lpszSubject: Pstr = lpszSubjectCtorArg
        internal set

    public var lpszNoteText: Pstr = lpszNoteTextCtorArg
        internal set

    public var lpszMessageType: Pstr = lpszMessageTypeCtorArg
        internal set

    public var lpszDateReceived: Pstr = lpszDateReceivedCtorArg
        internal set

    public var lpszConversationID: Pstr = lpszConversationIDCtorArg
        internal set

    public var lpOriginator: MutPtr<MapiRecipDesc> = lpOriginatorCtorArg
        internal set

    public var lpRecips: MutPtr<MapiRecipDesc> = lpRecipsCtorArg
        internal set

    public var lpFiles: MutPtr<MapiFileDesc> = lpFilesCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        lpszSubjectCtorArg = MutPtr(0L),
        lpszNoteTextCtorArg = MutPtr(0L),
        lpszMessageTypeCtorArg = MutPtr(0L),
        lpszDateReceivedCtorArg = MutPtr(0L),
        lpszConversationIDCtorArg = MutPtr(0L),
        flFlags = 0u,
        lpOriginatorCtorArg = MutPtr(0L),
        nRecipCount = 0u,
        lpRecipsCtorArg = MutPtr(0L),
        nFileCount = 0u,
        lpFilesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): Pstr = this.lpszSubject

    public operator fun component3(): Pstr = this.lpszNoteText

    public operator fun component4(): Pstr = this.lpszMessageType

    public operator fun component5(): Pstr = this.lpszDateReceived

    public operator fun component6(): Pstr = this.lpszConversationID

    public operator fun component7(): UInt = this.flFlags

    public operator fun component8(): MutPtr<MapiRecipDesc> = this.lpOriginator

    public operator fun component9(): UInt = this.nRecipCount

    public operator fun component10(): MutPtr<MapiRecipDesc> = this.lpRecips

    public operator fun component11(): UInt = this.nFileCount

    public operator fun component12(): MutPtr<MapiFileDesc> = this.lpFiles

    public fun copy(ulReserved: UInt = this.ulReserved, lpszSubject: Pstr = this.lpszSubject, lpszNoteText: Pstr = this.lpszNoteText, lpszMessageType: Pstr = this.lpszMessageType, lpszDateReceived: Pstr = this.lpszDateReceived, lpszConversationID: Pstr = this.lpszConversationID, flFlags: UInt = this.flFlags, lpOriginator: MutPtr<MapiRecipDesc> = this.lpOriginator, nRecipCount: UInt = this.nRecipCount, lpRecips: MutPtr<MapiRecipDesc> = this.lpRecips, nFileCount: UInt = this.nFileCount, lpFiles: MutPtr<MapiFileDesc> = this.lpFiles): MapiMessage = MapiMessage(ulReserved = ulReserved, lpszSubjectCtorArg = lpszSubject, lpszNoteTextCtorArg = lpszNoteText, lpszMessageTypeCtorArg = lpszMessageType, lpszDateReceivedCtorArg = lpszDateReceived, lpszConversationIDCtorArg = lpszConversationID, flFlags = flFlags, lpOriginatorCtorArg = lpOriginator, nRecipCount = nRecipCount, lpRecipsCtorArg = lpRecips, nFileCount = nFileCount, lpFilesCtorArg = lpFiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiMessage) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.lpszSubject != other.lpszSubject) return false
        if (this.lpszNoteText != other.lpszNoteText) return false
        if (this.lpszMessageType != other.lpszMessageType) return false
        if (this.lpszDateReceived != other.lpszDateReceived) return false
        if (this.lpszConversationID != other.lpszConversationID) return false
        if (this.flFlags != other.flFlags) return false
        if (this.lpOriginator != other.lpOriginator) return false
        if (this.nRecipCount != other.nRecipCount) return false
        if (this.lpRecips != other.lpRecips) return false
        if (this.nFileCount != other.nFileCount) return false
        if (this.lpFiles != other.lpFiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.lpszSubject.hashCode()
        result = 31 * result + this.lpszNoteText.hashCode()
        result = 31 * result + this.lpszMessageType.hashCode()
        result = 31 * result + this.lpszDateReceived.hashCode()
        result = 31 * result + this.lpszConversationID.hashCode()
        result = 31 * result + this.flFlags.hashCode()
        result = 31 * result + this.lpOriginator.hashCode()
        result = 31 * result + this.nRecipCount.hashCode()
        result = 31 * result + this.lpRecips.hashCode()
        result = 31 * result + this.nFileCount.hashCode()
        result = 31 * result + this.lpFiles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            lpszSubject: Pstr = MutPtr(0L),
            lpszNoteText: Pstr = MutPtr(0L),
            lpszMessageType: Pstr = MutPtr(0L),
            lpszDateReceived: Pstr = MutPtr(0L),
            lpszConversationID: Pstr = MutPtr(0L),
            flFlags: UInt = 0u,
            lpOriginator: MutPtr<MapiRecipDesc> = MutPtr(0L),
            nRecipCount: UInt = 0u,
            lpRecips: MutPtr<MapiRecipDesc> = MutPtr(0L),
            nFileCount: UInt = 0u,
            lpFiles: MutPtr<MapiFileDesc> = MutPtr(0L),
        ): MapiMessage =
            MapiMessage(
                ulReserved = ulReserved,
                lpszSubjectCtorArg = lpszSubject,
                lpszNoteTextCtorArg = lpszNoteText,
                lpszMessageTypeCtorArg = lpszMessageType,
                lpszDateReceivedCtorArg = lpszDateReceived,
                lpszConversationIDCtorArg = lpszConversationID,
                flFlags = flFlags,
                lpOriginatorCtorArg = lpOriginator,
                nRecipCount = nRecipCount,
                lpRecipsCtorArg = lpRecips,
                nFileCount = nFileCount,
                lpFilesCtorArg = lpFiles,
            )
    }
}

public class MapiMessageW internal constructor(
    public var ulReserved: UInt,
    lpszSubjectCtorArg: Pwstr,
    lpszNoteTextCtorArg: Pwstr,
    lpszMessageTypeCtorArg: Pwstr,
    lpszDateReceivedCtorArg: Pwstr,
    lpszConversationIDCtorArg: Pwstr,
    public var flFlags: UInt,
    lpOriginatorCtorArg: MutPtr<MapiRecipDescW>,
    public var nRecipCount: UInt,
    lpRecipsCtorArg: MutPtr<MapiRecipDescW>,
    public var nFileCount: UInt,
    lpFilesCtorArg: MutPtr<MapiFileDescW>,
) {
    public var lpszSubject: Pwstr = lpszSubjectCtorArg
        internal set

    public var lpszNoteText: Pwstr = lpszNoteTextCtorArg
        internal set

    public var lpszMessageType: Pwstr = lpszMessageTypeCtorArg
        internal set

    public var lpszDateReceived: Pwstr = lpszDateReceivedCtorArg
        internal set

    public var lpszConversationID: Pwstr = lpszConversationIDCtorArg
        internal set

    public var lpOriginator: MutPtr<MapiRecipDescW> = lpOriginatorCtorArg
        internal set

    public var lpRecips: MutPtr<MapiRecipDescW> = lpRecipsCtorArg
        internal set

    public var lpFiles: MutPtr<MapiFileDescW> = lpFilesCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        lpszSubjectCtorArg = MutPtr(0L),
        lpszNoteTextCtorArg = MutPtr(0L),
        lpszMessageTypeCtorArg = MutPtr(0L),
        lpszDateReceivedCtorArg = MutPtr(0L),
        lpszConversationIDCtorArg = MutPtr(0L),
        flFlags = 0u,
        lpOriginatorCtorArg = MutPtr(0L),
        nRecipCount = 0u,
        lpRecipsCtorArg = MutPtr(0L),
        nFileCount = 0u,
        lpFilesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): Pwstr = this.lpszSubject

    public operator fun component3(): Pwstr = this.lpszNoteText

    public operator fun component4(): Pwstr = this.lpszMessageType

    public operator fun component5(): Pwstr = this.lpszDateReceived

    public operator fun component6(): Pwstr = this.lpszConversationID

    public operator fun component7(): UInt = this.flFlags

    public operator fun component8(): MutPtr<MapiRecipDescW> = this.lpOriginator

    public operator fun component9(): UInt = this.nRecipCount

    public operator fun component10(): MutPtr<MapiRecipDescW> = this.lpRecips

    public operator fun component11(): UInt = this.nFileCount

    public operator fun component12(): MutPtr<MapiFileDescW> = this.lpFiles

    public fun copy(ulReserved: UInt = this.ulReserved, lpszSubject: Pwstr = this.lpszSubject, lpszNoteText: Pwstr = this.lpszNoteText, lpszMessageType: Pwstr = this.lpszMessageType, lpszDateReceived: Pwstr = this.lpszDateReceived, lpszConversationID: Pwstr = this.lpszConversationID, flFlags: UInt = this.flFlags, lpOriginator: MutPtr<MapiRecipDescW> = this.lpOriginator, nRecipCount: UInt = this.nRecipCount, lpRecips: MutPtr<MapiRecipDescW> = this.lpRecips, nFileCount: UInt = this.nFileCount, lpFiles: MutPtr<MapiFileDescW> = this.lpFiles): MapiMessageW = MapiMessageW(ulReserved = ulReserved, lpszSubjectCtorArg = lpszSubject, lpszNoteTextCtorArg = lpszNoteText, lpszMessageTypeCtorArg = lpszMessageType, lpszDateReceivedCtorArg = lpszDateReceived, lpszConversationIDCtorArg = lpszConversationID, flFlags = flFlags, lpOriginatorCtorArg = lpOriginator, nRecipCount = nRecipCount, lpRecipsCtorArg = lpRecips, nFileCount = nFileCount, lpFilesCtorArg = lpFiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiMessageW) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.lpszSubject != other.lpszSubject) return false
        if (this.lpszNoteText != other.lpszNoteText) return false
        if (this.lpszMessageType != other.lpszMessageType) return false
        if (this.lpszDateReceived != other.lpszDateReceived) return false
        if (this.lpszConversationID != other.lpszConversationID) return false
        if (this.flFlags != other.flFlags) return false
        if (this.lpOriginator != other.lpOriginator) return false
        if (this.nRecipCount != other.nRecipCount) return false
        if (this.lpRecips != other.lpRecips) return false
        if (this.nFileCount != other.nFileCount) return false
        if (this.lpFiles != other.lpFiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.lpszSubject.hashCode()
        result = 31 * result + this.lpszNoteText.hashCode()
        result = 31 * result + this.lpszMessageType.hashCode()
        result = 31 * result + this.lpszDateReceived.hashCode()
        result = 31 * result + this.lpszConversationID.hashCode()
        result = 31 * result + this.flFlags.hashCode()
        result = 31 * result + this.lpOriginator.hashCode()
        result = 31 * result + this.nRecipCount.hashCode()
        result = 31 * result + this.lpRecips.hashCode()
        result = 31 * result + this.nFileCount.hashCode()
        result = 31 * result + this.lpFiles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            lpszSubject: Pwstr = MutPtr(0L),
            lpszNoteText: Pwstr = MutPtr(0L),
            lpszMessageType: Pwstr = MutPtr(0L),
            lpszDateReceived: Pwstr = MutPtr(0L),
            lpszConversationID: Pwstr = MutPtr(0L),
            flFlags: UInt = 0u,
            lpOriginator: MutPtr<MapiRecipDescW> = MutPtr(0L),
            nRecipCount: UInt = 0u,
            lpRecips: MutPtr<MapiRecipDescW> = MutPtr(0L),
            nFileCount: UInt = 0u,
            lpFiles: MutPtr<MapiFileDescW> = MutPtr(0L),
        ): MapiMessageW =
            MapiMessageW(
                ulReserved = ulReserved,
                lpszSubjectCtorArg = lpszSubject,
                lpszNoteTextCtorArg = lpszNoteText,
                lpszMessageTypeCtorArg = lpszMessageType,
                lpszDateReceivedCtorArg = lpszDateReceived,
                lpszConversationIDCtorArg = lpszConversationID,
                flFlags = flFlags,
                lpOriginatorCtorArg = lpOriginator,
                nRecipCount = nRecipCount,
                lpRecipsCtorArg = lpRecips,
                nFileCount = nFileCount,
                lpFilesCtorArg = lpFiles,
            )
    }
}

public class MapiRecipDesc internal constructor(
    public var ulReserved: UInt,
    public var ulRecipClass: UInt,
    lpszNameCtorArg: Pstr,
    lpszAddressCtorArg: Pstr,
    public var ulEIDSize: UInt,
    lpEntryIDCtorArg: MutPtr<CVoid>,
) {
    public var lpszName: Pstr = lpszNameCtorArg
        internal set

    public var lpszAddress: Pstr = lpszAddressCtorArg
        internal set

    public var lpEntryID: MutPtr<CVoid> = lpEntryIDCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        ulRecipClass = 0u,
        lpszNameCtorArg = MutPtr(0L),
        lpszAddressCtorArg = MutPtr(0L),
        ulEIDSize = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): UInt = this.ulRecipClass

    public operator fun component3(): Pstr = this.lpszName

    public operator fun component4(): Pstr = this.lpszAddress

    public operator fun component5(): UInt = this.ulEIDSize

    public operator fun component6(): MutPtr<CVoid> = this.lpEntryID

    public fun copy(ulReserved: UInt = this.ulReserved, ulRecipClass: UInt = this.ulRecipClass, lpszName: Pstr = this.lpszName, lpszAddress: Pstr = this.lpszAddress, ulEIDSize: UInt = this.ulEIDSize, lpEntryID: MutPtr<CVoid> = this.lpEntryID): MapiRecipDesc = MapiRecipDesc(ulReserved = ulReserved, ulRecipClass = ulRecipClass, lpszNameCtorArg = lpszName, lpszAddressCtorArg = lpszAddress, ulEIDSize = ulEIDSize, lpEntryIDCtorArg = lpEntryID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiRecipDesc) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.ulRecipClass != other.ulRecipClass) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszAddress != other.lpszAddress) return false
        if (this.ulEIDSize != other.ulEIDSize) return false
        if (this.lpEntryID != other.lpEntryID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.ulRecipClass.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszAddress.hashCode()
        result = 31 * result + this.ulEIDSize.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            ulRecipClass: UInt = 0u,
            lpszName: Pstr = MutPtr(0L),
            lpszAddress: Pstr = MutPtr(0L),
            ulEIDSize: UInt = 0u,
            lpEntryID: MutPtr<CVoid> = MutPtr(0L),
        ): MapiRecipDesc =
            MapiRecipDesc(
                ulReserved = ulReserved,
                ulRecipClass = ulRecipClass,
                lpszNameCtorArg = lpszName,
                lpszAddressCtorArg = lpszAddress,
                ulEIDSize = ulEIDSize,
                lpEntryIDCtorArg = lpEntryID,
            )
    }
}

public class MapiRecipDescW internal constructor(
    public var ulReserved: UInt,
    public var ulRecipClass: UInt,
    lpszNameCtorArg: Pwstr,
    lpszAddressCtorArg: Pwstr,
    public var ulEIDSize: UInt,
    lpEntryIDCtorArg: MutPtr<CVoid>,
) {
    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public var lpszAddress: Pwstr = lpszAddressCtorArg
        internal set

    public var lpEntryID: MutPtr<CVoid> = lpEntryIDCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        ulRecipClass = 0u,
        lpszNameCtorArg = MutPtr(0L),
        lpszAddressCtorArg = MutPtr(0L),
        ulEIDSize = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): UInt = this.ulRecipClass

    public operator fun component3(): Pwstr = this.lpszName

    public operator fun component4(): Pwstr = this.lpszAddress

    public operator fun component5(): UInt = this.ulEIDSize

    public operator fun component6(): MutPtr<CVoid> = this.lpEntryID

    public fun copy(ulReserved: UInt = this.ulReserved, ulRecipClass: UInt = this.ulRecipClass, lpszName: Pwstr = this.lpszName, lpszAddress: Pwstr = this.lpszAddress, ulEIDSize: UInt = this.ulEIDSize, lpEntryID: MutPtr<CVoid> = this.lpEntryID): MapiRecipDescW = MapiRecipDescW(ulReserved = ulReserved, ulRecipClass = ulRecipClass, lpszNameCtorArg = lpszName, lpszAddressCtorArg = lpszAddress, ulEIDSize = ulEIDSize, lpEntryIDCtorArg = lpEntryID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapiRecipDescW) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.ulRecipClass != other.ulRecipClass) return false
        if (this.lpszName != other.lpszName) return false
        if (this.lpszAddress != other.lpszAddress) return false
        if (this.ulEIDSize != other.ulEIDSize) return false
        if (this.lpEntryID != other.lpEntryID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.ulRecipClass.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.lpszAddress.hashCode()
        result = 31 * result + this.ulEIDSize.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulReserved: UInt = 0u,
            ulRecipClass: UInt = 0u,
            lpszName: Pwstr = MutPtr(0L),
            lpszAddress: Pwstr = MutPtr(0L),
            ulEIDSize: UInt = 0u,
            lpEntryID: MutPtr<CVoid> = MutPtr(0L),
        ): MapiRecipDescW =
            MapiRecipDescW(
                ulReserved = ulReserved,
                ulRecipClass = ulRecipClass,
                lpszNameCtorArg = lpszName,
                lpszAddressCtorArg = lpszAddress,
                ulEIDSize = ulEIDSize,
                lpEntryIDCtorArg = lpEntryID,
            )
    }
}
