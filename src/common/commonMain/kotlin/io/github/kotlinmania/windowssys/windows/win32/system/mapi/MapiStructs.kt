package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class MapiFileDesc(
    public var ulReserved: UInt = 0u,
    public var flFlags: UInt = 0u,
    public var nPosition: UInt = 0u,
    public var lpszPathName: Pstr = null,
    public var lpszFileName: Pstr = null,
    public var lpFileType: COpaquePointer? = null,
)

public data class MapiFileDescW(
    public var ulReserved: UInt = 0u,
    public var flFlags: UInt = 0u,
    public var nPosition: UInt = 0u,
    public var lpszPathName: Pwstr = null,
    public var lpszFileName: Pwstr = null,
    public var lpFileType: COpaquePointer? = null,
)

public data class MapiFileTagExt(
    public var ulReserved: UInt = 0u,
    public var cbTag: UInt = 0u,
    public var lpTag: COpaquePointer? = null,
    public var cbEncoding: UInt = 0u,
    public var lpEncoding: COpaquePointer? = null,
)

public data class MapiMessage(
    public var ulReserved: UInt = 0u,
    public var lpszSubject: Pstr = null,
    public var lpszNoteText: Pstr = null,
    public var lpszMessageType: Pstr = null,
    public var lpszDateReceived: Pstr = null,
    public var lpszConversationID: Pstr = null,
    public var flFlags: UInt = 0u,
    public var lpOriginator: MapiRecipDesc? = null,
    public var nRecipCount: UInt = 0u,
    public var lpRecips: MapiRecipDesc? = null,
    public var nFileCount: UInt = 0u,
    public var lpFiles: MapiFileDesc? = null,
)

public data class MapiMessageW(
    public var ulReserved: UInt = 0u,
    public var lpszSubject: Pwstr = null,
    public var lpszNoteText: Pwstr = null,
    public var lpszMessageType: Pwstr = null,
    public var lpszDateReceived: Pwstr = null,
    public var lpszConversationID: Pwstr = null,
    public var flFlags: UInt = 0u,
    public var lpOriginator: MapiRecipDescW? = null,
    public var nRecipCount: UInt = 0u,
    public var lpRecips: MapiRecipDescW? = null,
    public var nFileCount: UInt = 0u,
    public var lpFiles: MapiFileDescW? = null,
)

public data class MapiRecipDesc(
    public var ulReserved: UInt = 0u,
    public var ulRecipClass: UInt = 0u,
    public var lpszName: Pstr = null,
    public var lpszAddress: Pstr = null,
    public var ulEIDSize: UInt = 0u,
    public var lpEntryID: COpaquePointer? = null,
)

public data class MapiRecipDescW(
    public var ulReserved: UInt = 0u,
    public var ulRecipClass: UInt = 0u,
    public var lpszName: Pwstr = null,
    public var lpszAddress: Pwstr = null,
    public var ulEIDSize: UInt = 0u,
    public var lpEntryID: COpaquePointer? = null,
)
