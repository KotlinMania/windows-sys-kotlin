@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_callEnclave(lproutine, lpparameter?.value?.toCPointer<ByteVar>(), fwaitforthread, lpreturnvalue?.value?.toCPointer<ByteVar>())

public actual fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_createEnclave(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), dwsize, dwinitialcommitment, flenclavetype, lpenclaveinformation?.value?.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_createEnvironmentBlock(lpenvironment?.value?.toCPointer<ByteVar>(), htoken?.value?.toCPointer<ByteVar>(), binherit)

public actual fun deleteEnclave(lpaddress: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_deleteEnclave(lpaddress?.value?.toCPointer<ByteVar>())

public actual fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_destroyEnvironmentBlock(lpenvironment?.value?.toCPointer<ByteVar>())

public actual fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_enclaveGetAttestationReport(enclavedata?.value?.toCPointer<ByteVar>(), report?.value?.toCPointer<ByteVar>(), buffersize, outputsize?.value?.toCPointer<ByteVar>())

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(informationsize, enclaveinformation?.value?.toCPointer<ByteVar>())

public actual fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_enclaveSealData(datatoencrypt?.value?.toCPointer<ByteVar>(), datatoencryptsize, identitypolicy, runtimepolicy, protectedblob?.value?.toCPointer<ByteVar>(), buffersize, protectedblobsize?.value?.toCPointer<ByteVar>())

public actual fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_enclaveUnsealData(protectedblob?.value?.toCPointer<ByteVar>(), protectedblobsize, decrypteddata?.value?.toCPointer<ByteVar>(), buffersize, decrypteddatasize?.value?.toCPointer<ByteVar>(), sealingidentity?.value?.toCPointer<ByteVar>(), unsealingflags?.value?.toCPointer<ByteVar>())

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(enclavetype, report?.value?.toCPointer<ByteVar>(), reportsize)

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_expandEnvironmentStringsA(lpsrc?.value?.toCPointer<ByteVar>(), lpdst?.value?.toCPointer<ByteVar>(), nsize)

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA(htoken?.value?.toCPointer<ByteVar>(), lpsrc?.value?.toCPointer<ByteVar>(), lpdest?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW(htoken?.value?.toCPointer<ByteVar>(), lpsrc?.value?.toCPointer<ByteVar>(), lpdest?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_expandEnvironmentStringsW(lpsrc?.value?.toCPointer<ByteVar>(), lpdst?.value?.toCPointer<ByteVar>(), nsize)

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_freeEnvironmentStringsA(penv?.value?.toCPointer<ByteVar>())

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_freeEnvironmentStringsW(penv?.value?.toCPointer<ByteVar>())

public actual fun getCommandLineA(): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getCommandLineA()?.let { COpaquePointer(it.toLong()) }

public actual fun getCommandLineW(): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getCommandLineW()?.let { COpaquePointer(it.toLong()) }

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getCurrentDirectoryA(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getCurrentDirectoryW(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getEnvironmentStrings(): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getEnvironmentStrings()?.let { COpaquePointer(it.toLong()) }

public actual fun getEnvironmentStringsW(): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getEnvironmentStringsW()?.let { COpaquePointer(it.toLong()) }

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getEnvironmentVariableA(lpname?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_getEnvironmentVariableW(lpname?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_initializeEnclave(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), lpenclaveinformation?.value?.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror?.value?.toCPointer<ByteVar>())

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_isEnclaveTypeSupported(flenclavetype)

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_loadEnclaveData(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize, flprotect, lppageinformation?.value?.toCPointer<ByteVar>(), dwinfolength, lpnumberofbyteswritten?.value?.toCPointer<ByteVar>(), lpenclaveerror?.value?.toCPointer<ByteVar>())

public actual fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_loadEnclaveImageA(lpenclaveaddress?.value?.toCPointer<ByteVar>(), lpimagename?.value?.toCPointer<ByteVar>())

public actual fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_loadEnclaveImageW(lpenclaveaddress?.value?.toCPointer<ByteVar>(), lpimagename?.value?.toCPointer<ByteVar>())

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA(exename?.value?.toCPointer<ByteVar>())

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW(exename?.value?.toCPointer<ByteVar>())

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_setCurrentDirectoryA(lppathname?.value?.toCPointer<ByteVar>())

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_setCurrentDirectoryW(lppathname?.value?.toCPointer<ByteVar>())

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_setEnvironmentStringsW(newenvironment?.value?.toCPointer<ByteVar>())

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_setEnvironmentVariableA(lpname?.value?.toCPointer<ByteVar>(), lpvalue?.value?.toCPointer<ByteVar>())

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_setEnvironmentVariableW(lpname?.value?.toCPointer<ByteVar>(), lpvalue?.value?.toCPointer<ByteVar>())

public actual fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_terminateEnclave(lpaddress?.value?.toCPointer<ByteVar>(), fwait)
