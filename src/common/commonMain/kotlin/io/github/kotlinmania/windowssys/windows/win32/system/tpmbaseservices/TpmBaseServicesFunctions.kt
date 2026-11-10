package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun getDeviceID(pbwindowsaik: COpaquePointer?, cbwindowsaik: UInt, pcbresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult

public expect fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult

public expect fun tbsiContextCreate(pcontextparams: COpaquePointer?, phcontext: COpaquePointer?): UInt

public expect fun tbsiCreateWindowsKey(keyhandle: UInt): UInt

public expect fun tbsiGetDeviceInfo(size: UInt, info: COpaquePointer?): UInt

public expect fun tbsiGetOwnerAuth(hcontext: COpaquePointer?, ownerauthtype: UInt, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt

public expect fun tbsiGetTcgLog(hcontext: COpaquePointer?, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt

public expect fun tbsiGetTcgLogEx(logtype: UInt, pboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt

public expect fun tbsiIsTpmPresent(): Bool

public expect fun tbsiPhysicalPresenceCommand(hcontext: COpaquePointer?, pabinput: COpaquePointer?, cbinput: UInt, paboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt

public expect fun tbsiRevokeAttestation(): UInt

public expect fun tbsipCancelCommands(hcontext: COpaquePointer?): UInt

public expect fun tbsipContextClose(hcontext: COpaquePointer?): UInt

public expect fun tbsipSubmitCommand(hcontext: COpaquePointer?, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: COpaquePointer?, cbcommand: UInt, pabresult: COpaquePointer?, pcbresult: COpaquePointer?): UInt
