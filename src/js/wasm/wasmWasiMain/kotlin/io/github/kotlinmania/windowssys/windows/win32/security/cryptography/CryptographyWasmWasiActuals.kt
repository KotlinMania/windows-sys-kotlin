@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
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

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateContext")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateHash")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, nhashes: UInt, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDecrypt")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr, cbpassword: UInt, pbsalt: ConstPtr, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEncrypt")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr, ppimpllist: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptExportKey")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFinishHash")

public actual fun bCryptFreeBuffer(pvbuffer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer")

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenRandom")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr, dwlength: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptGetProperty")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr, cbsecret: UInt, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptHash")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptHashData")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptImportKey")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr, cboperations: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr, ppbvalue: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration")

public actual fun bCryptRegisterConfigChangeNotify(phevent: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSetProperty")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptSignHash")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbhash: ConstPtr, cbhash: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse")

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext")

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr, ppvcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID")

public actual fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr, dwflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse")

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCloseStore")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr, pcertid2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareCertificate")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr, pcertname2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName")

public actual fun certCompareIntegerBlob(pint1: ConstPtr, pint2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr, ppublickey2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertControlStore")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr, cbctlencoded: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr, coptattr: UInt, rgoptattr: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pctlentry: MutPtr, pcbctlentry: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties")

public actual fun certCreateCertificateChainEngine(pconfig: ConstPtr, phchainengine: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateContext")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr, psignaturealgorithm: ConstPtr, pstarttime: ConstPtr, pendtime: ConstPtr, pextensions: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate")

public actual fun certDeleteCRLFromStore(pcrlcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore")

public actual fun certDeleteCTLFromStore(pctlcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore")

public actual fun certDeleteCertificateFromStore(pcertcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore")

public actual fun certDuplicateCRLContext(pcrlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext")

public actual fun certDuplicateCTLContext(pctlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext")

public actual fun certDuplicateCertificateChain(pchaincontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain")

public actual fun certDuplicateCertificateContext(pcertcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertDuplicateStore")

public actual fun certEnumCRLContextProperties(pcrlcontext: ConstPtr, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore")

public actual fun certEnumCTLContextProperties(pctlcontext: ConstPtr, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore")

public actual fun certEnumCertificateContextProperties(pcertcontext: ConstPtr, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore")

public actual fun certEnumPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumPhysicalStore): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr, ppvnextsubject: MutPtr, psubjectidentifier: MutPtr, pencodedattributes: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStore): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindAttribute")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr, pprevcrlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr, pprevctlcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore")

public actual fun certFindCertificateInCRL(pcert: ConstPtr, pcrlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppcrlentry: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr, pprevcertcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr, pprevchaincontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindChainInStore")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindExtension")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pencodedattributes: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL")

public actual fun certFreeCRLContext(pcrlcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext")

public actual fun certFreeCTLContext(pctlcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext")

public actual fun certFreeCertificateChain(pchaincontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain")

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine")

public actual fun certFreeCertificateChainList(prgpselection: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList")

public actual fun certFreeCertificateContext(pcertcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext")

public actual fun certGetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr, pprevcrlcontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore")

public actual fun certGetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr, ptime: ConstPtr, hadditionalstore: Hcertstore, pchainpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppchaincontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain")

public actual fun certGetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty")

public actual fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr, dwflags: UInt, pusage: MutPtr, pcbusage: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr, pbkeyusage: MutPtr, cbkeyusage: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr, pprevissuercontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore")

public actual fun certGetNameStringA(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetNameStringA")

public actual fun certGetNameStringW(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetNameStringW")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr, cnumoids: MutPtr, rghoids: MutPtr, pcboids: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertGetValidUsages")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr, prdn: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName")

public actual fun certIsStrongHashToSign(pstrongsignpara: ConstPtr, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign")

public actual fun certIsValidCRLForCertificate(pcert: ConstPtr, pcrl: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr, ptimestamp: ConstPtr, pwszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertIsWeakHash")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertNameToStrA")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertNameToStrW")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId")

public actual fun certOpenServerOcspResponse(pchaincontext: ConstPtr, dwflags: UInt, popenpara: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenStore")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW")

public actual fun certRegisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore")

public actual fun certRegisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection")

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr, ppbdata: MutPtr, pcbdata: MutPtr, ppwszmimetype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSaveStore")

public actual fun certSelectCertificateChains(pselectioncontext: ConstPtr, dwflags: UInt, pchainparameters: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, hstore: Hcertstore, pcselection: MutPtr, pprgpselection: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains")

public actual fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement")

public actual fun certSerializeCTLStoreElement(pctlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement")

public actual fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement")

public actual fun certSetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty")

public actual fun certSetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr, pctlentry: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry")

public actual fun certSetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty")

public actual fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr, pusage: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertStrToNameA")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertStrToNameW")

public actual fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore")

public actual fun certUnregisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr, ccrlinfo: UInt, rgpcrlinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr, pcrlinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, psubjectusage: ConstPtr, dwflags: UInt, pverifyusagepara: ConstPtr, pverifyusagestatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr, ppolicypara: ConstPtr, ppolicystatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr, dwflags: UInt, prevpara: ConstPtr, prevstatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation")

public actual fun certVerifySubjectCertificateContext(psubject: ConstPtr, pissuer: ConstPtr, pdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext")

public actual fun certVerifyTimeValidity(ptimetoverify: ConstPtr, pcertinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity")

public actual fun certVerifyValidityNesting(psubjectinfo: ConstPtr, pissuerinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting")

public actual fun closeCryptoHandle(hcrypto: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle")

public actual fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr, dwflags: CryptAcquireFlags, pvparameters: ConstPtr, phcryptprovorncryptkey: MutPtr, pdwkeyspec: MutPtr, pfcallerfreeprovorncryptkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey")

public actual fun cryptAcquireContextA(phprov: MutPtr, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA")

public actual fun cryptAcquireContextW(phprov: MutPtr, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW")

public actual fun cryptBinaryToStringA(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA")

public actual fun cryptBinaryToStringW(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync: Long): Int

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync)

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptContextAddRef")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateHash")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr, pbhash: MutPtr, pcbhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencodedblob: ConstPtr, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr, pdwinnercontenttype: MutPtr, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeObject")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecrypt")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature")

public actual fun cryptDecryptMessage(pdecryptpara: ConstPtr, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDeriveKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptDestroyHash")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash: Long): Int

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptDestroyKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey: Long): Int

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey.toLong())

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr, dwflags: UInt, phhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr, dwflags: UInt, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncodeObject")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr, pvencoded: MutPtr, pcbencoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwbuflen: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncrypt")

public actual fun cryptEncryptMessage(pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobeencrypted: ConstPtr, cbtobeencrypted: UInt, pbencryptedblob: MutPtr, pcbencryptedblob: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvarg: MutPtr, pfnenum: PfnCryptEnumKeyidProp): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pstr, pcbtypename: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pwstr, pcbtypename: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pstr, pcbprovname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pwstr, pcbprovname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportKey")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pbprivatekeyblob: MutPtr, pcbprivatekeyblob: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle")

public actual fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr, dwflags: CryptFindFlags, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr, dwgroupid: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, pbformat: MutPtr, pcbformat: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFormatObject")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGenKey")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGenRandom")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr, ppfnfree: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam")

public actual fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetHashParam")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount")

public actual fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr, pbvaluedata: MutPtr, pcbvaluedata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr, dwflags: CryptGetUrlFlags, purlarray: MutPtr, pcburlarray: MutPtr, purlinfo: MutPtr, pcburlinfo: MutPtr, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetProvParam")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptGetUserKey")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashCertificate")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2")

public actual fun cryptHashData(hhash: ULong, pbdata: ConstPtr, dwdatalen: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashData")

public actual fun cryptHashMessage(phashpara: ConstPtr, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbhashedblob: MutPtr, pcbhashedblob: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashMessage")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash: Long, hkey: Long, dwflags: Int): Int

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash.toLong(), hkey.toLong(), dwflags.toInt())

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned")

public actual fun cryptImportKey(hprov: ULong, pbdata: ConstPtr, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportKey")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr, pvauxinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPKCS8")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr, phdefaultcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress")

public actual fun cryptMemAlloc(cbsize: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemAlloc")

public actual fun cryptMemFree(pv: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemFree")

public actual fun cryptMemRealloc(pv: ConstPtr, cbsize: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMemRealloc")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength")

public actual fun cryptMsgClose(hcryptmsg: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgClose")

public actual fun cryptMsgControl(hcryptmsg: ConstPtr, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgControl")

public actual fun cryptMsgCountersign(hcryptmsg: ConstPtr, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr, pbcountersignature: MutPtr, pcbcountersignature: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded")

public actual fun cryptMsgDuplicate(hcryptmsg: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr, csignerstore: UInt, rghsignerstore: ConstPtr, dwflags: UInt, ppsigner: MutPtr, pdwsignerindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner")

public actual fun cryptMsgGetParam(hcryptmsg: ConstPtr, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr, pstreaminfo: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr, cbctlcontent: UInt, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL")

public actual fun cryptMsgUpdate(hcryptmsg: ConstPtr, pbdata: ConstPtr, cbdata: UInt, ffinal: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr, dwflags: UInt, pvextra: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx")

public actual fun cryptProtectData(pdatain: ConstPtr, szdatadescr: Pcwstr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptProtectData")

public actual fun cryptProtectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptProtectMemory")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr, pdwcontenttype: MutPtr, pdwformattype: MutPtr, phcertstore: MutPtr, phmsg: MutPtr, ppvcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptQueryObject")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction")

public actual fun cryptRegisterOIDInfo(pinfo: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCryptReleaseContext")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov: Long, dwflags: Int): Int

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov.toLong(), dwflags.toInt())

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr, pbdata: ConstPtr, cbdata: UInt, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetHashParam")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr, cbvaluedata: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProvParam")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderA")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSetProviderW")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate")

public actual fun cryptSignAndEncryptMessage(psignpara: ConstPtr, pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobesignedandencrypted: ConstPtr, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr, pcbsignedandencryptedblob: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbsignature: MutPtr, pcbsignature: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignCertificate")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignHashA")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignHashW")

public actual fun cryptSignMessage(psignpara: ConstPtr, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignMessage")

public actual fun cryptSignMessageWithKey(psignpara: ConstPtr, pbtobesigned: ConstPtr, cbtobesigned: UInt, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext")

public actual fun cryptUnprotectData(pdatain: ConstPtr, ppszdatadescr: MutPtr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnprotectData")

public actual fun cryptUnprotectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction")

public actual fun cryptUnregisterOIDInfo(pinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr, pdwfailurecount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, ppublickey: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr, dwissuertype: UInt, pvissuer: ConstPtr, dwflags: CryptVerifyCertFlags, pvextra: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx")

public actual fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr, pbdetachedhashblob: ConstPtr, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, ppsignercert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature")

public actual fun cryptVerifyMessageHash(phashpara: ConstPtr, pbhashedblob: ConstPtr, cbhashedblob: UInt, pbtobehashed: MutPtr, pcbtobehashed: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash")

public actual fun cryptVerifyMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppsignercert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr, ppublickeyinfo: ConstPtr, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr, cbtscontentinfo: UInt, pbdata: ConstPtr, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature")

public actual fun cryptXmlAddObject(hsignatureorobject: ConstPtr, dwflags: UInt, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, ppobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject")

public actual fun cryptXmlClose(hcryptxml: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlClose")

public actual fun cryptXmlCreateReference(hcryptxml: ConstPtr, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr, ctransform: UInt, rgtransform: ConstPtr, phreference: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference")

public actual fun cryptXmlDigestReference(hreference: ConstPtr, dwflags: UInt, pdataproviderin: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference")

public actual fun cryptXmlEncode(hcryptxml: ConstPtr, dwcharset: CryptXmlCharset, rgproperty: ConstPtr, cproperty: UInt, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlEncode")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr, dwgroupid: UInt, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr, dwflags: CryptXmlFlags, ppalginfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo")

public actual fun cryptXmlGetDocContext(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext")

public actual fun cryptXmlGetReference(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference")

public actual fun cryptXmlGetSignature(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature")

public actual fun cryptXmlGetStatus(hcryptxml: ConstPtr, pstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus")

public actual fun cryptXmlGetTransforms(ppconfig: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr, phkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey")

public actual fun cryptXmlOpenToDecode(pconfig: ConstPtr, dwflags: CryptXmlFlags, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phcryptxml: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode")

public actual fun cryptXmlOpenToEncode(pconfig: ConstPtr, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phsignature: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode")

public actual fun cryptXmlSetHMACSecret(hsignature: ConstPtr, pbsecret: ConstPtr, cbsecret: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret")

public actual fun cryptXmlSign(hsignature: ConstPtr, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr, psignaturemethod: ConstPtr, pcanonicalization: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlSign")

public actual fun cryptXmlVerifySignature(hsignature: ConstPtr, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature")

public actual fun decrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyDecrypt")

public actual fun encrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyEncrypt")

public actual fun findCertsByIssuer(pcertchains: MutPtr, pcbcertchains: MutPtr, pccertchains: MutPtr, pbencodedissuername: ConstPtr, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer")

public actual fun freeToken(pallocmemory: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyFreeToken")

public actual fun generateDerivedKey(hcrypto: ConstPtr, cblabel: UInt, plabel: ConstPtr, cbnonce: UInt, pnonce: ConstPtr, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr, ppkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr, pcbtoken: MutPtr, pptoken: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetBrowserToken")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetCipherInterface")

public actual fun getCryptoTransform(hsymmetriccrypto: ConstPtr, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr, pphtransform: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetCryptoTransform")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetHashInterface")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface")

public actual fun getKeyedHash(hsymmetriccrypto: ConstPtr, pphhash: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetKeyedHash")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetRngInterface")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSChannelInterface")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetSignatureInterface")

public actual fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr, securitytoken: MutPtr, phprooftokencrypto: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyGetToken")

public actual fun hashCore(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyHashCore")

public actual fun hashFinal(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyHashFinal")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyImportInformationCard")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyManageCardSpace")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyManageCardSpace(): Int

public actual fun manageCardSpace(): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyManageCardSpace()

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: MutPtr, cbclaimblob: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptDecrypt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey: Long, dwflags: Int): Int

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEncrypt")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr, ppenumstate: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptExportKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey: Long, dwflags: Int): Int

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptFreeBuffer(pvinput: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptFreeObject")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject: Long): Int

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject.toLong())

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: ObjectSecurityInformation): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptGetProperty")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr, dwinfotype: UInt, ppvinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, phkey: MutPtr, pbdata: ConstPtr, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptImportKey")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey: Long): Int

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey.toLong())

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptOpenKey")

public actual fun nCryptOpenStorageProvider(phprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbprotectedblob: MutPtr, pcbprotectedblob: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSetProperty")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptSignHash")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamClose")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr, phstream: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr, cbdata: ULong, ffinal: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate")

public actual fun nCryptTranslateHandle(phprovider: MutPtr, phkey: MutPtr, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle")

public actual fun nCryptUnprotectSecret(phdescriptor: MutPtr, dwflags: NcryptFlags, pbprotectedblob: ConstPtr, cbprotectedblob: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbdata: MutPtr, pcbdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: ConstPtr, cbclaimblob: UInt, poutput: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXExportCertStore")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, pvpara: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx")

public actual fun pFXImportCertStore(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXImportCertStore")

public actual fun pFXIsPFXBlob(ppfx: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob")

public actual fun pFXVerifyPassword(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword")

public actual fun processPrng(pbdata: MutPtr, cbdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyProcessPrng")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySignError")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySignError(): Int

public actual fun signError(): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySignError()

public actual fun signHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, pcbsig: MutPtr, ppsig: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignHash")

public actual fun signerFreeSignerContext(psignercontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext")

public actual fun signerSign(psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSign")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx2")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, pdigestsigninfo: ConstPtr, preserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerSignEx3")

public actual fun signerTimeStamp(psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStamp")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslChangeNotify")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr, cbrandoms: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslComputeSessionHash")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr, cbparams: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider: Long): Int

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslDecryptPacket")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEncryptPacket")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr, ppecccurve: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumEccCurves")

public actual fun sslEnumProtocolProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandBinderKey")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr, cbticketnonce: UInt, phpresharedkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr, phservertraffickey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExpandWriteKey")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExportKey")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr, cbrandoms: UInt, pbcontextvalue: ConstPtr, cbcontextvalue: UShort, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslExtractMasterKey")

public actual fun sslFreeBuffer(pvinput: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslFreeBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslFreeObject")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslFreeObject(hobject: Long, dwflags: Int): Int

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslFreeObject(hobject.toLong(), dwflags.toInt())

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetKeyProperty")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslGetProviderProperty")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslHashHandshake")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr, pszblobtype: Pcwstr, pbkeyblob: ConstPtr, cbkeyblob: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslImportKey")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pbencryptedkey: ConstPtr, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslImportMasterKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount")
private external fun wasiWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider: Long): Int

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    wasiWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr, pcertcontext: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey")

public actual fun sslOpenProvider(phsslprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslOpenProvider")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslSignHash")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySslVerifySignature")

public actual fun systemPrng(pbrandomdata: MutPtr, cbrandomdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySystemPrng")

public actual fun transformBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyTransformBlock")

public actual fun transformFinalBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyTransformFinalBlock")

public actual fun verifyHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr, pfverified: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyVerifyHash")
