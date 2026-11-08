package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.PAPCFUNC
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_ACCESS_MASK

public fun interface FnCallback {
    public operator fun invoke(lpfiberparameter: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(lpthreadparameter: Long): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, overlapped: Long, ioresult: UInt, numberofbytestransferred: ULong, io: PTP_IO)
}

public fun interface FnCallback3 {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, timer: PTP_TIMER)
}

public fun interface FnCallback4 {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, wait: PTP_WAIT, waitresult: UInt)
}

public fun interface FnCallback5 {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, work: PTP_WORK)
}

public fun interface FnCallback6 {
    public operator fun invoke(param0: Long, param1: Boolean)
}

public fun interface FnCallback7 {
    public operator fun invoke(initonce: Long, parameter: Long, context: Long): BOOL
}

public fun interface FnCallback8 {
    public operator fun invoke(lpargtocompletionroutine: Long, dwtimerlowvalue: UInt, dwtimerhighvalue: UInt)
}

public fun interface FnCallback9 {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long)
}

public fun AcquireSRWLockExclusive(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "AcquireSRWLockExclusive", longArrayOf(srwlock))
}

public fun AcquireSRWLockShared(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "AcquireSRWLockShared", longArrayOf(srwlock))
}

public fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddIntegrityLabelToBoundaryDescriptor", longArrayOf(boundarydescriptor, integritylabel)).toInt()
}

public fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddSIDToBoundaryDescriptor", longArrayOf(boundarydescriptor, requiredsid)).toInt()
}

public fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AttachThreadInput", longArrayOf(idattach.toLong(), idattachto.toLong(), fattach.toLong())).toInt()
}

public fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvQuerySystemResponsiveness", longArrayOf(avrthandle, systemresponsivenessvalue)).toInt()
}

public fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRevertMmThreadCharacteristics", longArrayOf(avrthandle)).toInt()
}

public fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtCreateThreadOrderingGroup", longArrayOf(context, period, threadorderingguid, timeout)).toInt()
}

public fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtCreateThreadOrderingGroupExA", longArrayOf(context, period, threadorderingguid, timeout, taskname)).toInt()
}

public fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtCreateThreadOrderingGroupExW", longArrayOf(context, period, threadorderingguid, timeout, taskname)).toInt()
}

public fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtDeleteThreadOrderingGroup", longArrayOf(context)).toInt()
}

public fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtJoinThreadOrderingGroup", longArrayOf(context, threadorderingguid, before.toLong())).toInt()
}

public fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtLeaveThreadOrderingGroup", longArrayOf(context)).toInt()
}

public fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtWaitOnThreadOrderingGroup", longArrayOf(context)).toInt()
}

public fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmMaxThreadCharacteristicsA", longArrayOf(firsttask, secondtask, taskindex))
}

public fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmMaxThreadCharacteristicsW", longArrayOf(firsttask, secondtask, taskindex))
}

public fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadCharacteristicsA", longArrayOf(taskname, taskindex))
}

public fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadCharacteristicsW", longArrayOf(taskname, taskindex))
}

public fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadPriority", longArrayOf(avrthandle, priority.toLong())).toInt()
}

public fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallbackMayRunLong", longArrayOf(pci)).toInt()
}

public fun CancelThreadpoolIo(pio: PTP_IO) {
    Win32DynamicFfi.invoke("kernel32.dll", "CancelThreadpoolIo", longArrayOf(pio))
}

public fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelTimerQueueTimer", longArrayOf(timerqueue, timer)).toInt()
}

public fun CancelWaitableTimer(htimer: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelWaitableTimer", longArrayOf(htimer)).toInt()
}

public fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ChangeTimerQueueTimer", longArrayOf(timerqueue, timer, duetime.toLong(), period.toLong())).toInt()
}

public fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "ClosePrivateNamespace", longArrayOf(handle, flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CloseThreadpool(ptpp: PTP_POOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpool", longArrayOf(ptpp))
}

public fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolCleanupGroup", longArrayOf(ptpcg))
}

public fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolCleanupGroupMembers", longArrayOf(ptpcg, fcancelpendingcallbacks.toLong(), pvcleanupcontext))
}

public fun CloseThreadpoolIo(pio: PTP_IO) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolIo", longArrayOf(pio))
}

public fun CloseThreadpoolTimer(pti: PTP_TIMER) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolTimer", longArrayOf(pti))
}

public fun CloseThreadpoolWait(pwa: PTP_WAIT) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolWait", longArrayOf(pwa))
}

public fun CloseThreadpoolWork(pwk: PTP_WORK) {
    Win32DynamicFfi.invoke("kernel32.dll", "CloseThreadpoolWork", longArrayOf(pwk))
}

public fun ConvertFiberToThread(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertFiberToThread", longArrayOf()).toInt()
}

public fun ConvertThreadToFiber(lpparameter: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertThreadToFiber", longArrayOf(lpparameter))
}

public fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "ConvertThreadToFiberEx", longArrayOf(lpparameter, dwflags.toLong()))
}

public fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateBoundaryDescriptorA", longArrayOf(name, flags.toLong()))
}

public fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateBoundaryDescriptorW", longArrayOf(name, flags.toLong()))
}

public fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateEventA", longArrayOf(lpeventattributes, bmanualreset.toLong(), binitialstate.toLong(), lpname))
}

public fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateEventExA", longArrayOf(lpeventattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateEventExW", longArrayOf(lpeventattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateEventW", longArrayOf(lpeventattributes, bmanualreset.toLong(), binitialstate.toLong(), lpname))
}

public fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFiber", longArrayOf(dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter))
}

public fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFiberEx", longArrayOf(dwstackcommitsize.toLong(), dwstackreservesize.toLong(), dwflags.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter))
}

public fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexA", longArrayOf(lpmutexattributes, binitialowner.toLong(), lpname))
}

public fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexExA", longArrayOf(lpmutexattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexExW", longArrayOf(lpmutexattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexW", longArrayOf(lpmutexattributes, binitialowner.toLong(), lpname))
}

public fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePrivateNamespaceA", longArrayOf(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix))
}

public fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePrivateNamespaceW", longArrayOf(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix))
}

public fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateProcessA", longArrayOf(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessAsUserA", longArrayOf(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessAsUserW", longArrayOf(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateProcessW", longArrayOf(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessWithLogonW", longArrayOf(lpusername, lpdomain, lppassword, dwlogonflags.toLong(), lpapplicationname, lpcommandline, dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessWithTokenW", longArrayOf(htoken, dwlogonflags.toLong(), lpapplicationname, lpcommandline, dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateRemoteThread", longArrayOf(hprocess, lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpthreadid))
}

public fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateRemoteThreadEx", longArrayOf(hprocess, lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpattributelist, lpthreadid))
}

public fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreA", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname))
}

public fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreExA", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreExW", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreW", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname))
}

public fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThread", longArrayOf(lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpthreadid))
}

public fun CreateThreadpool(reserved: Long): PTP_POOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpool", longArrayOf(reserved))
}

public fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolCleanupGroup", longArrayOf())
}

public fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolIo", longArrayOf(fl, Win32DynamicFfi.objectSlot(pfnio), pv, pcbe))
}

public fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolTimer", longArrayOf(Win32DynamicFfi.objectSlot(pfnti), pv, pcbe))
}

public fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolWait", longArrayOf(Win32DynamicFfi.objectSlot(pfnwa), pv, pcbe))
}

public fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolWork", longArrayOf(Win32DynamicFfi.objectSlot(pfnwk), pv, pcbe))
}

public fun CreateTimerQueue(): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateTimerQueue", longArrayOf())
}

public fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateTimerQueueTimer", longArrayOf(phnewtimer, timerqueue, Win32DynamicFfi.objectSlot(callback), parameter, duetime.toLong(), period.toLong(), flags.toLong())).toInt()
}

public fun CreateUmsCompletionList(umscompletionlist: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateUmsCompletionList", longArrayOf(umscompletionlist)).toInt()
}

public fun CreateUmsThreadContext(lpumsthread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateUmsThreadContext", longArrayOf(lpumsthread)).toInt()
}

public fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerA", longArrayOf(lptimerattributes, bmanualreset.toLong(), lptimername))
}

public fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerExA", longArrayOf(lptimerattributes, lptimername, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerExW", longArrayOf(lptimerattributes, lptimername, dwflags.toLong(), dwdesiredaccess.toLong()))
}

public fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerW", longArrayOf(lptimerattributes, bmanualreset.toLong(), lptimername))
}

public fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeleteBoundaryDescriptor", longArrayOf(boundarydescriptor))
}

public fun DeleteCriticalSection(lpcriticalsection: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeleteCriticalSection", longArrayOf(lpcriticalsection))
}

public fun DeleteFiber(lpfiber: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeleteFiber", longArrayOf(lpfiber))
}

public fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeleteProcThreadAttributeList", longArrayOf(lpattributelist))
}

public fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteSynchronizationBarrier", longArrayOf(lpbarrier)).toInt()
}

public fun DeleteTimerQueue(timerqueue: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueue", longArrayOf(timerqueue)).toInt()
}

public fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueueEx", longArrayOf(timerqueue, completionevent)).toInt()
}

public fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueueTimer", longArrayOf(timerqueue, timer, completionevent)).toInt()
}

public fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteUmsCompletionList", longArrayOf(umscompletionlist)).toInt()
}

public fun DeleteUmsThreadContext(umsthread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteUmsThreadContext", longArrayOf(umsthread)).toInt()
}

public fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DequeueUmsCompletionListItems", longArrayOf(umscompletionlist, waittimeout.toLong(), umsthreadlist)).toInt()
}

public fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE) {
    Win32DynamicFfi.invoke("kernel32.dll", "DisassociateCurrentThreadFromCallback", longArrayOf(pci))
}

public fun EnterCriticalSection(lpcriticalsection: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "EnterCriticalSection", longArrayOf(lpcriticalsection))
}

public fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnterSynchronizationBarrier", longArrayOf(lpbarrier, dwflags.toLong())).toInt()
}

public fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnterUmsSchedulingMode", longArrayOf(schedulerstartupinfo)).toInt()
}

public fun ExecuteUmsThread(umsthread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ExecuteUmsThread", longArrayOf(umsthread)).toInt()
}

public fun ExitProcess(uexitcode: UInt): Nothing {
    Win32DynamicFfi.invoke("kernel32.dll", "ExitProcess", longArrayOf(uexitcode.toLong()))
    error("unreachable")
}

public fun ExitThread(dwexitcode: UInt): Nothing {
    Win32DynamicFfi.invoke("kernel32.dll", "ExitThread", longArrayOf(dwexitcode.toLong()))
    error("unreachable")
}

public fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlsAlloc", longArrayOf(Win32DynamicFfi.objectSlot(lpcallback))).toUInt()
}

public fun FlsFree(dwflsindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlsFree", longArrayOf(dwflsindex.toLong())).toInt()
}

public fun FlsGetValue(dwflsindex: UInt): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlsGetValue", longArrayOf(dwflsindex.toLong()))
}

public fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlsSetValue", longArrayOf(dwflsindex.toLong(), lpflsdata)).toInt()
}

public fun FlushProcessWriteBuffers() {
    Win32DynamicFfi.invoke("kernel32.dll", "FlushProcessWriteBuffers", longArrayOf())
}

public fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE) {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeLibraryWhenCallbackReturns", longArrayOf(pci, mod))
}

public fun GetActiveProcessorCount(groupnumber: UShort): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetActiveProcessorCount", longArrayOf(groupnumber.toLong())).toUInt()
}

public fun GetActiveProcessorGroupCount(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetActiveProcessorGroupCount", longArrayOf()).toUShort()
}

public fun GetCurrentProcess(): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentProcess", longArrayOf())
}

public fun GetCurrentProcessId(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentProcessId", longArrayOf()).toUInt()
}

public fun GetCurrentProcessorNumber(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentProcessorNumber", longArrayOf()).toUInt()
}

public fun GetCurrentProcessorNumberEx(procnumber: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentProcessorNumberEx", longArrayOf(procnumber))
}

public fun GetCurrentThread(): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentThread", longArrayOf())
}

public fun GetCurrentThreadId(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentThreadId", longArrayOf()).toUInt()
}

public fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentThreadStackLimits", longArrayOf(lowlimit, highlimit))
}

public fun GetCurrentUmsThread(): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentUmsThread", longArrayOf())
}

public fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExitCodeProcess", longArrayOf(hprocess, lpexitcode)).toInt()
}

public fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExitCodeThread", longArrayOf(hthread, lpexitcode)).toInt()
}

public fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetGuiResources", longArrayOf(hprocess, uiflags.toLong())).toUInt()
}

public fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMachineTypeAttributes", longArrayOf(machine.toLong(), machinetypeattributes)).toInt()
}

public fun GetMaximumProcessorCount(groupnumber: UShort): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMaximumProcessorCount", longArrayOf(groupnumber.toLong())).toUInt()
}

public fun GetMaximumProcessorGroupCount(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMaximumProcessorGroupCount", longArrayOf()).toUShort()
}

public fun GetNextUmsListItem(umscontext: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNextUmsListItem", longArrayOf(umscontext))
}

public fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaAvailableMemoryNode", longArrayOf(node.toLong(), availablebytes)).toInt()
}

public fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaAvailableMemoryNodeEx", longArrayOf(node.toLong(), availablebytes)).toInt()
}

public fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaHighestNodeNumber", longArrayOf(highestnodenumber)).toInt()
}

public fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaNodeNumberFromHandle", longArrayOf(hfile, nodenumber)).toInt()
}

public fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaNodeProcessorMask", longArrayOf(node.toLong(), processormask)).toInt()
}

public fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaNodeProcessorMask2", longArrayOf(nodenumber.toLong(), processormasks, processormaskcount.toLong(), requiredmaskcount)).toInt()
}

public fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaNodeProcessorMaskEx", longArrayOf(node.toLong(), processormask)).toInt()
}

public fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaProcessorNode", longArrayOf(processor.toLong(), nodenumber)).toInt()
}

public fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaProcessorNodeEx", longArrayOf(processor, nodenumber)).toInt()
}

public fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaProximityNode", longArrayOf(proximityid.toLong(), nodenumber)).toInt()
}

public fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaProximityNodeEx", longArrayOf(proximityid.toLong(), nodenumber)).toInt()
}

public fun GetPriorityClass(hprocess: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPriorityClass", longArrayOf(hprocess)).toUInt()
}

public fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessAffinityMask", longArrayOf(hprocess, lpprocessaffinitymask, lpsystemaffinitymask)).toInt()
}

public fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDEPPolicy", longArrayOf(hprocess, lpflags, lppermanent)).toInt()
}

public fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDefaultCpuSetMasks", longArrayOf(process, cpusetmasks, cpusetmaskcount.toLong(), requiredmaskcount)).toInt()
}

public fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDefaultCpuSets", longArrayOf(process, cpusetids, cpusetidcount.toLong(), requiredidcount)).toInt()
}

public fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessGroupAffinity", longArrayOf(hprocess, groupcount, grouparray)).toInt()
}

public fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessHandleCount", longArrayOf(hprocess, pdwhandlecount)).toInt()
}

public fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE {
    return Win32DynamicFfi.invoke("oleacc.dll", "GetProcessHandleFromHwnd", longArrayOf(hwnd))
}

public fun GetProcessId(process: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessId", longArrayOf(process)).toUInt()
}

public fun GetProcessIdOfThread(thread: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessIdOfThread", longArrayOf(thread)).toUInt()
}

public fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessInformation", longArrayOf(hprocess, processinformationclass.toLong(), processinformation, processinformationsize.toLong())).toInt()
}

public fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessIoCounters", longArrayOf(hprocess, lpiocounters)).toInt()
}

public fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessMitigationPolicy", longArrayOf(hprocess, mitigationpolicy.toLong(), lpbuffer, dwlength.toLong())).toInt()
}

public fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessPriorityBoost", longArrayOf(hprocess, pdisablepriorityboost)).toInt()
}

public fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessShutdownParameters", longArrayOf(lpdwlevel, lpdwflags)).toInt()
}

public fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessTimes", longArrayOf(hprocess, lpcreationtime, lpexittime, lpkerneltime, lpusertime)).toInt()
}

public fun GetProcessVersion(processid: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessVersion", longArrayOf(processid.toLong())).toUInt()
}

public fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessWorkingSetSize", longArrayOf(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize)).toInt()
}

public fun GetStartupInfoA(lpstartupinfo: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetStartupInfoA", longArrayOf(lpstartupinfo))
}

public fun GetStartupInfoW(lpstartupinfo: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "GetStartupInfoW", longArrayOf(lpstartupinfo))
}

public fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemTimes", longArrayOf(lpidletime, lpkerneltime, lpusertime)).toInt()
}

public fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadDescription", longArrayOf(hthread, ppszthreaddescription)).toInt()
}

public fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadGroupAffinity", longArrayOf(hthread, groupaffinity)).toInt()
}

public fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadIOPendingFlag", longArrayOf(hthread, lpioispending)).toInt()
}

public fun GetThreadId(thread: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadId", longArrayOf(thread)).toUInt()
}

public fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadIdealProcessorEx", longArrayOf(hthread, lpidealprocessor)).toInt()
}

public fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadInformation", longArrayOf(hthread, threadinformationclass.toLong(), threadinformation, threadinformationsize.toLong())).toInt()
}

public fun GetThreadPriority(hthread: HANDLE): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadPriority", longArrayOf(hthread)).toInt()
}

public fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadPriorityBoost", longArrayOf(hthread, pdisablepriorityboost)).toInt()
}

public fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadSelectedCpuSetMasks", longArrayOf(thread, cpusetmasks, cpusetmaskcount.toLong(), requiredmaskcount)).toInt()
}

public fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadSelectedCpuSets", longArrayOf(thread, cpusetids, cpusetidcount.toLong(), requiredidcount)).toInt()
}

public fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadTimes", longArrayOf(hthread, lpcreationtime, lpexittime, lpkerneltime, lpusertime)).toInt()
}

public fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUmsCompletionListEvent", longArrayOf(umscompletionlist, umscompletionevent)).toInt()
}

public fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUmsSystemThreadInformation", longArrayOf(threadhandle, systemthreadinfo)).toInt()
}

public fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitOnceBeginInitialize", longArrayOf(lpinitonce, dwflags.toLong(), fpending, lpcontext)).toInt()
}

public fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitOnceComplete", longArrayOf(lpinitonce, dwflags.toLong(), lpcontext)).toInt()
}

public fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitOnceExecuteOnce", longArrayOf(initonce, Win32DynamicFfi.objectSlot(initfn), parameter, context)).toInt()
}

public fun InitOnceInitialize(initonce: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "InitOnceInitialize", longArrayOf(initonce))
}

public fun InitializeConditionVariable(conditionvariable: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "InitializeConditionVariable", longArrayOf(conditionvariable))
}

public fun InitializeCriticalSection(lpcriticalsection: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "InitializeCriticalSection", longArrayOf(lpcriticalsection))
}

public fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeCriticalSectionAndSpinCount", longArrayOf(lpcriticalsection, dwspincount.toLong())).toInt()
}

public fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeCriticalSectionEx", longArrayOf(lpcriticalsection, dwspincount.toLong(), flags.toLong())).toInt()
}

public fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeProcThreadAttributeList", longArrayOf(lpattributelist, dwattributecount.toLong(), dwflags.toLong(), lpsize)).toInt()
}

public fun InitializeSListHead(listhead: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "InitializeSListHead", longArrayOf(listhead))
}

public fun InitializeSRWLock(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "InitializeSRWLock", longArrayOf(srwlock))
}

public fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeSynchronizationBarrier", longArrayOf(lpbarrier, ltotalthreads.toLong(), lspincount.toLong())).toInt()
}

public fun InterlockedFlushSList(listhead: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "InterlockedFlushSList", longArrayOf(listhead))
}

public fun InterlockedPopEntrySList(listhead: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "InterlockedPopEntrySList", longArrayOf(listhead))
}

public fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "InterlockedPushEntrySList", longArrayOf(listhead, listentry))
}

public fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "InterlockedPushListSListEx", longArrayOf(listhead, list, listend, count.toLong()))
}

public fun IsImmersiveProcess(hprocess: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsImmersiveProcess", longArrayOf(hprocess)).toInt()
}

public fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsProcessCritical", longArrayOf(hprocess, critical)).toInt()
}

public fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsProcessorFeaturePresent", longArrayOf(processorfeature.toLong())).toInt()
}

public fun IsThreadAFiber(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsThreadAFiber", longArrayOf()).toInt()
}

public fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsThreadpoolTimerSet", longArrayOf(pti)).toInt()
}

public fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsWow64Process", longArrayOf(hprocess, wow64process)).toInt()
}

public fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsWow64Process2", longArrayOf(hprocess, pprocessmachine, pnativemachine)).toInt()
}

public fun LeaveCriticalSection(lpcriticalsection: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "LeaveCriticalSection", longArrayOf(lpcriticalsection))
}

public fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "LeaveCriticalSectionWhenCallbackReturns", longArrayOf(pci, pcs))
}

public fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenEventA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenEventW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenMutexW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenPrivateNamespaceA", longArrayOf(lpboundarydescriptor, lpaliasprefix))
}

public fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenPrivateNamespaceW", longArrayOf(lpboundarydescriptor, lpaliasprefix))
}

public fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenProcess", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), dwprocessid.toLong()))
}

public fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenProcessToken", longArrayOf(processhandle, desiredaccess.toLong(), tokenhandle)).toInt()
}

public fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenSemaphoreW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenThread", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), dwthreadid.toLong()))
}

public fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenThreadToken", longArrayOf(threadhandle, desiredaccess.toLong(), openasself.toLong(), tokenhandle)).toInt()
}

public fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenWaitableTimerA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lptimername))
}

public fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenWaitableTimerW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lptimername))
}

public fun PulseEvent(hevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PulseEvent", longArrayOf(hevent)).toInt()
}

public fun QueryDepthSList(listhead: Long): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryDepthSList", longArrayOf(listhead)).toUShort()
}

public fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryFullProcessImageNameA", longArrayOf(hprocess, dwflags.toLong(), lpexename, lpdwsize)).toInt()
}

public fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryFullProcessImageNameW", longArrayOf(hprocess, dwflags.toLong(), lpexename, lpdwsize)).toInt()
}

public fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryProcessAffinityUpdateMode", longArrayOf(hprocess, lpdwflags)).toInt()
}

public fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryProtectedPolicy", longArrayOf(policyguid, policyvalue)).toInt()
}

public fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryThreadpoolStackInformation", longArrayOf(ptpp, ptpsi)).toInt()
}

public fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryUmsThreadInformation", longArrayOf(umsthread, umsthreadinfoclass.toLong(), umsthreadinformation, umsthreadinformationlength.toLong(), returnlength)).toInt()
}

public fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserAPC", longArrayOf(Win32DynamicFfi.objectSlot(pfnapc), hthread, dwdata.toLong())).toUInt()
}

public fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserAPC2", longArrayOf(Win32DynamicFfi.objectSlot(apcroutine), thread, data.toLong(), flags.toLong())).toInt()
}

public fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserWorkItem", longArrayOf(Win32DynamicFfi.objectSlot(function), context, flags.toLong())).toInt()
}

public fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterWaitForSingleObject", longArrayOf(phnewwaitobject, hobject, Win32DynamicFfi.objectSlot(callback), context, dwmilliseconds.toLong(), dwflags.toLong())).toInt()
}

public fun ReleaseMutex(hmutex: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReleaseMutex", longArrayOf(hmutex)).toInt()
}

public fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseMutexWhenCallbackReturns", longArrayOf(pci, mut))
}

public fun ReleaseSRWLockExclusive(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSRWLockExclusive", longArrayOf(srwlock))
}

public fun ReleaseSRWLockShared(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSRWLockShared", longArrayOf(srwlock))
}

public fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSemaphore", longArrayOf(hsemaphore, lreleasecount.toLong(), lppreviouscount)).toInt()
}

public fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSemaphoreWhenCallbackReturns", longArrayOf(pci, sem, crel.toLong()))
}

public fun ResetEvent(hevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResetEvent", longArrayOf(hevent)).toInt()
}

public fun ResumeThread(hthread: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResumeThread", longArrayOf(hthread)).toUInt()
}

public fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqAddPeriodicCallback", longArrayOf(Win32DynamicFfi.objectSlot(callback), context, key)).toInt()
}

public fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqAllocateSerialWorkQueue", longArrayOf(workqueueidin.toLong(), workqueueidout)).toInt()
}

public fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqAllocateWorkQueue", longArrayOf(workqueuetype.toLong(), workqueueid)).toInt()
}

public fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqBeginRegisterWorkQueueWithMMCSS", longArrayOf(workqueueid.toLong(), usageclass, dwtaskid.toLong(), lpriority.toLong(), donecallback, donestate)).toInt()
}

public fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqBeginUnregisterWorkQueueWithMMCSS", longArrayOf(workqueueid.toLong(), donecallback, donestate)).toInt()
}

public fun RtwqCancelDeadline(prequest: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqCancelDeadline", longArrayOf(prequest)).toInt()
}

public fun RtwqCancelWorkItem(key: ULong): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqCancelWorkItem", longArrayOf(key.toLong())).toInt()
}

public fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqCreateAsyncResult", longArrayOf(appobject, callback, appstate, asyncresult)).toInt()
}

public fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqEndRegisterWorkQueueWithMMCSS", longArrayOf(result, taskid)).toInt()
}

public fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqGetWorkQueueMMCSSClass", longArrayOf(workqueueid.toLong(), usageclass, usageclasslength)).toInt()
}

public fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqGetWorkQueueMMCSSPriority", longArrayOf(workqueueid.toLong(), priority)).toInt()
}

public fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqGetWorkQueueMMCSSTaskId", longArrayOf(workqueueid.toLong(), taskid)).toInt()
}

public fun RtwqInvokeCallback(result: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqInvokeCallback", longArrayOf(result)).toInt()
}

public fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqJoinWorkQueue", longArrayOf(workqueueid.toLong(), hfile, out)).toInt()
}

public fun RtwqLockPlatform(): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqLockPlatform", longArrayOf()).toInt()
}

public fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqLockSharedWorkQueue", longArrayOf(usageclass, basepriority.toLong(), taskid, id)).toInt()
}

public fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqLockWorkQueue", longArrayOf(workqueueid.toLong())).toInt()
}

public fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqPutWaitingWorkItem", longArrayOf(hevent, lpriority.toLong(), result, key)).toInt()
}

public fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqPutWorkItem", longArrayOf(dwqueue.toLong(), lpriority.toLong(), result)).toInt()
}

public fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqRegisterPlatformEvents", longArrayOf(platformevents)).toInt()
}

public fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqRegisterPlatformWithMMCSS", longArrayOf(usageclass, taskid, lpriority.toLong())).toInt()
}

public fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqRemovePeriodicCallback", longArrayOf(dwkey.toLong())).toInt()
}

public fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqScheduleWorkItem", longArrayOf(result, timeout, key)).toInt()
}

public fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqSetDeadline", longArrayOf(workqueueid.toLong(), deadlineinhns, prequest)).toInt()
}

public fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqSetDeadline2", longArrayOf(workqueueid.toLong(), deadlineinhns, predeadlineinhns, prequest)).toInt()
}

public fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqSetLongRunning", longArrayOf(workqueueid.toLong(), enable.toLong())).toInt()
}

public fun RtwqShutdown(): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqShutdown", longArrayOf()).toInt()
}

public fun RtwqStartup(): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqStartup", longArrayOf()).toInt()
}

public fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnjoinWorkQueue", longArrayOf(workqueueid.toLong(), hfile)).toInt()
}

public fun RtwqUnlockPlatform(): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnlockPlatform", longArrayOf()).toInt()
}

public fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnlockWorkQueue", longArrayOf(workqueueid.toLong())).toInt()
}

public fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnregisterPlatformEvents", longArrayOf(platformevents)).toInt()
}

public fun RtwqUnregisterPlatformFromMMCSS(): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnregisterPlatformFromMMCSS", longArrayOf()).toInt()
}

public fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCriticalSectionSpinCount", longArrayOf(lpcriticalsection, dwspincount.toLong())).toUInt()
}

public fun SetEvent(hevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEvent", longArrayOf(hevent)).toInt()
}

public fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetEventWhenCallbackReturns", longArrayOf(pci, evt))
}

public fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetPriorityClass", longArrayOf(hprocess, dwpriorityclass.toLong())).toInt()
}

public fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessAffinityMask", longArrayOf(hprocess, dwprocessaffinitymask.toLong())).toInt()
}

public fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessAffinityUpdateMode", longArrayOf(hprocess, dwflags.toLong())).toInt()
}

public fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDEPPolicy", longArrayOf(dwflags.toLong())).toInt()
}

public fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDefaultCpuSetMasks", longArrayOf(process, cpusetmasks, cpusetmaskcount.toLong())).toInt()
}

public fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDefaultCpuSets", longArrayOf(process, cpusetids, cpusetidcount.toLong())).toInt()
}

public fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDynamicEHContinuationTargets", longArrayOf(process, numberoftargets.toLong(), targets)).toInt()
}

public fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDynamicEnforcedCetCompatibleRanges", longArrayOf(process, numberofranges.toLong(), ranges)).toInt()
}

public fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessInformation", longArrayOf(hprocess, processinformationclass.toLong(), processinformation, processinformationsize.toLong())).toInt()
}

public fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessMitigationPolicy", longArrayOf(mitigationpolicy.toLong(), lpbuffer, dwlength.toLong())).toInt()
}

public fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessPriorityBoost", longArrayOf(hprocess, bdisablepriorityboost.toLong())).toInt()
}

public fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessRestrictionExemption", longArrayOf(fenableexemption.toLong())).toInt()
}

public fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessShutdownParameters", longArrayOf(dwlevel.toLong(), dwflags.toLong())).toInt()
}

public fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessWorkingSetSize", longArrayOf(hprocess, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong())).toInt()
}

public fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProtectedPolicy", longArrayOf(policyguid, policyvalue.toLong(), oldpolicyvalue)).toInt()
}

public fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadAffinityMask", longArrayOf(hthread, dwthreadaffinitymask.toLong())).toULong()
}

public fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadDescription", longArrayOf(hthread, lpthreaddescription)).toInt()
}

public fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadGroupAffinity", longArrayOf(hthread, groupaffinity, previousgroupaffinity)).toInt()
}

public fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadIdealProcessor", longArrayOf(hthread, dwidealprocessor.toLong())).toUInt()
}

public fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadIdealProcessorEx", longArrayOf(hthread, lpidealprocessor, lppreviousidealprocessor)).toInt()
}

public fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadInformation", longArrayOf(hthread, threadinformationclass.toLong(), threadinformation, threadinformationsize.toLong())).toInt()
}

public fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPriority", longArrayOf(hthread, npriority.toLong())).toInt()
}

public fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPriorityBoost", longArrayOf(hthread, bdisablepriorityboost.toLong())).toInt()
}

public fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadSelectedCpuSetMasks", longArrayOf(thread, cpusetmasks, cpusetmaskcount.toLong())).toInt()
}

public fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadSelectedCpuSets", longArrayOf(thread, cpusetids, cpusetidcount.toLong())).toInt()
}

public fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadStackGuarantee", longArrayOf(stacksizeinbytes)).toInt()
}

public fun SetThreadToken(thread: Long, token: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetThreadToken", longArrayOf(thread, token)).toInt()
}

public fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolStackInformation", longArrayOf(ptpp, ptpsi)).toInt()
}

public fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolThreadMaximum", longArrayOf(ptpp, cthrdmost.toLong()))
}

public fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolThreadMinimum", longArrayOf(ptpp, cthrdmic.toLong())).toInt()
}

public fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolTimer", longArrayOf(pti, pftduetime, msperiod.toLong(), mswindowlength.toLong()))
}

public fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolTimerEx", longArrayOf(pti, pftduetime, msperiod.toLong(), mswindowlength.toLong())).toInt()
}

public fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolWait", longArrayOf(pwa, h, pfttimeout))
}

public fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolWaitEx", longArrayOf(pwa, h, pfttimeout, reserved)).toInt()
}

public fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetTimerQueueTimer", longArrayOf(timerqueue, Win32DynamicFfi.objectSlot(callback), parameter, duetime.toLong(), period.toLong(), preferio.toLong()))
}

public fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetUmsThreadInformation", longArrayOf(umsthread, umsthreadinfoclass.toLong(), umsthreadinformation, umsthreadinformationlength.toLong())).toInt()
}

public fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetWaitableTimer", longArrayOf(htimer, lpduetime, lperiod.toLong(), Win32DynamicFfi.objectSlot(pfncompletionroutine), lpargtocompletionroutine, fresume.toLong())).toInt()
}

public fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetWaitableTimerEx", longArrayOf(htimer, lpduetime, lperiod.toLong(), Win32DynamicFfi.objectSlot(pfncompletionroutine), lpargtocompletionroutine, wakecontext, tolerabledelay.toLong())).toInt()
}

public fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT {
    return Win32DynamicFfi.invoke("kernel32.dll", "SignalObjectAndWait", longArrayOf(hobjecttosignal, hobjecttowaiton, dwmilliseconds.toLong(), balertable.toLong())).toUInt()
}

public fun Sleep(dwmilliseconds: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "Sleep", longArrayOf(dwmilliseconds.toLong()))
}

public fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SleepConditionVariableCS", longArrayOf(conditionvariable, criticalsection, dwmilliseconds.toLong())).toInt()
}

public fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SleepConditionVariableSRW", longArrayOf(conditionvariable, srwlock, dwmilliseconds.toLong(), flags.toLong())).toInt()
}

public fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SleepEx", longArrayOf(dwmilliseconds.toLong(), balertable.toLong())).toUInt()
}

public fun StartThreadpoolIo(pio: PTP_IO) {
    Win32DynamicFfi.invoke("kernel32.dll", "StartThreadpoolIo", longArrayOf(pio))
}

public fun SubmitThreadpoolWork(pwk: PTP_WORK) {
    Win32DynamicFfi.invoke("kernel32.dll", "SubmitThreadpoolWork", longArrayOf(pwk))
}

public fun SuspendThread(hthread: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SuspendThread", longArrayOf(hthread)).toUInt()
}

public fun SwitchToFiber(lpfiber: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "SwitchToFiber", longArrayOf(lpfiber))
}

public fun SwitchToThread(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SwitchToThread", longArrayOf()).toInt()
}

public fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateProcess", longArrayOf(hprocess, uexitcode.toLong())).toInt()
}

public fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateThread", longArrayOf(hthread, dwexitcode.toLong())).toInt()
}

public fun TlsAlloc(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "TlsAlloc", longArrayOf()).toUInt()
}

public fun TlsFree(dwtlsindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TlsFree", longArrayOf(dwtlsindex.toLong())).toInt()
}

public fun TlsGetValue(dwtlsindex: UInt): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "TlsGetValue", longArrayOf(dwtlsindex.toLong()))
}

public fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TlsSetValue", longArrayOf(dwtlsindex.toLong(), lptlsvalue)).toInt()
}

public fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "TryAcquireSRWLockExclusive", longArrayOf(srwlock))
    return (rawRet and 0xFFL) != 0L
}

public fun TryAcquireSRWLockShared(srwlock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "TryAcquireSRWLockShared", longArrayOf(srwlock))
    return (rawRet and 0xFFL) != 0L
}

public fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TryEnterCriticalSection", longArrayOf(lpcriticalsection)).toInt()
}

public fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TrySubmitThreadpoolCallback", longArrayOf(Win32DynamicFfi.objectSlot(pfns), pv, pcbe)).toInt()
}

public fun UmsThreadYield(schedulerparam: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UmsThreadYield", longArrayOf(schedulerparam)).toInt()
}

public fun UnregisterWait(waithandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterWait", longArrayOf(waithandle)).toInt()
}

public fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterWaitEx", longArrayOf(waithandle, completionevent)).toInt()
}

public fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateProcThreadAttribute", longArrayOf(lpattributelist, dwflags.toLong(), attribute.toLong(), lpvalue, cbsize.toLong(), lppreviousvalue, lpreturnsize)).toInt()
}

public fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "WaitForInputIdle", longArrayOf(hprocess, dwmilliseconds.toLong())).toUInt()
}

public fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForMultipleObjects", longArrayOf(ncount.toLong(), lphandles, bwaitall.toLong(), dwmilliseconds.toLong())).toUInt()
}

public fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForMultipleObjectsEx", longArrayOf(ncount.toLong(), lphandles, bwaitall.toLong(), dwmilliseconds.toLong(), balertable.toLong())).toUInt()
}

public fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForSingleObject", longArrayOf(hhandle, dwmilliseconds.toLong())).toUInt()
}

public fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForSingleObjectEx", longArrayOf(hhandle, dwmilliseconds.toLong(), balertable.toLong())).toUInt()
}

public fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForThreadpoolIoCallbacks", longArrayOf(pio, fcancelpendingcallbacks.toLong()))
}

public fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForThreadpoolTimerCallbacks", longArrayOf(pti, fcancelpendingcallbacks.toLong()))
}

public fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForThreadpoolWaitCallbacks", longArrayOf(pwa, fcancelpendingcallbacks.toLong()))
}

public fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL) {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForThreadpoolWorkCallbacks", longArrayOf(pwk, fcancelpendingcallbacks.toLong()))
}

public fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-synch-l1-2-0.dll", "WaitOnAddress", longArrayOf(address, compareaddress, addresssize.toLong(), dwmilliseconds.toLong())).toInt()
}

public fun WakeAllConditionVariable(conditionvariable: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "WakeAllConditionVariable", longArrayOf(conditionvariable))
}

public fun WakeByAddressAll(address: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-synch-l1-2-0.dll", "WakeByAddressAll", longArrayOf(address))
}

public fun WakeByAddressSingle(address: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-synch-l1-2-0.dll", "WakeByAddressSingle", longArrayOf(address))
}

public fun WakeConditionVariable(conditionvariable: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "WakeConditionVariable", longArrayOf(conditionvariable))
}

public fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "WinExec", longArrayOf(lpcmdline, ucmdshow.toLong())).toUInt()
}

public fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort {
    return Win32DynamicFfi.invoke("api-ms-win-core-wow64-l1-1-1.dll", "Wow64SetThreadDefaultGuestMachine", longArrayOf(machine.toLong())).toUShort()
}

public fun Wow64SuspendThread(hthread: HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64SuspendThread", longArrayOf(hthread)).toUInt()
}
