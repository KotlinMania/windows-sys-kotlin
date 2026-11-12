package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun callEnclave(lproutine: Long, lpparameter: ConstPtr, fwaitforthread: Bool, lpreturnvalue: MutPtr): Bool

public expect fun createEnclave(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): MutPtr

public expect fun createEnvironmentBlock(lpenvironment: MutPtr, htoken: Handle, binherit: Bool): Bool

public expect fun deleteEnclave(lpaddress: ConstPtr): Bool

public expect fun destroyEnvironmentBlock(lpenvironment: ConstPtr): Bool

public expect fun enclaveGetAttestationReport(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Hresult

public expect fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr): Hresult

public expect fun enclaveSealData(datatoencrypt: ConstPtr, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr, buffersize: UInt, protectedblobsize: MutPtr): Hresult

public expect fun enclaveUnsealData(protectedblob: ConstPtr, protectedblobsize: UInt, decrypteddata: MutPtr, buffersize: UInt, decrypteddatasize: MutPtr, sealingidentity: MutPtr, unsealingflags: MutPtr): Hresult

public expect fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr, reportsize: UInt): Hresult

public expect fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt

public expect fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool

public expect fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool

public expect fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt

public expect fun freeEnvironmentStringsA(penv: Pcstr): Bool

public expect fun freeEnvironmentStringsW(penv: Pcwstr): Bool

public expect fun getCommandLineA(): Pcstr

public expect fun getCommandLineW(): Pcwstr

public expect fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getEnvironmentStrings(): Pstr

public expect fun getEnvironmentStringsW(): Pwstr

public expect fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt

public expect fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt

public expect fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): Bool

public expect fun isEnclaveTypeSupported(flenclavetype: UInt): Bool

public expect fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr, lpenclaveerror: MutPtr): Bool

public expect fun loadEnclaveImageA(lpenclaveaddress: ConstPtr, lpimagename: Pcstr): Bool

public expect fun loadEnclaveImageW(lpenclaveaddress: ConstPtr, lpimagename: Pcwstr): Bool

public expect fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool

public expect fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool

public expect fun setCurrentDirectoryA(lppathname: Pcstr): Bool

public expect fun setCurrentDirectoryW(lppathname: Pcwstr): Bool

public expect fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool

public expect fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool

public expect fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool

public expect fun terminateEnclave(lpaddress: ConstPtr, fwait: Bool): Bool
