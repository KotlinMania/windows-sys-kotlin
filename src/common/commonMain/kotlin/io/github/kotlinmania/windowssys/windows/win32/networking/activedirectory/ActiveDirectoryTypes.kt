package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias ADSI_DIALECT_ENUM = Int

public typealias ADSTYPE = Int

public typealias ADS_ACEFLAG_ENUM = Int

public typealias ADS_ACETYPE_ENUM = Int

public typealias ADS_AUTHENTICATION_ENUM = UInt

public typealias ADS_CHASE_REFERRALS_ENUM = Int

public typealias ADS_DEREFENUM = Int

public typealias ADS_DISPLAY_ENUM = Int

public typealias ADS_ESCAPE_MODE_ENUM = Int

public typealias ADS_FLAGTYPE_ENUM = Int

public typealias ADS_FORMAT_ENUM = Int

public typealias ADS_GROUP_TYPE_ENUM = Int

public typealias ADS_NAME_INITTYPE_ENUM = Int

public typealias ADS_NAME_TYPE_ENUM = Int

public typealias ADS_OPTION_ENUM = Int

public typealias ADS_PASSWORD_ENCODING_ENUM = Int

public typealias ADS_PATHTYPE_ENUM = Int

public typealias ADS_PREFERENCES_ENUM = Int

public typealias ADS_PROPERTY_OPERATION_ENUM = Int

public typealias ADS_RIGHTS_ENUM = Int

public typealias ADS_SCOPEENUM = Int

public typealias ADS_SD_CONTROL_ENUM = Int

public typealias ADS_SD_FORMAT_ENUM = Int

public typealias ADS_SD_REVISION_ENUM = Int

public typealias ADS_SEARCHPREF_ENUM = Int

public typealias ADS_SEARCH_HANDLE = Long

public typealias ADS_SECURITY_INFO_ENUM = Int

public typealias ADS_SETTYPE_ENUM = Int

public typealias ADS_STATUSENUM = Int

public typealias ADS_SYSTEMFLAG_ENUM = Int

public typealias ADS_USER_FLAG_ENUM = Int

public typealias DSROLE_MACHINE_ROLE = Int

public typealias DSROLE_OPERATION_STATE = Int

public typealias DSROLE_PRIMARY_DOMAIN_INFO_LEVEL = Int

public typealias DSROLE_SERVER_STATE = Int

public typealias DS_KCC_TASKID = Int

public typealias DS_MANGLE_FOR = Int

public typealias DS_NAME_ERROR = Int

public typealias DS_NAME_FLAGS = Int

public typealias DS_NAME_FORMAT = Int

public typealias DS_REPL_INFO_TYPE = Int

public typealias DS_REPL_OP_TYPE = Int

public typealias DS_REPSYNCALL_ERROR = Int

public typealias DS_REPSYNCALL_EVENT = Int

public typealias DS_SPN_NAME_TYPE = Int

public typealias DS_SPN_WRITE_OP = Int

public fun interface LPCQADDFORMSPROCFn {
    public operator fun invoke(lparam: LPARAM, pform: Long): HRESULT
}

public typealias LPCQADDFORMSPROC = LPCQADDFORMSPROCFn?

public fun interface LPCQADDPAGESPROCFn {
    public operator fun invoke(lparam: LPARAM, clsidform: Long, ppage: Long): HRESULT
}

public typealias LPCQADDPAGESPROC = LPCQADDPAGESPROCFn?

public fun interface LPCQPAGEPROCFn {
    public operator fun invoke(ppage: Long, hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): HRESULT
}

public typealias LPCQPAGEPROC = LPCQPAGEPROCFn?

public fun interface LPDSENUMATTRIBUTESFn {
    public operator fun invoke(lparam: LPARAM, pszattributename: PCWSTR, pszdisplayname: PCWSTR, dwflags: UInt): HRESULT
}

public typealias LPDSENUMATTRIBUTES = LPDSENUMATTRIBUTESFn?
