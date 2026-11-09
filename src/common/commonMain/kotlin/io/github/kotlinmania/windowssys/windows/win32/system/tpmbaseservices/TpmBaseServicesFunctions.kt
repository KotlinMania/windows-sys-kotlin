package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun GetDeviceID(pbwindowsaik: Long, cbwindowsaik: UInt, pcbresult: Long, pfprotectedbytpm: Long): HRESULT

public expect fun GetDeviceIDString(pszwindowsaik: PWSTR, cchwindowsaik: UInt, pcchresult: Long, pfprotectedbytpm: Long): HRESULT

public expect fun Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): UInt

public expect fun Tbsi_Create_Windows_Key(keyhandle: UInt): UInt

public expect fun Tbsi_GetDeviceInfo(size: UInt, info: Long): UInt

public expect fun Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: UInt, poutputbuf: Long, poutputbuflen: Long): UInt

public expect fun Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): UInt

public expect fun Tbsi_Get_TCG_Log_Ex(logtype: UInt, pboutput: Long, pcboutput: Long): UInt

public expect fun Tbsi_Is_Tpm_Present(): BOOL

public expect fun Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: UInt, paboutput: Long, pcboutput: Long): UInt

public expect fun Tbsi_Revoke_Attestation(): UInt

public expect fun Tbsip_Cancel_Commands(hcontext: Long): UInt

public expect fun Tbsip_Context_Close(hcontext: Long): UInt

public expect fun Tbsip_Submit_Command(hcontext: Long, locality: TBS_COMMAND_LOCALITY, priority: TBS_COMMAND_PRIORITY, pabcommand: Long, cbcommand: UInt, pabresult: Long, pcbresult: Long): UInt
