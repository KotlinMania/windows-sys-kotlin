package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_DYNAMIC_DEBUG_ACTIVE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_DYNAMIC_DEBUG_ENABLED
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_FLAG_FULL_DEBUG_ENABLED
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_IDENTITY_POLICY_SEAL_EXACT_CODE
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ENCLAVE_REPORT_DATA_LENGTH
import io.github.kotlinmania.windowssys.windows.win32.system.environment.EnclaveIdentity
import io.github.kotlinmania.windowssys.windows.win32.system.environment.EnclaveInformation
import io.github.kotlinmania.windowssys.windows.win32.system.environment.EnclaveVbsBasicKeyRequest
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VBS_ENCLAVE_REPORT_PKG_HEADER_VERSION_CURRENT
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveBasicCallCommitPagesFn
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveBasicCallReturnFromEnclaveFn
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveExceptionAmd64
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveSyscallPage
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveThreadDescriptor32
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsBasicEnclaveThreadDescriptor64
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsEnclaveReport
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsEnclaveReportModule
import io.github.kotlinmania.windowssys.windows.win32.system.environment.VbsEnclaveReportPkgHeader
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
        val identity = EnclaveIdentity(enclaveSvn = 5u)
        val info = EnclaveInformation(enclaveType = 1u, identity = identity)
        assertEquals(5u, info.identity.enclaveSvn)
        assertEquals(1u, info.enclaveType)

        val keyReq = EnclaveVbsBasicKeyRequest(requestSize = 32u, enclaveSVN = 2u)
        assertEquals(32u, keyReq.requestSize)
        assertEquals(2u, keyReq.enclaveSVN)

        val exc = VbsBasicEnclaveExceptionAmd64(exceptionCode = 0xC0000005u)
        assertEquals(0xC0000005u, exc.exceptionCode)

        val desc32 = VbsBasicEnclaveThreadDescriptor32(entryPoint = 0x1000u)
        assertEquals(0x1000u, desc32.entryPoint)

        val desc64 = VbsBasicEnclaveThreadDescriptor64(entryPoint = 0x2000uL)
        assertEquals(0x2000uL, desc64.entryPoint)

        val report = VbsEnclaveReport(reportSize = 128u)
        assertEquals(128u, report.reportSize)

        val mod = VbsEnclaveReportModule(svn = 3u)
        assertEquals(3u, mod.svn)

        val pkg = VbsEnclaveReportPkgHeader(packageSize = 256u)
        assertEquals(256u, pkg.packageSize)

        val syscallPage =
            VbsBasicEnclaveSyscallPage(
                returnFromEnclave = VbsBasicEnclaveBasicCallReturnFromEnclaveFn { _ -> },
                commitPages = VbsBasicEnclaveBasicCallCommitPagesFn { _, _, _, _ -> 0 },
            )
        assertNotNull(syscallPage.returnFromEnclave)
        assertNotNull(syscallPage.commitPages)
    }
}
