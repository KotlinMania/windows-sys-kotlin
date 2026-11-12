package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun callEnclave(lproutine: Long, lpparameter: ConstPtr<CVoid>, fwaitforthread: Bool, lpreturnvalue: MutPtr<MutPtr<CVoid>>): Bool

public expect fun createEnclave(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpenclaveerror: MutPtr<UInt>): MutPtr<CVoid>

public expect fun createEnvironmentBlock(lpenvironment: MutPtr<MutPtr<CVoid>>, htoken: Handle, binherit: Bool): Bool

public expect fun deleteEnclave(lpaddress: ConstPtr<CVoid>): Bool

public expect fun destroyEnvironmentBlock(lpenvironment: ConstPtr<CVoid>): Bool

public expect fun enclaveGetAttestationReport(enclavedata: ConstPtr<UByte>, report: MutPtr<CVoid>, buffersize: UInt, outputsize: MutPtr<UInt>): Hresult

public expect fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr<EnclaveInformation>): Hresult

public expect fun enclaveSealData(datatoencrypt: ConstPtr<CVoid>, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr<CVoid>, buffersize: UInt, protectedblobsize: MutPtr<UInt>): Hresult

public expect fun enclaveUnsealData(protectedblob: ConstPtr<CVoid>, protectedblobsize: UInt, decrypteddata: MutPtr<CVoid>, buffersize: UInt, decrypteddatasize: MutPtr<UInt>, sealingidentity: MutPtr<EnclaveIdentity>, unsealingflags: MutPtr<UInt>): Hresult

public expect fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr<CVoid>, reportsize: UInt): Hresult

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

public expect fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpenclaveinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpenclaveerror: MutPtr<UInt>): Bool

public expect fun isEnclaveTypeSupported(flenclavetype: UInt): Bool

public expect fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr<ULong>, lpenclaveerror: MutPtr<UInt>): Bool

public expect fun loadEnclaveImageA(lpenclaveaddress: ConstPtr<CVoid>, lpimagename: Pcstr): Bool

public expect fun loadEnclaveImageW(lpenclaveaddress: ConstPtr<CVoid>, lpimagename: Pcwstr): Bool

public expect fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool

public expect fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool

public expect fun setCurrentDirectoryA(lppathname: Pcstr): Bool

public expect fun setCurrentDirectoryW(lppathname: Pcwstr): Bool

public expect fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool

public expect fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool

public expect fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool

public expect fun terminateEnclave(lpaddress: ConstPtr<CVoid>, fwait: Bool): Bool
