package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM

public fun interface APPLICATION_RECOVERY_CALLBACKFn {
    public operator fun invoke(pvparameter: Long): UInt
}

public typealias APPLICATION_RECOVERY_CALLBACK = APPLICATION_RECOVERY_CALLBACKFn?

public typealias DECISION_LOCATION = Int

public fun interface ENUM_CALLBACKFn {
    public operator fun invoke(lpsurfaceinfo: Long, lpcontext: Long)
}

public typealias ENUM_CALLBACK = ENUM_CALLBACKFn?

public typealias FEATURE_CHANGE_TIME = Int

public typealias FEATURE_ENABLED_STATE = Int

public typealias FEATURE_STATE_CHANGE_SUBSCRIPTION = Long

public typealias HWINWATCH = Long

public fun interface PDELAYLOAD_FAILURE_DLL_CALLBACKFn {
    public operator fun invoke(notificationreason: UInt, delayloadinfo: Long): Long
}

public typealias PDELAYLOAD_FAILURE_DLL_CALLBACK = PDELAYLOAD_FAILURE_DLL_CALLBACKFn?

public fun interface PFEATURE_STATE_CHANGE_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias PFEATURE_STATE_CHANGE_CALLBACK = PFEATURE_STATE_CHANGE_CALLBACKFn?

public fun interface PFIBER_CALLOUT_ROUTINEFn {
    public operator fun invoke(lpparameter: Long): Long
}

public typealias PFIBER_CALLOUT_ROUTINE = PFIBER_CALLOUT_ROUTINEFn?

public fun interface PQUERYACTCTXW_FUNCFn {
    public operator fun invoke(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL
}

public typealias PQUERYACTCTXW_FUNC = PQUERYACTCTXW_FUNCFn?

public fun interface PWINSTATIONQUERYINFORMATIONWFn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: WINSTATIONINFOCLASS, param3: Long, param4: UInt, param5: Long): Boolean
}

public typealias PWINSTATIONQUERYINFORMATIONW = PWINSTATIONQUERYINFORMATIONWFn?

public fun interface PWLDP_CANEXECUTEBUFFER_APIFn {
    public operator fun invoke(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT
}

public typealias PWLDP_CANEXECUTEBUFFER_API = PWLDP_CANEXECUTEBUFFER_APIFn?

public fun interface PWLDP_CANEXECUTEFILE_APIFn {
    public operator fun invoke(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT
}

public typealias PWLDP_CANEXECUTEFILE_API = PWLDP_CANEXECUTEFILE_APIFn?

public fun interface PWLDP_CANEXECUTESTREAM_APIFn {
    public operator fun invoke(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT
}

public typealias PWLDP_CANEXECUTESTREAM_API = PWLDP_CANEXECUTESTREAM_APIFn?

public fun interface PWLDP_ISAPPAPPROVEDBYPOLICY_APIFn {
    public operator fun invoke(packagefamilyname: PCWSTR, packageversion: ULong): HRESULT
}

public typealias PWLDP_ISAPPAPPROVEDBYPOLICY_API = PWLDP_ISAPPAPPROVEDBYPOLICY_APIFn?

public fun interface PWLDP_ISDYNAMICCODEPOLICYENABLED_APIFn {
    public operator fun invoke(pbenabled: Long): HRESULT
}

public typealias PWLDP_ISDYNAMICCODEPOLICYENABLED_API = PWLDP_ISDYNAMICCODEPOLICYENABLED_APIFn?

public fun interface PWLDP_ISPRODUCTIONCONFIGURATION_APIFn {
    public operator fun invoke(isproductionconfiguration: Long): HRESULT
}

public typealias PWLDP_ISPRODUCTIONCONFIGURATION_API = PWLDP_ISPRODUCTIONCONFIGURATION_APIFn?

public fun interface PWLDP_ISWCOSPRODUCTIONCONFIGURATION_APIFn {
    public operator fun invoke(isproductionconfiguration: Long): HRESULT
}

public typealias PWLDP_ISWCOSPRODUCTIONCONFIGURATION_API = PWLDP_ISWCOSPRODUCTIONCONFIGURATION_APIFn?

public fun interface PWLDP_QUERYDEVICESECURITYINFORMATION_APIFn {
    public operator fun invoke(information: Long, informationlength: UInt, returnlength: Long): HRESULT
}

public typealias PWLDP_QUERYDEVICESECURITYINFORMATION_API = PWLDP_QUERYDEVICESECURITYINFORMATION_APIFn?

public fun interface PWLDP_QUERYDYNAMICODETRUST_APIFn {
    public operator fun invoke(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT
}

public typealias PWLDP_QUERYDYNAMICODETRUST_API = PWLDP_QUERYDYNAMICODETRUST_APIFn?

public fun interface PWLDP_QUERYPOLICYSETTINGENABLED2_APIFn {
    public operator fun invoke(setting: PCWSTR, enabled: Long): HRESULT
}

public typealias PWLDP_QUERYPOLICYSETTINGENABLED2_API = PWLDP_QUERYPOLICYSETTINGENABLED2_APIFn?

public fun interface PWLDP_QUERYPOLICYSETTINGENABLED_APIFn {
    public operator fun invoke(setting: WLDP_POLICY_SETTING, enabled: Long): HRESULT
}

public typealias PWLDP_QUERYPOLICYSETTINGENABLED_API = PWLDP_QUERYPOLICYSETTINGENABLED_APIFn?

public fun interface PWLDP_QUERYWINDOWSLOCKDOWNMODE_APIFn {
    public operator fun invoke(lockdownmode: Long): HRESULT
}

public typealias PWLDP_QUERYWINDOWSLOCKDOWNMODE_API = PWLDP_QUERYWINDOWSLOCKDOWNMODE_APIFn?

public fun interface PWLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_APIFn {
    public operator fun invoke(lockdownrestriction: Long): HRESULT
}

public typealias PWLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_API = PWLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_APIFn?

public fun interface PWLDP_RESETPRODUCTIONCONFIGURATION_APIFn {
    public operator fun invoke(): HRESULT
}

public typealias PWLDP_RESETPRODUCTIONCONFIGURATION_API = PWLDP_RESETPRODUCTIONCONFIGURATION_APIFn?

public fun interface PWLDP_RESETWCOSPRODUCTIONCONFIGURATION_APIFn {
    public operator fun invoke(): HRESULT
}

public typealias PWLDP_RESETWCOSPRODUCTIONCONFIGURATION_API = PWLDP_RESETWCOSPRODUCTIONCONFIGURATION_APIFn?

public fun interface PWLDP_SETDYNAMICCODETRUST_APIFn {
    public operator fun invoke(hfilehandle: HANDLE): HRESULT
}

public typealias PWLDP_SETDYNAMICCODETRUST_API = PWLDP_SETDYNAMICCODETRUST_APIFn?

public fun interface PWLDP_SETWINDOWSLOCKDOWNRESTRICTION_APIFn {
    public operator fun invoke(lockdownrestriction: WLDP_WINDOWS_LOCKDOWN_RESTRICTION): HRESULT
}

public typealias PWLDP_SETWINDOWSLOCKDOWNRESTRICTION_API = PWLDP_SETWINDOWSLOCKDOWNRESTRICTION_APIFn?

public fun interface REGINSTALLAFn {
    public operator fun invoke(hm: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT
}

public typealias REGINSTALLA = REGINSTALLAFn?

public typealias TDIENTITY_ENTITY_TYPE = UInt

public typealias TDI_TL_IO_CONTROL_TYPE = Int

public typealias VALUENAME = Int

public typealias WINSTATIONINFOCLASS = Int

public fun interface WINWATCHNOTIFYPROCFn {
    public operator fun invoke(hww: HWINWATCH, hwnd: HWND, code: UInt, lparam: LPARAM)
}

public typealias WINWATCHNOTIFYPROC = WINWATCHNOTIFYPROCFn?

public typealias WLDP_EXECUTION_EVALUATION_OPTIONS = Int

public typealias WLDP_EXECUTION_POLICY = Int

public typealias WLDP_HOST = Int

public typealias WLDP_HOST_ID = Int

public typealias WLDP_KEY = Int

public typealias WLDP_POLICY_SETTING = Int

public typealias WLDP_WINDOWS_LOCKDOWN_MODE = Int

public typealias WLDP_WINDOWS_LOCKDOWN_RESTRICTION = Int
