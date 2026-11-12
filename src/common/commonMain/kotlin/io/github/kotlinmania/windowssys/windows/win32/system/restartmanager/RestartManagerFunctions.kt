package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error

public expect fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error

public expect fun rmEndSession(dwsessionhandle: UInt): Win32Error

public expect fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr<UByte>, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr<UInt>): Win32Error

public expect fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr<UInt>, pnprocinfo: MutPtr<UInt>, rgaffectedapps: MutPtr<RmProcessInfo>, lpdwrebootreasons: MutPtr<UInt>): Win32Error

public expect fun rmJoinSession(psessionhandle: MutPtr<UInt>, strsessionkey: Pcwstr): Win32Error

public expect fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr<Pcwstr>, napplications: UInt, rgapplications: ConstPtr<RmUniqueProcess>, nservices: UInt, rgsservicenames: ConstPtr<Pcwstr>): Win32Error

public expect fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr<RmUniqueProcess>, strserviceshortname: Pcwstr): Win32Error

public expect fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmStartSession(psessionhandle: MutPtr<UInt>, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error
