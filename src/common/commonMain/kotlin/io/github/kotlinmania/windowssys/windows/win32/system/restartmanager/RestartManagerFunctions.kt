package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public expect fun RmAddFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR, filteraction: RM_FILTER_ACTION): WIN32_ERROR

public expect fun RmCancelCurrentTask(dwsessionhandle: UInt): WIN32_ERROR

public expect fun RmEndSession(dwsessionhandle: UInt): WIN32_ERROR

public expect fun RmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: Long, cbfilterbuf: UInt, cbfilterbufneeded: Long): WIN32_ERROR

public expect fun RmGetList(dwsessionhandle: UInt, pnprocinfoneeded: Long, pnprocinfo: Long, rgaffectedapps: Long, lpdwrebootreasons: Long): WIN32_ERROR

public expect fun RmJoinSession(psessionhandle: Long, strsessionkey: PCWSTR): WIN32_ERROR

public expect fun RmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: Long, napplications: UInt, rgapplications: Long, nservices: UInt, rgsservicenames: Long): WIN32_ERROR

public expect fun RmRemoveFilter(dwsessionhandle: UInt, strmodulename: PCWSTR, pprocess: Long, strserviceshortname: PCWSTR): WIN32_ERROR

public expect fun RmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR

public expect fun RmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RM_WRITE_STATUS_CALLBACK): WIN32_ERROR

public expect fun RmStartSession(psessionhandle: Long, dwsessionflags: UInt, strsessionkey: PWSTR): WIN32_ERROR
