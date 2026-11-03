package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

public typealias DISC_RECORDER_STATE_FLAGS = UInt

public typealias EmulationType = Int

public typealias FsiFileSystems = Int

public typealias FsiItemType = Int

public typealias IMAPI_BURN_VERIFICATION_LEVEL = Int

public typealias IMAPI_CD_SECTOR_TYPE = Int

public typealias IMAPI_CD_TRACK_DIGITAL_COPY_SETTING = Int

public typealias IMAPI_FEATURE_PAGE_TYPE = Int

public typealias IMAPI_FORMAT2_DATA_MEDIA_STATE = Int

public typealias IMAPI_FORMAT2_DATA_WRITE_ACTION = Int

public typealias IMAPI_FORMAT2_RAW_CD_DATA_SECTOR_TYPE = Int

public typealias IMAPI_FORMAT2_RAW_CD_WRITE_ACTION = Int

public typealias IMAPI_FORMAT2_TAO_WRITE_ACTION = Int

public typealias IMAPI_MEDIA_PHYSICAL_TYPE = Int

public typealias IMAPI_MEDIA_WRITE_PROTECT_STATE = Int

public typealias IMAPI_MODE_PAGE_REQUEST_TYPE = Int

public typealias IMAPI_MODE_PAGE_TYPE = Int

public typealias IMAPI_PROFILE_TYPE = Int

public typealias IMAPI_READ_TRACK_ADDRESS_TYPE = Int

public typealias IMMPID_CPV_ENUM = Int

public typealias IMMPID_MPV_ENUM = Int

public typealias IMMPID_MP_ENUM = Int

public typealias IMMPID_NMP_ENUM = Int

public typealias IMMPID_RPV_ENUM = Int

public typealias IMMPID_RP_ENUM = Int

public typealias LPMSGSESS = Long

public typealias MEDIA_FLAGS = Int

public typealias MEDIA_TYPES = Int

public fun interface MSGCALLRELEASEFn {
    public operator fun invoke(ulcallerdata: UInt, lpmessage: Long)
}

public typealias MSGCALLRELEASE = MSGCALLRELEASEFn?

public typealias PlatformId = Int

public typealias RECORDER_TYPES = Int
