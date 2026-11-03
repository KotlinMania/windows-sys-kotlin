package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

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

public fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: Security.PSID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddIntegrityLabelToBoundaryDescriptor", longArrayOf(boundarydescriptor, Win32DynamicFfi.objectSlot(integritylabel))).toInt()
}

public fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: Security.PSID): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddSIDToBoundaryDescriptor", longArrayOf(boundarydescriptor, Win32DynamicFfi.objectSlot(requiredsid))).toInt()
}

public fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AttachThreadInput", longArrayOf(idattach.toLong(), idattachto.toLong(), fattach.toLong())).toInt()
}

public fun AvQuerySystemResponsiveness(avrthandle: Foundation.HANDLE, systemresponsivenessvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvQuerySystemResponsiveness", longArrayOf(Win32DynamicFfi.objectSlot(avrthandle), systemresponsivenessvalue)).toInt()
}

public fun AvRevertMmThreadCharacteristics(avrthandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRevertMmThreadCharacteristics", longArrayOf(Win32DynamicFfi.objectSlot(avrthandle))).toInt()
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

public fun AvRtDeleteThreadOrderingGroup(context: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtDeleteThreadOrderingGroup", longArrayOf(Win32DynamicFfi.objectSlot(context))).toInt()
}

public fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtJoinThreadOrderingGroup", longArrayOf(context, threadorderingguid, before.toLong())).toInt()
}

public fun AvRtLeaveThreadOrderingGroup(context: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtLeaveThreadOrderingGroup", longArrayOf(Win32DynamicFfi.objectSlot(context))).toInt()
}

public fun AvRtWaitOnThreadOrderingGroup(context: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvRtWaitOnThreadOrderingGroup", longArrayOf(Win32DynamicFfi.objectSlot(context))).toInt()
}

public fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("avrt.dll", "AvSetMmMaxThreadCharacteristicsA", longArrayOf(firsttask, secondtask, taskindex))
    return Foundation.HANDLE()
}

public fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("avrt.dll", "AvSetMmMaxThreadCharacteristicsW", longArrayOf(firsttask, secondtask, taskindex))
    return Foundation.HANDLE()
}

public fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadCharacteristicsA", longArrayOf(taskname, taskindex))
    return Foundation.HANDLE()
}

public fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadCharacteristicsW", longArrayOf(taskname, taskindex))
    return Foundation.HANDLE()
}

public fun AvSetMmThreadPriority(avrthandle: Foundation.HANDLE, priority: AVRT_PRIORITY): BOOL {
    return Win32DynamicFfi.invoke("avrt.dll", "AvSetMmThreadPriority", longArrayOf(Win32DynamicFfi.objectSlot(avrthandle), priority.toLong())).toInt()
}

public fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CallbackMayRunLong", longArrayOf(pci)).toInt()
}

public fun CancelThreadpoolIo(pio: PTP_IO) {
    Win32DynamicFfi.invoke("kernel32.dll", "CancelThreadpoolIo", longArrayOf(pio))
}

public fun CancelTimerQueueTimer(timerqueue: Foundation.HANDLE, timer: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelTimerQueueTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(timer))).toInt()
}

public fun CancelWaitableTimer(htimer: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelWaitableTimer", longArrayOf(Win32DynamicFfi.objectSlot(htimer))).toInt()
}

public fun ChangeTimerQueueTimer(timerqueue: Foundation.HANDLE, timer: Foundation.HANDLE, duetime: UInt, period: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ChangeTimerQueueTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(timer), duetime.toLong(), period.toLong())).toInt()
}

public fun ClosePrivateNamespace(handle: Foundation.HANDLE, flags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "ClosePrivateNamespace", longArrayOf(Win32DynamicFfi.objectSlot(handle), flags.toLong()))
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

public fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateBoundaryDescriptorA", longArrayOf(name, flags.toLong()))
    return Foundation.HANDLE()
}

public fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateBoundaryDescriptorW", longArrayOf(name, flags.toLong()))
    return Foundation.HANDLE()
}

public fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateEventA", longArrayOf(lpeventattributes, bmanualreset.toLong(), binitialstate.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateEventExA", longArrayOf(lpeventattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateEventExW", longArrayOf(lpeventattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateEventW", longArrayOf(lpeventattributes, bmanualreset.toLong(), binitialstate.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFiber", longArrayOf(dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter))
}

public fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFiberEx", longArrayOf(dwstackcommitsize.toLong(), dwstackreservesize.toLong(), dwflags.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter))
}

public fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexA", longArrayOf(lpmutexattributes, binitialowner.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexExA", longArrayOf(lpmutexattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexExW", longArrayOf(lpmutexattributes, lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateMutexW", longArrayOf(lpmutexattributes, binitialowner.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreatePrivateNamespaceA", longArrayOf(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix))
    return Foundation.HANDLE()
}

public fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreatePrivateNamespaceW", longArrayOf(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix))
    return Foundation.HANDLE()
}

public fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateProcessA", longArrayOf(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessAsUserA(htoken: Foundation.HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessAsUserA", longArrayOf(Win32DynamicFfi.objectSlot(htoken), lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessAsUserW(htoken: Foundation.HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessAsUserW", longArrayOf(Win32DynamicFfi.objectSlot(htoken), lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateProcessW", longArrayOf(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles.toLong(), dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessWithLogonW", longArrayOf(lpusername, lpdomain, lppassword, dwlogonflags.toLong(), lpapplicationname, lpcommandline, dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateProcessWithTokenW(htoken: Foundation.HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateProcessWithTokenW", longArrayOf(Win32DynamicFfi.objectSlot(htoken), dwlogonflags.toLong(), lpapplicationname, lpcommandline, dwcreationflags.toLong(), lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation)).toInt()
}

public fun CreateRemoteThread(hprocess: Foundation.HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateRemoteThread", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpthreadid))
    return Foundation.HANDLE()
}

public fun CreateRemoteThreadEx(hprocess: Foundation.HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateRemoteThreadEx", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpattributelist, lpthreadid))
    return Foundation.HANDLE()
}

public fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreA", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreExA", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreExW", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateSemaphoreW", longArrayOf(lpsemaphoreattributes, linitialcount.toLong(), lmaximumcount.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateThread", longArrayOf(lpthreadattributes, dwstacksize.toLong(), Win32DynamicFfi.objectSlot(lpstartaddress), lpparameter, dwcreationflags.toLong(), lpthreadid))
    return Foundation.HANDLE()
}

public fun CreateThreadpool(reserved: Long): PTP_POOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpool", longArrayOf(reserved))
}

public fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolCleanupGroup", longArrayOf())
}

public fun CreateThreadpoolIo(fl: Foundation.HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateThreadpoolIo", longArrayOf(Win32DynamicFfi.objectSlot(fl), Win32DynamicFfi.objectSlot(pfnio), pv, pcbe))
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

public fun CreateTimerQueue(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateTimerQueue", longArrayOf())
    return Foundation.HANDLE()
}

public fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: Foundation.HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateTimerQueueTimer", longArrayOf(phnewtimer, Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(callback), parameter, duetime.toLong(), period.toLong(), flags.toLong())).toInt()
}

public fun CreateUmsCompletionList(umscompletionlist: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateUmsCompletionList", longArrayOf(umscompletionlist)).toInt()
}

public fun CreateUmsThreadContext(lpumsthread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateUmsThreadContext", longArrayOf(lpumsthread)).toInt()
}

public fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerA", longArrayOf(lptimerattributes, bmanualreset.toLong(), lptimername))
    return Foundation.HANDLE()
}

public fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerExA", longArrayOf(lptimerattributes, lptimername, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerExW", longArrayOf(lptimerattributes, lptimername, dwflags.toLong(), dwdesiredaccess.toLong()))
    return Foundation.HANDLE()
}

public fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "CreateWaitableTimerW", longArrayOf(lptimerattributes, bmanualreset.toLong(), lptimername))
    return Foundation.HANDLE()
}

public fun DeleteBoundaryDescriptor(boundarydescriptor: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeleteBoundaryDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(boundarydescriptor)))
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

public fun DeleteTimerQueue(timerqueue: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueue", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue))).toInt()
}

public fun DeleteTimerQueueEx(timerqueue: Foundation.HANDLE, completionevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueueEx", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(completionevent))).toInt()
}

public fun DeleteTimerQueueTimer(timerqueue: Foundation.HANDLE, timer: Foundation.HANDLE, completionevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeleteTimerQueueTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(timer), Win32DynamicFfi.objectSlot(completionevent))).toInt()
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

public fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: Foundation.HMODULE) {
    Win32DynamicFfi.invoke("kernel32.dll", "FreeLibraryWhenCallbackReturns", longArrayOf(pci, Win32DynamicFfi.objectSlot(mod)))
}

public fun GetActiveProcessorCount(groupnumber: UShort): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetActiveProcessorCount", longArrayOf(groupnumber.toLong())).toUInt()
}

public fun GetActiveProcessorGroupCount(): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetActiveProcessorGroupCount", longArrayOf()).toUShort()
}

public fun GetCurrentProcess(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentProcess", longArrayOf())
    return Foundation.HANDLE()
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

public fun GetCurrentThread(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentThread", longArrayOf())
    return Foundation.HANDLE()
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

public fun GetExitCodeProcess(hprocess: Foundation.HANDLE, lpexitcode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExitCodeProcess", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpexitcode)).toInt()
}

public fun GetExitCodeThread(hthread: Foundation.HANDLE, lpexitcode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetExitCodeThread", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpexitcode)).toInt()
}

public fun GetGuiResources(hprocess: Foundation.HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetGuiResources", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), uiflags.toLong())).toUInt()
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

public fun GetNumaNodeNumberFromHandle(hfile: Foundation.HANDLE, nodenumber: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetNumaNodeNumberFromHandle", longArrayOf(Win32DynamicFfi.objectSlot(hfile), nodenumber)).toInt()
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

public fun GetPriorityClass(hprocess: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPriorityClass", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toUInt()
}

public fun GetProcessAffinityMask(hprocess: Foundation.HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessAffinityMask", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpprocessaffinitymask, lpsystemaffinitymask)).toInt()
}

public fun GetProcessDEPPolicy(hprocess: Foundation.HANDLE, lpflags: Long, lppermanent: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDEPPolicy", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpflags, lppermanent)).toInt()
}

public fun GetProcessDefaultCpuSetMasks(process: Foundation.HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDefaultCpuSetMasks", longArrayOf(Win32DynamicFfi.objectSlot(process), cpusetmasks, cpusetmaskcount.toLong(), requiredmaskcount)).toInt()
}

public fun GetProcessDefaultCpuSets(process: Foundation.HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessDefaultCpuSets", longArrayOf(Win32DynamicFfi.objectSlot(process), cpusetids, cpusetidcount.toLong(), requiredidcount)).toInt()
}

public fun GetProcessGroupAffinity(hprocess: Foundation.HANDLE, groupcount: Long, grouparray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessGroupAffinity", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), groupcount, grouparray)).toInt()
}

public fun GetProcessHandleCount(hprocess: Foundation.HANDLE, pdwhandlecount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessHandleCount", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pdwhandlecount)).toInt()
}

public fun GetProcessHandleFromHwnd(hwnd: Foundation.HWND): Foundation.HANDLE {
    Win32DynamicFfi.invoke("oleacc.dll", "GetProcessHandleFromHwnd", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HANDLE()
}

public fun GetProcessId(process: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessId", longArrayOf(Win32DynamicFfi.objectSlot(process))).toUInt()
}

public fun GetProcessIdOfThread(thread: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessIdOfThread", longArrayOf(Win32DynamicFfi.objectSlot(thread))).toUInt()
}

public fun GetProcessInformation(hprocess: Foundation.HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessInformation", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), processinformationclass.toLong(), processinformation, processinformationsize.toLong())).toInt()
}

public fun GetProcessIoCounters(hprocess: Foundation.HANDLE, lpiocounters: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessIoCounters", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpiocounters)).toInt()
}

public fun GetProcessMitigationPolicy(hprocess: Foundation.HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessMitigationPolicy", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), mitigationpolicy.toLong(), lpbuffer, dwlength.toLong())).toInt()
}

public fun GetProcessPriorityBoost(hprocess: Foundation.HANDLE, pdisablepriorityboost: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessPriorityBoost", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pdisablepriorityboost)).toInt()
}

public fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessShutdownParameters", longArrayOf(lpdwlevel, lpdwflags)).toInt()
}

public fun GetProcessTimes(hprocess: Foundation.HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessTimes", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpcreationtime, lpexittime, lpkerneltime, lpusertime)).toInt()
}

public fun GetProcessVersion(processid: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessVersion", longArrayOf(processid.toLong())).toUInt()
}

public fun GetProcessWorkingSetSize(hprocess: Foundation.HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessWorkingSetSize", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpminimumworkingsetsize, lpmaximumworkingsetsize)).toInt()
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

public fun GetThreadDescription(hthread: Foundation.HANDLE, ppszthreaddescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadDescription", longArrayOf(Win32DynamicFfi.objectSlot(hthread), ppszthreaddescription)).toInt()
}

public fun GetThreadGroupAffinity(hthread: Foundation.HANDLE, groupaffinity: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadGroupAffinity", longArrayOf(Win32DynamicFfi.objectSlot(hthread), groupaffinity)).toInt()
}

public fun GetThreadIOPendingFlag(hthread: Foundation.HANDLE, lpioispending: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadIOPendingFlag", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpioispending)).toInt()
}

public fun GetThreadId(thread: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadId", longArrayOf(Win32DynamicFfi.objectSlot(thread))).toUInt()
}

public fun GetThreadIdealProcessorEx(hthread: Foundation.HANDLE, lpidealprocessor: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadIdealProcessorEx", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpidealprocessor)).toInt()
}

public fun GetThreadInformation(hthread: Foundation.HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadInformation", longArrayOf(Win32DynamicFfi.objectSlot(hthread), threadinformationclass.toLong(), threadinformation, threadinformationsize.toLong())).toInt()
}

public fun GetThreadPriority(hthread: Foundation.HANDLE): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadPriority", longArrayOf(Win32DynamicFfi.objectSlot(hthread))).toInt()
}

public fun GetThreadPriorityBoost(hthread: Foundation.HANDLE, pdisablepriorityboost: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadPriorityBoost", longArrayOf(Win32DynamicFfi.objectSlot(hthread), pdisablepriorityboost)).toInt()
}

public fun GetThreadSelectedCpuSetMasks(thread: Foundation.HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadSelectedCpuSetMasks", longArrayOf(Win32DynamicFfi.objectSlot(thread), cpusetmasks, cpusetmaskcount.toLong(), requiredmaskcount)).toInt()
}

public fun GetThreadSelectedCpuSets(thread: Foundation.HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadSelectedCpuSets", longArrayOf(Win32DynamicFfi.objectSlot(thread), cpusetids, cpusetidcount.toLong(), requiredidcount)).toInt()
}

public fun GetThreadTimes(hthread: Foundation.HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadTimes", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpcreationtime, lpexittime, lpkerneltime, lpusertime)).toInt()
}

public fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUmsCompletionListEvent", longArrayOf(umscompletionlist, umscompletionevent)).toInt()
}

public fun GetUmsSystemThreadInformation(threadhandle: Foundation.HANDLE, systemthreadinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetUmsSystemThreadInformation", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), systemthreadinfo)).toInt()
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

public fun IsImmersiveProcess(hprocess: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsImmersiveProcess", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toInt()
}

public fun IsProcessCritical(hprocess: Foundation.HANDLE, critical: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsProcessCritical", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), critical)).toInt()
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

public fun IsWow64Process(hprocess: Foundation.HANDLE, wow64process: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsWow64Process", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), wow64process)).toInt()
}

public fun IsWow64Process2(hprocess: Foundation.HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsWow64Process2", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), pprocessmachine, pnativemachine)).toInt()
}

public fun LeaveCriticalSection(lpcriticalsection: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "LeaveCriticalSection", longArrayOf(lpcriticalsection))
}

public fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "LeaveCriticalSectionWhenCallbackReturns", longArrayOf(pci, pcs))
}

public fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenEventA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenEventW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenMutexW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenPrivateNamespaceA", longArrayOf(lpboundarydescriptor, lpaliasprefix))
    return Foundation.HANDLE()
}

public fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenPrivateNamespaceW", longArrayOf(lpboundarydescriptor, lpaliasprefix))
    return Foundation.HANDLE()
}

public fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenProcess", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), dwprocessid.toLong()))
    return Foundation.HANDLE()
}

public fun OpenProcessToken(processhandle: Foundation.HANDLE, desiredaccess: Security.TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenProcessToken", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), Win32DynamicFfi.objectSlot(desiredaccess), tokenhandle)).toInt()
}

public fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenSemaphoreW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenThread", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), dwthreadid.toLong()))
    return Foundation.HANDLE()
}

public fun OpenThreadToken(threadhandle: Foundation.HANDLE, desiredaccess: Security.TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenThreadToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), Win32DynamicFfi.objectSlot(desiredaccess), openasself.toLong(), tokenhandle)).toInt()
}

public fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenWaitableTimerA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lptimername))
    return Foundation.HANDLE()
}

public fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenWaitableTimerW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lptimername))
    return Foundation.HANDLE()
}

public fun PulseEvent(hevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PulseEvent", longArrayOf(Win32DynamicFfi.objectSlot(hevent))).toInt()
}

public fun QueryDepthSList(listhead: Long): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryDepthSList", longArrayOf(listhead)).toUShort()
}

public fun QueryFullProcessImageNameA(hprocess: Foundation.HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryFullProcessImageNameA", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwflags.toLong(), lpexename, lpdwsize)).toInt()
}

public fun QueryFullProcessImageNameW(hprocess: Foundation.HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryFullProcessImageNameW", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwflags.toLong(), lpexename, lpdwsize)).toInt()
}

public fun QueryProcessAffinityUpdateMode(hprocess: Foundation.HANDLE, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryProcessAffinityUpdateMode", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), lpdwflags)).toInt()
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

public fun QueueUserAPC(pfnapc: Foundation.PAPCFUNC, hthread: Foundation.HANDLE, dwdata: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserAPC", longArrayOf(Win32DynamicFfi.objectSlot(pfnapc), Win32DynamicFfi.objectSlot(hthread), dwdata.toLong())).toUInt()
}

public fun QueueUserAPC2(apcroutine: Foundation.PAPCFUNC, thread: Foundation.HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserAPC2", longArrayOf(Win32DynamicFfi.objectSlot(apcroutine), Win32DynamicFfi.objectSlot(thread), data.toLong(), flags.toLong())).toInt()
}

public fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueueUserWorkItem", longArrayOf(Win32DynamicFfi.objectSlot(function), context, flags.toLong())).toInt()
}

public fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: Foundation.HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterWaitForSingleObject", longArrayOf(phnewwaitobject, Win32DynamicFfi.objectSlot(hobject), Win32DynamicFfi.objectSlot(callback), context, dwmilliseconds.toLong(), dwflags.toLong())).toInt()
}

public fun ReleaseMutex(hmutex: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReleaseMutex", longArrayOf(Win32DynamicFfi.objectSlot(hmutex))).toInt()
}

public fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseMutexWhenCallbackReturns", longArrayOf(pci, Win32DynamicFfi.objectSlot(mut)))
}

public fun ReleaseSRWLockExclusive(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSRWLockExclusive", longArrayOf(srwlock))
}

public fun ReleaseSRWLockShared(srwlock: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSRWLockShared", longArrayOf(srwlock))
}

public fun ReleaseSemaphore(hsemaphore: Foundation.HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSemaphore", longArrayOf(Win32DynamicFfi.objectSlot(hsemaphore), lreleasecount.toLong(), lppreviouscount)).toInt()
}

public fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: Foundation.HANDLE, crel: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseSemaphoreWhenCallbackReturns", longArrayOf(pci, Win32DynamicFfi.objectSlot(sem), crel.toLong()))
}

public fun ResetEvent(hevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResetEvent", longArrayOf(Win32DynamicFfi.objectSlot(hevent))).toInt()
}

public fun ResumeThread(hthread: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResumeThread", longArrayOf(Win32DynamicFfi.objectSlot(hthread))).toUInt()
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

public fun RtwqCancelDeadline(prequest: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqCancelDeadline", longArrayOf(Win32DynamicFfi.objectSlot(prequest))).toInt()
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

public fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: Foundation.HANDLE, out: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqJoinWorkQueue", longArrayOf(workqueueid.toLong(), Win32DynamicFfi.objectSlot(hfile), out)).toInt()
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

public fun RtwqPutWaitingWorkItem(hevent: Foundation.HANDLE, lpriority: Int, result: Long, key: Long): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqPutWaitingWorkItem", longArrayOf(Win32DynamicFfi.objectSlot(hevent), lpriority.toLong(), result, key)).toInt()
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

public fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("rtworkq.dll", "RtwqUnjoinWorkQueue", longArrayOf(workqueueid.toLong(), Win32DynamicFfi.objectSlot(hfile))).toInt()
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

public fun SetEvent(hevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEvent", longArrayOf(Win32DynamicFfi.objectSlot(hevent))).toInt()
}

public fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetEventWhenCallbackReturns", longArrayOf(pci, Win32DynamicFfi.objectSlot(evt)))
}

public fun SetPriorityClass(hprocess: Foundation.HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetPriorityClass", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwpriorityclass.toLong())).toInt()
}

public fun SetProcessAffinityMask(hprocess: Foundation.HANDLE, dwprocessaffinitymask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessAffinityMask", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwprocessaffinitymask.toLong())).toInt()
}

public fun SetProcessAffinityUpdateMode(hprocess: Foundation.HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessAffinityUpdateMode", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwflags.toLong())).toInt()
}

public fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDEPPolicy", longArrayOf(dwflags.toLong())).toInt()
}

public fun SetProcessDefaultCpuSetMasks(process: Foundation.HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDefaultCpuSetMasks", longArrayOf(Win32DynamicFfi.objectSlot(process), cpusetmasks, cpusetmaskcount.toLong())).toInt()
}

public fun SetProcessDefaultCpuSets(process: Foundation.HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDefaultCpuSets", longArrayOf(Win32DynamicFfi.objectSlot(process), cpusetids, cpusetidcount.toLong())).toInt()
}

public fun SetProcessDynamicEHContinuationTargets(process: Foundation.HANDLE, numberoftargets: UShort, targets: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDynamicEHContinuationTargets", longArrayOf(Win32DynamicFfi.objectSlot(process), numberoftargets.toLong(), targets)).toInt()
}

public fun SetProcessDynamicEnforcedCetCompatibleRanges(process: Foundation.HANDLE, numberofranges: UShort, ranges: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessDynamicEnforcedCetCompatibleRanges", longArrayOf(Win32DynamicFfi.objectSlot(process), numberofranges.toLong(), ranges)).toInt()
}

public fun SetProcessInformation(hprocess: Foundation.HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessInformation", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), processinformationclass.toLong(), processinformation, processinformationsize.toLong())).toInt()
}

public fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessMitigationPolicy", longArrayOf(mitigationpolicy.toLong(), lpbuffer, dwlength.toLong())).toInt()
}

public fun SetProcessPriorityBoost(hprocess: Foundation.HANDLE, bdisablepriorityboost: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessPriorityBoost", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), bdisablepriorityboost.toLong())).toInt()
}

public fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessRestrictionExemption", longArrayOf(fenableexemption.toLong())).toInt()
}

public fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessShutdownParameters", longArrayOf(dwlevel.toLong(), dwflags.toLong())).toInt()
}

public fun SetProcessWorkingSetSize(hprocess: Foundation.HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessWorkingSetSize", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong())).toInt()
}

public fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProtectedPolicy", longArrayOf(policyguid, policyvalue.toLong(), oldpolicyvalue)).toInt()
}

public fun SetThreadAffinityMask(hthread: Foundation.HANDLE, dwthreadaffinitymask: ULong): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadAffinityMask", longArrayOf(Win32DynamicFfi.objectSlot(hthread), dwthreadaffinitymask.toLong())).toULong()
}

public fun SetThreadDescription(hthread: Foundation.HANDLE, lpthreaddescription: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadDescription", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpthreaddescription)).toInt()
}

public fun SetThreadGroupAffinity(hthread: Foundation.HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadGroupAffinity", longArrayOf(Win32DynamicFfi.objectSlot(hthread), groupaffinity, previousgroupaffinity)).toInt()
}

public fun SetThreadIdealProcessor(hthread: Foundation.HANDLE, dwidealprocessor: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadIdealProcessor", longArrayOf(Win32DynamicFfi.objectSlot(hthread), dwidealprocessor.toLong())).toUInt()
}

public fun SetThreadIdealProcessorEx(hthread: Foundation.HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadIdealProcessorEx", longArrayOf(Win32DynamicFfi.objectSlot(hthread), lpidealprocessor, lppreviousidealprocessor)).toInt()
}

public fun SetThreadInformation(hthread: Foundation.HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadInformation", longArrayOf(Win32DynamicFfi.objectSlot(hthread), threadinformationclass.toLong(), threadinformation, threadinformationsize.toLong())).toInt()
}

public fun SetThreadPriority(hthread: Foundation.HANDLE, npriority: THREAD_PRIORITY): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPriority", longArrayOf(Win32DynamicFfi.objectSlot(hthread), npriority.toLong())).toInt()
}

public fun SetThreadPriorityBoost(hthread: Foundation.HANDLE, bdisablepriorityboost: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadPriorityBoost", longArrayOf(Win32DynamicFfi.objectSlot(hthread), bdisablepriorityboost.toLong())).toInt()
}

public fun SetThreadSelectedCpuSetMasks(thread: Foundation.HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadSelectedCpuSetMasks", longArrayOf(Win32DynamicFfi.objectSlot(thread), cpusetmasks, cpusetmaskcount.toLong())).toInt()
}

public fun SetThreadSelectedCpuSets(thread: Foundation.HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadSelectedCpuSets", longArrayOf(Win32DynamicFfi.objectSlot(thread), cpusetids, cpusetidcount.toLong())).toInt()
}

public fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadStackGuarantee", longArrayOf(stacksizeinbytes)).toInt()
}

public fun SetThreadToken(thread: Long, token: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetThreadToken", longArrayOf(thread, Win32DynamicFfi.objectSlot(token))).toInt()
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

public fun SetThreadpoolWait(pwa: PTP_WAIT, h: Foundation.HANDLE, pfttimeout: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolWait", longArrayOf(pwa, Win32DynamicFfi.objectSlot(h), pfttimeout))
}

public fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: Foundation.HANDLE, pfttimeout: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadpoolWaitEx", longArrayOf(pwa, Win32DynamicFfi.objectSlot(h), pfttimeout, reserved)).toInt()
}

public fun SetTimerQueueTimer(timerqueue: Foundation.HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "SetTimerQueueTimer", longArrayOf(Win32DynamicFfi.objectSlot(timerqueue), Win32DynamicFfi.objectSlot(callback), parameter, duetime.toLong(), period.toLong(), preferio.toLong()))
    return Foundation.HANDLE()
}

public fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetUmsThreadInformation", longArrayOf(umsthread, umsthreadinfoclass.toLong(), umsthreadinformation, umsthreadinformationlength.toLong())).toInt()
}

public fun SetWaitableTimer(htimer: Foundation.HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetWaitableTimer", longArrayOf(Win32DynamicFfi.objectSlot(htimer), lpduetime, lperiod.toLong(), Win32DynamicFfi.objectSlot(pfncompletionroutine), lpargtocompletionroutine, fresume.toLong())).toInt()
}

public fun SetWaitableTimerEx(htimer: Foundation.HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetWaitableTimerEx", longArrayOf(Win32DynamicFfi.objectSlot(htimer), lpduetime, lperiod.toLong(), Win32DynamicFfi.objectSlot(pfncompletionroutine), lpargtocompletionroutine, wakecontext, tolerabledelay.toLong())).toInt()
}

public fun SignalObjectAndWait(hobjecttosignal: Foundation.HANDLE, hobjecttowaiton: Foundation.HANDLE, dwmilliseconds: UInt, balertable: BOOL): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("kernel32.dll", "SignalObjectAndWait", longArrayOf(Win32DynamicFfi.objectSlot(hobjecttosignal), Win32DynamicFfi.objectSlot(hobjecttowaiton), dwmilliseconds.toLong(), balertable.toLong()))
    return Foundation.WAIT_EVENT()
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

public fun SuspendThread(hthread: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SuspendThread", longArrayOf(Win32DynamicFfi.objectSlot(hthread))).toUInt()
}

public fun SwitchToFiber(lpfiber: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "SwitchToFiber", longArrayOf(lpfiber))
}

public fun SwitchToThread(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SwitchToThread", longArrayOf()).toInt()
}

public fun TerminateProcess(hprocess: Foundation.HANDLE, uexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateProcess", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), uexitcode.toLong())).toInt()
}

public fun TerminateThread(hthread: Foundation.HANDLE, dwexitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "TerminateThread", longArrayOf(Win32DynamicFfi.objectSlot(hthread), dwexitcode.toLong())).toInt()
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

public fun UnregisterWait(waithandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterWait", longArrayOf(Win32DynamicFfi.objectSlot(waithandle))).toInt()
}

public fun UnregisterWaitEx(waithandle: Foundation.HANDLE, completionevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterWaitEx", longArrayOf(Win32DynamicFfi.objectSlot(waithandle), Win32DynamicFfi.objectSlot(completionevent))).toInt()
}

public fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UpdateProcThreadAttribute", longArrayOf(lpattributelist, dwflags.toLong(), attribute.toLong(), lpvalue, cbsize.toLong(), lppreviousvalue, lpreturnsize)).toInt()
}

public fun WaitForInputIdle(hprocess: Foundation.HANDLE, dwmilliseconds: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "WaitForInputIdle", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), dwmilliseconds.toLong())).toUInt()
}

public fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForMultipleObjects", longArrayOf(ncount.toLong(), lphandles, bwaitall.toLong(), dwmilliseconds.toLong()))
    return Foundation.WAIT_EVENT()
}

public fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForMultipleObjectsEx", longArrayOf(ncount.toLong(), lphandles, bwaitall.toLong(), dwmilliseconds.toLong(), balertable.toLong()))
    return Foundation.WAIT_EVENT()
}

public fun WaitForSingleObject(hhandle: Foundation.HANDLE, dwmilliseconds: UInt): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForSingleObject", longArrayOf(Win32DynamicFfi.objectSlot(hhandle), dwmilliseconds.toLong()))
    return Foundation.WAIT_EVENT()
}

public fun WaitForSingleObjectEx(hhandle: Foundation.HANDLE, dwmilliseconds: UInt, balertable: BOOL): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("kernel32.dll", "WaitForSingleObjectEx", longArrayOf(Win32DynamicFfi.objectSlot(hhandle), dwmilliseconds.toLong(), balertable.toLong()))
    return Foundation.WAIT_EVENT()
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

public fun Wow64SuspendThread(hthread: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64SuspendThread", longArrayOf(Win32DynamicFfi.objectSlot(hthread))).toUInt()
}
