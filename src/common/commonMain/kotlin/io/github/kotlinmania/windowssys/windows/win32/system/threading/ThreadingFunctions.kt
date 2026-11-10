package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask

public expect fun acquireSRWLockExclusive(srwlock: COpaquePointer?)

public expect fun acquireSRWLockShared(srwlock: COpaquePointer?)

public expect fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, integritylabel: Psid): Bool

public expect fun addSIDToBoundaryDescriptor(boundarydescriptor: COpaquePointer?, requiredsid: Psid): Bool

public expect fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool

public expect fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: COpaquePointer?): Bool

public expect fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool

public expect fun avRtCreateThreadOrderingGroup(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?): Bool

public expect fun avRtCreateThreadOrderingGroupExA(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcstr): Bool

public expect fun avRtCreateThreadOrderingGroupExW(context: COpaquePointer?, period: COpaquePointer?, threadorderingguid: COpaquePointer?, timeout: COpaquePointer?, taskname: Pcwstr): Bool

public expect fun avRtDeleteThreadOrderingGroup(context: Handle): Bool

public expect fun avRtJoinThreadOrderingGroup(context: COpaquePointer?, threadorderingguid: COpaquePointer?, before: Bool): Bool

public expect fun avRtLeaveThreadOrderingGroup(context: Handle): Bool

public expect fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool

public expect fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: COpaquePointer?): Handle

public expect fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: COpaquePointer?): Handle

public expect fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: COpaquePointer?): Handle

public expect fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: COpaquePointer?): Handle

public expect fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool

public expect fun callbackMayRunLong(pci: PtpCallbackInstance): Bool

public expect fun cancelThreadpoolIo(pio: PtpIo)

public expect fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool

public expect fun cancelWaitableTimer(htimer: Handle): Bool

public expect fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool

public expect fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean

public expect fun closeThreadpool(ptpp: PtpPool)

public expect fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup)

public expect fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: COpaquePointer?)

public expect fun closeThreadpoolIo(pio: PtpIo)

public expect fun closeThreadpoolTimer(pti: PtpTimer)

public expect fun closeThreadpoolWait(pwa: PtpWait)

public expect fun closeThreadpoolWork(pwk: PtpWork)

public expect fun convertFiberToThread(): Bool

public expect fun convertThreadToFiber(lpparameter: COpaquePointer?): COpaquePointer?

public expect fun convertThreadToFiberEx(lpparameter: COpaquePointer?, dwflags: UInt): COpaquePointer?

public expect fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle

public expect fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle

public expect fun createEventA(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle

public expect fun createEventExA(lpeventattributes: COpaquePointer?, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventExW(lpeventattributes: COpaquePointer?, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle

public expect fun createEventW(lpeventattributes: COpaquePointer?, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle

public expect fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer?

public expect fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: COpaquePointer?): COpaquePointer?

public expect fun createMutexA(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcstr): Handle

public expect fun createMutexExA(lpmutexattributes: COpaquePointer?, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexExW(lpmutexattributes: COpaquePointer?, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createMutexW(lpmutexattributes: COpaquePointer?, binitialowner: Bool, lpname: Pcwstr): Handle

public expect fun createPrivateNamespaceA(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle

public expect fun createPrivateNamespaceW(lpprivatenamespaceattributes: COpaquePointer?, lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle

public expect fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: COpaquePointer?, lpthreadattributes: COpaquePointer?, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: COpaquePointer?, lpcurrentdirectory: Pcwstr, lpstartupinfo: COpaquePointer?, lpprocessinformation: COpaquePointer?): Bool

public expect fun createRemoteThread(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpthreadid: COpaquePointer?): Handle

public expect fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: COpaquePointer?): Handle

public expect fun createSemaphoreA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle

public expect fun createSemaphoreExA(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreExW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createSemaphoreW(lpsemaphoreattributes: COpaquePointer?, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle

public expect fun createThread(lpthreadattributes: COpaquePointer?, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: COpaquePointer?, dwcreationflags: ThreadCreationFlags, lpthreadid: COpaquePointer?): Handle

public expect fun createThreadpool(reserved: COpaquePointer?): PtpPool

public expect fun createThreadpoolCleanupGroup(): PtpCleanupGroup

public expect fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpIo

public expect fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpTimer

public expect fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWait

public expect fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): PtpWork

public expect fun createTimerQueue(): Handle

public expect fun createTimerQueueTimer(phnewtimer: COpaquePointer?, timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool

public expect fun createUmsCompletionList(umscompletionlist: COpaquePointer?): Bool

public expect fun createUmsThreadContext(lpumsthread: COpaquePointer?): Bool

public expect fun createWaitableTimerA(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcstr): Handle

public expect fun createWaitableTimerExA(lptimerattributes: COpaquePointer?, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerExW(lptimerattributes: COpaquePointer?, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle

public expect fun createWaitableTimerW(lptimerattributes: COpaquePointer?, bmanualreset: Bool, lptimername: Pcwstr): Handle

public expect fun deleteBoundaryDescriptor(boundarydescriptor: Handle)

public expect fun deleteCriticalSection(lpcriticalsection: COpaquePointer?)

public expect fun deleteFiber(lpfiber: COpaquePointer?)

public expect fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList)

public expect fun deleteSynchronizationBarrier(lpbarrier: COpaquePointer?): Bool

public expect fun deleteTimerQueue(timerqueue: Handle): Bool

public expect fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool

public expect fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool

public expect fun deleteUmsCompletionList(umscompletionlist: COpaquePointer?): Bool

public expect fun deleteUmsThreadContext(umsthread: COpaquePointer?): Bool

public expect fun dequeueUmsCompletionListItems(umscompletionlist: COpaquePointer?, waittimeout: UInt, umsthreadlist: COpaquePointer?): Bool

public expect fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance)

public expect fun enterCriticalSection(lpcriticalsection: COpaquePointer?)

public expect fun enterSynchronizationBarrier(lpbarrier: COpaquePointer?, dwflags: UInt): Bool

public expect fun enterUmsSchedulingMode(schedulerstartupinfo: COpaquePointer?): Bool

public expect fun executeUmsThread(umsthread: COpaquePointer?): Bool

public expect fun exitProcess(uexitcode: UInt): Nothing

public expect fun exitThread(dwexitcode: UInt): Nothing

public expect fun flsAlloc(lpcallback: PflsCallbackFunction): UInt

public expect fun flsFree(dwflsindex: UInt): Bool

public expect fun flsGetValue(dwflsindex: UInt): COpaquePointer?

public expect fun flsSetValue(dwflsindex: UInt, lpflsdata: COpaquePointer?): Bool

public expect fun flushProcessWriteBuffers()

public expect fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule)

public expect fun getActiveProcessorCount(groupnumber: UShort): UInt

public expect fun getActiveProcessorGroupCount(): UShort

public expect fun getCurrentProcess(): Handle

public expect fun getCurrentProcessId(): UInt

public expect fun getCurrentProcessorNumber(): UInt

public expect fun getCurrentProcessorNumberEx(procnumber: COpaquePointer?)

public expect fun getCurrentThread(): Handle

public expect fun getCurrentThreadId(): UInt

public expect fun getCurrentThreadStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?)

public expect fun getCurrentUmsThread(): COpaquePointer?

public expect fun getExitCodeProcess(hprocess: Handle, lpexitcode: COpaquePointer?): Bool

public expect fun getExitCodeThread(hthread: Handle, lpexitcode: COpaquePointer?): Bool

public expect fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt

public expect fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: COpaquePointer?): Hresult

public expect fun getMaximumProcessorCount(groupnumber: UShort): UInt

public expect fun getMaximumProcessorGroupCount(): UShort

public expect fun getNextUmsListItem(umscontext: COpaquePointer?): COpaquePointer?

public expect fun getNumaAvailableMemoryNode(node: UByte, availablebytes: COpaquePointer?): Bool

public expect fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: COpaquePointer?): Bool

public expect fun getNumaHighestNodeNumber(highestnodenumber: COpaquePointer?): Bool

public expect fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: COpaquePointer?): Bool

public expect fun getNumaNodeProcessorMask(node: UByte, processormask: COpaquePointer?): Bool

public expect fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: COpaquePointer?, processormaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool

public expect fun getNumaNodeProcessorMaskEx(node: UShort, processormask: COpaquePointer?): Bool

public expect fun getNumaProcessorNode(processor: UByte, nodenumber: COpaquePointer?): Bool

public expect fun getNumaProcessorNodeEx(processor: COpaquePointer?, nodenumber: COpaquePointer?): Bool

public expect fun getNumaProximityNode(proximityid: UInt, nodenumber: COpaquePointer?): Bool

public expect fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: COpaquePointer?): Bool

public expect fun getPriorityClass(hprocess: Handle): UInt

public expect fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: COpaquePointer?, lpsystemaffinitymask: COpaquePointer?): Bool

public expect fun getProcessDEPPolicy(hprocess: Handle, lpflags: COpaquePointer?, lppermanent: COpaquePointer?): Bool

public expect fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool

public expect fun getProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool

public expect fun getProcessGroupAffinity(hprocess: Handle, groupcount: COpaquePointer?, grouparray: COpaquePointer?): Bool

public expect fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: COpaquePointer?): Bool

public expect fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle

public expect fun getProcessId(process: Handle): UInt

public expect fun getProcessIdOfThread(thread: Handle): UInt

public expect fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool

public expect fun getProcessIoCounters(hprocess: Handle, lpiocounters: COpaquePointer?): Bool

public expect fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool

public expect fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: COpaquePointer?): Bool

public expect fun getProcessShutdownParameters(lpdwlevel: COpaquePointer?, lpdwflags: COpaquePointer?): Bool

public expect fun getProcessTimes(hprocess: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool

public expect fun getProcessVersion(processid: UInt): UInt

public expect fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?): Bool

public expect fun getStartupInfoA(lpstartupinfo: COpaquePointer?)

public expect fun getStartupInfoW(lpstartupinfo: COpaquePointer?)

public expect fun getSystemTimes(lpidletime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool

public expect fun getThreadDescription(hthread: Handle, ppszthreaddescription: COpaquePointer?): Hresult

public expect fun getThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?): Bool

public expect fun getThreadIOPendingFlag(hthread: Handle, lpioispending: COpaquePointer?): Bool

public expect fun getThreadId(thread: Handle): UInt

public expect fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?): Bool

public expect fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool

public expect fun getThreadPriority(hthread: Handle): Int

public expect fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: COpaquePointer?): Bool

public expect fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort, requiredmaskcount: COpaquePointer?): Bool

public expect fun getThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt, requiredidcount: COpaquePointer?): Bool

public expect fun getThreadTimes(hthread: Handle, lpcreationtime: COpaquePointer?, lpexittime: COpaquePointer?, lpkerneltime: COpaquePointer?, lpusertime: COpaquePointer?): Bool

public expect fun getUmsCompletionListEvent(umscompletionlist: COpaquePointer?, umscompletionevent: COpaquePointer?): Bool

public expect fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: COpaquePointer?): Bool

public expect fun initOnceBeginInitialize(lpinitonce: COpaquePointer?, dwflags: UInt, fpending: COpaquePointer?, lpcontext: COpaquePointer?): Bool

public expect fun initOnceComplete(lpinitonce: COpaquePointer?, dwflags: UInt, lpcontext: COpaquePointer?): Bool

public expect fun initOnceExecuteOnce(initonce: COpaquePointer?, initfn: PinitOnceFn, parameter: COpaquePointer?, context: COpaquePointer?): Bool

public expect fun initOnceInitialize(initonce: COpaquePointer?)

public expect fun initializeConditionVariable(conditionvariable: COpaquePointer?)

public expect fun initializeCriticalSection(lpcriticalsection: COpaquePointer?)

public expect fun initializeCriticalSectionAndSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): Bool

public expect fun initializeCriticalSectionEx(lpcriticalsection: COpaquePointer?, dwspincount: UInt, flags: UInt): Bool

public expect fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: COpaquePointer?): Bool

public expect fun initializeSListHead(listhead: COpaquePointer?)

public expect fun initializeSRWLock(srwlock: COpaquePointer?)

public expect fun initializeSynchronizationBarrier(lpbarrier: COpaquePointer?, ltotalthreads: Int, lspincount: Int): Bool

public expect fun interlockedFlushSList(listhead: COpaquePointer?): COpaquePointer?

public expect fun interlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer?

public expect fun interlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer?

public expect fun interlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer?

public expect fun isImmersiveProcess(hprocess: Handle): Bool

public expect fun isProcessCritical(hprocess: Handle, critical: COpaquePointer?): Bool

public expect fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool

public expect fun isThreadAFiber(): Bool

public expect fun isThreadpoolTimerSet(pti: PtpTimer): Bool

public expect fun isWow64Process(hprocess: Handle, wow64process: COpaquePointer?): Bool

public expect fun isWow64Process2(hprocess: Handle, pprocessmachine: COpaquePointer?, pnativemachine: COpaquePointer?): Bool

public expect fun leaveCriticalSection(lpcriticalsection: COpaquePointer?)

public expect fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: COpaquePointer?)

public expect fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openPrivateNamespaceA(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcstr): Handle

public expect fun openPrivateNamespaceW(lpboundarydescriptor: COpaquePointer?, lpaliasprefix: Pcwstr): Handle

public expect fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle

public expect fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: COpaquePointer?): Bool

public expect fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle

public expect fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: COpaquePointer?): Bool

public expect fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle

public expect fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle

public expect fun pulseEvent(hevent: Handle): Bool

public expect fun queryDepthSList(listhead: COpaquePointer?): UShort

public expect fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: COpaquePointer?): Bool

public expect fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: COpaquePointer?): Bool

public expect fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: COpaquePointer?): Bool

public expect fun queryProtectedPolicy(policyguid: COpaquePointer?, policyvalue: COpaquePointer?): Bool

public expect fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool

public expect fun queryUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt, returnlength: COpaquePointer?): Bool

public expect fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt

public expect fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool

public expect fun queueUserWorkItem(function: LpthreadStartRoutine, context: COpaquePointer?, flags: WorkerThreadFlags): Bool

public expect fun registerWaitForSingleObject(phnewwaitobject: COpaquePointer?, hobject: Handle, callback: Waitortimercallback, context: COpaquePointer?, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool

public expect fun releaseMutex(hmutex: Handle): Bool

public expect fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle)

public expect fun releaseSRWLockExclusive(srwlock: COpaquePointer?)

public expect fun releaseSRWLockShared(srwlock: COpaquePointer?)

public expect fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: COpaquePointer?): Bool

public expect fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt)

public expect fun resetEvent(hevent: Handle): Bool

public expect fun resumeThread(hthread: Handle): UInt

public expect fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: COpaquePointer?, key: COpaquePointer?): Hresult

public expect fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: COpaquePointer?): Hresult

public expect fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: COpaquePointer?): Hresult

public expect fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult

public expect fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: COpaquePointer?, donestate: COpaquePointer?): Hresult

public expect fun rtwqCancelDeadline(prequest: Handle): Hresult

public expect fun rtwqCancelWorkItem(key: ULong): Hresult

public expect fun rtwqCreateAsyncResult(appobject: COpaquePointer?, callback: COpaquePointer?, appstate: COpaquePointer?, asyncresult: COpaquePointer?): Hresult

public expect fun rtwqEndRegisterWorkQueueWithMMCSS(result: COpaquePointer?, taskid: COpaquePointer?): Hresult

public expect fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: COpaquePointer?): Hresult

public expect fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: COpaquePointer?): Hresult

public expect fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: COpaquePointer?): Hresult

public expect fun rtwqInvokeCallback(result: COpaquePointer?): Hresult

public expect fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: COpaquePointer?): Hresult

public expect fun rtwqLockPlatform(): Hresult

public expect fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: COpaquePointer?, id: COpaquePointer?): Hresult

public expect fun rtwqLockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: COpaquePointer?, key: COpaquePointer?): Hresult

public expect fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: COpaquePointer?): Hresult

public expect fun rtwqRegisterPlatformEvents(platformevents: COpaquePointer?): Hresult

public expect fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: COpaquePointer?, lpriority: Int): Hresult

public expect fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult

public expect fun rtwqScheduleWorkItem(result: COpaquePointer?, timeout: Long, key: COpaquePointer?): Hresult

public expect fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: COpaquePointer?): Hresult

public expect fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: COpaquePointer?): Hresult

public expect fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult

public expect fun rtwqShutdown(): Hresult

public expect fun rtwqStartup(): Hresult

public expect fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult

public expect fun rtwqUnlockPlatform(): Hresult

public expect fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult

public expect fun rtwqUnregisterPlatformEvents(platformevents: COpaquePointer?): Hresult

public expect fun rtwqUnregisterPlatformFromMMCSS(): Hresult

public expect fun setCriticalSectionSpinCount(lpcriticalsection: COpaquePointer?, dwspincount: UInt): UInt

public expect fun setEvent(hevent: Handle): Bool

public expect fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle)

public expect fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool

public expect fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool

public expect fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool

public expect fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool

public expect fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool

public expect fun setProcessDefaultCpuSets(process: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool

public expect fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: COpaquePointer?): Bool

public expect fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: COpaquePointer?): Bool

public expect fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: COpaquePointer?, processinformationsize: UInt): Bool

public expect fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: COpaquePointer?, dwlength: ULong): Bool

public expect fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setProcessRestrictionExemption(fenableexemption: Bool): Bool

public expect fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool

public expect fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool

public expect fun setProtectedPolicy(policyguid: COpaquePointer?, policyvalue: ULong, oldpolicyvalue: COpaquePointer?): Bool

public expect fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong

public expect fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult

public expect fun setThreadGroupAffinity(hthread: Handle, groupaffinity: COpaquePointer?, previousgroupaffinity: COpaquePointer?): Bool

public expect fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt

public expect fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: COpaquePointer?, lppreviousidealprocessor: COpaquePointer?): Bool

public expect fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: COpaquePointer?, threadinformationsize: UInt): Bool

public expect fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool

public expect fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool

public expect fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: COpaquePointer?, cpusetmaskcount: UShort): Bool

public expect fun setThreadSelectedCpuSets(thread: Handle, cpusetids: COpaquePointer?, cpusetidcount: UInt): Bool

public expect fun setThreadStackGuarantee(stacksizeinbytes: COpaquePointer?): Bool

public expect fun setThreadToken(thread: COpaquePointer?, token: Handle): Bool

public expect fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: COpaquePointer?): Bool

public expect fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt)

public expect fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool

public expect fun setThreadpoolTimer(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt)

public expect fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: COpaquePointer?, msperiod: UInt, mswindowlength: UInt): Bool

public expect fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?)

public expect fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: COpaquePointer?, duetime: UInt, period: UInt, preferio: Bool): Handle

public expect fun setUmsThreadInformation(umsthread: COpaquePointer?, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: COpaquePointer?, umsthreadinformationlength: UInt): Bool

public expect fun setWaitableTimer(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, fresume: Bool): Bool

public expect fun setWaitableTimerEx(htimer: Handle, lpduetime: COpaquePointer?, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: COpaquePointer?, wakecontext: COpaquePointer?, tolerabledelay: UInt): Bool

public expect fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun sleep(dwmilliseconds: UInt)

public expect fun sleepConditionVariableCS(conditionvariable: COpaquePointer?, criticalsection: COpaquePointer?, dwmilliseconds: UInt): Bool

public expect fun sleepConditionVariableSRW(conditionvariable: COpaquePointer?, srwlock: COpaquePointer?, dwmilliseconds: UInt, flags: UInt): Bool

public expect fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt

public expect fun startThreadpoolIo(pio: PtpIo)

public expect fun submitThreadpoolWork(pwk: PtpWork)

public expect fun suspendThread(hthread: Handle): UInt

public expect fun switchToFiber(lpfiber: COpaquePointer?)

public expect fun switchToThread(): Bool

public expect fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool

public expect fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool

public expect fun tlsAlloc(): UInt

public expect fun tlsFree(dwtlsindex: UInt): Bool

public expect fun tlsGetValue(dwtlsindex: UInt): COpaquePointer?

public expect fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: COpaquePointer?): Bool

public expect fun tryAcquireSRWLockExclusive(srwlock: COpaquePointer?): Boolean

public expect fun tryAcquireSRWLockShared(srwlock: COpaquePointer?): Boolean

public expect fun tryEnterCriticalSection(lpcriticalsection: COpaquePointer?): Bool

public expect fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: COpaquePointer?, pcbe: COpaquePointer?): Bool

public expect fun umsThreadYield(schedulerparam: COpaquePointer?): Bool

public expect fun unregisterWait(waithandle: Handle): Bool

public expect fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool

public expect fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: COpaquePointer?, cbsize: ULong, lppreviousvalue: COpaquePointer?, lpreturnsize: COpaquePointer?): Bool

public expect fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt

public expect fun waitForMultipleObjects(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent

public expect fun waitForMultipleObjectsEx(ncount: UInt, lphandles: COpaquePointer?, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent

public expect fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent

public expect fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool)

public expect fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool)

public expect fun waitOnAddress(address: COpaquePointer?, compareaddress: COpaquePointer?, addresssize: ULong, dwmilliseconds: UInt): Bool

public expect fun wakeAllConditionVariable(conditionvariable: COpaquePointer?)

public expect fun wakeByAddressAll(address: COpaquePointer?)

public expect fun wakeByAddressSingle(address: COpaquePointer?)

public expect fun wakeConditionVariable(conditionvariable: COpaquePointer?)

public expect fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt

public expect fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort

public expect fun wow64SuspendThread(hthread: Handle): UInt
