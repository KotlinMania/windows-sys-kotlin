package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias DiscRecorderStateFlags = UInt

public typealias EmulationType = Int

public typealias FsiFileSystems = Int

public typealias FsiItemType = Int

public typealias ImapiBurnVerificationLevel = Int

public typealias ImapiCdSectorType = Int

public typealias ImapiCdTrackDigitalCopySetting = Int

public typealias ImapiFeaturePageType = Int

public typealias ImapiFormat2DataMediaState = Int

public typealias ImapiFormat2DataWriteAction = Int

public typealias ImapiFormat2RawCdDataSectorType = Int

public typealias ImapiFormat2RawCdWriteAction = Int

public typealias ImapiFormat2TaoWriteAction = Int

public typealias ImapiMediaPhysicalType = Int

public typealias ImapiMediaWriteProtectState = Int

public typealias ImapiModePageRequestType = Int

public typealias ImapiModePageType = Int

public typealias ImapiProfileType = Int

public typealias ImapiReadTrackAddressType = Int

public typealias ImmpidCpvEnum = Int

public typealias ImmpidMpvEnum = Int

public typealias ImmpidMpEnum = Int

public typealias ImmpidNmpEnum = Int

public typealias ImmpidRpvEnum = Int

public typealias ImmpidRpEnum = Int

public typealias Lpmsgsess = Long

public typealias MediaFlags = Int

public typealias MediaTypes = Int

public fun interface MsgcallreleaseFn {
    public operator fun invoke(ulcallerdata: UInt, lpmessage: COpaquePointer?)
}

public typealias Msgcallrelease = MsgcallreleaseFn?

public typealias PlatformId = Int

public typealias RecorderTypes = Int
