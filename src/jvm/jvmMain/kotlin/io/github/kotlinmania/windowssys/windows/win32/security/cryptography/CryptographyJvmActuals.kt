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

private object WindowsWin32SecurityCryptographyJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptAddContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider(halgorithm: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptConfigureContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptCreateContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptCreateHash(halgorithm: Long, phhash: Long, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash(halgorithm: Long, phhash: Long, nhashes: Int, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDeleteContext(dwtable: Int, pszcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi(hhash: Long, htargetalg: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2(hprf: Long, pbpassword: Long, cbpassword: Int, pbsalt: Long, cbsalt: Int, citerations: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDestroySecret(hsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDuplicateHash(hhash: Long, phnewhash: Long, pbhashobject: Long, cbhashobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptDuplicateKey(hkey: Long, phnewkey: Long, pbkeyobject: Long, cbkeyobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms(dwalgoperations: Int, palgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions(dwtable: Int, pszcontext: Long, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumContexts(dwtable: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumProviders(pszalgid: Long, pimplcount: Long, ppimpllist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptFinishHash(hhash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptFreeBuffer(pvbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptGenRandom(halgorithm: Long, pbbuffer: Long, cbbuffer: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair(halgorithm: Long, phkey: Long, dwlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey(halgorithm: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode(pfenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptHash(halgorithm: Long, pbsecret: Long, cbsecret: Int, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptHashData(hhash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptImportKey(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptImportKeyPair(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: Long, pszimplementation: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations(hobject: Long, operationtype: Int, poperations: Long, cboperations: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration(dwtable: Int, pszcontext: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration(pszprovider: Long, dwmode: Int, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify(phevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptRegisterProvider(pszprovider: Long, dwflags: Int, preg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptResolveProviders(pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwmode: Int, dwflags: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptSignHash(hkey: Long, ppaddinginfo: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider(pszprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_BCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhash: Long, cbhash: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore(hcertstore: Long, dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int, dwadddisposition: Int, ppcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore(hcertstore: Long, dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int, dwadddisposition: Int, ppctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore(hcertstore: Long, dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int, dwadddisposition: Int, ppcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse(hserverocspresponse: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore(hcertstore: Long, pbelement: Long, cbelement: Int, dwadddisposition: Int, dwflags: Int, dwcontexttypeflags: Int, pdwcontexttype: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAddStoreToCollection(hcollectionstore: Long, hsiblingstore: Long, dwupdateflags: Int, dwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertAlgIdToOID(dwalgid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCloseStore(hcertstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCompareCertificate(dwcertencodingtype: Int, pcertid1: Long, pcertid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCompareCertificateName(dwcertencodingtype: Int, pcertname1: Long, pcertname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob(pint1: Long, pint2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo(dwcertencodingtype: Int, ppublickey1: Long, ppublickey2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertControlStore(hcertstore: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateCRLContext(dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateCTLContext(dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: Int, rgoptattr: Long, dwflags: Int, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateCertificateContext(dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateContext(dwcontexttype: Int, dwencodingtype: Int, pbencoded: Long, cbencoded: Int, dwflags: Int, pcreatepara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate(hcryptprovorncryptkey: Long, psubjectissuerblob: Long, dwflags: Int, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext(pcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext(pctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain(pchaincontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext(pcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertDuplicateStore(hcertstore: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore(hcertstore: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore(hcertstore: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore(hcertstore: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore(pvsystemstore: Long, dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumSystemStore(dwflags: Int, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation(dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindAttribute(pszobjid: Long, cattr: Int, rgattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindCRLInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindCTLInStore(hcertstore: Long, dwmsgandcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: Int, pvreserved: Long, ppcrlentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindCertificateInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindChainInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevchaincontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindExtension(pszobjid: Long, cextensions: Int, rgextensions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindRDNAttr(pszobjid: Long, pname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, pctlcontext: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: Int, pvreserved: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCRLContext(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCTLContext(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCertificateChain(pchaincontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine(hchainengine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList(prgpselection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeCertificateContext(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetCRLFromStore(hcertstore: Long, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty(pctlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetCertificateChain(hchainengine: Long, pcertcontext: Long, ptime: Long, hadditionalstore: Long, pchainpara: Long, dwflags: Int, pvreserved: Long, ppchaincontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: Int, pusage: Long, pcbusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage(dwcertencodingtype: Int, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore(hcertstore: Long, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetNameStringA(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetNameStringW(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength(dwcertencodingtype: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetStoreProperty(hcertstore: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore(hcertstore: Long, dwcertencodingtype: Int, pcertid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertGetValidUsages(ccerts: Int, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName(dwcertencodingtype: Int, dwflags: Int, pcertname: Long, prdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: Long, psigningcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertIsWeakHash(dwhashusetype: Int, pwszcnghashalgid: Long, dwchainflags: Int, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertNameToStrA(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertNameToStrW(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertOIDToAlgId(pszobjid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse(pchaincontext: Long, dwflags: Int, popenpara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertOpenStore(lpszstoreprovider: Long, dwencodingtype: Int, hcryptprov: Long, dwflags: Int, pvpara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRDNValueToStrA(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRDNValueToStrW(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRegisterSystemStore(pvsystemstore: Long, dwflags: Int, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection(hcollectionstore: Long, hsiblingstore: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine(hchainengine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: Long, dwretrievalflags: Int, dwtimeout: Int, dwflags: Int, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSaveStore(hcertstore: Long, dwencodingtype: Int, dwsaveas: Int, dwsaveto: Int, pvsavetopara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSelectCertificateChains(pselectioncontext: Long, dwflags: Int, pchainparameters: Long, ccriteria: Int, rgpcriteria: Long, hstore: Long, pcselection: Long, pprgpselection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty(pctlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertSetStoreProperty(hcertstore: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertStrToNameA(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertStrToNameW(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore(pvsystemstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation(dwcertencodingtype: Int, pcertid: Long, ccrlinfo: Int, rgpcrlinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, psubjectusage: Long, dwflags: Int, pverifyusagepara: Long, pverifyusagestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy(pszpolicyoid: Long, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyRevocation(dwencodingtype: Int, dwrevtype: Int, ccontext: Int, rgpvcontext: Long, dwflags: Int, prevpara: Long, prevstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CloseCryptoHandle(hcrypto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: Int, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptAcquireContextA(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptAcquireContextW(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptBinaryToStringA(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptBinaryToStringW(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle(hasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptContextAddRef(hprov: Long, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle(dwflags: Int, phasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptCreateHash(hprov: Long, algid: Int, hkey: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: Int, pszpubkeyoid: Long, ppubkeystruc: Long, cbpubkeystruc: Int, dwflags: Int, pvreserved: Long, pbhash: Long, pcbhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecodeMessage(dwmsgtypeflags: Int, pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencodedblob: Long, cbencodedblob: Int, dwprevinnercontenttype: Int, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDeriveKey(hprov: Long, algid: Int, hbasedata: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDuplicateHash(hhash: Long, pdwreserved: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptDuplicateKey(hkey: Long, pdwreserved: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEncodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, dwflags: Int, pencodepara: Long, pvencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEncrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEncryptMessage(pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: Int, pbencryptedblob: Long, pcbencryptedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, dwflags: Int, pvarg: Long, pfnenumoidfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumoidinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumProvidersA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptEnumProvidersW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptExportKey(hkey: Long, hexpkey: Long, dwblobtype: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptExportPKCS8(hcryptprov: Long, dwkeyspec: Int, pszprivatekeyobjid: Long, dwflags: Int, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: Long, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptFindLocalizedName(pwszcryptname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptFindOIDInfo(dwkeytype: Int, pvkey: Long, dwgroupid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptFormatObject(dwcertencodingtype: Int, dwformattype: Int, dwformatstrtype: Int, pformatstruct: Long, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, pbformat: Long, pcbformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGenKey(hprov: Long, algid: Int, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGenRandom(hprov: Long, dwlen: Int, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetAsyncParam(hasync: Long, pszparamoid: Long, ppvparam: Long, ppfnfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: Int, pwszdlllist: Long, pcchdlllist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pwszdll: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetHashParam(hhash: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates(dwmsgandcertencodingtype: Int, hcryptprov: Long, dwflags: Int, pbsignedblob: Long, cbsignedblob: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount(dwmsgencodingtype: Int, pbsignedblob: Long, cbsignedblob: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pszoid: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetObjectUrl(pszurloid: Long, pvpara: Long, dwflags: Int, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetProvParam(hprov: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptGetUserKey(hprov: Long, dwkeyspec: Int, phuserkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashCertificate(hcryptprov: Long, algid: Int, dwflags: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashCertificate2(pwszcnghashalgid: Long, dwflags: Int, pvreserved: Long, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashData(hhash: Long, pbdata: Long, dwdatalen: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashMessage(phashpara: Long, fdetachedhash: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo(hcryptprov: Long, algid: Int, dwflags: Int, dwcertencodingtype: Int, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashSessionKey(hhash: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptHashToBeSigned(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptImportKey(hprov: Long, pbdata: Long, dwdatalen: Int, hpubkey: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, aikeyalg: Int, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2(dwcertencodingtype: Int, pinfo: Long, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet(pszfuncname: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval(pfncancel: Long, pvarg: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext(hcryptprov: Long, dwdefaulttype: Int, pvdefaultpara: Long, dwflags: Int, pvreserved: Long, phdefaultcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress(hmodule: Long, dwencodingtype: Int, pszfuncname: Long, cfuncentry: Int, rgfuncentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMemAlloc(cbsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMemFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMemRealloc(pv: Long, cbsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgClose(hcryptmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgControl(hcryptmsg: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgCountersign(hcryptmsg: Long, dwindex: Int, ccountersigners: Int, rgcountersigners: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded(dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, ccountersigners: Int, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgDuplicate(hcryptmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL(dwmsgencodingtype: Int, pctlinfo: Long, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: Int, rghsignerstore: Long, dwflags: Int, ppsigner: Long, pdwsignerindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgGetParam(hcryptmsg: Long, dwparamtype: Int, dwindex: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, hcryptprov: Long, precipientinfo: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgSignCTL(dwmsgencodingtype: Int, pbctlcontent: Long, cbctlcontent: Int, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: Int, ffinal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, pcicountersigner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, dwsignertype: Int, pvsigner: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptProtectData(pdatain: Long, szdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptProtectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptQueryObject(dwobjecttype: Int, pvobject: Long, dwexpectedcontenttypeflags: Int, dwexpectedformattypeflags: Int, dwflags: Int, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, dwindex: Int, pwszdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszdll: Long, pszoverridefuncname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo(pinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptReleaseContext(hprov: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp(wszurl: Long, dwretrievalflags: Int, dwtimeout: Int, pszhashid: Long, ppara: Long, pbdata: Long, cbdata: Int, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetAsyncParam(hasync: Long, pszparamoid: Long, pvparam: Long, pfnfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetHashParam(hhash: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, dwvaluetype: Int, pbvaluedata: Long, cbvaluedata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetProvParam(hprov: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetProviderA(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetProviderExA(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetProviderExW(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSetProviderW(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: Int, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pbencodedtobesigned: Long, cbencodedtobesigned: Int, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignHashA(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignHashW(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignMessage(psignpara: Long, fdetachedsignature: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: Int, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptStringToBinaryA(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptStringToBinaryW(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval(dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUnprotectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, pwszdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState(poldsid: Long, pwszoldpassword: Long, dwflags: Int, pdwsuccesscount: Long, pdwfailurecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx(hcryptprov: Long, dwcertencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, dwissuertype: Int, pvissuer: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: Int, pbdetachedsignblob: Long, cbdetachedsignblob: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: Int, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: Int, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifySignatureA(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifySignatureW(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: Int, pbdata: Long, cbdata: Int, hadditionalstore: Long, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlAddObject(hsignatureorobject: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlClose(hcryptxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlCreateReference(hcryptxml: Long, dwflags: Int, wszid: Long, wszuri: Long, wsztype: Long, pdigestmethod: Long, ctransform: Int, rgtransform: Long, phreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlDigestReference(hreference: Long, dwflags: Int, pdataproviderin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlEncode(hcryptxml: Long, dwcharset: Int, rgproperty: Long, cproperty: Int, pvcallbackstate: Long, pfnwrite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumalginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo(dwfindbytype: Int, pvfindby: Long, dwgroupid: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: Int, ppalginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms(ppconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey(dwflags: Int, pkeyvalue: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode(pconfig: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, phcryptxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode(pconfig: Long, dwflags: Int, wszid: Long, rgproperty: Long, cproperty: Int, pencoded: Long, phsignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlSign(hsignature: Long, hkey: Long, dwkeyspec: Int, dwflags: Int, dwkeyinfospec: Int, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature(hsignature: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_Decrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_Encrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: Int, pwszpurpose: Long, dwkeyspec: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_FreeToken(pallocmemory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GenerateDerivedKey(hcrypto: Long, cblabel: Int, plabel: Long, cbnonce: Int, pnonce: Long, derivedkeylength: Int, offset: Int, algid: Long, pcbkey: Long, ppkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetBrowserToken(dwparamtype: Int, pparam: Long, pcbtoken: Long, pptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetCipherInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetHashInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetKeyStorageInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetRngInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetSChannelInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetSignatureInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_GetToken(cpolicychain: Int, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_HashCore(hcrypto: Long, cbindata: Int, pindata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_HashFinal(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ImportInformationCard(filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ManageCardSpace(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor(hdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptCreateClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey(hprovider: Long, phkey: Long, pszalgid: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor(pwszdescriptorstring: Long, dwflags: Int, phdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptDeleteKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms(hprovider: Long, dwalgoperations: Int, pdwalgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptEnumKeys(hprovider: Long, pszscope: Long, ppkeyname: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptFinalizeKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptFreeObject(hobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo(hdescriptor: Long, pmempara: Long, dwinfotype: Int, ppvinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptImportKey(hprovider: Long, himportkey: Long, pszblobtype: Long, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported(hprovider: Long, pszalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey(hprovider: Long, phevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptOpenKey(hprovider: Long, phkey: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider(phprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptProtectSecret(hdescriptor: Long, dwflags: Int, pbdata: Long, cbdata: Int, pmempara: Long, hwnd: Long, ppbprotectedblob: Long, pcbprotectedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, pcdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptSignHash(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptStreamClose(hstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect(hdescriptor: Long, dwflags: Int, hwnd: Long, pstreaminfo: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptStreamUpdate(hstream: Long, pbdata: Long, cbdata: Long, ffinal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: Long, hlegacykey: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret(phdescriptor: Long, dwflags: Int, pbprotectedblob: Long, cbprotectedblob: Int, pmempara: Long, hwnd: Long, ppbdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptVerifyClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, poutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_NCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_PFXExportCertStore(hstore: Long, ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx(hstore: Long, ppfx: Long, szpassword: Long, pvpara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_PFXImportCertStore(ppfx: Long, szpassword: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_PFXIsPFXBlob(ppfx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_PFXVerifyPassword(ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_ProcessPrng(pbdata: Long, cbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, pcbsig: Long, ppsig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerFreeSignerContext(psignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerSignEx(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerSignEx2(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerSignEx3(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerTimeStampEx(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerTimeStampEx2(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, dwalgid: Int, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SignerTimeStampEx3(dwflags: Int, dwindex: Int, psubjectinfo: Long, pwszhttptimestamp: Long, pszalgorithmoid: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslChangeNotify(hevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pszalgid: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock(hsslprovider: Long, hmasterkey: Long, pbrandoms: Long, cbrandoms: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslComputeFinishedHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslComputeSessionHash(hsslprovider: Long, hhandshakehash: Long, dwprotocol: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, pszhashalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey(hsslprovider: Long, phephemeralkey: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, dwkeybitlen: Int, pbparams: Long, cbparams: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslDecryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash(hsslprovider: Long, htranscripthash: Long, phtranscripthash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslEncryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwcontenttype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslEnumCipherSuites(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslEnumEccCurves(hsslprovider: Long, pecccurvecount: Long, ppecccurve: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandBinderKey(hsslprovider: Long, hearlykey: Long, phbinderkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phexportermasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey(hsslprovider: Long, hresumptionmasterkey: Long, pbticketnonce: Long, cbticketnonce: Int, phpresharedkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey(hsslprovider: Long, hmasterkey: Long, hhashvalue: Long, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExpandWriteKey(hsslprovider: Long, hbasetraffickey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExportKey(hsslprovider: Long, hkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial(hsslprovider: Long, hmasterkey: Long, slabel: Long, pbrandoms: Long, cbrandoms: Int, pbcontextvalue: Long, cbcontextvalue: Short, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExtractEarlyKey(hsslprovider: Long, hpresharedkey: Long, phearlykey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, hearlykey: Long, phhandshakekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslExtractMasterKey(hsslprovider: Long, hhandshakekey: Long, phmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslFreeObject(hobject: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGenerateMasterKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey(hsslprovider: Long, hpublickey: Long, phpremasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys(hsslprovider: Long, hmasterkey: Long, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, szprfhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGetKeyProperty(hkey: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslGetProviderProperty(hsslprovider: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslHashHandshake(hsslprovider: Long, hhandshakehash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslImportKey(hsslprovider: Long, phkey: Long, pszblobtype: Long, pbkeyblob: Long, cbkeyblob: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslImportMasterKey(hsslprovider: Long, hprivatekey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslLookupCipherLengths(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pcipherlengths: Long, cbcipherlengths: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pciphersuite: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslOpenPrivateKey(hsslprovider: Long, phprivatekey: Long, pcertcontext: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslOpenProvider(phsslprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslSignHash(hsslprovider: Long, hprivatekey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SslVerifySignature(hsslprovider: Long, hpublickey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_SystemPrng(pbrandomdata: Long, cbrandomdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_TransformBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_TransformFinalBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_VerifyHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, cbsig: Int, psig: Long, pfverified: Long): Int
}

public actual fun BCryptAddContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, dwposition: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptAddContextFunction(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, dwposition.toInt())

public actual fun BCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwposition: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pszprovider, dwposition.toInt())

public actual fun BCryptCloseAlgorithmProvider(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider(halgorithm, dwflags.toInt())

public actual fun BCryptConfigureContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptConfigureContext(dwtable.toInt(), pszcontext, pconfig)

public actual fun BCryptConfigureContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pconfig: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pconfig)

public actual fun BCryptCreateContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptCreateContext(dwtable.toInt(), pszcontext, pconfig)

public actual fun BCryptCreateHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptCreateHash(halgorithm, phhash, pbhashobject, cbhashobject.toInt(), pbsecret, cbsecret.toInt(), dwflags.toInt())

public actual fun BCryptCreateMultiHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash(halgorithm, phhash, nhashes.toInt(), pbhashobject, cbhashobject.toInt(), pbsecret, cbsecret.toInt(), dwflags.toInt())

public actual fun BCryptDecrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDecrypt(hkey, pbinput, cbinput.toInt(), ppaddinginfo, pbiv, cbiv.toInt(), pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptDeleteContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDeleteContext(dwtable.toInt(), pszcontext)

public actual fun BCryptDeriveKey(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDeriveKey(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptDeriveKeyCapi(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi(hhash, htargetalg, pbderivedkey, cbderivedkey.toInt(), dwflags.toInt())

public actual fun BCryptDeriveKeyPBKDF2(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2(hprf, pbpassword, cbpassword.toInt(), pbsalt, cbsalt.toInt(), citerations.toLong(), pbderivedkey, cbderivedkey.toInt(), dwflags.toInt())

public actual fun BCryptDestroyHash(hhash: BCRYPT_HASH_HANDLE): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDestroyHash(hhash)

public actual fun BCryptDestroyKey(hkey: BCRYPT_KEY_HANDLE): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDestroyKey(hkey)

public actual fun BCryptDestroySecret(hsecret: BCRYPT_SECRET_HANDLE): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDestroySecret(hsecret)

public actual fun BCryptDuplicateHash(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDuplicateHash(hhash, phnewhash, pbhashobject, cbhashobject.toInt(), dwflags.toInt())

public actual fun BCryptDuplicateKey(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptDuplicateKey(hkey, phnewkey, pbkeyobject, cbkeyobject.toInt(), dwflags.toInt())

public actual fun BCryptEncrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEncrypt(hkey, pbinput, cbinput.toInt(), ppaddinginfo, pbiv, cbiv.toInt(), pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptEnumAlgorithms(dwalgoperations: BCRYPT_OPERATION, palgcount: Long, ppalglist: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms(dwalgoperations.toInt(), palgcount, ppalglist, dwflags.toInt())

public actual fun BCryptEnumContextFunctionProviders(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pcbbuffer, ppbuffer)

public actual fun BCryptEnumContextFunctions(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions(dwtable.toInt(), pszcontext, dwinterface.toInt(), pcbbuffer, ppbuffer)

public actual fun BCryptEnumContexts(dwtable: BCRYPT_TABLE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumContexts(dwtable.toInt(), pcbbuffer, ppbuffer)

public actual fun BCryptEnumProviders(pszalgid: PCWSTR, pimplcount: Long, ppimpllist: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumProviders(pszalgid, pimplcount, ppimpllist, dwflags.toInt())

public actual fun BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders(pcbbuffer, ppbuffer)

public actual fun BCryptExportKey(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptExportKey(hkey, hexportkey, pszblobtype, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptFinalizeKeyPair(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair(hkey, dwflags.toInt())

public actual fun BCryptFinishHash(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptFinishHash(hhash, pboutput, cboutput.toInt(), dwflags.toInt())

public actual fun BCryptFreeBuffer(pvbuffer: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptFreeBuffer(pvbuffer)
}

public actual fun BCryptGenRandom(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: BCRYPTGENRANDOM_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptGenRandom(halgorithm, pbbuffer, cbbuffer.toInt(), dwflags.toInt())

public actual fun BCryptGenerateKeyPair(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair(halgorithm, phkey, dwlength.toInt(), dwflags.toInt())

public actual fun BCryptGenerateSymmetricKey(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey(halgorithm, phkey, pbkeyobject, cbkeyobject.toInt(), pbsecret, cbsecret.toInt(), dwflags.toInt())

public actual fun BCryptGetFipsAlgorithmMode(pfenabled: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode(pfenabled)

public actual fun BCryptGetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptGetProperty(hobject, pszproperty, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptHash(halgorithm: BCRYPT_ALG_HANDLE, pbsecret: Long, cbsecret: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptHash(halgorithm, pbsecret, cbsecret.toInt(), pbinput, cbinput.toInt(), pboutput, cboutput.toInt())

public actual fun BCryptHashData(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptHashData(hhash, pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun BCryptImportKey(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptImportKey(halgorithm, himportkey, pszblobtype, phkey, pbkeyobject, cbkeyobject.toInt(), pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun BCryptImportKeyPair(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptImportKeyPair(halgorithm, himportkey, pszblobtype, phkey, pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun BCryptKeyDerivation(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptKeyDerivation(hkey, pparameterlist, pbderivedkey, cbderivedkey.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: PCWSTR, pszimplementation: PCWSTR, dwflags: BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider(phalgorithm, pszalgid, pszimplementation, dwflags.toInt())

public actual fun BCryptProcessMultiOperations(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations(hobject, operationtype, poperations, cboperations.toInt(), dwflags.toInt())

public actual fun BCryptQueryContextConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration(dwtable.toInt(), pszcontext, pcbbuffer, ppbuffer)

public actual fun BCryptQueryContextFunctionConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pcbbuffer, ppbuffer)

public actual fun BCryptQueryContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, pcbvalue: Long, ppbvalue: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pszproperty, pcbvalue, ppbvalue)

public actual fun BCryptQueryProviderRegistration(pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration(pszprovider, dwmode.toInt(), dwinterface.toInt(), pcbbuffer, ppbuffer)

public actual fun BCryptRegisterConfigChangeNotify(phevent: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify(phevent)

public actual fun BCryptRegisterProvider(pszprovider: PCWSTR, dwflags: UInt, preg: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptRegisterProvider(pszprovider, dwflags.toInt(), preg)

public actual fun BCryptRemoveContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction)

public actual fun BCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pszprovider)

public actual fun BCryptResolveProviders(pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwflags: BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptResolveProviders(pszcontext, dwinterface.toInt(), pszfunction, pszprovider, dwmode.toInt(), dwflags.toInt(), pcbbuffer, ppbuffer)

public actual fun BCryptSecretAgreement(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptSecretAgreement(hprivkey, hpubkey, phagreedsecret, dwflags.toInt())

public actual fun BCryptSetContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, cbvalue: UInt, pbvalue: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty(dwtable.toInt(), pszcontext, dwinterface.toInt(), pszfunction, pszproperty, cbvalue.toInt(), pbvalue)

public actual fun BCryptSetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptSetProperty(hobject, pszproperty, pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun BCryptSignHash(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptSignHash(hkey, ppaddinginfo, pbinput, cbinput.toInt(), pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun BCryptUnregisterConfigChangeNotify(hevent: HANDLE): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify(hevent)

public actual fun BCryptUnregisterProvider(pszprovider: PCWSTR): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider(pszprovider)

public actual fun BCryptVerifySignature(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: BCRYPT_FLAGS): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_BCryptVerifySignature(hkey, ppaddinginfo, pbhash, cbhash.toInt(), pbsignature, cbsignature.toInt(), dwflags.toInt())

public actual fun CertAddCRLContextToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore(hcertstore, pcrlcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddCRLLinkToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore(hcertstore, pcrlcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddCTLContextToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore(hcertstore, pctlcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddCTLLinkToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore(hcertstore, pctlcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddCertificateContextToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore(hcertstore, pcertcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddCertificateLinkToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore(hcertstore, pcertcontext, dwadddisposition.toInt(), ppstorecontext)

public actual fun CertAddEncodedCRLToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore(hcertstore, dwcertencodingtype.toInt(), pbcrlencoded, cbcrlencoded.toInt(), dwadddisposition.toInt(), ppcrlcontext)

public actual fun CertAddEncodedCTLToStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbctlencoded: Long, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore(hcertstore, dwmsgandcertencodingtype.toInt(), pbctlencoded, cbctlencoded.toInt(), dwadddisposition.toInt(), ppctlcontext)

public actual fun CertAddEncodedCertificateToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore(hcertstore, dwcertencodingtype.toInt(), pbcertencoded, cbcertencoded.toInt(), dwadddisposition.toInt(), ppcertcontext)

public actual fun CertAddEncodedCertificateToSystemStoreA(szcertstorename: PCSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA(szcertstorename, pbcertencoded, cbcertencoded.toInt())

public actual fun CertAddEncodedCertificateToSystemStoreW(szcertstorename: PCWSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW(szcertstorename, pbcertencoded, cbcertencoded.toInt())

public actual fun CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier(pcertcontext, pszusageidentifier)

public actual fun CertAddRefServerOcspResponse(hserverocspresponse: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse(hserverocspresponse)
}

public actual fun CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext(pserverocspresponsecontext)
}

public actual fun CertAddSerializedElementToStore(hcertstore: HCERTSTORE, pbelement: Long, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: Long, ppvcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore(hcertstore, pbelement, cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), pdwcontexttype, ppvcontext)

public actual fun CertAddStoreToCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE, dwupdateflags: UInt, dwpriority: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAddStoreToCollection(hcollectionstore, hsiblingstore, dwupdateflags.toInt(), dwpriority.toInt())

public actual fun CertAlgIdToOID(dwalgid: UInt): PCSTR =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertAlgIdToOID(dwalgid.toInt())

public actual fun CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: UInt) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse(hserverocspresponse, dwflags.toInt())
}

public actual fun CertCloseStore(hcertstore: HCERTSTORE, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCloseStore(hcertstore, dwflags.toInt())

public actual fun CertCompareCertificate(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid1: Long, pcertid2: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCompareCertificate(dwcertencodingtype.toInt(), pcertid1, pcertid2)

public actual fun CertCompareCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertname1: Long, pcertname2: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCompareCertificateName(dwcertencodingtype.toInt(), pcertname1, pcertname2)

public actual fun CertCompareIntegerBlob(pint1: Long, pint2: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob(pint1, pint2)

public actual fun CertComparePublicKeyInfo(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey1: Long, ppublickey2: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo(dwcertencodingtype.toInt(), ppublickey1, ppublickey2)

public actual fun CertControlStore(hcertstore: HCERTSTORE, dwflags: CERT_CONTROL_STORE_FLAGS, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertControlStore(hcertstore, dwflags.toInt(), dwctrltype.toInt(), pvctrlpara)

public actual fun CertCreateCRLContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateCRLContext(dwcertencodingtype.toInt(), pbcrlencoded, cbcrlencoded.toInt())

public actual fun CertCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: Long, cbctlencoded: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateCTLContext(dwmsgandcertencodingtype.toInt(), pbctlencoded, cbctlencoded.toInt())

public actual fun CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: UInt, rgoptattr: Long, dwflags: UInt, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties(pcertcontext, coptattr.toInt(), rgoptattr, dwflags.toInt(), pvreserved, pctlentry, pcbctlentry)

public actual fun CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine(pconfig, phchainengine)

public actual fun CertCreateCertificateContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateCertificateContext(dwcertencodingtype.toInt(), pbcertencoded, cbcertencoded.toInt())

public actual fun CertCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pcreatepara: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), pbencoded, cbencoded.toInt(), dwflags.toInt(), pcreatepara)

public actual fun CertCreateSelfSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob: Long, dwflags: CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate(hcryptprovorncryptkey.toLong(), psubjectissuerblob, dwflags.toInt(), pkeyprovinfo, psignaturealgorithm, pstarttime, pendtime, pextensions)

public actual fun CertDeleteCRLFromStore(pcrlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore(pcrlcontext)

public actual fun CertDeleteCTLFromStore(pctlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore(pctlcontext)

public actual fun CertDeleteCertificateFromStore(pcertcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore(pcertcontext)

public actual fun CertDuplicateCRLContext(pcrlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext(pcrlcontext)

public actual fun CertDuplicateCTLContext(pctlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext(pctlcontext)

public actual fun CertDuplicateCertificateChain(pchaincontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain(pchaincontext)

public actual fun CertDuplicateCertificateContext(pcertcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext(pcertcontext)

public actual fun CertDuplicateStore(hcertstore: HCERTSTORE): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertDuplicateStore(hcertstore)

public actual fun CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties(pcrlcontext, dwpropid.toInt()).toUInt()

public actual fun CertEnumCRLsInStore(hcertstore: HCERTSTORE, pprevcrlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore(hcertstore, pprevcrlcontext)

public actual fun CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties(pctlcontext, dwpropid.toInt()).toUInt()

public actual fun CertEnumCTLsInStore(hcertstore: HCERTSTORE, pprevctlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore(hcertstore, pprevctlcontext)

public actual fun CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties(pcertcontext, dwpropid.toInt()).toUInt()

public actual fun CertEnumCertificatesInStore(hcertstore: HCERTSTORE, pprevcertcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore(hcertstore, pprevcertcontext)

public actual fun CertEnumPhysicalStore(pvsystemstore: Long, dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_PHYSICAL_STORE): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore(pvsystemstore, dwflags.toInt(), pvarg, pfnenum.toLong())

public actual fun CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL(pctlcontext, ppvnextsubject, psubjectidentifier, pencodedattributes)

public actual fun CertEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumSystemStore(dwflags.toInt(), pvsystemstorelocationpara, pvarg, pfnenum.toLong())

public actual fun CertEnumSystemStoreLocation(dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE_LOCATION): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation(dwflags.toInt(), pvarg, pfnenum.toLong())

public actual fun CertFindAttribute(pszobjid: PCSTR, cattr: UInt, rgattr: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindAttribute(pszobjid, cattr.toInt(), rgattr)

public actual fun CertFindCRLInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: Long, pprevcrlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindCRLInStore(hcertstore, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara, pprevcrlcontext)

public actual fun CertFindCTLInStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CERT_FIND_TYPE, pvfindpara: Long, pprevctlcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindCTLInStore(hcertstore, dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara, pprevctlcontext)

public actual fun CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: UInt, pvreserved: Long, ppcrlentry: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL(pcert, pcrlcontext, dwflags.toInt(), pvreserved, ppcrlentry)

public actual fun CertFindCertificateInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: CERT_FIND_FLAGS, pvfindpara: Long, pprevcertcontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindCertificateInStore(hcertstore, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara, pprevcertcontext)

public actual fun CertFindChainInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype: UInt, pvfindpara: Long, pprevchaincontext: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindChainInStore(hcertstore, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara, pprevchaincontext)

public actual fun CertFindExtension(pszobjid: PCSTR, cextensions: UInt, rgextensions: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindExtension(pszobjid, cextensions.toInt(), rgextensions)

public actual fun CertFindRDNAttr(pszobjid: PCSTR, pname: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindRDNAttr(pszobjid, pname)

public actual fun CertFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, pctlcontext: Long, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject, pctlcontext, dwflags.toInt())

public actual fun CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: UInt, pvreserved: Long, pencodedattributes: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL(psubjectidentifier, pctlcontext, dwflags.toInt(), pvreserved, pencodedattributes)

public actual fun CertFreeCRLContext(pcrlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCRLContext(pcrlcontext)

public actual fun CertFreeCTLContext(pctlcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCTLContext(pctlcontext)

public actual fun CertFreeCertificateChain(pchaincontext: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCertificateChain(pchaincontext)
}

public actual fun CertFreeCertificateChainEngine(hchainengine: HCERTCHAINENGINE) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine(hchainengine)
}

public actual fun CertFreeCertificateChainList(prgpselection: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList(prgpselection)
}

public actual fun CertFreeCertificateContext(pcertcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeCertificateContext(pcertcontext)

public actual fun CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext(pserverocspresponsecontext)
}

public actual fun CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty(pcrlcontext, dwpropid.toInt(), pvdata, pcbdata)

public actual fun CertGetCRLFromStore(hcertstore: HCERTSTORE, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetCRLFromStore(hcertstore, pissuercontext, pprevcrlcontext, pdwflags)

public actual fun CertGetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty(pctlcontext, dwpropid.toInt(), pvdata, pcbdata)

public actual fun CertGetCertificateChain(hchainengine: HCERTCHAINENGINE, pcertcontext: Long, ptime: Long, hadditionalstore: HCERTSTORE, pchainpara: Long, dwflags: UInt, pvreserved: Long, ppchaincontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetCertificateChain(hchainengine, pcertcontext, ptime, hadditionalstore, pchainpara, dwflags.toInt(), pvreserved, ppchaincontext)

public actual fun CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty(pcertcontext, dwpropid.toInt(), pvdata, pcbdata)

public actual fun CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: UInt, pusage: Long, pcbusage: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage(pcertcontext, dwflags.toInt(), pusage, pcbusage)

public actual fun CertGetIntendedKeyUsage(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage(dwcertencodingtype.toInt(), pcertinfo, pbkeyusage, cbkeyusage.toInt())

public actual fun CertGetIssuerCertificateFromStore(hcertstore: HCERTSTORE, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore(hcertstore, psubjectcontext, pprevissuercontext, pdwflags)

public actual fun CertGetNameStringA(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PSTR, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetNameStringA(pcertcontext, dwtype.toInt(), dwflags.toInt(), pvtypepara, psznamestring, cchnamestring.toInt()).toUInt()

public actual fun CertGetNameStringW(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PWSTR, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetNameStringW(pcertcontext, dwtype.toInt(), dwflags.toInt(), pvtypepara, psznamestring, cchnamestring.toInt()).toUInt()

public actual fun CertGetPublicKeyLength(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey: Long): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength(dwcertencodingtype.toInt(), ppublickey).toUInt()

public actual fun CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: UInt, pvreserved: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext(hserverocspresponse, dwflags.toInt(), pvreserved)

public actual fun CertGetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetStoreProperty(hcertstore, dwpropid.toInt(), pvdata, pcbdata)

public actual fun CertGetSubjectCertificateFromStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore(hcertstore, dwcertencodingtype.toInt(), pcertid)

public actual fun CertGetValidUsages(ccerts: UInt, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertGetValidUsages(ccerts.toInt(), rghcerts, cnumoids, rghoids, pcboids)

public actual fun CertIsRDNAttrsInCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwflags: UInt, pcertname: Long, prdn: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), pcertname, prdn)

public actual fun CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: PCWSTR, psigningcert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign(pstrongsignpara, pwszcnghashalgid, psigningcert)

public actual fun CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate(pcert, pcrl, dwflags.toInt(), pvreserved)

public actual fun CertIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertIsWeakHash(dwhashusetype.toInt(), pwszcnghashalgid, dwchainflags.toInt(), psignerchaincontext, ptimestamp, pwszfilename)

public actual fun CertNameToStrA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PSTR, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertNameToStrA(dwcertencodingtype.toInt(), pname, dwstrtype.toInt(), psz, csz.toInt()).toUInt()

public actual fun CertNameToStrW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PWSTR, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertNameToStrW(dwcertencodingtype.toInt(), pname, dwstrtype.toInt(), psz, csz.toInt()).toUInt()

public actual fun CertOIDToAlgId(pszobjid: PCSTR): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertOIDToAlgId(pszobjid).toUInt()

public actual fun CertOpenServerOcspResponse(pchaincontext: Long, dwflags: UInt, popenpara: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse(pchaincontext, dwflags.toInt(), popenpara)

public actual fun CertOpenStore(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertOpenStore(lpszstoreprovider, dwencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), pvpara)

public actual fun CertOpenSystemStoreA(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCSTR): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA(hprov.toLong(), szsubsystemprotocol)

public actual fun CertOpenSystemStoreW(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCWSTR): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW(hprov.toLong(), szsubsystemprotocol)

public actual fun CertRDNValueToStrA(dwvaluetype: UInt, pvalue: Long, psz: PSTR, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRDNValueToStrA(dwvaluetype.toInt(), pvalue, psz, csz.toInt()).toUInt()

public actual fun CertRDNValueToStrW(dwvaluetype: UInt, pvalue: Long, psz: PWSTR, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRDNValueToStrW(dwvaluetype.toInt(), pvalue, psz, csz.toInt()).toUInt()

public actual fun CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore(pvsystemstore, dwflags.toInt(), pwszstorename, pstoreinfo, pvreserved)

public actual fun CertRegisterSystemStore(pvsystemstore: Long, dwflags: UInt, pstoreinfo: Long, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRegisterSystemStore(pvsystemstore, dwflags.toInt(), pstoreinfo, pvreserved)

public actual fun CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier(pcertcontext, pszusageidentifier)

public actual fun CertRemoveStoreFromCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection(hcollectionstore, hsiblingstore)
}

public actual fun CertResyncCertificateChainEngine(hchainengine: HCERTCHAINENGINE): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine(hchainengine)

public actual fun CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo(pcertcontext, lpszlogoorbiometrictype, dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), pvreserved, ppbdata, pcbdata, ppwszmimetype)

public actual fun CertSaveStore(hcertstore: HCERTSTORE, dwencodingtype: CERT_QUERY_ENCODING_TYPE, dwsaveas: CERT_STORE_SAVE_AS, dwsaveto: CERT_STORE_SAVE_TO, pvsavetopara: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSaveStore(hcertstore, dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), pvsavetopara, dwflags.toInt())

public actual fun CertSelectCertificateChains(pselectioncontext: Long, dwflags: UInt, pchainparameters: Long, ccriteria: UInt, rgpcriteria: Long, hstore: HCERTSTORE, pcselection: Long, pprgpselection: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSelectCertificateChains(pselectioncontext, dwflags.toInt(), pchainparameters, ccriteria.toInt(), rgpcriteria, hstore, pcselection, pprgpselection)

public actual fun CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement(pcrlcontext, dwflags.toInt(), pbelement, pcbelement)

public actual fun CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement(pctlcontext, dwflags.toInt(), pbelement, pcbelement)

public actual fun CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement(pcertcontext, dwflags.toInt(), pbelement, pcbelement)

public actual fun CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty(pcrlcontext, dwpropid.toInt(), dwflags.toInt(), pvdata)

public actual fun CertSetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty(pctlcontext, dwpropid.toInt(), dwflags.toInt(), pvdata)

public actual fun CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext, pctlentry, dwflags.toInt())

public actual fun CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty(pcertcontext, dwpropid.toInt(), dwflags.toInt(), pvdata)

public actual fun CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage(pcertcontext, pusage)

public actual fun CertSetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertSetStoreProperty(hcertstore, dwpropid.toInt(), dwflags.toInt(), pvdata)

public actual fun CertStrToNameA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertStrToNameA(dwcertencodingtype.toInt(), pszx500, dwstrtype.toInt(), pvreserved, pbencoded, pcbencoded, ppszerror)

public actual fun CertStrToNameW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCWSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertStrToNameW(dwcertencodingtype.toInt(), pszx500, dwstrtype.toInt(), pvreserved, pbencoded, pcbencoded, ppszerror)

public actual fun CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore(pvsystemstore, dwflags.toInt(), pwszstorename)

public actual fun CertUnregisterSystemStore(pvsystemstore: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore(pvsystemstore, dwflags.toInt())

public actual fun CertVerifyCRLRevocation(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long, ccrlinfo: UInt, rgpcrlinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation(dwcertencodingtype.toInt(), pcertid, ccrlinfo.toInt(), rgpcrlinfo)

public actual fun CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity(ptimetoverify, pcrlinfo)

public actual fun CertVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, psubjectusage: Long, dwflags: UInt, pverifyusagepara: Long, pverifyusagestatus: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject, psubjectusage, dwflags.toInt(), pverifyusagepara, pverifyusagestatus)

public actual fun CertVerifyCertificateChainPolicy(pszpolicyoid: PCSTR, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy(pszpolicyoid, pchaincontext, ppolicypara, ppolicystatus)

public actual fun CertVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: Long, dwflags: UInt, prevpara: Long, prevstatus: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), rgpvcontext, dwflags.toInt(), prevpara, prevstatus)

public actual fun CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext(psubject, pissuer, pdwflags)

public actual fun CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity(ptimetoverify, pcertinfo)

public actual fun CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting(psubjectinfo, pissuerinfo)

public actual fun CloseCryptoHandle(hcrypto: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CloseCryptoHandle(hcrypto)

public actual fun CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: CRYPT_ACQUIRE_FLAGS, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey(pcert, dwflags.toInt(), pvparameters, phcryptprovorncryptkey, pdwkeyspec, pfcallerfreeprovorncryptkey)

public actual fun CryptAcquireContextA(phprov: Long, szcontainer: PCSTR, szprovider: PCSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptAcquireContextA(phprov, szcontainer, szprovider, dwprovtype.toInt(), dwflags.toInt())

public actual fun CryptAcquireContextW(phprov: Long, szcontainer: PCWSTR, szprovider: PCWSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptAcquireContextW(phprov, szcontainer, szprovider, dwprovtype.toInt(), dwflags.toInt())

public actual fun CryptBinaryToStringA(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PSTR, pcchstring: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptBinaryToStringA(pbbinary, cbbinary.toInt(), dwflags.toInt(), pszstring, pcchstring)

public actual fun CryptBinaryToStringW(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PWSTR, pcchstring: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptBinaryToStringW(pbbinary, cbbinary.toInt(), dwflags.toInt(), pszstring, pcchstring)

public actual fun CryptCloseAsyncHandle(hasync: HCRYPTASYNC): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle(hasync)

public actual fun CryptContextAddRef(hprov: ULong, pdwreserved: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptContextAddRef(hprov.toLong(), pdwreserved, dwflags.toInt())

public actual fun CryptCreateAsyncHandle(dwflags: UInt, phasync: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle(dwflags.toInt(), phasync)

public actual fun CryptCreateHash(hprov: ULong, algid: ALG_ID, hkey: ULong, dwflags: UInt, phhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptCreateHash(hprov.toLong(), algid.toInt(), hkey.toLong(), dwflags.toInt(), phhash)

public actual fun CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpubkeyoid: PCSTR, ppubkeystruc: Long, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: Long, pbhash: Long, pcbhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), pszpubkeyoid, ppubkeystruc, cbpubkeystruc.toInt(), dwflags.toInt(), pvreserved, pbhash, pcbhash)

public actual fun CryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencodedblob: Long, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecodeMessage(dwmsgtypeflags.toInt(), pdecryptpara, pverifypara, dwsignerindex.toInt(), pbencodedblob, cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), pdwmsgtype, pdwinnercontenttype, pbdecoded, pcbdecoded, ppxchgcert, ppsignercert)

public actual fun CryptDecodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecodeObject(dwcertencodingtype.toInt(), lpszstructtype, pbencoded, cbencoded.toInt(), dwflags.toInt(), pvstructinfo, pcbstructinfo)

public actual fun CryptDecodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype, pbencoded, cbencoded.toInt(), dwflags.toInt(), pdecodepara, pvstructinfo, pcbstructinfo)

public actual fun CryptDecrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), pbdata, pdwdatalen)

public actual fun CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature(pdecryptpara, pverifypara, dwsignerindex.toInt(), pbencryptedblob, cbencryptedblob.toInt(), pbdecrypted, pcbdecrypted, ppxchgcert, ppsignercert)

public actual fun CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDecryptMessage(pdecryptpara, pbencryptedblob, cbencryptedblob.toInt(), pbdecrypted, pcbdecrypted, ppxchgcert)

public actual fun CryptDeriveKey(hprov: ULong, algid: ALG_ID, hbasedata: ULong, dwflags: UInt, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDeriveKey(hprov.toLong(), algid.toInt(), hbasedata.toLong(), dwflags.toInt(), phkey)

public actual fun CryptDestroyHash(hhash: ULong): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDestroyHash(hhash.toLong())

public actual fun CryptDestroyKey(hkey: ULong): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDestroyKey(hkey.toLong())

public actual fun CryptDuplicateHash(hhash: ULong, pdwreserved: Long, dwflags: UInt, phhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDuplicateHash(hhash.toLong(), pdwreserved, dwflags.toInt(), phhash)

public actual fun CryptDuplicateKey(hkey: ULong, pdwreserved: Long, dwflags: UInt, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptDuplicateKey(hkey.toLong(), pdwreserved, dwflags.toInt(), phkey)

public actual fun CryptEncodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEncodeObject(dwcertencodingtype.toInt(), lpszstructtype, pvstructinfo, pbencoded, pcbencoded)

public actual fun CryptEncodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, dwflags: CRYPT_ENCODE_OBJECT_FLAGS, pencodepara: Long, pvencoded: Long, pcbencoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype, pvstructinfo, dwflags.toInt(), pencodepara, pvencoded, pcbencoded)

public actual fun CryptEncrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long, dwbuflen: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEncrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), pbdata, pdwdatalen, dwbuflen.toInt())

public actual fun CryptEncryptMessage(pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: UInt, pbencryptedblob: Long, pcbencryptedblob: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEncryptMessage(pencryptpara, crecipientcert.toInt(), rgprecipientcert, pbtobeencrypted, cbtobeencrypted.toInt(), pbencryptedblob, pcbencryptedblob)

public actual fun CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvarg: Long, pfnenum: PFN_CRYPT_ENUM_KEYID_PROP): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties(pkeyidentifier, dwpropid.toInt(), dwflags.toInt(), pwszcomputername, pvreserved, pvarg, pfnenum.toLong())

public actual fun CryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, dwflags: UInt, pvarg: Long, pfnenumoidfunc: PFN_CRYPT_ENUM_OID_FUNC): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction(dwencodingtype.toInt(), pszfuncname, pszoid, dwflags.toInt(), pvarg, pfnenumoidfunc.toLong())

public actual fun CryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumoidinfo: PFN_CRYPT_ENUM_OID_INFO): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg, pfnenumoidinfo.toLong())

public actual fun CryptEnumProviderTypesA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PSTR, pcbtypename: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA(dwindex.toInt(), pdwreserved, dwflags.toInt(), pdwprovtype, sztypename, pcbtypename)

public actual fun CryptEnumProviderTypesW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PWSTR, pcbtypename: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW(dwindex.toInt(), pdwreserved, dwflags.toInt(), pdwprovtype, sztypename, pcbtypename)

public actual fun CryptEnumProvidersA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PSTR, pcbprovname: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumProvidersA(dwindex.toInt(), pdwreserved, dwflags.toInt(), pdwprovtype, szprovname, pcbprovname)

public actual fun CryptEnumProvidersW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PWSTR, pcbprovname: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptEnumProvidersW(dwindex.toInt(), pdwreserved, dwflags.toInt(), pdwprovtype, szprovname, pcbprovname)

public actual fun CryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CRYPT_KEY_FLAGS, pbdata: Long, pdwdatalen: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptExportKey(hkey.toLong(), hexpkey.toLong(), dwblobtype.toInt(), dwflags.toInt(), pbdata, pdwdatalen)

public actual fun CryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptExportPKCS8(hcryptprov.toLong(), dwkeyspec.toInt(), pszprivatekeyobjid, dwflags.toInt(), pvauxinfo, pbprivatekeyblob, pcbprivatekeyblob)

public actual fun CryptExportPublicKeyInfo(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pcbinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pinfo, pcbinfo)

public actual fun CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pszpublickeyobjid, dwflags.toInt(), pvauxinfo, pinfo, pcbinfo)

public actual fun CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey, dwcertencodingtype.toInt(), pszpublickeyobjid, dwflags.toInt(), pvauxinfo, pinfo, pcbinfo)

public actual fun CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: CRYPT_FIND_FLAGS, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo(pcert, dwflags.toInt(), pvreserved)

public actual fun CryptFindLocalizedName(pwszcryptname: PCWSTR): PCWSTR =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptFindLocalizedName(pwszcryptname)

public actual fun CryptFindOIDInfo(dwkeytype: UInt, pvkey: Long, dwgroupid: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptFindOIDInfo(dwkeytype.toInt(), pvkey, dwgroupid.toInt())

public actual fun CryptFormatObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: Long, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, pbformat: Long, pcbformat: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), pformatstruct, lpszstructtype, pbencoded, cbencoded.toInt(), pbformat, pcbformat)

public actual fun CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress(hfuncaddr, dwflags.toInt())

public actual fun CryptGenKey(hprov: ULong, algid: ALG_ID, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGenKey(hprov.toLong(), algid.toInt(), dwflags.toInt(), phkey)

public actual fun CryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGenRandom(hprov.toLong(), dwlen.toInt(), pbbuffer)

public actual fun CryptGetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, ppvparam: Long, ppfnfree: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetAsyncParam(hasync, pszparamoid, ppvparam, ppfnfree)

public actual fun CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: UInt, pwszdlllist: PWSTR, pcchdlllist: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList(hfuncset, dwencodingtype.toInt(), pwszdlllist, pcchdlllist)

public actual fun CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pwszdll: PCWSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress(hfuncset, dwencodingtype.toInt(), pwszdll, dwflags.toInt(), ppvfuncaddr, phfuncaddr)

public actual fun CryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PSTR, pcbprovname: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA(dwprovtype.toInt(), pdwreserved, dwflags.toInt(), pszprovname, pcbprovname)

public actual fun CryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PWSTR, pcbprovname: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW(dwprovtype.toInt(), pdwreserved, dwflags.toInt(), pszprovname, pcbprovname)

public actual fun CryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetHashParam(hhash.toLong(), dwparam.toInt(), pbdata, pdwdatalen, dwflags.toInt())

public actual fun CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty(pkeyidentifier, dwpropid.toInt(), dwflags.toInt(), pwszcomputername, pvreserved, pvdata, pcbdata)

public actual fun CryptGetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetKeyParam(hkey.toLong(), dwparam.toInt(), pbdata, pdwdatalen, dwflags.toInt())

public actual fun CryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, dwflags: UInt, pbsignedblob: Long, cbsignedblob: UInt): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), pbsignedblob, cbsignedblob.toInt())

public actual fun CryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: Long, cbsignedblob: UInt): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount(dwmsgencodingtype.toInt(), pbsignedblob, cbsignedblob.toInt())

public actual fun CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pszoid: PCSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress(hfuncset, dwencodingtype.toInt(), pszoid, dwflags.toInt(), ppvfuncaddr, phfuncaddr)

public actual fun CryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname, pszoid, pwszvaluename, pdwvaluetype, pbvaluedata, pcbvaluedata)

public actual fun CryptGetObjectUrl(pszurloid: PCSTR, pvpara: Long, dwflags: CRYPT_GET_URL_FLAGS, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetObjectUrl(pszurloid, pvpara, dwflags.toInt(), purlarray, pcburlarray, purlinfo, pcburlinfo, pvreserved)

public actual fun CryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetProvParam(hprov.toLong(), dwparam.toInt(), pbdata, pdwdatalen, dwflags.toInt())

public actual fun CryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptGetUserKey(hprov.toLong(), dwkeyspec.toInt(), phuserkey)

public actual fun CryptHashCertificate(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashCertificate(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), pbencoded, cbencoded.toInt(), pbcomputedhash, pcbcomputedhash)

public actual fun CryptHashCertificate2(pwszcnghashalgid: PCWSTR, dwflags: UInt, pvreserved: Long, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashCertificate2(pwszcnghashalgid, dwflags.toInt(), pvreserved, pbencoded, cbencoded.toInt(), pbcomputedhash, pcbcomputedhash)

public actual fun CryptHashData(hhash: ULong, pbdata: Long, dwdatalen: UInt, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashData(hhash.toLong(), pbdata, dwdatalen.toInt(), dwflags.toInt())

public actual fun CryptHashMessage(phashpara: Long, fdetachedhash: BOOL, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashMessage(phashpara, fdetachedhash, ctobehashed.toInt(), rgpbtobehashed, rgcbtobehashed, pbhashedblob, pcbhashedblob, pbcomputedhash, pcbcomputedhash)

public actual fun CryptHashPublicKeyInfo(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), pinfo, pbcomputedhash, pcbcomputedhash)

public actual fun CryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashSessionKey(hhash.toLong(), hkey.toLong(), dwflags.toInt())

public actual fun CryptHashToBeSigned(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptHashToBeSigned(hcryptprov.toLong(), dwcertencodingtype.toInt(), pbencoded, cbencoded.toInt(), pbcomputedhash, pcbcomputedhash)

public actual fun CryptImportKey(hprov: ULong, pbdata: Long, dwdatalen: UInt, hpubkey: ULong, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptImportKey(hprov.toLong(), pbdata, dwdatalen.toInt(), hpubkey.toLong(), dwflags.toInt(), phkey)

public actual fun CryptImportPKCS8(sprivatekeyandparams: CRYPT_PKCS8_IMPORT_PARAMS, dwflags: CRYPT_KEY_FLAGS, phcryptprov: Long, pvauxinfo: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo(hcryptprov.toLong(), dwcertencodingtype.toInt(), pinfo, phkey)

public actual fun CryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, aikeyalg: ALG_ID, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), pinfo, aikeyalg.toInt(), dwflags.toInt(), pvauxinfo, phkey)

public actual fun CryptImportPublicKeyInfoEx2(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo: Long, phkey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), pinfo, dwflags.toInt(), pvauxinfo, phkey)

public actual fun CryptInitOIDFunctionSet(pszfuncname: PCSTR, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet(pszfuncname, dwflags.toInt())

public actual fun CryptInstallCancelRetrieval(pfncancel: PFN_CRYPT_CANCEL_RETRIEVAL, pvarg: Long, dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval(pfncancel.toLong(), pvarg, dwflags.toInt(), pvreserved)

public actual fun CryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara: Long, dwflags: CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved: Long, phdefaultcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext(hcryptprov.toLong(), dwdefaulttype.toInt(), pvdefaultpara, dwflags.toInt(), pvreserved, phdefaultcontext)

public actual fun CryptInstallOIDFunctionAddress(hmodule: HMODULE, dwencodingtype: UInt, pszfuncname: PCSTR, cfuncentry: UInt, rgfuncentry: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress(hmodule, dwencodingtype.toInt(), pszfuncname, cfuncentry.toInt(), rgfuncentry, dwflags.toInt())

public actual fun CryptMemAlloc(cbsize: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMemAlloc(cbsize.toInt())

public actual fun CryptMemFree(pv: Long) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMemFree(pv)
}

public actual fun CryptMemRealloc(pv: Long, cbsize: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMemRealloc(pv, cbsize.toInt())

public actual fun CryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, cbdata: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo, pszinnercontentobjid, cbdata.toInt()).toUInt()

public actual fun CryptMsgClose(hcryptmsg: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgClose(hcryptmsg)

public actual fun CryptMsgControl(hcryptmsg: Long, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgControl(hcryptmsg, dwflags.toInt(), dwctrltype.toInt(), pvctrlpara)

public actual fun CryptMsgCountersign(hcryptmsg: Long, dwindex: UInt, ccountersigners: UInt, rgcountersigners: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgCountersign(hcryptmsg, dwindex.toInt(), ccountersigners.toInt(), rgcountersigners)

public actual fun CryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded(dwencodingtype.toInt(), pbsignerinfo, cbsignerinfo.toInt(), ccountersigners.toInt(), rgcountersigners, pbcountersignature, pcbcountersignature)

public actual fun CryptMsgDuplicate(hcryptmsg: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgDuplicate(hcryptmsg)

public actual fun CryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: Long, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), pctlinfo, psigninfo, dwflags.toInt(), pbencoded, pcbencoded)

public actual fun CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: UInt, rghsignerstore: Long, dwflags: UInt, ppsigner: Long, pdwsignerindex: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner(hcryptmsg, csignerstore.toInt(), rghsignerstore, dwflags.toInt(), ppsigner, pdwsignerindex)

public actual fun CryptMsgGetParam(hcryptmsg: Long, dwparamtype: UInt, dwindex: UInt, pvdata: Long, pcbdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgGetParam(hcryptmsg, dwparamtype.toInt(), dwindex.toInt(), pvdata, pcbdata)

public actual fun CryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, precipientinfo: Long, pstreaminfo: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toLong(), precipientinfo, pstreaminfo)

public actual fun CryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CRYPT_MSG_TYPE, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, pstreaminfo: Long): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo, pszinnercontentobjid, pstreaminfo)

public actual fun CryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: Long, cbctlcontent: UInt, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgSignCTL(dwmsgencodingtype.toInt(), pbctlcontent, cbctlcontent.toInt(), psigninfo, dwflags.toInt(), pbencoded, pcbencoded)

public actual fun CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgUpdate(hcryptmsg, pbdata, cbdata.toInt(), ffinal)

public actual fun CryptMsgVerifyCountersignatureEncoded(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, pcicountersigner: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded(hcryptprov.toLong(), dwencodingtype.toInt(), pbsignerinfo, cbsignerinfo.toInt(), pbsignerinfocountersignature, cbsignerinfocountersignature.toInt(), pcicountersigner)

public actual fun CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: Long, dwflags: UInt, pvextra: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toLong(), dwencodingtype.toInt(), pbsignerinfo, cbsignerinfo.toInt(), pbsignerinfocountersignature, cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), pvsigner, dwflags.toInt(), pvextra)

public actual fun CryptProtectData(pdatain: Long, szdatadescr: PCWSTR, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptProtectData(pdatain, szdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags.toInt(), pdataout)

public actual fun CryptProtectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptProtectMemory(pdatain, cbdatain.toInt(), dwflags.toInt())

public actual fun CryptQueryObject(dwobjecttype: CERT_QUERY_OBJECT_TYPE, pvobject: Long, dwexpectedcontenttypeflags: CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags: CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags: UInt, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptQueryObject(dwobjecttype.toInt(), pvobject, dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), pdwmsgandcertencodingtype, pdwcontenttype, pdwformattype, phcertstore, phmsg, ppvcontext)

public actual fun CryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, dwindex: UInt, pwszdll: PCWSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname, dwindex.toInt(), pwszdll)

public actual fun CryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszdll: PCWSTR, pszoverridefuncname: PCSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction(dwencodingtype.toInt(), pszfuncname, pszoid, pwszdll, pszoverridefuncname)

public actual fun CryptRegisterOIDInfo(pinfo: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo(pinfo, dwflags.toInt())

public actual fun CryptReleaseContext(hprov: ULong, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptReleaseContext(hprov.toLong(), dwflags.toInt())

public actual fun CryptRetrieveObjectByUrlA(pszurl: PCSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA(pszurl, pszobjectoid, dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo)

public actual fun CryptRetrieveObjectByUrlW(pszurl: PCWSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW(pszurl, pszobjectoid, dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo)

public actual fun CryptRetrieveTimeStamp(wszurl: PCWSTR, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: PCSTR, ppara: Long, pbdata: Long, cbdata: UInt, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp(wszurl, dwretrievalflags.toInt(), dwtimeout.toInt(), pszhashid, ppara, pbdata, cbdata.toInt(), pptscontext, pptssigner, phstore)

public actual fun CryptSetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, pvparam: Long, pfnfree: PFN_CRYPT_ASYNC_PARAM_FREE_FUNC): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetAsyncParam(hasync, pszparamoid, pvparam, pfnfree.toLong())

public actual fun CryptSetHashParam(hhash: ULong, dwparam: CRYPT_SET_HASH_PARAM, pbdata: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetHashParam(hhash.toLong(), dwparam.toInt(), pbdata, dwflags.toInt())

public actual fun CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty(pkeyidentifier, dwpropid.toInt(), dwflags.toInt(), pwszcomputername, pvreserved, pvdata)

public actual fun CryptSetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetKeyParam(hkey.toLong(), dwparam.toInt(), pbdata, dwflags.toInt())

public actual fun CryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, dwvaluetype: REG_VALUE_TYPE, pbvaluedata: Long, cbvaluedata: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname, pszoid, pwszvaluename, dwvaluetype.toInt(), pbvaluedata, cbvaluedata.toInt())

public actual fun CryptSetProvParam(hprov: ULong, dwparam: CRYPT_SET_PROV_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetProvParam(hprov.toLong(), dwparam.toInt(), pbdata, dwflags.toInt())

public actual fun CryptSetProviderA(pszprovname: PCSTR, dwprovtype: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetProviderA(pszprovname, dwprovtype.toInt())

public actual fun CryptSetProviderExA(pszprovname: PCSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetProviderExA(pszprovname, dwprovtype.toInt(), pdwreserved, dwflags.toInt())

public actual fun CryptSetProviderExW(pszprovname: PCWSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetProviderExW(pszprovname, dwprovtype.toInt(), pdwreserved, dwflags.toInt())

public actual fun CryptSetProviderW(pszprovname: PCWSTR, dwprovtype: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSetProviderW(pszprovname, dwprovtype.toInt())

public actual fun CryptSignAndEncodeCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), lpszstructtype, pvstructinfo, psignaturealgorithm, pvhashauxinfo, pbencoded, pcbencoded)

public actual fun CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage(psignpara, pencryptpara, crecipientcert.toInt(), rgprecipientcert, pbtobesignedandencrypted, cbtobesignedandencrypted.toInt(), pbsignedandencryptedblob, pcbsignedandencryptedblob)

public actual fun CryptSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned: Long, cbencodedtobesigned: UInt, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pbencodedtobesigned, cbencodedtobesigned.toInt(), psignaturealgorithm, pvhashauxinfo, pbsignature, pcbsignature)

public actual fun CryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: PCSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignHashA(hhash.toLong(), dwkeyspec.toInt(), szdescription, dwflags.toInt(), pbsignature, pdwsiglen)

public actual fun CryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: PCWSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignHashW(hhash.toLong(), dwkeyspec.toInt(), szdescription, dwflags.toInt(), pbsignature, pdwsiglen)

public actual fun CryptSignMessage(psignpara: Long, fdetachedsignature: BOOL, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignMessage(psignpara, fdetachedsignature, ctobesigned.toInt(), rgpbtobesigned, rgcbtobesigned, pbsignedblob, pcbsignedblob)

public actual fun CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: UInt, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey(psignpara, pbtobesigned, cbtobesigned.toInt(), pbsignedblob, pcbsignedblob)

public actual fun CryptStringToBinaryA(pszstring: PCSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptStringToBinaryA(pszstring, cchstring.toInt(), dwflags.toInt(), pbbinary, pcbbinary, pdwskip, pdwflags)

public actual fun CryptStringToBinaryW(pszstring: PCWSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptStringToBinaryW(pszstring, cchstring.toInt(), dwflags.toInt(), pbbinary, pcbbinary, pdwskip, pdwflags)

public actual fun CryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval(dwflags.toInt(), pvreserved)

public actual fun CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: UInt, pvreserved: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext(hdefaultcontext, dwflags.toInt(), pvreserved)

public actual fun CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUnprotectData(pdatain, ppszdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags.toInt(), pdataout)

public actual fun CryptUnprotectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUnprotectMemory(pdatain, cbdatain.toInt(), dwflags.toInt())

public actual fun CryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pwszdll: PCWSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname, pwszdll)

public actual fun CryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction(dwencodingtype.toInt(), pszfuncname, pszoid)

public actual fun CryptUnregisterOIDInfo(pinfo: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo(pinfo)

public actual fun CryptUpdateProtectedState(poldsid: PSID, pwszoldpassword: PCWSTR, dwflags: UInt, pdwsuccesscount: Long, pdwfailurecount: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState(poldsid, pwszoldpassword, dwflags.toInt(), pdwsuccesscount, pdwfailurecount)

public actual fun CryptVerifyCertificateSignature(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, ppublickey: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature(hcryptprov.toLong(), dwcertencodingtype.toInt(), pbencoded, cbencoded.toInt(), ppublickey)

public actual fun CryptVerifyCertificateSignatureEx(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwsubjecttype: UInt, pvsubject: Long, dwissuertype: UInt, pvissuer: Long, dwflags: CRYPT_VERIFY_CERT_FLAGS, pvextra: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject, dwissuertype.toInt(), pvissuer, dwflags.toInt(), pvextra)

public actual fun CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash(phashpara, pbdetachedhashblob, cbdetachedhashblob.toInt(), ctobehashed.toInt(), rgpbtobehashed, rgcbtobehashed, pbcomputedhash, pcbcomputedhash)

public actual fun CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbdetachedsignblob: Long, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature(pverifypara, dwsignerindex.toInt(), pbdetachedsignblob, cbdetachedsignblob.toInt(), ctobesigned.toInt(), rgpbtobesigned, rgcbtobesigned, ppsignercert)

public actual fun CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: UInt, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash(phashpara, pbhashedblob, cbhashedblob.toInt(), pbtobehashed, pcbtobehashed, pbcomputedhash, pcbcomputedhash)

public actual fun CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature(pverifypara, dwsignerindex.toInt(), pbsignedblob, cbsignedblob.toInt(), pbdecoded, pcbdecoded, ppsignercert)

public actual fun CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey(pverifypara, ppublickeyinfo, pbsignedblob, cbsignedblob.toInt(), pbdecoded, pcbdecoded)

public actual fun CryptVerifySignatureA(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifySignatureA(hhash.toLong(), pbsignature, dwsiglen.toInt(), hpubkey.toLong(), szdescription, dwflags.toInt())

public actual fun CryptVerifySignatureW(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifySignatureW(hhash.toLong(), pbsignature, dwsiglen.toInt(), hpubkey.toLong(), szdescription, dwflags.toInt())

public actual fun CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: UInt, pbdata: Long, cbdata: UInt, hadditionalstore: HCERTSTORE, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature(pbtscontentinfo, cbtscontentinfo.toInt(), pbdata, cbdata.toInt(), hadditionalstore, pptscontext, pptssigner, phstore)

public actual fun CryptXmlAddObject(hsignatureorobject: Long, dwflags: UInt, rgproperty: Long, cproperty: UInt, pencoded: Long, ppobject: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlAddObject(hsignatureorobject, dwflags.toInt(), rgproperty, cproperty.toInt(), pencoded, ppobject)

public actual fun CryptXmlClose(hcryptxml: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlClose(hcryptxml)

public actual fun CryptXmlCreateReference(hcryptxml: Long, dwflags: UInt, wszid: PCWSTR, wszuri: PCWSTR, wsztype: PCWSTR, pdigestmethod: Long, ctransform: UInt, rgtransform: Long, phreference: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlCreateReference(hcryptxml, dwflags.toInt(), wszid, wszuri, wsztype, pdigestmethod, ctransform.toInt(), rgtransform, phreference)

public actual fun CryptXmlDigestReference(hreference: Long, dwflags: UInt, pdataproviderin: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlDigestReference(hreference, dwflags.toInt(), pdataproviderin)

public actual fun CryptXmlEncode(hcryptxml: Long, dwcharset: CRYPT_XML_CHARSET, rgproperty: Long, cproperty: UInt, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlEncode(hcryptxml, dwcharset, rgproperty, cproperty.toInt(), pvcallbackstate, pfnwrite.toLong())

public actual fun CryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumalginfo: PFN_CRYPT_XML_ENUM_ALG_INFO): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg, pfnenumalginfo.toLong())

public actual fun CryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: Long, dwgroupid: UInt, dwflags: UInt): Long =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), pvfindby, dwgroupid.toInt(), dwflags.toInt())

public actual fun CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: CRYPT_XML_FLAGS, ppalginfo: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo(pxmlalgorithm, dwflags.toInt(), ppalginfo)

public actual fun CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext(hcryptxml, ppstruct)

public actual fun CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetReference(hcryptxml, ppstruct)

public actual fun CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetSignature(hcryptxml, ppstruct)

public actual fun CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetStatus(hcryptxml, pstatus)

public actual fun CryptXmlGetTransforms(ppconfig: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms(ppconfig)

public actual fun CryptXmlImportPublicKey(dwflags: CRYPT_XML_FLAGS, pkeyvalue: Long, phkey: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey(dwflags.toInt(), pkeyvalue, phkey)

public actual fun CryptXmlOpenToDecode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, rgproperty: Long, cproperty: UInt, pencoded: Long, phcryptxml: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode(pconfig, dwflags.toInt(), rgproperty, cproperty.toInt(), pencoded, phcryptxml)

public actual fun CryptXmlOpenToEncode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, wszid: PCWSTR, rgproperty: Long, cproperty: UInt, pencoded: Long, phsignature: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode(pconfig, dwflags.toInt(), wszid, rgproperty, cproperty.toInt(), pencoded, phsignature)

public actual fun CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret(hsignature, pbsecret, cbsecret.toInt())

public actual fun CryptXmlSign(hsignature: Long, hkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwflags: CRYPT_XML_FLAGS, dwkeyinfospec: CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlSign(hsignature, hkey.toLong(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, pvkeyinfospec, psignaturemethod, pcanonicalization)

public actual fun CryptXmlVerifySignature(hsignature: Long, hkey: BCRYPT_KEY_HANDLE, dwflags: CRYPT_XML_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature(hsignature, hkey, dwflags.toInt())

public actual fun Decrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_Decrypt(hcrypto, foaep, cbindata.toInt(), pindata, pcboutdata, ppoutdata)

public actual fun Encrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_Encrypt(hcrypto, foaep, cbindata.toInt(), pindata, pcboutdata, ppoutdata)

public actual fun FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: UInt, pwszpurpose: PCWSTR, dwkeyspec: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_FindCertsByIssuer(pcertchains, pcbcertchains, pccertchains, pbencodedissuername, cbencodedissuername.toInt(), pwszpurpose, dwkeyspec.toInt())

public actual fun FreeToken(pallocmemory: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_FreeToken(pallocmemory)

public actual fun GenerateDerivedKey(hcrypto: Long, cblabel: UInt, plabel: Long, cbnonce: UInt, pnonce: Long, derivedkeylength: UInt, offset: UInt, algid: PCWSTR, pcbkey: Long, ppkey: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GenerateDerivedKey(hcrypto, cblabel.toInt(), plabel, cbnonce.toInt(), pnonce, derivedkeylength.toInt(), offset.toInt(), algid, pcbkey, ppkey)

public actual fun GetAsymmetricEncryptionInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetBrowserToken(dwparamtype: UInt, pparam: Long, pcbtoken: Long, pptoken: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetBrowserToken(dwparamtype.toInt(), pparam, pcbtoken, pptoken)

public actual fun GetCipherInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetCipherInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetCryptoTransform(hsymmetriccrypto: Long, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: Long, pphtransform: Long): HRESULT =
    0

public actual fun GetHashInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetHashInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetKeyDerivationInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetKeyStorageInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetKeyStorageInterface(pszprovidername, ppfunctiontable, dwflags.toInt())

public actual fun GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetKeyedHash(hsymmetriccrypto, pphhash)

public actual fun GetRngInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetRngInterface(pszprovidername, ppfunctiontable, dwflags.toInt())

public actual fun GetSChannelInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetSChannelInterface(pszprovidername, ppfunctiontable, dwflags.toInt())

public actual fun GetSecretAgreementInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetSignatureInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetSignatureInterface(pszprovidername, pszalgid, ppfunctiontable, dwflags.toInt())

public actual fun GetToken(cpolicychain: UInt, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_GetToken(cpolicychain.toInt(), ppolicychain, securitytoken, phprooftokencrypto)

public actual fun HashCore(hcrypto: Long, cbindata: UInt, pindata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_HashCore(hcrypto, cbindata.toInt(), pindata)

public actual fun HashFinal(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_HashFinal(hcrypto, cbindata.toInt(), pindata, pcboutdata, ppoutdata)

public actual fun ImportInformationCard(filename: PCWSTR): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_ImportInformationCard(filename)

public actual fun ManageCardSpace(): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_ManageCardSpace()

public actual fun NCryptCloseProtectionDescriptor(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor(hdescriptor)

public actual fun NCryptCreateClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptCreateClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), pparameterlist, pbclaimblob, cbclaimblob.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptCreatePersistedKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey(hprovider.toLong(), phkey, pszalgid, pszkeyname, dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun NCryptCreateProtectionDescriptor(pwszdescriptorstring: PCWSTR, dwflags: UInt, phdescriptor: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor(pwszdescriptorstring, dwflags.toInt(), phdescriptor)

public actual fun NCryptDecrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptDecrypt(hkey.toLong(), pbinput, cbinput.toInt(), ppaddinginfo, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptDeleteKey(hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptDeleteKey(hkey.toLong(), dwflags.toInt())

public actual fun NCryptDeriveKey(hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptDeriveKey(hsharedsecret.toLong(), pwszkdf, pparameterlist, pbderivedkey, cbderivedkey.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptEncrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptEncrypt(hkey.toLong(), pbinput, cbinput.toInt(), ppaddinginfo, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptEnumAlgorithms(hprovider: NCRYPT_PROV_HANDLE, dwalgoperations: NCRYPT_OPERATION, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms(hprovider.toLong(), dwalgoperations.toInt(), pdwalgcount, ppalglist, dwflags.toInt())

public actual fun NCryptEnumKeys(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptEnumKeys(hprovider.toLong(), pszscope, ppkeyname, ppenumstate, dwflags.toInt())

public actual fun NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders(pdwprovidercount, ppproviderlist, dwflags.toInt())

public actual fun NCryptExportKey(hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptExportKey(hkey.toLong(), hexportkey.toLong(), pszblobtype, pparameterlist, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptFinalizeKey(hkey: NCRYPT_KEY_HANDLE, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptFinalizeKey(hkey.toLong(), dwflags.toInt())

public actual fun NCryptFreeBuffer(pvinput: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptFreeBuffer(pvinput)

public actual fun NCryptFreeObject(hobject: NCRYPT_HANDLE): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptFreeObject(hobject.toLong())

public actual fun NCryptGetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: OBJECT_SECURITY_INFORMATION): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptGetProperty(hobject.toLong(), pszproperty, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptGetProtectionDescriptorInfo(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, pmempara: Long, dwinfotype: UInt, ppvinfo: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo(hdescriptor, pmempara, dwinfotype.toInt(), ppvinfo)

public actual fun NCryptImportKey(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptImportKey(hprovider.toLong(), himportkey.toLong(), pszblobtype, pparameterlist, phkey, pbdata, cbdata.toInt(), dwflags.toInt())

public actual fun NCryptIsAlgSupported(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported(hprovider.toLong(), pszalgid, dwflags.toInt())

public actual fun NCryptIsKeyHandle(hkey: NCRYPT_KEY_HANDLE): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle(hkey.toLong())

public actual fun NCryptKeyDerivation(hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptKeyDerivation(hkey.toLong(), pparameterlist, pbderivedkey, cbderivedkey.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptNotifyChangeKey(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey(hprovider.toLong(), phevent, dwflags.toInt())

public actual fun NCryptOpenKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptOpenKey(hprovider.toLong(), phkey, pszkeyname, dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun NCryptOpenStorageProvider(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider(phprovider, pszprovidername, dwflags.toInt())

public actual fun NCryptProtectSecret(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, pbdata: Long, cbdata: UInt, pmempara: Long, hwnd: HWND, ppbprotectedblob: Long, pcbprotectedblob: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptProtectSecret(hdescriptor, dwflags.toInt(), pbdata, cbdata.toInt(), pmempara, hwnd, ppbprotectedblob, pcbprotectedblob)

public actual fun NCryptQueryProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PWSTR, pcdescriptorstring: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName(pwszname, pwszdescriptorstring, pcdescriptorstring, dwflags.toInt())

public actual fun NCryptRegisterProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName(pwszname, pwszdescriptorstring, dwflags.toInt())

public actual fun NCryptSecretAgreement(hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptSecretAgreement(hprivkey.toLong(), hpubkey.toLong(), phagreedsecret, dwflags.toInt())

public actual fun NCryptSetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptSetProperty(hobject.toLong(), pszproperty, pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun NCryptSignHash(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptSignHash(hkey.toLong(), ppaddinginfo, pbhashvalue, cbhashvalue.toInt(), pbsignature, cbsignature.toInt(), pcbresult, dwflags.toInt())

public actual fun NCryptStreamClose(hstream: NCRYPT_STREAM_HANDLE): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptStreamClose(hstream)

public actual fun NCryptStreamOpenToProtect(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, hwnd: HWND, pstreaminfo: Long, phstream: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect(hdescriptor, dwflags.toInt(), hwnd, pstreaminfo, phstream)

public actual fun NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect(pstreaminfo, dwflags.toInt(), hwnd, phstream)

public actual fun NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx(pstreaminfo, dwflags.toInt(), hwnd, phstream)

public actual fun NCryptStreamUpdate(hstream: NCRYPT_STREAM_HANDLE, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptStreamUpdate(hstream, pbdata, cbdata.toLong(), ffinal)

public actual fun NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptTranslateHandle(phprovider, phkey, hlegacyprov.toLong(), hlegacykey.toLong(), dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun NCryptUnprotectSecret(phdescriptor: Long, dwflags: NCRYPT_FLAGS, pbprotectedblob: Long, cbprotectedblob: UInt, pmempara: Long, hwnd: HWND, ppbdata: Long, pcbdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret(phdescriptor, dwflags.toInt(), pbprotectedblob, cbprotectedblob.toInt(), pmempara, hwnd, ppbdata, pcbdata)

public actual fun NCryptVerifyClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptVerifyClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), pparameterlist, pbclaimblob, cbclaimblob.toInt(), poutput, dwflags.toInt())

public actual fun NCryptVerifySignature(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_NCryptVerifySignature(hkey.toLong(), ppaddinginfo, pbhashvalue, cbhashvalue.toInt(), pbsignature, cbsignature.toInt(), dwflags.toInt())

public actual fun PFXExportCertStore(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_PFXExportCertStore(hstore, ppfx, szpassword, dwflags.toInt())

public actual fun PFXExportCertStoreEx(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, pvpara: Long, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx(hstore, ppfx, szpassword, pvpara, dwflags.toInt())

public actual fun PFXImportCertStore(ppfx: Long, szpassword: PCWSTR, dwflags: CRYPT_KEY_FLAGS): HCERTSTORE =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_PFXImportCertStore(ppfx, szpassword, dwflags.toInt())

public actual fun PFXIsPFXBlob(ppfx: Long): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_PFXIsPFXBlob(ppfx)

public actual fun PFXVerifyPassword(ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_PFXVerifyPassword(ppfx, szpassword, dwflags.toInt())

public actual fun ProcessPrng(pbdata: Long, cbdata: ULong): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_ProcessPrng(pbdata, cbdata.toLong())

public actual fun SignError(): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignError()

public actual fun SignHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, pcbsig: Long, ppsig: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignHash(hcrypto, cbhash.toInt(), phash, hashalgoid, pcbsig, ppsig)

public actual fun SignerFreeSignerContext(psignercontext: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerFreeSignerContext(psignercontext)

public actual fun SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerSign(psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata)

public actual fun SignerSignEx(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerSignEx(dwflags.toInt(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext)

public actual fun SignerSignEx2(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerSignEx2(dwflags.toInt(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags.toInt(), psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved)

public actual fun SignerSignEx3(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerSignEx3(dwflags.toInt(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags.toInt(), psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, pdigestsigninfo, preserved)

public actual fun SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerTimeStamp(psubjectinfo, pwszhttptimestamp, psrequest, psipdata)

public actual fun SignerTimeStampEx(dwflags: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerTimeStampEx(dwflags.toInt(), psubjectinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext)

public actual fun SignerTimeStampEx2(dwflags: SIGNER_TIMESTAMP_FLAGS, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, dwalgid: ALG_ID, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerTimeStampEx2(dwflags.toInt(), psubjectinfo, pwszhttptimestamp, dwalgid.toInt(), psrequest, psipdata, ppsignercontext)

public actual fun SignerTimeStampEx3(dwflags: SIGNER_TIMESTAMP_FLAGS, dwindex: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, pszalgorithmoid: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SignerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), psubjectinfo, pwszhttptimestamp, pszalgorithmoid, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved)

public actual fun SslChangeNotify(hevent: HANDLE, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslChangeNotify(hevent, dwflags.toInt())

public actual fun SslComputeClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pszalgid, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslComputeEapKeyBlock(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock(hsslprovider.toLong(), hmasterkey.toLong(), pbrandoms, cbrandoms.toInt(), pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslComputeFinishedHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslComputeFinishedHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pboutput, cboutput.toInt(), dwflags.toInt())

public actual fun SslComputeSessionHash(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslComputeSessionHash(hsslprovider.toLong(), hhandshakehash.toLong(), dwprotocol.toInt(), pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslCreateClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash(hsslprovider.toLong(), phhandshakehash, dwprotocol.toInt(), dwciphersuite.toInt(), pszhashalgid, dwflags.toInt())

public actual fun SslCreateEphemeralKey(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey(hsslprovider.toLong(), phephemeralkey, dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), pbparams, cbparams.toInt(), dwflags.toInt())

public actual fun SslCreateHandshakeHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash(hsslprovider.toLong(), phhandshakehash, dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt())

public actual fun SslDecrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount(hsslprovider.toLong())

public actual fun SslDecryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslDecryptPacket(hsslprovider.toLong(), hkey.toLong(), pbinput, cbinput.toInt(), pboutput, cboutput.toInt(), pcbresult, sequencenumber.toLong(), dwflags.toInt())

public actual fun SslDuplicateTranscriptHash(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phtranscripthash: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash(hsslprovider.toLong(), htranscripthash.toLong(), phtranscripthash, dwflags.toInt())

public actual fun SslEncryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslEncryptPacket(hsslprovider.toLong(), hkey.toLong(), pbinput, cbinput.toInt(), pboutput, cboutput.toInt(), pcbresult, sequencenumber.toLong(), dwcontenttype.toInt(), dwflags.toInt())

public actual fun SslEnumCipherSuites(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslEnumCipherSuites(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite, ppenumstate, dwflags.toInt())

public actual fun SslEnumCipherSuitesEx(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite, ppenumstate, dwflags.toInt())

public actual fun SslEnumEccCurves(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslEnumEccCurves(hsslprovider.toLong(), pecccurvecount, ppecccurve, dwflags.toInt())

public actual fun SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders(pdwprovidercount, ppproviderlist, dwflags.toInt())

public actual fun SslExpandBinderKey(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandBinderKey(hsslprovider.toLong(), hearlykey.toLong(), phbinderkey, pparameterlist, dwflags.toInt())

public actual fun SslExpandExporterMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phexportermasterkey, pparameterlist, dwflags.toInt())

public actual fun SslExpandPreSharedKey(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey(hsslprovider.toLong(), hresumptionmasterkey.toLong(), pbticketnonce, cbticketnonce.toInt(), phpresharedkey, pparameterlist, dwflags.toInt())

public actual fun SslExpandResumptionMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey(hsslprovider.toLong(), hmasterkey.toLong(), hhashvalue.toLong(), phresumptionmasterkey, pparameterlist, dwflags.toInt())

public actual fun SslExpandTrafficKeys(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phclienttraffickey, phservertraffickey, pparameterlist, dwflags.toInt())

public actual fun SslExpandWriteKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExpandWriteKey(hsslprovider.toLong(), hbasetraffickey.toLong(), phwritekey, pparameterlist, dwflags.toInt())

public actual fun SslExportKey(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExportKey(hsslprovider.toLong(), hkey.toLong(), pszblobtype, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslExportKeyingMaterial(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial(hsslprovider.toLong(), hmasterkey.toLong(), slabel, pbrandoms, cbrandoms.toInt(), pbcontextvalue, cbcontextvalue.toShort(), pboutput, cboutput.toInt(), dwflags.toInt())

public actual fun SslExtractEarlyKey(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExtractEarlyKey(hsslprovider.toLong(), hpresharedkey.toLong(), phearlykey, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist, dwflags.toInt())

public actual fun SslExtractHandshakeKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), hearlykey.toLong(), phhandshakekey, pparameterlist, dwflags.toInt())

public actual fun SslExtractMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslExtractMasterKey(hsslprovider.toLong(), hhandshakekey.toLong(), phmasterkey, pparameterlist, dwflags.toInt())

public actual fun SslFreeBuffer(pvinput: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslFreeBuffer(pvinput)

public actual fun SslFreeObject(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslFreeObject(hobject.toLong(), dwflags.toInt())

public actual fun SslGenerateMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGenerateMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), phmasterkey, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslGeneratePreMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey(hsslprovider.toLong(), hpublickey.toLong(), phpremasterkey, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist, pboutput, cboutput.toInt(), pcbresult, dwflags.toInt())

public actual fun SslGenerateSessionKeys(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys(hsslprovider.toLong(), hmasterkey.toLong(), phreadkey, phwritekey, pparameterlist, dwflags.toInt())

public actual fun SslGetCipherSuitePRFHashAlgorithm(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), szprfhash, dwflags.toInt())

public actual fun SslGetKeyProperty(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGetKeyProperty(hkey.toLong(), pszproperty, ppboutput, pcboutput, dwflags.toInt())

public actual fun SslGetProviderProperty(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslGetProviderProperty(hsslprovider.toLong(), pszproperty, ppboutput, pcboutput, ppenumstate, dwflags.toInt())

public actual fun SslHashHandshake(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslHashHandshake(hsslprovider.toLong(), hhandshakehash.toLong(), pbinput, cbinput.toInt(), dwflags.toInt())

public actual fun SslImportKey(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslImportKey(hsslprovider.toLong(), phkey, pszblobtype, pbkeyblob, cbkeyblob.toInt(), dwflags.toInt())

public actual fun SslImportMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslImportMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), phmasterkey, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist, pbencryptedkey, cbencryptedkey.toInt(), dwflags.toInt())

public actual fun SslIncrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount(hsslprovider.toLong())

public actual fun SslLookupCipherLengths(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslLookupCipherLengths(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pcipherlengths, cbcipherlengths.toInt(), dwflags.toInt())

public actual fun SslLookupCipherSuiteInfo(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pciphersuite, dwflags.toInt())

public actual fun SslOpenPrivateKey(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslOpenPrivateKey(hsslprovider.toLong(), phprivatekey, pcertcontext, dwflags.toInt())

public actual fun SslOpenProvider(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslOpenProvider(phsslprovider, pszprovidername, dwflags.toInt())

public actual fun SslSignHash(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslSignHash(hsslprovider.toLong(), hprivatekey.toLong(), pbhashvalue, cbhashvalue.toInt(), pbsignature, cbsignature.toInt(), pcbresult, dwflags.toInt())

public actual fun SslVerifySignature(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SslVerifySignature(hsslprovider.toLong(), hpublickey.toLong(), pbhashvalue, cbhashvalue.toInt(), pbsignature, cbsignature.toInt(), dwflags.toInt())

public actual fun SystemPrng(pbrandomdata: Long, cbrandomdata: ULong): BOOL =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_SystemPrng(pbrandomdata, cbrandomdata.toLong())

public actual fun TransformBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_TransformBlock(hcrypto, cbindata.toInt(), pindata, pcboutdata, ppoutdata)

public actual fun TransformFinalBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_TransformFinalBlock(hcrypto, cbindata.toInt(), pindata, pcboutdata, ppoutdata)

public actual fun VerifyHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, cbsig: UInt, psig: Long, pfverified: Long): HRESULT =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_VerifyHash(hcrypto, cbhash.toInt(), phash, hashalgoid, cbsig.toInt(), psig, pfverified)
