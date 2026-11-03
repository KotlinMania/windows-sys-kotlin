package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class MapiFileDesc(
    public var ulReserved: UInt = 0u,
    public var flFlags: UInt = 0u,
    public var nPosition: UInt = 0u,
    public var lpszPathName: PSTR = 0L,
    public var lpszFileName: PSTR = 0L,
    public var lpFileType: Long = 0L,
)

public data class MapiFileDescW(
    public var ulReserved: UInt = 0u,
    public var flFlags: UInt = 0u,
    public var nPosition: UInt = 0u,
    public var lpszPathName: PWSTR = 0L,
    public var lpszFileName: PWSTR = 0L,
    public var lpFileType: Long = 0L,
)

public data class MapiFileTagExt(
    public var ulReserved: UInt = 0u,
    public var cbTag: UInt = 0u,
    public var lpTag: Long = 0L,
    public var cbEncoding: UInt = 0u,
    public var lpEncoding: Long = 0L,
)

public data class MapiMessage(
    public var ulReserved: UInt = 0u,
    public var lpszSubject: PSTR = 0L,
    public var lpszNoteText: PSTR = 0L,
    public var lpszMessageType: PSTR = 0L,
    public var lpszDateReceived: PSTR = 0L,
    public var lpszConversationID: PSTR = 0L,
    public var flFlags: UInt = 0u,
    public var lpOriginator: Long = 0L,
    public var nRecipCount: UInt = 0u,
    public var lpRecips: Long = 0L,
    public var nFileCount: UInt = 0u,
    public var lpFiles: Long = 0L,
)

public data class MapiMessageW(
    public var ulReserved: UInt = 0u,
    public var lpszSubject: PWSTR = 0L,
    public var lpszNoteText: PWSTR = 0L,
    public var lpszMessageType: PWSTR = 0L,
    public var lpszDateReceived: PWSTR = 0L,
    public var lpszConversationID: PWSTR = 0L,
    public var flFlags: UInt = 0u,
    public var lpOriginator: Long = 0L,
    public var nRecipCount: UInt = 0u,
    public var lpRecips: Long = 0L,
    public var nFileCount: UInt = 0u,
    public var lpFiles: Long = 0L,
)

public data class MapiRecipDesc(
    public var ulReserved: UInt = 0u,
    public var ulRecipClass: UInt = 0u,
    public var lpszName: PSTR = 0L,
    public var lpszAddress: PSTR = 0L,
    public var ulEIDSize: UInt = 0u,
    public var lpEntryID: Long = 0L,
)

public data class MapiRecipDescW(
    public var ulReserved: UInt = 0u,
    public var ulRecipClass: UInt = 0u,
    public var lpszName: PWSTR = 0L,
    public var lpszAddress: PWSTR = 0L,
    public var ulEIDSize: UInt = 0u,
    public var lpEntryID: Long = 0L,
)
