package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error

public expect fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error

public expect fun rmEndSession(dwsessionhandle: UInt): Win32Error

public expect fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: COpaquePointer?, cbfilterbuf: UInt, cbfilterbufneeded: COpaquePointer?): Win32Error

public expect fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: COpaquePointer?, pnprocinfo: COpaquePointer?, rgaffectedapps: COpaquePointer?, lpdwrebootreasons: COpaquePointer?): Win32Error

public expect fun rmJoinSession(psessionhandle: COpaquePointer?, strsessionkey: Pcwstr): Win32Error

public expect fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: COpaquePointer?, napplications: UInt, rgapplications: COpaquePointer?, nservices: UInt, rgsservicenames: COpaquePointer?): Win32Error

public expect fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr): Win32Error

public expect fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error

public expect fun rmStartSession(psessionhandle: COpaquePointer?, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error
