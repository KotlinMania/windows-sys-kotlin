@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, nhashes: UInt, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: COpaquePointer?, cbpassword: UInt, pbsalt: COpaquePointer?, cbsalt: UInt, citerations: ULong, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: COpaquePointer?, ppimpllist: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptFreeBuffer(pvbuffer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: COpaquePointer?, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, dwlength: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: COpaquePointer?, cbsecret: UInt, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: COpaquePointer?, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: COpaquePointer?, cboperations: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptRegisterConfigChangeNotify(phevent: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhash: COpaquePointer?, cbhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: COpaquePointer?, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: COpaquePointer?, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCloseServerOcspResponse(hserverocspresponse: COpaquePointer?, dwflags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: COpaquePointer?, pcertid2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: COpaquePointer?, pcertname2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCompareIntegerBlob(pint1: COpaquePointer?, pint2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: COpaquePointer?, ppublickey2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: COpaquePointer?, cbctlencoded: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: COpaquePointer?, coptattr: UInt, rgoptattr: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pctlentry: COpaquePointer?, pcbctlentry: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateCertificateChainEngine(pconfig: COpaquePointer?, phchainengine: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pcreatepara: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: COpaquePointer?, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pstarttime: COpaquePointer?, pendtime: COpaquePointer?, pextensions: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDeleteCRLFromStore(pcrlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDeleteCTLFromStore(pctlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDeleteCertificateFromStore(pcertcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDuplicateCRLContext(pcrlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDuplicateCTLContext(pctlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDuplicateCertificateChain(pchaincontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDuplicateCertificateContext(pcertcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCRLContextProperties(pcrlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCTLContextProperties(pctlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCertificateContextProperties(pcertcontext: COpaquePointer?, dwpropid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumPhysicalStore): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: COpaquePointer?, ppvnextsubject: COpaquePointer?, psubjectidentifier: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStore): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: COpaquePointer?, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindCertificateInCRL(pcert: COpaquePointer?, pcrlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppcrlentry: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: COpaquePointer?, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevchaincontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCRLContext(pcrlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCTLContext(pctlcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCertificateChain(pchaincontext: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCertificateChainList(prgpselection: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeCertificateContext(pcertcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: COpaquePointer?, pprevcrlcontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: COpaquePointer?, ptime: COpaquePointer?, hadditionalstore: Hcertstore, pchainpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppchaincontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetEnhancedKeyUsage(pcertcontext: COpaquePointer?, dwflags: UInt, pusage: COpaquePointer?, pcbusage: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: COpaquePointer?, pbkeyusage: COpaquePointer?, cbkeyusage: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: COpaquePointer?, pprevissuercontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetNameStringA(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetNameStringW(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: COpaquePointer?, cnumoids: COpaquePointer?, rghoids: COpaquePointer?, pcboids: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: COpaquePointer?, prdn: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certIsStrongHashToSign(pstrongsignpara: COpaquePointer?, pwszcnghashalgid: Pcwstr, psigningcert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certIsValidCRLForCertificate(pcert: COpaquePointer?, pcrl: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: COpaquePointer?, ptimestamp: COpaquePointer?, pwszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certOpenServerOcspResponse(pchaincontext: COpaquePointer?, dwflags: UInt, popenpara: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: COpaquePointer?): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pstr, csz: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pwstr, csz: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRegisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRegisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: COpaquePointer?, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: COpaquePointer?, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?, ppwszmimetype: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSelectCertificateChains(pselectioncontext: COpaquePointer?, dwflags: UInt, pchainparameters: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, hstore: Hcertstore, pcselection: COpaquePointer?, pprgpselection: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSerializeCRLStoreElement(pcrlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSerializeCTLStoreElement(pctlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSerializeCertificateStoreElement(pcertcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: COpaquePointer?, pctlentry: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetEnhancedKeyUsage(pcertcontext: COpaquePointer?, pusage: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certUnregisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certUnregisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?, ccrlinfo: UInt, rgpcrlinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: COpaquePointer?, pcrlinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, psubjectusage: COpaquePointer?, dwflags: UInt, pverifyusagepara: COpaquePointer?, pverifyusagestatus: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: COpaquePointer?, ppolicypara: COpaquePointer?, ppolicystatus: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: COpaquePointer?, dwflags: UInt, prevpara: COpaquePointer?, prevstatus: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifySubjectCertificateContext(psubject: COpaquePointer?, pissuer: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyTimeValidity(ptimetoverify: COpaquePointer?, pcertinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun certVerifyValidityNesting(psubjectinfo: COpaquePointer?, pissuerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeCryptoHandle(hcrypto: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptAcquireCertificatePrivateKey(pcert: COpaquePointer?, dwflags: CryptAcquireFlags, pvparameters: COpaquePointer?, phcryptprovorncryptkey: COpaquePointer?, pdwkeyspec: COpaquePointer?, pfcallerfreeprovorncryptkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptAcquireContextA(phprov: COpaquePointer?, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptAcquireContextW(phprov: COpaquePointer?, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptBinaryToStringA(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptBinaryToStringW(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: COpaquePointer?, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: COpaquePointer?, pbhash: COpaquePointer?, pcbhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencodedblob: COpaquePointer?, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: COpaquePointer?, pdwinnercontenttype: COpaquePointer?, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pdecodepara: COpaquePointer?, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDecryptMessage(pdecryptpara: COpaquePointer?, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, dwflags: CryptEncodeObjectFlags, pencodepara: COpaquePointer?, pvencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwbuflen: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEncryptMessage(pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobeencrypted: COpaquePointer?, cbtobeencrypted: UInt, pbencryptedblob: COpaquePointer?, pcbencryptedblob: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCryptEnumKeyidProp): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pstr, pcbtypename: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pwstr, pcbtypename: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pbprivatekeyblob: COpaquePointer?, pcbprivatekeyblob: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptFindCertificateKeyProvInfo(pcert: COpaquePointer?, dwflags: CryptFindFlags, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: COpaquePointer?, dwgroupid: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: COpaquePointer?, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, pbformat: COpaquePointer?, pcbformat: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: COpaquePointer?, ppfnfree: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetDefaultOIDDllList(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: COpaquePointer?, pbvaluedata: COpaquePointer?, pcbvaluedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: COpaquePointer?, dwflags: CryptGetUrlFlags, purlarray: COpaquePointer?, pcburlarray: COpaquePointer?, purlinfo: COpaquePointer?, pcburlinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashData(hhash: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashMessage(phashpara: COpaquePointer?, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbhashedblob: COpaquePointer?, pcbhashedblob: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptImportKey(hprov: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: COpaquePointer?, pvauxinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, dwflags: CryptImportPublicKeyFlags, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: COpaquePointer?, dwflags: CryptDefaultContextFlags, pvreserved: COpaquePointer?, phdefaultcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMemAlloc(cbsize: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMemFree(pv: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMemRealloc(pv: COpaquePointer?, cbsize: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgClose(hcryptmsg: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgControl(hcryptmsg: COpaquePointer?, dwflags: UInt, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgCountersign(hcryptmsg: COpaquePointer?, dwindex: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?, pbcountersignature: COpaquePointer?, pcbcountersignature: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgDuplicate(hcryptmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: COpaquePointer?, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: COpaquePointer?, csignerstore: UInt, rghsignerstore: COpaquePointer?, dwflags: UInt, ppsigner: COpaquePointer?, pdwsignerindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgGetParam(hcryptmsg: COpaquePointer?, dwparamtype: UInt, dwindex: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: COpaquePointer?, pstreaminfo: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, pstreaminfo: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: COpaquePointer?, cbctlcontent: UInt, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgUpdate(hcryptmsg: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, ffinal: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, pcicountersigner: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: COpaquePointer?, dwflags: UInt, pvextra: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptProtectData(pdatain: COpaquePointer?, szdatadescr: Pcwstr, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptProtectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: COpaquePointer?, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: COpaquePointer?, pdwcontenttype: COpaquePointer?, pdwformattype: COpaquePointer?, phcertstore: COpaquePointer?, phmsg: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRegisterOIDInfo(pinfo: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: COpaquePointer?, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: COpaquePointer?, cbvaluedata: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignAndEncryptMessage(psignpara: COpaquePointer?, pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobesignedandencrypted: COpaquePointer?, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: COpaquePointer?, pcbsignedandencryptedblob: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: COpaquePointer?, cbencodedtobesigned: UInt, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbsignature: COpaquePointer?, pcbsignature: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignMessage(psignpara: COpaquePointer?, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptSignMessageWithKey(psignpara: COpaquePointer?, pbtobesigned: COpaquePointer?, cbtobesigned: UInt, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUnprotectData(pdatain: COpaquePointer?, ppszdatadescr: COpaquePointer?, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUnprotectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUnregisterOIDInfo(pinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: COpaquePointer?, pdwfailurecount: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, ppublickey: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: COpaquePointer?, dwissuertype: UInt, pvissuer: COpaquePointer?, dwflags: CryptVerifyCertFlags, pvextra: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyDetachedMessageHash(phashpara: COpaquePointer?, pbdetachedhashblob: COpaquePointer?, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbdetachedsignblob: COpaquePointer?, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyMessageHash(phashpara: COpaquePointer?, pbhashedblob: COpaquePointer?, cbhashedblob: UInt, pbtobehashed: COpaquePointer?, pcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: COpaquePointer?, ppublickeyinfo: COpaquePointer?, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: COpaquePointer?, cbtscontentinfo: UInt, pbdata: COpaquePointer?, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlAddObject(hsignatureorobject: COpaquePointer?, dwflags: UInt, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlClose(hcryptxml: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlCreateReference(hcryptxml: COpaquePointer?, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: COpaquePointer?, ctransform: UInt, rgtransform: COpaquePointer?, phreference: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlDigestReference(hreference: COpaquePointer?, dwflags: UInt, pdataproviderin: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlEncode(hcryptxml: COpaquePointer?, dwcharset: CryptXmlCharset, rgproperty: COpaquePointer?, cproperty: UInt, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: COpaquePointer?, dwgroupid: UInt, dwflags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: COpaquePointer?, dwflags: CryptXmlFlags, ppalginfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetDocContext(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetReference(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetSignature(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetStatus(hcryptxml: COpaquePointer?, pstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlGetTransforms(ppconfig: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: COpaquePointer?, phkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlOpenToDecode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phcryptxml: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlOpenToEncode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phsignature: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlSetHMACSecret(hsignature: COpaquePointer?, pbsecret: COpaquePointer?, cbsecret: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlSign(hsignature: COpaquePointer?, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: COpaquePointer?, psignaturemethod: COpaquePointer?, pcanonicalization: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cryptXmlVerifySignature(hsignature: COpaquePointer?, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun encrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findCertsByIssuer(pcertchains: COpaquePointer?, pcbcertchains: COpaquePointer?, pccertchains: COpaquePointer?, pbencodedissuername: COpaquePointer?, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeToken(pallocmemory: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun generateDerivedKey(hcrypto: COpaquePointer?, cblabel: UInt, plabel: COpaquePointer?, cbnonce: UInt, pnonce: COpaquePointer?, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: COpaquePointer?, ppkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: COpaquePointer?, pcbtoken: COpaquePointer?, pptoken: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCryptoTransform(hsymmetriccrypto: COpaquePointer?, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: COpaquePointer?, pphtransform: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKeyedHash(hsymmetriccrypto: COpaquePointer?, pphhash: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getToken(cpolicychain: UInt, ppolicychain: COpaquePointer?, securitytoken: COpaquePointer?, phprooftokencrypto: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hashCore(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hashFinal(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun manageCardSpace(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptFreeBuffer(pvinput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: ObjectSecurityInformation): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: COpaquePointer?, dwinfotype: UInt, ppvinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, phkey: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptOpenStorageProvider(phprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbprotectedblob: COpaquePointer?, pcbprotectedblob: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: COpaquePointer?, phstream: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: COpaquePointer?, cbdata: ULong, ffinal: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptTranslateHandle(phprovider: COpaquePointer?, phkey: COpaquePointer?, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptUnprotectSecret(phdescriptor: COpaquePointer?, dwflags: NcryptFlags, pbprotectedblob: COpaquePointer?, cbprotectedblob: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, poutput: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, pvpara: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pFXImportCertStore(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pFXIsPFXBlob(ppfx: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pFXVerifyPassword(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processPrng(pbdata: COpaquePointer?, cbdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signError(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, pcbsig: COpaquePointer?, ppsig: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerFreeSignerContext(psignercontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerSign(psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, pdigestsigninfo: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerTimeStamp(psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: COpaquePointer?, cbrandoms: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: COpaquePointer?, cbparams: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: COpaquePointer?, ppecccurve: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslEnumProtocolProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: COpaquePointer?, cbticketnonce: UInt, phpresharedkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: COpaquePointer?, phservertraffickey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: COpaquePointer?, cbrandoms: UInt, pbcontextvalue: COpaquePointer?, cbcontextvalue: UShort, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslFreeBuffer(pvinput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: COpaquePointer?, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: COpaquePointer?, pszblobtype: Pcwstr, pbkeyblob: COpaquePointer?, cbkeyblob: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pbencryptedkey: COpaquePointer?, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: COpaquePointer?, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: COpaquePointer?, pcertcontext: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslOpenProvider(phsslprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemPrng(pbrandomdata: COpaquePointer?, cbrandomdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transformBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transformFinalBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun verifyHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, cbsig: UInt, psig: COpaquePointer?, pfverified: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
