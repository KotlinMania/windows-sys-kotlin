package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun getDeviceID(pbwindowsaik: MutPtr<UByte>, cbwindowsaik: UInt, pcbresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult

public expect fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult

public expect fun tbsiContextCreate(pcontextparams: ConstPtr<TbsContextParams>, phcontext: MutPtr<MutPtr<CVoid>>): UInt

public expect fun tbsiCreateWindowsKey(keyhandle: UInt): UInt

public expect fun tbsiGetDeviceInfo(size: UInt, info: MutPtr<CVoid>): UInt

public expect fun tbsiGetOwnerAuth(hcontext: ConstPtr<CVoid>, ownerauthtype: UInt, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt

public expect fun tbsiGetTcgLog(hcontext: ConstPtr<CVoid>, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt

public expect fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt

public expect fun tbsiIsTpmPresent(): Bool

public expect fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr<CVoid>, pabinput: ConstPtr<UByte>, cbinput: UInt, paboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt

public expect fun tbsiRevokeAttestation(): UInt

public expect fun tbsipCancelCommands(hcontext: ConstPtr<CVoid>): UInt

public expect fun tbsipContextClose(hcontext: ConstPtr<CVoid>): UInt

public expect fun tbsipSubmitCommand(hcontext: ConstPtr<CVoid>, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr<UByte>, cbcommand: UInt, pabresult: MutPtr<UByte>, pcbresult: MutPtr<UInt>): UInt
