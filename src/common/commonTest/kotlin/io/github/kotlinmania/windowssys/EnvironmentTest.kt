package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_DYNAMIC_DEBUG_ACTIVE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_DYNAMIC_DEBUG_ENABLED
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_FULL_DEBUG_ENABLED
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_IDENTITY
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_IDENTITY_POLICY_SEAL_EXACT_CODE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_REPORT_DATA_LENGTH
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_VBS_BASIC_KEY_REQUEST
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_BASIC_ENCLAVE_EXCEPTION_AMD64
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_BASIC_ENCLAVE_SYSCALL_PAGE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_ENCLAVE_REPORT
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_ENCLAVE_REPORT_MODULE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_ENCLAVE_REPORT_PKG_HEADER
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_ENCLAVE_REPORT_PKG_HEADER_VERSION_CURRENT
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class EnvironmentTest {
    @Test
    fun testEnvironmentConstants() {
        assertEquals(4u, ENCLAVE_FLAG_DYNAMIC_DEBUG_ACTIVE)
        assertEquals(2u, ENCLAVE_FLAG_DYNAMIC_DEBUG_ENABLED)
        assertEquals(1u, ENCLAVE_FLAG_FULL_DEBUG_ENABLED)
        assertEquals(64u, ENCLAVE_REPORT_DATA_LENGTH)
        assertEquals(1, ENCLAVE_IDENTITY_POLICY_SEAL_EXACT_CODE)
        assertEquals(1u, VBS_ENCLAVE_REPORT_PKG_HEADER_VERSION_CURRENT)
    }

    @Test
    fun testEnvironmentStructs() {
        val identity = ENCLAVE_IDENTITY(EnclaveSvn = 5u)
        val info = ENCLAVE_INFORMATION(EnclaveType = 1u, Identity = identity)
        assertEquals(5u, info.Identity.EnclaveSvn)
        assertEquals(1u, info.EnclaveType)

        val keyReq = ENCLAVE_VBS_BASIC_KEY_REQUEST(RequestSize = 32u, EnclaveSVN = 2u)
        assertEquals(32u, keyReq.RequestSize)
        assertEquals(2u, keyReq.EnclaveSVN)

        val exc = VBS_BASIC_ENCLAVE_EXCEPTION_AMD64(ExceptionCode = 0xC0000005u)
        assertEquals(0xC0000005u, exc.ExceptionCode)

        val desc32 = VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32(EntryPoint = 0x1000u)
        assertEquals(0x1000u, desc32.EntryPoint)

        val desc64 = VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64(EntryPoint = 0x2000uL)
        assertEquals(0x2000uL, desc64.EntryPoint)

        val report = VBS_ENCLAVE_REPORT(ReportSize = 128u)
        assertEquals(128u, report.ReportSize)

        val mod = VBS_ENCLAVE_REPORT_MODULE(Svn = 3u)
        assertEquals(3u, mod.Svn)

        val pkg = VBS_ENCLAVE_REPORT_PKG_HEADER(PackageSize = 256u)
        assertEquals(256u, pkg.PackageSize)

        val syscallPage =
            VBS_BASIC_ENCLAVE_SYSCALL_PAGE(
                ReturnFromEnclave = { _ -> },
                CommitPages = { _, _, _, _ -> 0 },
            )
        assertNotNull(syscallPage.ReturnFromEnclave)
        assertNotNull(syscallPage.CommitPages)
    }
}
