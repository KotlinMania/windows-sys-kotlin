@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.NCRYPT_DESCRIPTOR_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.NCRYPT_STREAM_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.system.registry.REG_VALUE_TYPE

public actual fun BCryptAddContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, dwposition: UInt): NTSTATUS =
    0

public actual fun BCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwposition: UInt): NTSTATUS =
    0

public actual fun BCryptCloseAlgorithmProvider(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptConfigureContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    0

public actual fun BCryptConfigureContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pconfig: Long): NTSTATUS =
    0

public actual fun BCryptCreateContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    0

public actual fun BCryptCreateHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptCreateMultiHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptDecrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    0

public actual fun BCryptDeleteContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR): NTSTATUS =
    0

public actual fun BCryptDeriveKey(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptDeriveKeyCapi(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptDeriveKeyPBKDF2(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptDestroyHash(hhash: BCRYPT_HASH_HANDLE): NTSTATUS =
    0

public actual fun BCryptDestroyKey(hkey: BCRYPT_KEY_HANDLE): NTSTATUS =
    0

public actual fun BCryptDestroySecret(hsecret: BCRYPT_SECRET_HANDLE): NTSTATUS =
    0

public actual fun BCryptDuplicateHash(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptDuplicateKey(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptEncrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    0

public actual fun BCryptEnumAlgorithms(dwalgoperations: BCRYPT_OPERATION, palgcount: Long, ppalglist: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptEnumContextFunctionProviders(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptEnumContextFunctions(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptEnumContexts(dwtable: BCRYPT_TABLE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptEnumProviders(pszalgid: PCWSTR, pimplcount: Long, ppimpllist: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptExportKey(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptFinalizeKeyPair(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptFinishHash(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptFreeBuffer(pvbuffer: Long) {
}

public actual fun BCryptGenRandom(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: BCRYPTGENRANDOM_FLAGS): NTSTATUS =
    0

public actual fun BCryptGenerateKeyPair(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptGenerateSymmetricKey(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptGetFipsAlgorithmMode(pfenabled: Long): NTSTATUS =
    0

public actual fun BCryptGetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptHash(halgorithm: BCRYPT_ALG_HANDLE, pbsecret: Long, cbsecret: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt): NTSTATUS =
    0

public actual fun BCryptHashData(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptImportKey(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptImportKeyPair(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptKeyDerivation(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: PCWSTR, pszimplementation: PCWSTR, dwflags: BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS): NTSTATUS =
    0

public actual fun BCryptProcessMultiOperations(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptQueryContextConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptQueryContextFunctionConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptQueryContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, pcbvalue: Long, ppbvalue: Long): NTSTATUS =
    0

public actual fun BCryptQueryProviderRegistration(pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptRegisterConfigChangeNotify(phevent: Long): NTSTATUS =
    0

public actual fun BCryptRegisterProvider(pszprovider: PCWSTR, dwflags: UInt, preg: Long): NTSTATUS =
    0

public actual fun BCryptRemoveContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR): NTSTATUS =
    0

public actual fun BCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR): NTSTATUS =
    0

public actual fun BCryptResolveProviders(pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwflags: BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    0

public actual fun BCryptSecretAgreement(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptSetContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, cbvalue: UInt, pbvalue: Long): NTSTATUS =
    0

public actual fun BCryptSetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    0

public actual fun BCryptSignHash(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    0

public actual fun BCryptUnregisterConfigChangeNotify(hevent: HANDLE): NTSTATUS =
    0

public actual fun BCryptUnregisterProvider(pszprovider: PCWSTR): NTSTATUS =
    0

public actual fun BCryptVerifySignature(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: BCRYPT_FLAGS): NTSTATUS =
    0

public actual fun CertAddCRLContextToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddCRLLinkToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddCTLContextToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddCTLLinkToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddCertificateContextToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddCertificateLinkToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    0

public actual fun CertAddEncodedCRLToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: Long): BOOL =
    0

public actual fun CertAddEncodedCTLToStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbctlencoded: Long, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: Long): BOOL =
    0

public actual fun CertAddEncodedCertificateToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: Long): BOOL =
    0

public actual fun CertAddEncodedCertificateToSystemStoreA(szcertstorename: PCSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    0

public actual fun CertAddEncodedCertificateToSystemStoreW(szcertstorename: PCWSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    0

public actual fun CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    0

public actual fun CertAddRefServerOcspResponse(hserverocspresponse: Long) {
}

public actual fun CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long) {
}

public actual fun CertAddSerializedElementToStore(hcertstore: HCERTSTORE, pbelement: Long, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: Long, ppvcontext: Long): BOOL =
    0

public actual fun CertAddStoreToCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE, dwupdateflags: UInt, dwpriority: UInt): BOOL =
    0

public actual fun CertAlgIdToOID(dwalgid: UInt): PCSTR =
    0L

public actual fun CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: UInt) {
}

public actual fun CertCloseStore(hcertstore: HCERTSTORE, dwflags: UInt): BOOL =
    0

public actual fun CertCompareCertificate(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid1: Long, pcertid2: Long): BOOL =
    0

public actual fun CertCompareCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertname1: Long, pcertname2: Long): BOOL =
    0

public actual fun CertCompareIntegerBlob(pint1: Long, pint2: Long): BOOL =
    0

public actual fun CertComparePublicKeyInfo(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey1: Long, ppublickey2: Long): BOOL =
    0

public actual fun CertControlStore(hcertstore: HCERTSTORE, dwflags: CERT_CONTROL_STORE_FLAGS, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    0

public actual fun CertCreateCRLContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt): Long =
    0L

public actual fun CertCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: Long, cbctlencoded: UInt): Long =
    0L

public actual fun CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: UInt, rgoptattr: Long, dwflags: UInt, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): BOOL =
    0

public actual fun CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): BOOL =
    0

public actual fun CertCreateCertificateContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt): Long =
    0L

public actual fun CertCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pcreatepara: Long): Long =
    0L

public actual fun CertCreateSelfSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob: Long, dwflags: CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long =
    0L

public actual fun CertDeleteCRLFromStore(pcrlcontext: Long): BOOL =
    0

public actual fun CertDeleteCTLFromStore(pctlcontext: Long): BOOL =
    0

public actual fun CertDeleteCertificateFromStore(pcertcontext: Long): BOOL =
    0

public actual fun CertDuplicateCRLContext(pcrlcontext: Long): Long =
    0L

public actual fun CertDuplicateCTLContext(pctlcontext: Long): Long =
    0L

public actual fun CertDuplicateCertificateChain(pchaincontext: Long): Long =
    0L

public actual fun CertDuplicateCertificateContext(pcertcontext: Long): Long =
    0L

public actual fun CertDuplicateStore(hcertstore: HCERTSTORE): HCERTSTORE =
    0L

public actual fun CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: UInt): UInt =
    0u

public actual fun CertEnumCRLsInStore(hcertstore: HCERTSTORE, pprevcrlcontext: Long): Long =
    0L

public actual fun CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: UInt): UInt =
    0u

public actual fun CertEnumCTLsInStore(hcertstore: HCERTSTORE, pprevctlcontext: Long): Long =
    0L

public actual fun CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: UInt): UInt =
    0u

public actual fun CertEnumCertificatesInStore(hcertstore: HCERTSTORE, pprevcertcontext: Long): Long =
    0L

public actual fun CertEnumPhysicalStore(pvsystemstore: Long, dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_PHYSICAL_STORE): BOOL =
    0

public actual fun CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): BOOL =
    0

public actual fun CertEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE): BOOL =
    0

public actual fun CertEnumSystemStoreLocation(dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE_LOCATION): BOOL =
    0

public actual fun CertFindAttribute(pszobjid: PCSTR, cattr: UInt, rgattr: Long): Long =
    0L

public actual fun CertFindCRLInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: Long, pprevcrlcontext: Long): Long =
    0L

public actual fun CertFindCTLInStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CERT_FIND_TYPE, pvfindpara: Long, pprevctlcontext: Long): Long =
    0L

public actual fun CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: UInt, pvreserved: Long, ppcrlentry: Long): BOOL =
    0

public actual fun CertFindCertificateInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: CERT_FIND_FLAGS, pvfindpara: Long, pprevcertcontext: Long): Long =
    0L

public actual fun CertFindChainInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype: UInt, pvfindpara: Long, pprevchaincontext: Long): Long =
    0L

public actual fun CertFindExtension(pszobjid: PCSTR, cextensions: UInt, rgextensions: Long): Long =
    0L

public actual fun CertFindRDNAttr(pszobjid: PCSTR, pname: Long): Long =
    0L

public actual fun CertFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, pctlcontext: Long, dwflags: UInt): Long =
    0L

public actual fun CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: UInt, pvreserved: Long, pencodedattributes: Long): BOOL =
    0

public actual fun CertFreeCRLContext(pcrlcontext: Long): BOOL =
    0

public actual fun CertFreeCTLContext(pctlcontext: Long): BOOL =
    0

public actual fun CertFreeCertificateChain(pchaincontext: Long) {
}

public actual fun CertFreeCertificateChainEngine(hchainengine: HCERTCHAINENGINE) {
}

public actual fun CertFreeCertificateChainList(prgpselection: Long) {
}

public actual fun CertFreeCertificateContext(pcertcontext: Long): BOOL =
    0

public actual fun CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long) {
}

public actual fun CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CertGetCRLFromStore(hcertstore: HCERTSTORE, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long =
    0L

public actual fun CertGetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CertGetCertificateChain(hchainengine: HCERTCHAINENGINE, pcertcontext: Long, ptime: Long, hadditionalstore: HCERTSTORE, pchainpara: Long, dwflags: UInt, pvreserved: Long, ppchaincontext: Long): BOOL =
    0

public actual fun CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: UInt, pusage: Long, pcbusage: Long): BOOL =
    0

public actual fun CertGetIntendedKeyUsage(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: UInt): BOOL =
    0

public actual fun CertGetIssuerCertificateFromStore(hcertstore: HCERTSTORE, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long =
    0L

public actual fun CertGetNameStringA(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PSTR, cchnamestring: UInt): UInt =
    0u

public actual fun CertGetNameStringW(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PWSTR, cchnamestring: UInt): UInt =
    0u

public actual fun CertGetPublicKeyLength(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey: Long): UInt =
    0u

public actual fun CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: UInt, pvreserved: Long): Long =
    0L

public actual fun CertGetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CertGetSubjectCertificateFromStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long): Long =
    0L

public actual fun CertGetValidUsages(ccerts: UInt, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): BOOL =
    0

public actual fun CertIsRDNAttrsInCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwflags: UInt, pcertname: Long, prdn: Long): BOOL =
    0

public actual fun CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: PCWSTR, psigningcert: Long): BOOL =
    0

public actual fun CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun CertIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL =
    0

public actual fun CertNameToStrA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PSTR, csz: UInt): UInt =
    0u

public actual fun CertNameToStrW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PWSTR, csz: UInt): UInt =
    0u

public actual fun CertOIDToAlgId(pszobjid: PCSTR): UInt =
    0u

public actual fun CertOpenServerOcspResponse(pchaincontext: Long, dwflags: UInt, popenpara: Long): Long =
    0L

public actual fun CertOpenStore(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long): HCERTSTORE =
    0L

public actual fun CertOpenSystemStoreA(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCSTR): HCERTSTORE =
    0L

public actual fun CertOpenSystemStoreW(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCWSTR): HCERTSTORE =
    0L

public actual fun CertRDNValueToStrA(dwvaluetype: UInt, pvalue: Long, psz: PSTR, csz: UInt): UInt =
    0u

public actual fun CertRDNValueToStrW(dwvaluetype: UInt, pvalue: Long, psz: PWSTR, csz: UInt): UInt =
    0u

public actual fun CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long): BOOL =
    0

public actual fun CertRegisterSystemStore(pvsystemstore: Long, dwflags: UInt, pstoreinfo: Long, pvreserved: Long): BOOL =
    0

public actual fun CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    0

public actual fun CertRemoveStoreFromCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE) {
}

public actual fun CertResyncCertificateChainEngine(hchainengine: HCERTCHAINENGINE): BOOL =
    0

public actual fun CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): BOOL =
    0

public actual fun CertSaveStore(hcertstore: HCERTSTORE, dwencodingtype: CERT_QUERY_ENCODING_TYPE, dwsaveas: CERT_STORE_SAVE_AS, dwsaveto: CERT_STORE_SAVE_TO, pvsavetopara: Long, dwflags: UInt): BOOL =
    0

public actual fun CertSelectCertificateChains(pselectioncontext: Long, dwflags: UInt, pchainparameters: Long, ccriteria: UInt, rgpcriteria: Long, hstore: HCERTSTORE, pcselection: Long, pprgpselection: Long): BOOL =
    0

public actual fun CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    0

public actual fun CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    0

public actual fun CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    0

public actual fun CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    0

public actual fun CertSetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    0

public actual fun CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: UInt): BOOL =
    0

public actual fun CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    0

public actual fun CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): BOOL =
    0

public actual fun CertSetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    0

public actual fun CertStrToNameA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    0

public actual fun CertStrToNameW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCWSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    0

public actual fun CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR): BOOL =
    0

public actual fun CertUnregisterSystemStore(pvsystemstore: Long, dwflags: UInt): BOOL =
    0

public actual fun CertVerifyCRLRevocation(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long, ccrlinfo: UInt, rgpcrlinfo: Long): BOOL =
    0

public actual fun CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int =
    0

public actual fun CertVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, psubjectusage: Long, dwflags: UInt, pverifyusagepara: Long, pverifyusagestatus: Long): BOOL =
    0

public actual fun CertVerifyCertificateChainPolicy(pszpolicyoid: PCSTR, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): BOOL =
    0

public actual fun CertVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: Long, dwflags: UInt, prevpara: Long, prevstatus: Long): BOOL =
    0

public actual fun CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): BOOL =
    0

public actual fun CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int =
    0

public actual fun CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): BOOL =
    0

public actual fun CloseCryptoHandle(hcrypto: Long): HRESULT =
    0

public actual fun CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: CRYPT_ACQUIRE_FLAGS, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): BOOL =
    0

public actual fun CryptAcquireContextA(phprov: Long, szcontainer: PCSTR, szprovider: PCSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    0

public actual fun CryptAcquireContextW(phprov: Long, szcontainer: PCWSTR, szprovider: PCWSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    0

public actual fun CryptBinaryToStringA(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PSTR, pcchstring: Long): BOOL =
    0

public actual fun CryptBinaryToStringW(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PWSTR, pcchstring: Long): BOOL =
    0

public actual fun CryptCloseAsyncHandle(hasync: HCRYPTASYNC): BOOL =
    0

public actual fun CryptContextAddRef(hprov: ULong, pdwreserved: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptCreateAsyncHandle(dwflags: UInt, phasync: Long): BOOL =
    0

public actual fun CryptCreateHash(hprov: ULong, algid: ALG_ID, hkey: ULong, dwflags: UInt, phhash: Long): BOOL =
    0

public actual fun CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpubkeyoid: PCSTR, ppubkeystruc: Long, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: Long, pbhash: Long, pcbhash: Long): BOOL =
    0

public actual fun CryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencodedblob: Long, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    0

public actual fun CryptDecodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    0

public actual fun CryptDecodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    0

public actual fun CryptDecrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long): BOOL =
    0

public actual fun CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    0

public actual fun CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): BOOL =
    0

public actual fun CryptDeriveKey(hprov: ULong, algid: ALG_ID, hbasedata: ULong, dwflags: UInt, phkey: Long): BOOL =
    0

public actual fun CryptDestroyHash(hhash: ULong): BOOL =
    0

public actual fun CryptDestroyKey(hkey: ULong): BOOL =
    0

public actual fun CryptDuplicateHash(hhash: ULong, pdwreserved: Long, dwflags: UInt, phhash: Long): BOOL =
    0

public actual fun CryptDuplicateKey(hkey: ULong, pdwreserved: Long, dwflags: UInt, phkey: Long): BOOL =
    0

public actual fun CryptEncodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    0

public actual fun CryptEncodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, dwflags: CRYPT_ENCODE_OBJECT_FLAGS, pencodepara: Long, pvencoded: Long, pcbencoded: Long): BOOL =
    0

public actual fun CryptEncrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long, dwbuflen: UInt): BOOL =
    0

public actual fun CryptEncryptMessage(pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: UInt, pbencryptedblob: Long, pcbencryptedblob: Long): BOOL =
    0

public actual fun CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvarg: Long, pfnenum: PFN_CRYPT_ENUM_KEYID_PROP): BOOL =
    0

public actual fun CryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, dwflags: UInt, pvarg: Long, pfnenumoidfunc: PFN_CRYPT_ENUM_OID_FUNC): BOOL =
    0

public actual fun CryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumoidinfo: PFN_CRYPT_ENUM_OID_INFO): BOOL =
    0

public actual fun CryptEnumProviderTypesA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PSTR, pcbtypename: Long): BOOL =
    0

public actual fun CryptEnumProviderTypesW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PWSTR, pcbtypename: Long): BOOL =
    0

public actual fun CryptEnumProvidersA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PSTR, pcbprovname: Long): BOOL =
    0

public actual fun CryptEnumProvidersW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PWSTR, pcbprovname: Long): BOOL =
    0

public actual fun CryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CRYPT_KEY_FLAGS, pbdata: Long, pdwdatalen: Long): BOOL =
    0

public actual fun CryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): BOOL =
    0

public actual fun CryptExportPublicKeyInfo(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pcbinfo: Long): BOOL =
    0

public actual fun CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    0

public actual fun CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    0

public actual fun CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: CRYPT_FIND_FLAGS, pvreserved: Long): BOOL =
    0

public actual fun CryptFindLocalizedName(pwszcryptname: PCWSTR): PCWSTR =
    0L

public actual fun CryptFindOIDInfo(dwkeytype: UInt, pvkey: Long, dwgroupid: UInt): Long =
    0L

public actual fun CryptFormatObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: Long, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, pbformat: Long, pcbformat: Long): BOOL =
    0

public actual fun CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptGenKey(hprov: ULong, algid: ALG_ID, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    0

public actual fun CryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: Long): BOOL =
    0

public actual fun CryptGetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, ppvparam: Long, ppfnfree: Long): BOOL =
    0

public actual fun CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: UInt, pwszdlllist: PWSTR, pcchdlllist: Long): BOOL =
    0

public actual fun CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pwszdll: PCWSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    0

public actual fun CryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PSTR, pcbprovname: Long): BOOL =
    0

public actual fun CryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PWSTR, pcbprovname: Long): BOOL =
    0

public actual fun CryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CryptGetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, dwflags: UInt, pbsignedblob: Long, cbsignedblob: UInt): HCERTSTORE =
    0L

public actual fun CryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: Long, cbsignedblob: UInt): Int =
    0

public actual fun CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pszoid: PCSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    0

public actual fun CryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): BOOL =
    0

public actual fun CryptGetObjectUrl(pszurloid: PCSTR, pvpara: Long, dwflags: CRYPT_GET_URL_FLAGS, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): BOOL =
    0

public actual fun CryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: Long): BOOL =
    0

public actual fun CryptHashCertificate(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptHashCertificate2(pwszcnghashalgid: PCWSTR, dwflags: UInt, pvreserved: Long, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptHashData(hhash: ULong, pbdata: Long, dwdatalen: UInt, dwflags: UInt): BOOL =
    0

public actual fun CryptHashMessage(phashpara: Long, fdetachedhash: BOOL, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptHashPublicKeyInfo(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): BOOL =
    0

public actual fun CryptHashToBeSigned(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptImportKey(hprov: ULong, pbdata: Long, dwdatalen: UInt, hpubkey: ULong, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    0

public actual fun CryptImportPKCS8(sprivatekeyandparams: CRYPT_PKCS8_IMPORT_PARAMS, dwflags: CRYPT_KEY_FLAGS, phcryptprov: Long, pvauxinfo: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, phkey: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, aikeyalg: ALG_ID, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfoEx2(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo: Long, phkey: Long): BOOL =
    0

public actual fun CryptInitOIDFunctionSet(pszfuncname: PCSTR, dwflags: UInt): Long =
    0L

public actual fun CryptInstallCancelRetrieval(pfncancel: PFN_CRYPT_CANCEL_RETRIEVAL, pvarg: Long, dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun CryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara: Long, dwflags: CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved: Long, phdefaultcontext: Long): BOOL =
    0

public actual fun CryptInstallOIDFunctionAddress(hmodule: HMODULE, dwencodingtype: UInt, pszfuncname: PCSTR, cfuncentry: UInt, rgfuncentry: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptMemAlloc(cbsize: UInt): Long =
    0L

public actual fun CryptMemFree(pv: Long) {
}

public actual fun CryptMemRealloc(pv: Long, cbsize: UInt): Long =
    0L

public actual fun CryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, cbdata: UInt): UInt =
    0u

public actual fun CryptMsgClose(hcryptmsg: Long): BOOL =
    0

public actual fun CryptMsgControl(hcryptmsg: Long, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    0

public actual fun CryptMsgCountersign(hcryptmsg: Long, dwindex: UInt, ccountersigners: UInt, rgcountersigners: Long): BOOL =
    0

public actual fun CryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): BOOL =
    0

public actual fun CryptMsgDuplicate(hcryptmsg: Long): Long =
    0L

public actual fun CryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: Long, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    0

public actual fun CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: UInt, rghsignerstore: Long, dwflags: UInt, ppsigner: Long, pdwsignerindex: Long): BOOL =
    0

public actual fun CryptMsgGetParam(hcryptmsg: Long, dwparamtype: UInt, dwindex: UInt, pvdata: Long, pcbdata: Long): BOOL =
    0

public actual fun CryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, precipientinfo: Long, pstreaminfo: Long): Long =
    0L

public actual fun CryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CRYPT_MSG_TYPE, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, pstreaminfo: Long): Long =
    0L

public actual fun CryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: Long, cbctlcontent: UInt, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    0

public actual fun CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL =
    0

public actual fun CryptMsgVerifyCountersignatureEncoded(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, pcicountersigner: Long): BOOL =
    0

public actual fun CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: Long, dwflags: UInt, pvextra: Long): BOOL =
    0

public actual fun CryptProtectData(pdatain: Long, szdatadescr: PCWSTR, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    0

public actual fun CryptProtectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    0

public actual fun CryptQueryObject(dwobjecttype: CERT_QUERY_OBJECT_TYPE, pvobject: Long, dwexpectedcontenttypeflags: CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags: CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags: UInt, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): BOOL =
    0

public actual fun CryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, dwindex: UInt, pwszdll: PCWSTR): BOOL =
    0

public actual fun CryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszdll: PCWSTR, pszoverridefuncname: PCSTR): BOOL =
    0

public actual fun CryptRegisterOIDInfo(pinfo: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptReleaseContext(hprov: ULong, dwflags: UInt): BOOL =
    0

public actual fun CryptRetrieveObjectByUrlA(pszurl: PCSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    0

public actual fun CryptRetrieveObjectByUrlW(pszurl: PCWSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    0

public actual fun CryptRetrieveTimeStamp(wszurl: PCWSTR, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: PCSTR, ppara: Long, pbdata: Long, cbdata: UInt, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    0

public actual fun CryptSetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, pvparam: Long, pfnfree: PFN_CRYPT_ASYNC_PARAM_FREE_FUNC): BOOL =
    0

public actual fun CryptSetHashParam(hhash: ULong, dwparam: CRYPT_SET_HASH_PARAM, pbdata: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long): BOOL =
    0

public actual fun CryptSetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, dwvaluetype: REG_VALUE_TYPE, pbvaluedata: Long, cbvaluedata: UInt): BOOL =
    0

public actual fun CryptSetProvParam(hprov: ULong, dwparam: CRYPT_SET_PROV_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptSetProviderA(pszprovname: PCSTR, dwprovtype: UInt): BOOL =
    0

public actual fun CryptSetProviderExA(pszprovname: PCSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptSetProviderExW(pszprovname: PCWSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    0

public actual fun CryptSetProviderW(pszprovname: PCWSTR, dwprovtype: UInt): BOOL =
    0

public actual fun CryptSignAndEncodeCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    0

public actual fun CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): BOOL =
    0

public actual fun CryptSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned: Long, cbencodedtobesigned: UInt, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): BOOL =
    0

public actual fun CryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: PCSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    0

public actual fun CryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: PCWSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    0

public actual fun CryptSignMessage(psignpara: Long, fdetachedsignature: BOOL, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    0

public actual fun CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: UInt, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    0

public actual fun CryptStringToBinaryA(pszstring: PCSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    0

public actual fun CryptStringToBinaryW(pszstring: PCWSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    0

public actual fun CryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: UInt, pvreserved: Long): BOOL =
    0

public actual fun CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    0

public actual fun CryptUnprotectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    0

public actual fun CryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pwszdll: PCWSTR): BOOL =
    0

public actual fun CryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR): BOOL =
    0

public actual fun CryptUnregisterOIDInfo(pinfo: Long): BOOL =
    0

public actual fun CryptUpdateProtectedState(poldsid: PSID, pwszoldpassword: PCWSTR, dwflags: UInt, pdwsuccesscount: Long, pdwfailurecount: Long): BOOL =
    0

public actual fun CryptVerifyCertificateSignature(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, ppublickey: Long): BOOL =
    0

public actual fun CryptVerifyCertificateSignatureEx(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwsubjecttype: UInt, pvsubject: Long, dwissuertype: UInt, pvissuer: Long, dwflags: CRYPT_VERIFY_CERT_FLAGS, pvextra: Long): BOOL =
    0

public actual fun CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbdetachedsignblob: Long, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): BOOL =
    0

public actual fun CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: UInt, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    0

public actual fun CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): BOOL =
    0

public actual fun CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long): BOOL =
    0

public actual fun CryptVerifySignatureA(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCSTR, dwflags: UInt): BOOL =
    0

public actual fun CryptVerifySignatureW(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCWSTR, dwflags: UInt): BOOL =
    0

public actual fun CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: UInt, pbdata: Long, cbdata: UInt, hadditionalstore: HCERTSTORE, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    0

public actual fun CryptXmlAddObject(hsignatureorobject: Long, dwflags: UInt, rgproperty: Long, cproperty: UInt, pencoded: Long, ppobject: Long): HRESULT =
    0

public actual fun CryptXmlClose(hcryptxml: Long): HRESULT =
    0

public actual fun CryptXmlCreateReference(hcryptxml: Long, dwflags: UInt, wszid: PCWSTR, wszuri: PCWSTR, wsztype: PCWSTR, pdigestmethod: Long, ctransform: UInt, rgtransform: Long, phreference: Long): HRESULT =
    0

public actual fun CryptXmlDigestReference(hreference: Long, dwflags: UInt, pdataproviderin: Long): HRESULT =
    0

public actual fun CryptXmlEncode(hcryptxml: Long, dwcharset: CRYPT_XML_CHARSET, rgproperty: Long, cproperty: UInt, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT =
    0

public actual fun CryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumalginfo: PFN_CRYPT_XML_ENUM_ALG_INFO): HRESULT =
    0

public actual fun CryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: Long, dwgroupid: UInt, dwflags: UInt): Long =
    0L

public actual fun CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: CRYPT_XML_FLAGS, ppalginfo: Long): HRESULT =
    0

public actual fun CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): HRESULT =
    0

public actual fun CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): HRESULT =
    0

public actual fun CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): HRESULT =
    0

public actual fun CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): HRESULT =
    0

public actual fun CryptXmlGetTransforms(ppconfig: Long): HRESULT =
    0

public actual fun CryptXmlImportPublicKey(dwflags: CRYPT_XML_FLAGS, pkeyvalue: Long, phkey: Long): HRESULT =
    0

public actual fun CryptXmlOpenToDecode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, rgproperty: Long, cproperty: UInt, pencoded: Long, phcryptxml: Long): HRESULT =
    0

public actual fun CryptXmlOpenToEncode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, wszid: PCWSTR, rgproperty: Long, cproperty: UInt, pencoded: Long, phsignature: Long): HRESULT =
    0

public actual fun CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: UInt): HRESULT =
    0

public actual fun CryptXmlSign(hsignature: Long, hkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwflags: CRYPT_XML_FLAGS, dwkeyinfospec: CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): HRESULT =
    0

public actual fun CryptXmlVerifySignature(hsignature: Long, hkey: BCRYPT_KEY_HANDLE, dwflags: CRYPT_XML_FLAGS): HRESULT =
    0

public actual fun Decrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    0

public actual fun Encrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    0

public actual fun FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: UInt, pwszpurpose: PCWSTR, dwkeyspec: UInt): HRESULT =
    0

public actual fun FreeToken(pallocmemory: Long): BOOL =
    0

public actual fun GenerateDerivedKey(hcrypto: Long, cblabel: UInt, plabel: Long, cbnonce: UInt, pnonce: Long, derivedkeylength: UInt, offset: UInt, algid: PCWSTR, pcbkey: Long, ppkey: Long): HRESULT =
    0

public actual fun GetAsymmetricEncryptionInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetBrowserToken(dwparamtype: UInt, pparam: Long, pcbtoken: Long, pptoken: Long): HRESULT =
    0

public actual fun GetCipherInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetCryptoTransform(hsymmetriccrypto: Long, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: Long, pphtransform: Long): HRESULT =
    0

public actual fun GetHashInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetKeyDerivationInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetKeyStorageInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): HRESULT =
    0

public actual fun GetRngInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetSChannelInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetSecretAgreementInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetSignatureInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    0

public actual fun GetToken(cpolicychain: UInt, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): HRESULT =
    0

public actual fun HashCore(hcrypto: Long, cbindata: UInt, pindata: Long): HRESULT =
    0

public actual fun HashFinal(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    0

public actual fun ImportInformationCard(filename: PCWSTR): HRESULT =
    0

public actual fun ManageCardSpace(): HRESULT =
    0

public actual fun NCryptCloseProtectionDescriptor(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE): HRESULT =
    0

public actual fun NCryptCreateClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptCreatePersistedKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptCreateProtectionDescriptor(pwszdescriptorstring: PCWSTR, dwflags: UInt, phdescriptor: Long): HRESULT =
    0

public actual fun NCryptDecrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptDeleteKey(hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT =
    0

public actual fun NCryptDeriveKey(hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptEncrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptEnumAlgorithms(hprovider: NCRYPT_PROV_HANDLE, dwalgoperations: NCRYPT_OPERATION, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptEnumKeys(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptExportKey(hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptFinalizeKey(hkey: NCRYPT_KEY_HANDLE, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptFreeBuffer(pvinput: Long): HRESULT =
    0

public actual fun NCryptFreeObject(hobject: NCRYPT_HANDLE): HRESULT =
    0

public actual fun NCryptGetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: OBJECT_SECURITY_INFORMATION): HRESULT =
    0

public actual fun NCryptGetProtectionDescriptorInfo(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, pmempara: Long, dwinfotype: UInt, ppvinfo: Long): HRESULT =
    0

public actual fun NCryptImportKey(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptIsAlgSupported(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun NCryptIsKeyHandle(hkey: NCRYPT_KEY_HANDLE): BOOL =
    0

public actual fun NCryptKeyDerivation(hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptNotifyChangeKey(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptOpenKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptOpenStorageProvider(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun NCryptProtectSecret(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, pbdata: Long, cbdata: UInt, pmempara: Long, hwnd: HWND, ppbprotectedblob: Long, pcbprotectedblob: Long): HRESULT =
    0

public actual fun NCryptQueryProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PWSTR, pcdescriptorstring: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptRegisterProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun NCryptSecretAgreement(hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptSetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptSignHash(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun NCryptStreamClose(hstream: NCRYPT_STREAM_HANDLE): HRESULT =
    0

public actual fun NCryptStreamOpenToProtect(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, hwnd: HWND, pstreaminfo: Long, phstream: Long): HRESULT =
    0

public actual fun NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    0

public actual fun NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    0

public actual fun NCryptStreamUpdate(hstream: NCRYPT_STREAM_HANDLE, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT =
    0

public actual fun NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: UInt): HRESULT =
    0

public actual fun NCryptUnprotectSecret(phdescriptor: Long, dwflags: NCRYPT_FLAGS, pbprotectedblob: Long, cbprotectedblob: UInt, pmempara: Long, hwnd: HWND, ppbdata: Long, pcbdata: Long): HRESULT =
    0

public actual fun NCryptVerifyClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT =
    0

public actual fun NCryptVerifySignature(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    0

public actual fun PFXExportCertStore(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    0

public actual fun PFXExportCertStoreEx(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, pvpara: Long, dwflags: UInt): BOOL =
    0

public actual fun PFXImportCertStore(ppfx: Long, szpassword: PCWSTR, dwflags: CRYPT_KEY_FLAGS): HCERTSTORE =
    0L

public actual fun PFXIsPFXBlob(ppfx: Long): BOOL =
    0

public actual fun PFXVerifyPassword(ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    0

public actual fun ProcessPrng(pbdata: Long, cbdata: ULong): BOOL =
    0

public actual fun SignError(): HRESULT =
    0

public actual fun SignHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, pcbsig: Long, ppsig: Long): HRESULT =
    0

public actual fun SignerFreeSignerContext(psignercontext: Long): HRESULT =
    0

public actual fun SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    0

public actual fun SignerSignEx(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    0

public actual fun SignerSignEx2(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    0

public actual fun SignerSignEx3(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): HRESULT =
    0

public actual fun SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    0

public actual fun SignerTimeStampEx(dwflags: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    0

public actual fun SignerTimeStampEx2(dwflags: SIGNER_TIMESTAMP_FLAGS, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, dwalgid: ALG_ID, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    0

public actual fun SignerTimeStampEx3(dwflags: SIGNER_TIMESTAMP_FLAGS, dwindex: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, pszalgorithmoid: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    0

public actual fun SslChangeNotify(hevent: HANDLE, dwflags: UInt): HRESULT =
    0

public actual fun SslComputeClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslComputeEapKeyBlock(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslComputeFinishedHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslComputeSessionHash(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslCreateClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun SslCreateEphemeralKey(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslCreateHandshakeHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslDecrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    0

public actual fun SslDecryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT =
    0

public actual fun SslDuplicateTranscriptHash(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phtranscripthash: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslEncryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslEnumCipherSuites(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslEnumCipherSuitesEx(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslEnumEccCurves(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandBinderKey(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandExporterMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandPreSharedKey(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandResumptionMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandTrafficKeys(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExpandWriteKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExportKey(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExportKeyingMaterial(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslExtractEarlyKey(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExtractHandshakeKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslExtractMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslFreeBuffer(pvinput: Long): HRESULT =
    0

public actual fun SslFreeObject(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT =
    0

public actual fun SslGenerateMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslGeneratePreMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslGenerateSessionKeys(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslGetCipherSuitePRFHashAlgorithm(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT =
    0

public actual fun SslGetKeyProperty(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslGetProviderProperty(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslHashHandshake(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslImportKey(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslImportMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslIncrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    0

public actual fun SslLookupCipherLengths(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SslLookupCipherSuiteInfo(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslOpenPrivateKey(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslOpenProvider(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun SslSignHash(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    0

public actual fun SslVerifySignature(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT =
    0

public actual fun SystemPrng(pbrandomdata: Long, cbrandomdata: ULong): BOOL =
    0

public actual fun TransformBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    0

public actual fun TransformFinalBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    0

public actual fun VerifyHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, cbsig: UInt, psig: Long, pfverified: Long): HRESULT =
    0
