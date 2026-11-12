@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction")

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider")

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider")

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr<CryptContextFunctionConfig>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateContext")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateHash")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, nhashes: UInt, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDecrypt")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr<UByte>, cbpassword: UInt, pbsalt: ConstPtr<UByte>, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEncrypt")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<BcryptAlgorithmIdentifier>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionProviders>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctions>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContexts>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr<UInt>, ppimpllist: MutPtr<MutPtr<BcryptProviderName>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviders>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptExportKey")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFinishHash")

public actual fun bCryptFreeBuffer(pvbuffer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer")

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr<UByte>, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenRandom")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, dwlength: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr<UByte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGetProperty")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr<UByte>, cbsecret: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptHash")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptHashData")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptImportKey")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr<BcryptAlgHandle>, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr<CVoid>, cboperations: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextConfig>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionConfig>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderReg>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration")

public actual fun bCryptRegisterConfigChangeNotify(phevent: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr<CryptProviderReg>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderRefs>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr<BcryptSecretHandle>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSetProperty")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSignHash")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhash: ConstPtr<UByte>, cbhash: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr<MutPtr<CrlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr<MutPtr<CtlContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse")

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext")

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr<UByte>, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr<UInt>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID")

public actual fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse")

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCloseStore")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr<CertInfo>, pcertid2: ConstPtr<CertInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareCertificate")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr<CryptIntegerBlob>, pcertname2: ConstPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName")

public actual fun certCompareIntegerBlob(pint1: ConstPtr<CryptIntegerBlob>, pint2: ConstPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr<CertPublicKeyInfo>, ppublickey2: ConstPtr<CertPublicKeyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertControlStore")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt): MutPtr<CrlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt): MutPtr<CtlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, coptattr: UInt, rgoptattr: ConstPtr<CryptAttribute>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pctlentry: MutPtr<CtlEntry>, pcbctlentry: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties")

public actual fun certCreateCertificateChainEngine(pconfig: ConstPtr<CertChainEngineConfig>, phchainengine: MutPtr<Hcertchainengine>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr<CertCreateContextPara>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateContext")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr<CryptIntegerBlob>, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr<CryptKeyProvInfo>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pstarttime: ConstPtr<Systemtime>, pendtime: ConstPtr<Systemtime>, pextensions: ConstPtr<CertExtensions>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate")

public actual fun certDeleteCRLFromStore(pcrlcontext: ConstPtr<CrlContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore")

public actual fun certDeleteCTLFromStore(pctlcontext: ConstPtr<CtlContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore")

public actual fun certDeleteCertificateFromStore(pcertcontext: ConstPtr<CertContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore")

public actual fun certDuplicateCRLContext(pcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext")

public actual fun certDuplicateCTLContext(pctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext")

public actual fun certDuplicateCertificateChain(pchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain")

public actual fun certDuplicateCertificateContext(pcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateStore")

public actual fun certEnumCRLContextProperties(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore")

public actual fun certEnumCTLContextProperties(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore")

public actual fun certEnumCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore")

public actual fun certEnumPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumPhysicalStore): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr<CtlContext>, ppvnextsubject: MutPtr<MutPtr<CVoid>>, psubjectidentifier: MutPtr<CryptIntegerBlob>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStore): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr<CryptAttribute>): MutPtr<CryptAttribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindAttribute")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr<CVoid>, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore")

public actual fun certFindCertificateInCRL(pcert: ConstPtr<CertContext>, pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppcrlentry: MutPtr<MutPtr<CrlEntry>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr<CVoid>, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindChainInStore")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr<CertExtension>): MutPtr<CertExtension> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindExtension")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr<CertNameInfo>): MutPtr<CertRdnAttr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt): MutPtr<CtlEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr<CryptIntegerBlob>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL")

public actual fun certFreeCRLContext(pcrlcontext: ConstPtr<CrlContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext")

public actual fun certFreeCTLContext(pctlcontext: ConstPtr<CtlContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext")

public actual fun certFreeCertificateChain(pchaincontext: ConstPtr<CertChainContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain")

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine")

public actual fun certFreeCertificateChainList(prgpselection: ConstPtr<ConstPtr<CertChainContext>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList")

public actual fun certFreeCertificateContext(pcertcontext: ConstPtr<CertContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext")

public actual fun certGetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr<CertContext>, pprevcrlcontext: ConstPtr<CrlContext>, pdwflags: MutPtr<UInt>): MutPtr<CrlContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore")

public actual fun certGetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr<CertContext>, ptime: ConstPtr<Filetime>, hadditionalstore: Hcertstore, pchainpara: ConstPtr<CertChainPara>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppchaincontext: MutPtr<MutPtr<CertChainContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain")

public actual fun certGetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty")

public actual fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pusage: MutPtr<CtlUsage>, pcbusage: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr<CertInfo>, pbkeyusage: MutPtr<UByte>, cbkeyusage: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr<CertContext>, pprevissuercontext: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore")

public actual fun certGetNameStringA(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetNameStringA")

public actual fun certGetNameStringW(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetNameStringW")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr<CertPublicKeyInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertServerOcspResponseContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>): MutPtr<CertContext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr<ConstPtr<CertContext>>, cnumoids: MutPtr<Int>, rghoids: MutPtr<Pstr>, pcboids: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetValidUsages")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr<CryptIntegerBlob>, prdn: ConstPtr<CertRdn>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName")

public actual fun certIsStrongHashToSign(pstrongsignpara: ConstPtr<CertStrongSignPara>, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr<CertContext>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign")

public actual fun certIsValidCRLForCertificate(pcert: ConstPtr<CertContext>, pcrl: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr<CertChainContext>, ptimestamp: ConstPtr<Filetime>, pwszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsWeakHash")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertNameToStrA")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertNameToStrW")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId")

public actual fun certOpenServerOcspResponse(pchaincontext: ConstPtr<CertChainContext>, dwflags: UInt, popenpara: ConstPtr<CertServerOcspResponseOpenPara>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr<CVoid>): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenStore")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW")

public actual fun certRegisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr<CertPhysicalStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore")

public actual fun certRegisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pstoreinfo: ConstPtr<CertSystemStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection")

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr<CertContext>, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>, ppwszmimetype: MutPtr<Pwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr<CVoid>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSaveStore")

public actual fun certSelectCertificateChains(pselectioncontext: ConstPtr<Guid>, dwflags: UInt, pchainparameters: ConstPtr<CertSelectChainPara>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, hstore: Hcertstore, pcselection: MutPtr<UInt>, pprgpselection: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains")

public actual fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement")

public actual fun certSerializeCTLStoreElement(pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement")

public actual fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement")

public actual fun certSetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty")

public actual fun certSetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr<CertContext>, pctlentry: ConstPtr<CtlEntry>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry")

public actual fun certSetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty")

public actual fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, pusage: ConstPtr<CtlUsage>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertStrToNameA")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertStrToNameW")

public actual fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore")

public actual fun certUnregisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>, ccrlinfo: UInt, rgpcrlinfo: ConstPtr<ConstPtr<CrlInfo>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcrlinfo: ConstPtr<CrlInfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, psubjectusage: ConstPtr<CtlUsage>, dwflags: UInt, pverifyusagepara: ConstPtr<CtlVerifyUsagePara>, pverifyusagestatus: MutPtr<CtlVerifyUsageStatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr<CertChainContext>, ppolicypara: ConstPtr<CertChainPolicyPara>, ppolicystatus: MutPtr<CertChainPolicyStatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr<ConstPtr<CVoid>>, dwflags: UInt, prevpara: ConstPtr<CertRevocationPara>, prevstatus: MutPtr<CertRevocationStatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation")

public actual fun certVerifySubjectCertificateContext(psubject: ConstPtr<CertContext>, pissuer: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext")

public actual fun certVerifyTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcertinfo: ConstPtr<CertInfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity")

public actual fun certVerifyValidityNesting(psubjectinfo: ConstPtr<CertInfo>, pissuerinfo: ConstPtr<CertInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting")

public actual fun closeCryptoHandle(hcrypto: ConstPtr<InformationcardCryptoHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle")

public actual fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr<CertContext>, dwflags: CryptAcquireFlags, pvparameters: ConstPtr<CVoid>, phcryptprovorncryptkey: MutPtr<HcryptprovOrNcryptKeyHandle>, pdwkeyspec: MutPtr<CertKeySpec>, pfcallerfreeprovorncryptkey: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey")

public actual fun cryptAcquireContextA(phprov: MutPtr<ULong>, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA")

public actual fun cryptAcquireContextW(phprov: MutPtr<ULong>, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW")

public actual fun cryptBinaryToStringA(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA")

public actual fun cryptBinaryToStringW(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync: Long): Int

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync).toInt()

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptContextAddRef")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr<Hcryptasync>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateHash")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr<Publickeystruc>, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbhash: MutPtr<UByte>, pcbhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencodedblob: ConstPtr<UByte>, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr<UInt>, pdwinnercontenttype: MutPtr<UInt>, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeObject")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr<CryptDecodePara>, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecrypt")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature")

public actual fun cryptDecryptMessage(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDeriveKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptDestroyHash")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash: Long): Int

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash.toLong()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptDestroyKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey: Long): Int

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey.toLong()).toInt()

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phhash: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncodeObject")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr<CryptEncodePara>, pvencoded: MutPtr<CVoid>, pcbencoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwbuflen: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncrypt")

public actual fun cryptEncryptMessage(pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobeencrypted: ConstPtr<UByte>, cbtobeencrypted: UInt, pbencryptedblob: MutPtr<UByte>, pcbencryptedblob: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCryptEnumKeyidProp): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pstr, pcbtypename: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pwstr, pcbtypename: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportKey")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pbprivatekeyblob: MutPtr<UByte>, pcbprivatekeyblob: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle")

public actual fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr<CertContext>, dwflags: CryptFindFlags, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr<CVoid>, dwgroupid: UInt): MutPtr<CryptOidInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr<CVoid>, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbformat: MutPtr<CVoid>, pcbformat: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFormatObject")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr<CVoid>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGenKey")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGenRandom")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr<MutPtr<CVoid>>, ppfnfree: MutPtr<PfnCryptAsyncParamFreeFunc>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam")

public actual fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetHashParam")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount")

public actual fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr<UInt>, pbvaluedata: MutPtr<UByte>, pcbvaluedata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr<CVoid>, dwflags: CryptGetUrlFlags, purlarray: MutPtr<CryptUrlArray>, pcburlarray: MutPtr<UInt>, purlinfo: MutPtr<CryptUrlInfo>, pcburlinfo: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetProvParam")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetUserKey")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashCertificate")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2")

public actual fun cryptHashData(hhash: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashData")

public actual fun cryptHashMessage(phashpara: ConstPtr<CryptHashMessagePara>, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbhashedblob: MutPtr<UByte>, pcbhashedblob: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashMessage")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash: Long, hkey: Long, dwflags: Int): Int

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash.toLong(), hkey.toLong(), dwflags.toInt()).toInt()

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned")

public actual fun cryptImportKey(hprov: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportKey")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr<ULong>, pvauxinfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPKCS8")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<BcryptKeyHandle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr<CVoid>, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr<CVoid>, phdefaultcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr<CryptOidFuncEntry>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress")

public actual fun cryptMemAlloc(cbsize: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemAlloc")

public actual fun cryptMemFree(pv: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemFree")

public actual fun cryptMemRealloc(pv: ConstPtr<CVoid>, cbsize: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemRealloc")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength")

public actual fun cryptMsgClose(hcryptmsg: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgClose")

public actual fun cryptMsgControl(hcryptmsg: ConstPtr<CVoid>, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgControl")

public actual fun cryptMsgCountersign(hcryptmsg: ConstPtr<CVoid>, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>, pbcountersignature: MutPtr<UByte>, pcbcountersignature: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded")

public actual fun cryptMsgDuplicate(hcryptmsg: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr<CtlInfo>, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr<CVoid>, csignerstore: UInt, rghsignerstore: ConstPtr<Hcertstore>, dwflags: UInt, ppsigner: MutPtr<MutPtr<CertContext>>, pdwsignerindex: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner")

public actual fun cryptMsgGetParam(hcryptmsg: ConstPtr<CVoid>, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr<CertInfo>, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr<UByte>, cbctlcontent: UInt, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL")

public actual fun cryptMsgUpdate(hcryptmsg: ConstPtr<CVoid>, pbdata: ConstPtr<UByte>, cbdata: UInt, ffinal: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr<CertInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr<CVoid>, dwflags: UInt, pvextra: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx")

public actual fun cryptProtectData(pdatain: ConstPtr<CryptIntegerBlob>, szdatadescr: Pcwstr, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptProtectData")

public actual fun cryptProtectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptProtectMemory")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr<CVoid>, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr<CertQueryEncodingType>, pdwcontenttype: MutPtr<CertQueryContentType>, pdwformattype: MutPtr<CertQueryFormatType>, phcertstore: MutPtr<Hcertstore>, phmsg: MutPtr<MutPtr<CVoid>>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptQueryObject")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction")

public actual fun cryptRegisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptReleaseContext")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov: Long, dwflags: Int): Int

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov.toLong(), dwflags.toInt()).toInt()

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr<CryptTimestampPara>, pbdata: ConstPtr<UByte>, cbdata: UInt, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr<CVoid>, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetHashParam")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr<UByte>, cbvaluedata: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProvParam")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderA")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderW")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate")

public actual fun cryptSignAndEncryptMessage(psignpara: ConstPtr<CryptSignMessagePara>, pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobesignedandencrypted: ConstPtr<UByte>, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr<UByte>, pcbsignedandencryptedblob: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr<UByte>, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbsignature: MutPtr<UByte>, pcbsignature: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignCertificate")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignHashA")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignHashW")

public actual fun cryptSignMessage(psignpara: ConstPtr<CryptSignMessagePara>, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignMessage")

public actual fun cryptSignMessageWithKey(psignpara: ConstPtr<CryptKeySignMessagePara>, pbtobesigned: ConstPtr<UByte>, cbtobesigned: UInt, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext")

public actual fun cryptUnprotectData(pdatain: ConstPtr<CryptIntegerBlob>, ppszdatadescr: MutPtr<Pwstr>, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnprotectData")

public actual fun cryptUnprotectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction")

public actual fun cryptUnregisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr<UInt>, pdwfailurecount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, ppublickey: ConstPtr<CertPublicKeyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, dwissuertype: UInt, pvissuer: ConstPtr<CVoid>, dwflags: CryptVerifyCertFlags, pvextra: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx")

public actual fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbdetachedhashblob: ConstPtr<UByte>, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr<UByte>, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature")

public actual fun cryptVerifyMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbhashedblob: ConstPtr<UByte>, cbhashedblob: UInt, pbtobehashed: MutPtr<UByte>, pcbtobehashed: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash")

public actual fun cryptVerifyMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr<CryptKeyVerifyMessagePara>, ppublickeyinfo: ConstPtr<CertPublicKeyInfo>, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr<UByte>, cbtscontentinfo: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature")

public actual fun cryptXmlAddObject(hsignatureorobject: ConstPtr<CVoid>, dwflags: UInt, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, ppobject: MutPtr<MutPtr<CryptXmlObject>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject")

public actual fun cryptXmlClose(hcryptxml: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlClose")

public actual fun cryptXmlCreateReference(hcryptxml: ConstPtr<CVoid>, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr<CryptXmlAlgorithm>, ctransform: UInt, rgtransform: ConstPtr<CryptXmlAlgorithm>, phreference: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference")

public actual fun cryptXmlDigestReference(hreference: ConstPtr<CVoid>, dwflags: UInt, pdataproviderin: ConstPtr<CryptXmlDataProvider>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference")

public actual fun cryptXmlEncode(hcryptxml: ConstPtr<CVoid>, dwcharset: CryptXmlCharset, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pvcallbackstate: MutPtr<CVoid>, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlEncode")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr<CVoid>, dwgroupid: UInt, dwflags: UInt): MutPtr<CryptXmlAlgorithmInfo> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr<CryptXmlAlgorithm>, dwflags: CryptXmlFlags, ppalginfo: MutPtr<MutPtr<CryptXmlAlgorithmInfo>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo")

public actual fun cryptXmlGetDocContext(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlDocCtxt>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext")

public actual fun cryptXmlGetReference(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlReference>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference")

public actual fun cryptXmlGetSignature(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlSignature>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature")

public actual fun cryptXmlGetStatus(hcryptxml: ConstPtr<CVoid>, pstatus: MutPtr<CryptXmlStatus>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus")

public actual fun cryptXmlGetTransforms(ppconfig: MutPtr<MutPtr<CryptXmlTransformChainConfig>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr<CryptXmlKeyValue>, phkey: MutPtr<BcryptKeyHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey")

public actual fun cryptXmlOpenToDecode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phcryptxml: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode")

public actual fun cryptXmlOpenToEncode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phsignature: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode")

public actual fun cryptXmlSetHMACSecret(hsignature: ConstPtr<CVoid>, pbsecret: ConstPtr<UByte>, cbsecret: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret")

public actual fun cryptXmlSign(hsignature: ConstPtr<CVoid>, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr<CVoid>, psignaturemethod: ConstPtr<CryptXmlAlgorithm>, pcanonicalization: ConstPtr<CryptXmlAlgorithm>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlSign")

public actual fun cryptXmlVerifySignature(hsignature: ConstPtr<CVoid>, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature")

public actual fun decrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyDecrypt")

public actual fun encrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyEncrypt")

public actual fun findCertsByIssuer(pcertchains: MutPtr<CertChain>, pcbcertchains: MutPtr<UInt>, pccertchains: MutPtr<UInt>, pbencodedissuername: ConstPtr<UByte>, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer")

public actual fun freeToken(pallocmemory: ConstPtr<GenericXmlToken>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyFreeToken")

public actual fun generateDerivedKey(hcrypto: ConstPtr<InformationcardCryptoHandle>, cblabel: UInt, plabel: ConstPtr<UByte>, cbnonce: UInt, pnonce: ConstPtr<UByte>, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr<UInt>, ppkey: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptAsymmetricEncryptionFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr<CVoid>, pcbtoken: MutPtr<UInt>, pptoken: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetBrowserToken")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptCipherFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetCipherInterface")

public actual fun getCryptoTransform(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr<UByte>, pphtransform: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetCryptoTransform")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptHashFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetHashInterface")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptKeyDerivationFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptKeyStorageFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface")

public actual fun getKeyedHash(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, pphhash: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyedHash")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptRngFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetRngInterface")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptSslFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSChannelInterface")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSecretAgreementFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSignatureFunctionTable>>, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSignatureInterface")

public actual fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr<PolicyElement>, securitytoken: MutPtr<MutPtr<GenericXmlToken>>, phprooftokencrypto: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetToken")

public actual fun hashCore(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyHashCore")

public actual fun hashFinal(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyHashFinal")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyImportInformationCard")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyManageCardSpace")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyManageCardSpace(): Int

public actual fun manageCardSpace(): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyManageCardSpace().toInt()

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: MutPtr<UByte>, cbclaimblob: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr<NcryptDescriptorHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptDecrypt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey: Long, dwflags: Int): Int

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey.toLong(), dwflags.toInt()).toInt()

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEncrypt")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<NCryptAlgorithmName>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr<MutPtr<NCryptKeyName>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptExportKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey: Long, dwflags: Int): Int

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey.toLong(), dwflags.toInt()).toInt()

public actual fun nCryptFreeBuffer(pvinput: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptFreeObject")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject: Long): Int

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject.toLong()).toInt()

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: ObjectSecurityInformation): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptGetProperty")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr<NcryptAllocPara>, dwinfotype: UInt, ppvinfo: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, phkey: MutPtr<NcryptKeyHandle>, pbdata: ConstPtr<UByte>, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptImportKey")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey: Long): Int

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey.toLong()).toInt()

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr<Handle>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptOpenKey")

public actual fun nCryptOpenStorageProvider(phprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbprotectedblob: MutPtr<MutPtr<UByte>>, pcbprotectedblob: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr<ULong>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr<NcryptSecretHandle>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSetProperty")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSignHash")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamClose")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr<NcryptProtectStreamInfoEx>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr<UByte>, cbdata: ULong, ffinal: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate")

public actual fun nCryptTranslateHandle(phprovider: MutPtr<NcryptProvHandle>, phkey: MutPtr<NcryptKeyHandle>, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle")

public actual fun nCryptUnprotectSecret(phdescriptor: MutPtr<NcryptDescriptorHandle>, dwflags: NcryptFlags, pbprotectedblob: ConstPtr<UByte>, cbprotectedblob: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: ConstPtr<UByte>, cbclaimblob: UInt, poutput: MutPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXExportCertStore")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, pvpara: ConstPtr<CVoid>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx")

public actual fun pFXImportCertStore(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXImportCertStore")

public actual fun pFXIsPFXBlob(ppfx: ConstPtr<CryptIntegerBlob>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob")

public actual fun pFXVerifyPassword(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword")

public actual fun processPrng(pbdata: MutPtr<UByte>, cbdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyProcessPrng")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySignError")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySignError(): Int

public actual fun signError(): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySignError().toInt()

public actual fun signHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, pcbsig: MutPtr<UInt>, ppsig: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignHash")

public actual fun signerFreeSignerContext(psignercontext: ConstPtr<SignerContext>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext")

public actual fun signerSign(psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSign")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx2")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, pdigestsigninfo: ConstPtr<SignerDigestSignInfo>, preserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx3")

public actual fun signerTimeStamp(psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStamp")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslChangeNotify")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeSessionHash")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr<UByte>, cbparams: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider: Long): Int

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider.toLong()).toInt()

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslDecryptPacket")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr<NcryptHashHandle>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEncryptPacket")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuite>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuiteEx>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr<UInt>, ppecccurve: MutPtr<MutPtr<NcryptSslEccCurve>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumEccCurves")

public actual fun sslEnumProtocolProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandBinderKey")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr<UByte>, cbticketnonce: UInt, phpresharedkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr<NcryptKeyHandle>, phservertraffickey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandWriteKey")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExportKey")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pbcontextvalue: ConstPtr<UByte>, cbcontextvalue: UShort, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractMasterKey")

public actual fun sslFreeBuffer(pvinput: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslFreeBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslFreeObject")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslFreeObject(hobject: Long, dwflags: Int): Int

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslFreeObject(hobject.toLong(), dwflags.toInt()).toInt()

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr<NcryptKeyHandle>, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetKeyProperty")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetProviderProperty")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslHashHandshake")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszblobtype: Pcwstr, pbkeyblob: ConstPtr<UByte>, cbkeyblob: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslImportKey")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbencryptedkey: ConstPtr<UByte>, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslImportMasterKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider: Long): Int

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider.toLong()).toInt()

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr<NcryptSslCipherLengths>, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr<NcryptSslCipherSuite>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr<NcryptKeyHandle>, pcertcontext: ConstPtr<CertContext>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey")

public actual fun sslOpenProvider(phsslprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslOpenProvider")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslSignHash")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslVerifySignature")

public actual fun systemPrng(pbrandomdata: MutPtr<UByte>, cbrandomdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySystemPrng")

public actual fun transformBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyTransformBlock")

public actual fun transformFinalBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyTransformFinalBlock")

public actual fun verifyHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr<UByte>, pfverified: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyVerifyHash")
