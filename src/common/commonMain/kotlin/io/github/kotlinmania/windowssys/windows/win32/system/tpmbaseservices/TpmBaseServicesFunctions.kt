package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetDeviceID(pbwindowsaik: Long, cbwindowsaik: UInt, pcbresult: Long, pfprotectedbytpm: Long): HRESULT {
    return Win32DynamicFfi.invoke("tbs.dll", "GetDeviceID", longArrayOf(pbwindowsaik, cbwindowsaik.toLong(), pcbresult, pfprotectedbytpm)).toInt()
}

public fun GetDeviceIDString(pszwindowsaik: PWSTR, cchwindowsaik: UInt, pcchresult: Long, pfprotectedbytpm: Long): HRESULT {
    return Win32DynamicFfi.invoke("tbs.dll", "GetDeviceIDString", longArrayOf(pszwindowsaik, cchwindowsaik.toLong(), pcchresult, pfprotectedbytpm)).toInt()
}

public fun Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Context_Create", longArrayOf(pcontextparams, phcontext)).toUInt()
}

public fun Tbsi_Create_Windows_Key(keyhandle: UInt): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Create_Windows_Key", longArrayOf(keyhandle.toLong())).toUInt()
}

public fun Tbsi_GetDeviceInfo(size: UInt, info: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_GetDeviceInfo", longArrayOf(size.toLong(), info)).toUInt()
}

public fun Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: UInt, poutputbuf: Long, poutputbuflen: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Get_OwnerAuth", longArrayOf(hcontext, ownerauthtype.toLong(), poutputbuf, poutputbuflen)).toUInt()
}

public fun Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Get_TCG_Log", longArrayOf(hcontext, poutputbuf, poutputbuflen)).toUInt()
}

public fun Tbsi_Get_TCG_Log_Ex(logtype: UInt, pboutput: Long, pcboutput: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Get_TCG_Log_Ex", longArrayOf(logtype.toLong(), pboutput, pcboutput)).toUInt()
}

public fun Tbsi_Is_Tpm_Present(): BOOL {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Is_Tpm_Present", longArrayOf()).toInt()
}

public fun Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: UInt, paboutput: Long, pcboutput: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Physical_Presence_Command", longArrayOf(hcontext, pabinput, cbinput.toLong(), paboutput, pcboutput)).toUInt()
}

public fun Tbsi_Revoke_Attestation(): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsi_Revoke_Attestation", longArrayOf()).toUInt()
}

public fun Tbsip_Cancel_Commands(hcontext: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsip_Cancel_Commands", longArrayOf(hcontext)).toUInt()
}

public fun Tbsip_Context_Close(hcontext: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsip_Context_Close", longArrayOf(hcontext)).toUInt()
}

public fun Tbsip_Submit_Command(hcontext: Long, locality: TBS_COMMAND_LOCALITY, priority: TBS_COMMAND_PRIORITY, pabcommand: Long, cbcommand: UInt, pabresult: Long, pcbresult: Long): UInt {
    return Win32DynamicFfi.invoke("tbs.dll", "Tbsip_Submit_Command", longArrayOf(hcontext, locality.toLong(), priority.toLong(), pabcommand, cbcommand.toLong(), pabresult, pcbresult)).toUInt()
}
