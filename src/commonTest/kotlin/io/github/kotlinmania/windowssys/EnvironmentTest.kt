// port-lint: tests Windows/Win32/System/Environment/mod.rs
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
        val identity = ENCLAVE_IDENTITY(enclaveSvn = 5u)
        val info = ENCLAVE_INFORMATION(enclaveType = 1u, identity = identity)
        assertEquals(5u, info.identity.enclaveSvn)
        assertEquals(1u, info.enclaveType)

        val keyReq = ENCLAVE_VBS_BASIC_KEY_REQUEST(requestSize = 32u, enclaveSvn = 2u)
        assertEquals(32u, keyReq.requestSize)
        assertEquals(2u, keyReq.enclaveSvn)

        val exc = VBS_BASIC_ENCLAVE_EXCEPTION_AMD64(exceptionCode = 0xC0000005u)
        assertEquals(0xC0000005u, exc.exceptionCode)

        val desc32 = VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32(entryPoint = 0x1000u)
        assertEquals(0x1000u, desc32.entryPoint)

        val desc64 = VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64(entryPoint = 0x2000uL)
        assertEquals(0x2000uL, desc64.entryPoint)

        val report = VBS_ENCLAVE_REPORT(reportSize = 128u)
        assertEquals(128u, report.reportSize)

        val mod = VBS_ENCLAVE_REPORT_MODULE(svn = 3u)
        assertEquals(3u, mod.svn)

        val pkg = VBS_ENCLAVE_REPORT_PKG_HEADER(packageSize = 256u)
        assertEquals(256u, pkg.packageSize)

        val syscallPage =
            VBS_BASIC_ENCLAVE_SYSCALL_PAGE(
                returnFromEnclave = { _ -> },
                commitPages = { _, _, _, _ -> 0 },
            )
        assertNotNull(syscallPage.returnFromEnclave)
        assertNotNull(syscallPage.commitPages)
    }
}
