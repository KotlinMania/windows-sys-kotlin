// port-lint: tests Windows/Win32/System/ProcessStatus/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.ENUM_PAGE_FILE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_32BIT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_64BIT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_ALL
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_DEFAULT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.MODULEINFO
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PENUM_PAGE_FILE_CALLBACKA
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PENUM_PAGE_FILE_CALLBACKW
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PERFORMANCE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PROCESS_MEMORY_COUNTERS
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PROCESS_MEMORY_COUNTERS_EX
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PROCESS_MEMORY_COUNTERS_EX2
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_VERSION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_BLOCK
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_BLOCK_0
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_EX_BLOCK
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_EX_BLOCK_0
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_EX_BLOCK_0_0
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_EX_BLOCK_0_1
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_EX_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WORKING_SET_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WS_WATCH_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_WS_WATCH_INFORMATION_EX
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ProcessStatusTest {
    @Test
    fun testProcessStatusConstants() {
        assertEquals(0u, LIST_MODULES_DEFAULT)
        assertEquals(1u, LIST_MODULES_32BIT)
        assertEquals(2u, LIST_MODULES_64BIT)
        assertEquals(3u, LIST_MODULES_ALL)
        assertEquals(2u, PSAPI_VERSION)
    }

    @Test
    fun testEnumPageFileInformation() {
        val info =
            ENUM_PAGE_FILE_INFORMATION(
                cb = 24u,
                Reserved = 0u,
                TotalSize = 1024uL,
                TotalInUse = 512uL,
                PeakUsage = 768uL,
            )
        assertEquals(24u, info.cb)
        assertEquals(0u, info.Reserved)
        assertEquals(1024uL, info.TotalSize)
        assertEquals(512uL, info.TotalInUse)
        assertEquals(768uL, info.PeakUsage)
    }

    @Test
    fun testModuleInfo() {
        val modInfo =
            MODULEINFO(
                lpBaseOfDll = 0x140000000L,
                SizeOfImage = 0x20000u,
                EntryPoint = 0x140001000L,
            )
        assertEquals(0x140000000L, modInfo.lpBaseOfDll)
        assertEquals(0x20000u, modInfo.SizeOfImage)
        assertEquals(0x140001000L, modInfo.EntryPoint)
    }

    @Test
    fun testPerformanceInformation() {
        val perf =
            PERFORMANCE_INFORMATION(
                cb = 56u,
                CommitTotal = 4096uL,
                CommitLimit = 8192uL,
                CommitPeak = 6000uL,
                PhysicalTotal = 16384uL,
                PhysicalAvailable = 8192uL,
                SystemCache = 2048uL,
                KernelTotal = 1024uL,
                KernelPaged = 512uL,
                KernelNonpaged = 512uL,
                PageSize = 4096uL,
                HandleCount = 25000u,
                ProcessCount = 120u,
                ThreadCount = 950u,
            )
        assertEquals(56u, perf.cb)
        assertEquals(4096uL, perf.CommitTotal)
        assertEquals(8192uL, perf.CommitLimit)
        assertEquals(6000uL, perf.CommitPeak)
        assertEquals(16384uL, perf.PhysicalTotal)
        assertEquals(8192uL, perf.PhysicalAvailable)
        assertEquals(2048uL, perf.SystemCache)
        assertEquals(1024uL, perf.KernelTotal)
        assertEquals(512uL, perf.KernelPaged)
        assertEquals(512uL, perf.KernelNonpaged)
        assertEquals(4096uL, perf.PageSize)
        assertEquals(25000u, perf.HandleCount)
        assertEquals(120u, perf.ProcessCount)
        assertEquals(950u, perf.ThreadCount)
    }

    @Test
    fun testProcessMemoryCounters() {
        val counters =
            PROCESS_MEMORY_COUNTERS(
                cb = 44u,
                PageFaultCount = 100u,
                PeakWorkingSetSize = 1048576uL,
                WorkingSetSize = 524288uL,
                QuotaPeakPagedPoolUsage = 65536uL,
                QuotaPagedPoolUsage = 32768uL,
                QuotaPeakNonPagedPoolUsage = 16384uL,
                QuotaNonPagedPoolUsage = 8192uL,
                PagefileUsage = 2097152uL,
                PeakPagefileUsage = 3145728uL,
            )
        assertEquals(44u, counters.cb)
        assertEquals(100u, counters.PageFaultCount)
        assertEquals(1048576uL, counters.PeakWorkingSetSize)
        assertEquals(524288uL, counters.WorkingSetSize)
        assertEquals(65536uL, counters.QuotaPeakPagedPoolUsage)
        assertEquals(32768uL, counters.QuotaPagedPoolUsage)
        assertEquals(16384uL, counters.QuotaPeakNonPagedPoolUsage)
        assertEquals(8192uL, counters.QuotaNonPagedPoolUsage)
        assertEquals(2097152uL, counters.PagefileUsage)
        assertEquals(3145728uL, counters.PeakPagefileUsage)

        val countersEx =
            PROCESS_MEMORY_COUNTERS_EX(
                cb = 48u,
                PrivateUsage = 4194304uL,
            )
        assertEquals(48u, countersEx.cb)
        assertEquals(4194304uL, countersEx.PrivateUsage)

        val countersEx2 =
            PROCESS_MEMORY_COUNTERS_EX2(
                cb = 64u,
                PrivateUsage = 4194304uL,
                PrivateWorkingSetSize = 2097152uL,
                SharedCommitUsage = 1048576uL,
            )
        assertEquals(64u, countersEx2.cb)
        assertEquals(4194304uL, countersEx2.PrivateUsage)
        assertEquals(2097152uL, countersEx2.PrivateWorkingSetSize)
        assertEquals(1048576uL, countersEx2.SharedCommitUsage)
    }

    @Test
    fun testWorkingSetStructures() {
        val b0 = PSAPI_WORKING_SET_BLOCK_0(_bitfield = 0x1uL)
        val block = PSAPI_WORKING_SET_BLOCK(Flags = 0x1uL, Anonymous = b0)
        assertEquals(0x1uL, block.Flags)
        assertEquals(0x1uL, block.Anonymous._bitfield)

        val exB00 = PSAPI_WORKING_SET_EX_BLOCK_0_0(_bitfield = 0x2uL)
        val exB01 = PSAPI_WORKING_SET_EX_BLOCK_0_1(_bitfield = 0x3uL)
        val exB0 = PSAPI_WORKING_SET_EX_BLOCK_0(Anonymous = exB00, Invalid = exB01)
        val exBlock = PSAPI_WORKING_SET_EX_BLOCK(Flags = 0x2uL, Anonymous = exB0)
        assertEquals(0x2uL, exBlock.Flags)
        assertEquals(0x2uL, exBlock.Anonymous.Anonymous._bitfield)
        assertEquals(0x3uL, exBlock.Anonymous.Invalid._bitfield)

        val wsExInfo =
            PSAPI_WORKING_SET_EX_INFORMATION(
                VirtualAddress = 0x10000000L,
                VirtualAttributes = exBlock,
            )
        assertEquals(0x10000000L, wsExInfo.VirtualAddress)
        assertEquals(0x2uL, wsExInfo.VirtualAttributes.Flags)

        val wsInfo =
            PSAPI_WORKING_SET_INFORMATION(
                NumberOfEntries = 1uL,
                WorkingSetInfo = arrayOf(block),
            )
        assertEquals(1uL, wsInfo.NumberOfEntries)
        assertEquals(block, wsInfo.WorkingSetInfo[0])
        assertEquals(wsInfo, PSAPI_WORKING_SET_INFORMATION(1uL, arrayOf(block)))
    }

    @Test
    fun testWatchInformation() {
        val watchInfo =
            PSAPI_WS_WATCH_INFORMATION(
                FaultingPc = 0x7FFF0001L,
                FaultingVa = 0x7FFF1000L,
            )
        assertEquals(0x7FFF0001L, watchInfo.FaultingPc)
        assertEquals(0x7FFF1000L, watchInfo.FaultingVa)

        val watchInfoEx =
            PSAPI_WS_WATCH_INFORMATION_EX(
                BasicInfo = watchInfo,
                FaultingThreadId = 1234uL,
                Flags = 0uL,
            )
        assertEquals(watchInfo, watchInfoEx.BasicInfo)
        assertEquals(1234uL, watchInfoEx.FaultingThreadId)
        assertEquals(0uL, watchInfoEx.Flags)
    }

    @Test
    fun testPageFileCallbacks() {
        val callbackA =
            PENUM_PAGE_FILE_CALLBACKA { _, ppagefileinfo, _ ->
                assertNotNull(ppagefileinfo)
                1
            }
        val info = ENUM_PAGE_FILE_INFORMATION(cb = 24u)
        val resultA = callbackA.invoke(0L, info, 0L)
        assertEquals(1, resultA)

        val callbackW =
            PENUM_PAGE_FILE_CALLBACKW { _, ppagefileinfo, _ ->
                assertNotNull(ppagefileinfo)
                1
            }
        val resultW = callbackW.invoke(0L, info, 0L)
        assertEquals(1, resultW)
    }
}
