package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error

public expect fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error

public expect fun rmEndSession(dwsessionhandle: UInt): Win32Error

public expect fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr): Win32Error

public expect fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr, pnprocinfo: MutPtr, rgaffectedapps: MutPtr, lpdwrebootreasons: MutPtr): Win32Error

public expect fun rmJoinSession(psessionhandle: MutPtr, strsessionkey: Pcwstr): Win32Error

public expect fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr, napplications: UInt, rgapplications: ConstPtr, nservices: UInt, rgsservicenames: ConstPtr): Win32Error

public expect fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr): Win32Error

public expect fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmStartSession(psessionhandle: MutPtr, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error
