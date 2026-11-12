@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SecurityCryptographyJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(halgorithm: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptCreateContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptCreateHash(halgorithm: Long, phhash: Long, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(halgorithm: Long, phhash: Long, nhashes: Int, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(dwtable: Int, pszcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(hhash: Long, htargetalg: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(hprf: Long, pbpassword: Long, cbpassword: Int, pbsalt: Long, cbsalt: Int, citerations: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(hsecret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(hhash: Long, phnewhash: Long, pbhashobject: Long, cbhashobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(hkey: Long, phnewkey: Long, pbkeyobject: Long, cbkeyobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(dwalgoperations: Int, palgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(dwtable: Int, pszcontext: Long, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(dwtable: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(pszalgid: Long, pimplcount: Long, ppimpllist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptFinishHash(hhash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(pvbuffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptGenRandom(halgorithm: Long, pbbuffer: Long, cbbuffer: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(halgorithm: Long, phkey: Long, dwlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(halgorithm: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(pfenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptHash(halgorithm: Long, pbsecret: Long, cbsecret: Int, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptHashData(hhash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptImportKey(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: Long, pszimplementation: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(hobject: Long, operationtype: Int, poperations: Long, cboperations: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(dwtable: Int, pszcontext: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(pszprovider: Long, dwmode: Int, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(phevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(pszprovider: Long, dwflags: Int, preg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwmode: Int, dwflags: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptSignHash(hkey: Long, ppaddinginfo: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(pszprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhash: Long, cbhash: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(hcertstore: Long, dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int, dwadddisposition: Int, ppcrlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(hcertstore: Long, dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int, dwadddisposition: Int, ppctlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(hcertstore: Long, dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int, dwadddisposition: Int, ppcertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(hserverocspresponse: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(hcertstore: Long, pbelement: Long, cbelement: Int, dwadddisposition: Int, dwflags: Int, dwcontexttypeflags: Int, pdwcontexttype: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(hcollectionstore: Long, hsiblingstore: Long, dwupdateflags: Int, dwpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(dwalgid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCloseStore(hcertstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCompareCertificate(dwcertencodingtype: Int, pcertid1: Long, pcertid2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(dwcertencodingtype: Int, pcertname1: Long, pcertname2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(pint1: Long, pint2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(dwcertencodingtype: Int, ppublickey1: Long, ppublickey2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertControlStore(hcertstore: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: Int, rgoptattr: Long, dwflags: Int, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateContext(dwcontexttype: Int, dwencodingtype: Int, pbencoded: Long, cbencoded: Int, dwflags: Int, pcreatepara: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(hcryptprovorncryptkey: Long, psubjectissuerblob: Long, dwflags: Int, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(pcrlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(pctlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(pchaincontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(pcertcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertDuplicateStore(hcertstore: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(hcertstore: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(pctlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(hcertstore: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(hcertstore: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(pvsystemstore: Long, dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(dwflags: Int, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindAttribute(pszobjid: Long, cattr: Int, rgattr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(hcertstore: Long, dwmsgandcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: Int, pvreserved: Long, ppcrlentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindChainInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevchaincontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindExtension(pszobjid: Long, cextensions: Int, rgextensions: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(pszobjid: Long, pname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, pctlcontext: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: Int, pvreserved: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(pchaincontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(hchainengine: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(prgpselection: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(hcertstore: Long, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(pctlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(hchainengine: Long, pcertcontext: Long, ptime: Long, hadditionalstore: Long, pchainpara: Long, dwflags: Int, pvreserved: Long, ppchaincontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: Int, pusage: Long, pcbusage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(dwcertencodingtype: Int, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(hcertstore: Long, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetNameStringA(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetNameStringW(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(dwcertencodingtype: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(hcertstore: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(hcertstore: Long, dwcertencodingtype: Int, pcertid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertGetValidUsages(ccerts: Int, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(dwcertencodingtype: Int, dwflags: Int, pcertname: Long, prdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: Long, psigningcert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertIsWeakHash(dwhashusetype: Int, pwszcnghashalgid: Long, dwchainflags: Int, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertNameToStrA(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertNameToStrW(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(pszobjid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(pchaincontext: Long, dwflags: Int, popenpara: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertOpenStore(lpszstoreprovider: Long, dwencodingtype: Int, hcryptprov: Long, dwflags: Int, pvpara: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(pvsystemstore: Long, dwflags: Int, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(hcollectionstore: Long, hsiblingstore: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(hchainengine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: Long, dwretrievalflags: Int, dwtimeout: Int, dwflags: Int, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSaveStore(hcertstore: Long, dwencodingtype: Int, dwsaveas: Int, dwsaveto: Int, pvsavetopara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(pselectioncontext: Long, dwflags: Int, pchainparameters: Long, ccriteria: Int, rgpcriteria: Long, hstore: Long, pcselection: Long, pprgpselection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(pctlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(pctlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(hcertstore: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertStrToNameA(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertStrToNameW(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(pvsystemstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(dwcertencodingtype: Int, pcertid: Long, ccrlinfo: Int, rgpcrlinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, psubjectusage: Long, dwflags: Int, pverifyusagepara: Long, pverifyusagestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(pszpolicyoid: Long, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(dwencodingtype: Int, dwrevtype: Int, ccontext: Int, rgpvcontext: Long, dwflags: Int, prevpara: Long, prevstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(hcrypto: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(pcert: Long, dwflags: Int, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptContextAddRef(hprov: Long, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(dwflags: Int, phasync: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptCreateHash(hprov: Long, algid: Int, hkey: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(dwcertencodingtype: Int, pszpubkeyoid: Long, ppubkeystruc: Long, cbpubkeystruc: Int, dwflags: Int, pvreserved: Long, pbhash: Long, pcbhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(dwmsgtypeflags: Int, pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencodedblob: Long, cbencodedblob: Int, dwprevinnercontenttype: Int, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDeriveKey(hprov: Long, algid: Int, hbasedata: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(hhash: Long, pdwreserved: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(hkey: Long, pdwreserved: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEncodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, dwflags: Int, pencodepara: Long, pvencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEncrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: Int, pbencryptedblob: Long, pcbencryptedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, dwflags: Int, pvarg: Long, pfnenumoidfunc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumoidinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptExportKey(hkey: Long, hexpkey: Long, dwblobtype: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(hcryptprov: Long, dwkeyspec: Int, pszprivatekeyobjid: Long, dwflags: Int, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: Long, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(pcert: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(pwszcryptname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(dwkeytype: Int, pvkey: Long, dwgroupid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptFormatObject(dwcertencodingtype: Int, dwformattype: Int, dwformatstrtype: Int, pformatstruct: Long, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, pbformat: Long, pcbformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGenKey(hprov: Long, algid: Int, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGenRandom(hprov: Long, dwlen: Int, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(hasync: Long, pszparamoid: Long, ppvparam: Long, ppfnfree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: Int, pwszdlllist: Long, pcchdlllist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pwszdll: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetHashParam(hhash: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(dwmsgandcertencodingtype: Int, hcryptprov: Long, dwflags: Int, pbsignedblob: Long, cbsignedblob: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(dwmsgencodingtype: Int, pbsignedblob: Long, cbsignedblob: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pszoid: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(pszurloid: Long, pvpara: Long, dwflags: Int, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetProvParam(hprov: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptGetUserKey(hprov: Long, dwkeyspec: Int, phuserkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashCertificate(hcryptprov: Long, algid: Int, dwflags: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(pwszcnghashalgid: Long, dwflags: Int, pvreserved: Long, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashData(hhash: Long, pbdata: Long, dwdatalen: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashMessage(phashpara: Long, fdetachedhash: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(hcryptprov: Long, algid: Int, dwflags: Int, dwcertencodingtype: Int, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptImportKey(hprov: Long, pbdata: Long, dwdatalen: Int, hpubkey: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, aikeyalg: Int, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(dwcertencodingtype: Int, pinfo: Long, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(pszfuncname: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(pfncancel: Long, pvarg: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(hcryptprov: Long, dwdefaulttype: Int, pvdefaultpara: Long, dwflags: Int, pvreserved: Long, phdefaultcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(hmodule: Long, dwencodingtype: Int, pszfuncname: Long, cfuncentry: Int, rgfuncentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMemAlloc(cbsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMemFree(pv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMemRealloc(pv: Long, cbsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgClose(hcryptmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgControl(hcryptmsg: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(hcryptmsg: Long, dwindex: Int, ccountersigners: Int, rgcountersigners: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, ccountersigners: Int, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(hcryptmsg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(dwmsgencodingtype: Int, pctlinfo: Long, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: Int, rghsignerstore: Long, dwflags: Int, ppsigner: Long, pdwsignerindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(hcryptmsg: Long, dwparamtype: Int, dwindex: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, hcryptprov: Long, precipientinfo: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(dwmsgencodingtype: Int, pbctlcontent: Long, cbctlcontent: Int, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: Int, ffinal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, pcicountersigner: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, dwsignertype: Int, pvsigner: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptProtectData(pdatain: Long, szdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptProtectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptQueryObject(dwobjecttype: Int, pvobject: Long, dwexpectedcontenttypeflags: Int, dwexpectedformattypeflags: Int, dwflags: Int, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, dwindex: Int, pwszdll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszdll: Long, pszoverridefuncname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(pinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(wszurl: Long, dwretrievalflags: Int, dwtimeout: Int, pszhashid: Long, ppara: Long, pbdata: Long, cbdata: Int, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(hasync: Long, pszparamoid: Long, pvparam: Long, pfnfree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetHashParam(hhash: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, dwvaluetype: Int, pbvaluedata: Long, cbvaluedata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetProvParam(hprov: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetProviderA(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSetProviderW(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: Int, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pbencodedtobesigned: Long, cbencodedtobesigned: Int, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignHashA(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignHashW(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignMessage(psignpara: Long, fdetachedsignature: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: Int, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, pwszdll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(poldsid: Long, pwszoldpassword: Long, dwflags: Int, pdwsuccesscount: Long, pdwfailurecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(hcryptprov: Long, dwcertencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, dwissuertype: Int, pvissuer: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: Int, pbdetachedsignblob: Long, cbdetachedsignblob: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: Int, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: Int, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: Int, pbdata: Long, cbdata: Int, hadditionalstore: Long, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(hsignatureorobject: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlClose(hcryptxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(hcryptxml: Long, dwflags: Int, wszid: Long, wszuri: Long, wsztype: Long, pdigestmethod: Long, ctransform: Int, rgtransform: Long, phreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(hreference: Long, dwflags: Int, pdataproviderin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlEncode(hcryptxml: Long, dwcharset: Int, rgproperty: Long, cproperty: Int, pvcallbackstate: Long, pfnwrite: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumalginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(dwfindbytype: Int, pvfindby: Long, dwgroupid: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: Int, ppalginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(hcryptxml: Long, pstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(ppconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(dwflags: Int, pkeyvalue: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(pconfig: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, phcryptxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(pconfig: Long, dwflags: Int, wszid: Long, rgproperty: Long, cproperty: Int, pencoded: Long, phsignature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlSign(hsignature: Long, hkey: Long, dwkeyspec: Int, dwflags: Int, dwkeyinfospec: Int, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(hsignature: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyDecrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyEncrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: Int, pwszpurpose: Long, dwkeyspec: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyFreeToken(pallocmemory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(hcrypto: Long, cblabel: Int, plabel: Long, cbnonce: Int, pnonce: Long, derivedkeylength: Int, offset: Int, algid: Long, pcbkey: Long, ppkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetBrowserToken(dwparamtype: Int, pparam: Long, pcbtoken: Long, pptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetCipherInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetHashInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetRngInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetSChannelInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetSignatureInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyGetToken(cpolicychain: Int, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyHashCore(hcrypto: Long, cbindata: Int, pindata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyHashFinal(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyImportInformationCard(filename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyManageCardSpace(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(hdescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(hprovider: Long, phkey: Long, pszalgid: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(pwszdescriptorstring: Long, dwflags: Int, phdescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(hprovider: Long, dwalgoperations: Int, pdwalgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(hprovider: Long, pszscope: Long, ppkeyname: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(hdescriptor: Long, pmempara: Long, dwinfotype: Int, ppvinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptImportKey(hprovider: Long, himportkey: Long, pszblobtype: Long, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(hprovider: Long, pszalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(hprovider: Long, phevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptOpenKey(hprovider: Long, phkey: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(phprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(hdescriptor: Long, dwflags: Int, pbdata: Long, cbdata: Int, pmempara: Long, hwnd: Long, ppbprotectedblob: Long, pcbprotectedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, pcdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptSignHash(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptStreamClose(hstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(hdescriptor: Long, dwflags: Int, hwnd: Long, pstreaminfo: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(hstream: Long, pbdata: Long, cbdata: Long, ffinal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: Long, hlegacykey: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(phdescriptor: Long, dwflags: Int, pbprotectedblob: Long, cbprotectedblob: Int, pmempara: Long, hwnd: Long, ppbdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, poutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyPFXExportCertStore(hstore: Long, ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(hstore: Long, ppfx: Long, szpassword: Long, pvpara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyPFXImportCertStore(ppfx: Long, szpassword: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(ppfx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyProcessPrng(pbdata: Long, cbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, pcbsig: Long, ppsig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(psignercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerSignEx(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerSignEx2(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerSignEx3(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerTimeStampEx(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, dwalgid: Int, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(dwflags: Int, dwindex: Int, psubjectinfo: Long, pwszhttptimestamp: Long, pszalgorithmoid: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslChangeNotify(hevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pszalgid: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(hsslprovider: Long, hmasterkey: Long, pbrandoms: Long, cbrandoms: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslComputeSessionHash(hsslprovider: Long, hhandshakehash: Long, dwprotocol: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, pszhashalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(hsslprovider: Long, phephemeralkey: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, dwkeybitlen: Int, pbparams: Long, cbparams: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslDecryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(hsslprovider: Long, htranscripthash: Long, phtranscripthash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslEncryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwcontenttype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslEnumEccCurves(hsslprovider: Long, pecccurvecount: Long, ppecccurve: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandBinderKey(hsslprovider: Long, hearlykey: Long, phbinderkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phexportermasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(hsslprovider: Long, hresumptionmasterkey: Long, pbticketnonce: Long, cbticketnonce: Int, phpresharedkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(hsslprovider: Long, hmasterkey: Long, hhashvalue: Long, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExpandWriteKey(hsslprovider: Long, hbasetraffickey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExportKey(hsslprovider: Long, hkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(hsslprovider: Long, hmasterkey: Long, slabel: Long, pbrandoms: Long, cbrandoms: Int, pbcontextvalue: Long, cbcontextvalue: Short, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(hsslprovider: Long, hpresharedkey: Long, phearlykey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, hearlykey: Long, phhandshakekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslExtractMasterKey(hsslprovider: Long, hhandshakekey: Long, phmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslFreeObject(hobject: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(hsslprovider: Long, hpublickey: Long, phpremasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(hsslprovider: Long, hmasterkey: Long, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, szprfhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGetKeyProperty(hkey: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslGetProviderProperty(hsslprovider: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslHashHandshake(hsslprovider: Long, hhandshakehash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslImportKey(hsslprovider: Long, phkey: Long, pszblobtype: Long, pbkeyblob: Long, cbkeyblob: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslImportMasterKey(hsslprovider: Long, hprivatekey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pcipherlengths: Long, cbcipherlengths: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pciphersuite: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(hsslprovider: Long, phprivatekey: Long, pcertcontext: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslOpenProvider(phsslprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslSignHash(hsslprovider: Long, hprivatekey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySslVerifySignature(hsslprovider: Long, hpublickey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographySystemPrng(pbrandomdata: Long, cbrandomdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyTransformBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyTransformFinalBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyVerifyHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, cbsig: Int, psig: Long, pfverified: Long): Int
}

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, dwposition.toInt())

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pszprovider.rawAddress, dwposition.toInt())

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(halgorithm.rawAddress, dwflags.toInt())

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(dwtable.toInt(), pszcontext.rawAddress, pconfig.rawAddress)

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pconfig.rawAddress)

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptCreateContext(dwtable.toInt(), pszcontext.rawAddress, pconfig.rawAddress)

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptCreateHash(halgorithm.rawAddress, phhash.rawAddress, pbhashobject.rawAddress, cbhashobject.toInt(), pbsecret.rawAddress, cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, nhashes: UInt, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(halgorithm.rawAddress, phhash.rawAddress, nhashes.toInt(), pbhashobject.rawAddress, cbhashobject.toInt(), pbsecret.rawAddress, cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDecrypt(hkey.rawAddress, pbinput.rawAddress, cbinput.toInt(), ppaddinginfo.rawAddress, pbiv.rawAddress, cbiv.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(dwtable.toInt(), pszcontext.rawAddress)

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(hsharedsecret.rawAddress, pwszkdf.rawAddress, pparameterlist.rawAddress, pbderivedkey.rawAddress, cbderivedkey.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(hhash.rawAddress, htargetalg.rawAddress, pbderivedkey.rawAddress, cbderivedkey.toInt(), dwflags.toInt())

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr, cbpassword: UInt, pbsalt: ConstPtr, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(hprf.rawAddress, pbpassword.rawAddress, cbpassword.toInt(), pbsalt.rawAddress, cbsalt.toInt(), citerations.toLong(), pbderivedkey.rawAddress, cbderivedkey.toInt(), dwflags.toInt())

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(hhash.rawAddress)

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(hkey.rawAddress)

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(hsecret.rawAddress)

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(hhash.rawAddress, phnewhash.rawAddress, pbhashobject.rawAddress, cbhashobject.toInt(), dwflags.toInt())

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(hkey.rawAddress, phnewkey.rawAddress, pbkeyobject.rawAddress, cbkeyobject.toInt(), dwflags.toInt())

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEncrypt(hkey.rawAddress, pbinput.rawAddress, cbinput.toInt(), ppaddinginfo.rawAddress, pbiv.rawAddress, cbiv.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(dwalgoperations.toInt(), palgcount.rawAddress, ppalglist.rawAddress, dwflags.toInt())

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(dwtable.toInt(), pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr, ppimpllist: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(pszalgid.rawAddress, pimplcount.rawAddress, ppimpllist.rawAddress, dwflags.toInt())

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptExportKey(hkey.rawAddress, hexportkey.rawAddress, pszblobtype.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(hkey.rawAddress, dwflags.toInt())

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptFinishHash(hhash.rawAddress, pboutput.rawAddress, cboutput.toInt(), dwflags.toInt())

public actual fun bCryptFreeBuffer(pvbuffer: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(pvbuffer.rawAddress)
}

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptGenRandom(halgorithm.rawAddress, pbbuffer.rawAddress, cbbuffer.toInt(), dwflags.toInt())

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr, dwlength: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(halgorithm.rawAddress, phkey.rawAddress, dwlength.toInt(), dwflags.toInt())

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(halgorithm.rawAddress, phkey.rawAddress, pbkeyobject.rawAddress, cbkeyobject.toInt(), pbsecret.rawAddress, cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(pfenabled.rawAddress)

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptGetProperty(hobject.rawAddress, pszproperty.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr, cbsecret: UInt, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptHash(halgorithm.rawAddress, pbsecret.rawAddress, cbsecret.toInt(), pbinput.rawAddress, cbinput.toInt(), pboutput.rawAddress, cboutput.toInt())

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptHashData(hhash.rawAddress, pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptImportKey(halgorithm.rawAddress, himportkey.rawAddress, pszblobtype.rawAddress, phkey.rawAddress, pbkeyobject.rawAddress, cbkeyobject.toInt(), pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(halgorithm.rawAddress, himportkey.rawAddress, pszblobtype.rawAddress, phkey.rawAddress, pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(hkey.rawAddress, pparameterlist.rawAddress, pbderivedkey.rawAddress, cbderivedkey.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(phalgorithm.rawAddress, pszalgid.rawAddress, pszimplementation.rawAddress, dwflags.toInt())

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr, cboperations: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(hobject.rawAddress, operationtype, poperations.rawAddress, cboperations.toInt(), dwflags.toInt())

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(dwtable.toInt(), pszcontext.rawAddress, pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr, ppbvalue: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pszproperty.rawAddress, pcbvalue.rawAddress, ppbvalue.rawAddress)

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(pszprovider.rawAddress, dwmode.toInt(), dwinterface.toInt(), pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptRegisterConfigChangeNotify(phevent: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(phevent.rawAddress)

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(pszprovider.rawAddress, dwflags.toInt(), preg.rawAddress)

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress)

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pszprovider.rawAddress)

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pszprovider.rawAddress, dwmode.toInt(), dwflags.toInt(), pcbbuffer.rawAddress, ppbuffer.rawAddress)

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(hprivkey.rawAddress, hpubkey.rawAddress, phagreedsecret.rawAddress, dwflags.toInt())

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress, dwinterface.toInt(), pszfunction.rawAddress, pszproperty.rawAddress, cbvalue.toInt(), pbvalue.rawAddress)

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptSetProperty(hobject.rawAddress, pszproperty.rawAddress, pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptSignHash(hkey.rawAddress, ppaddinginfo.rawAddress, pbinput.rawAddress, cbinput.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(hevent.rawAddress)

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(pszprovider.rawAddress)

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbhash: ConstPtr, cbhash: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(hkey.rawAddress, ppaddinginfo.rawAddress, pbhash.rawAddress, cbhash.toInt(), pbsignature.rawAddress, cbsignature.toInt(), dwflags.toInt())

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(hcertstore.rawAddress, pcrlcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(hcertstore.rawAddress, pcrlcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(hcertstore.rawAddress, pctlcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(hcertstore.rawAddress, pctlcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(hcertstore.rawAddress, pcertcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(hcertstore.rawAddress, pcertcontext.rawAddress, dwadddisposition.toInt(), ppstorecontext.rawAddress)

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), pbcrlencoded.rawAddress, cbcrlencoded.toInt(), dwadddisposition.toInt(), ppcrlcontext.rawAddress)

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(hcertstore.rawAddress, dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress, cbctlencoded.toInt(), dwadddisposition.toInt(), ppctlcontext.rawAddress)

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), pbcertencoded.rawAddress, cbcertencoded.toInt(), dwadddisposition.toInt(), ppcertcontext.rawAddress)

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(szcertstorename.rawAddress, pbcertencoded.rawAddress, cbcertencoded.toInt())

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(szcertstorename.rawAddress, pbcertencoded.rawAddress, cbcertencoded.toInt())

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(pcertcontext.rawAddress, pszusageidentifier.rawAddress)

public actual fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(hserverocspresponse.rawAddress)
}

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(pserverocspresponsecontext.rawAddress)
}

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr, ppvcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(hcertstore.rawAddress, pbelement.rawAddress, cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), pdwcontexttype.rawAddress, ppvcontext.rawAddress)

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(hcollectionstore.rawAddress, hsiblingstore.rawAddress, dwupdateflags.toInt(), dwpriority.toInt())

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    ConstPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(dwalgid.toInt()))

public actual fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr, dwflags: UInt) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(hserverocspresponse.rawAddress, dwflags.toInt())
}

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCloseStore(hcertstore.rawAddress, dwflags.toInt())

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr, pcertid2: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCompareCertificate(dwcertencodingtype.toInt(), pcertid1.rawAddress, pcertid2.rawAddress)

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr, pcertname2: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(dwcertencodingtype.toInt(), pcertname1.rawAddress, pcertname2.rawAddress)

public actual fun certCompareIntegerBlob(pint1: ConstPtr, pint2: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(pint1.rawAddress, pint2.rawAddress)

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr, ppublickey2: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(dwcertencodingtype.toInt(), ppublickey1.rawAddress, ppublickey2.rawAddress)

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertControlStore(hcertstore.rawAddress, dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress)

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(dwcertencodingtype.toInt(), pbcrlencoded.rawAddress, cbcrlencoded.toInt()))

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr, cbctlencoded: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress, cbctlencoded.toInt()))

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr, coptattr: UInt, rgoptattr: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pctlentry: MutPtr, pcbctlentry: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(pcertcontext.rawAddress, coptattr.toInt(), rgoptattr.rawAddress, dwflags.toInt(), pvreserved.rawAddress, pctlentry.rawAddress, pcbctlentry.rawAddress)

public actual fun certCreateCertificateChainEngine(pconfig: ConstPtr, phchainengine: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(pconfig.rawAddress, phchainengine.rawAddress)

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(dwcertencodingtype.toInt(), pbcertencoded.rawAddress, cbcertencoded.toInt()))

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), pbencoded.rawAddress, cbencoded.toInt(), dwflags.toInt(), pcreatepara.rawAddress))

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr, psignaturealgorithm: ConstPtr, pstarttime: ConstPtr, pendtime: ConstPtr, pextensions: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(hcryptprovorncryptkey.toLong(), psubjectissuerblob.rawAddress, dwflags.toInt(), pkeyprovinfo.rawAddress, psignaturealgorithm.rawAddress, pstarttime.rawAddress, pendtime.rawAddress, pextensions.rawAddress))

public actual fun certDeleteCRLFromStore(pcrlcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(pcrlcontext.rawAddress)

public actual fun certDeleteCTLFromStore(pctlcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(pctlcontext.rawAddress)

public actual fun certDeleteCertificateFromStore(pcertcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(pcertcontext.rawAddress)

public actual fun certDuplicateCRLContext(pcrlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(pcrlcontext.rawAddress))

public actual fun certDuplicateCTLContext(pctlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(pctlcontext.rawAddress))

public actual fun certDuplicateCertificateChain(pchaincontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(pchaincontext.rawAddress))

public actual fun certDuplicateCertificateContext(pcertcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(pcertcontext.rawAddress))

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertDuplicateStore(hcertstore.rawAddress))

public actual fun certEnumCRLContextProperties(pcrlcontext: ConstPtr, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(pcrlcontext.rawAddress, dwpropid.toInt()).toUInt()

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(hcertstore.rawAddress, pprevcrlcontext.rawAddress))

public actual fun certEnumCTLContextProperties(pctlcontext: ConstPtr, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(pctlcontext.rawAddress, dwpropid.toInt()).toUInt()

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(hcertstore.rawAddress, pprevctlcontext.rawAddress))

public actual fun certEnumCertificateContextProperties(pcertcontext: ConstPtr, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(pcertcontext.rawAddress, dwpropid.toInt()).toUInt()

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(hcertstore.rawAddress, pprevcertcontext.rawAddress))

public actual fun certEnumPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumPhysicalStore): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(pvsystemstore.rawAddress, dwflags.toInt(), pvarg.rawAddress, 0L)

public actual fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr, ppvnextsubject: MutPtr, psubjectidentifier: MutPtr, pencodedattributes: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(pctlcontext.rawAddress, ppvnextsubject.rawAddress, psubjectidentifier.rawAddress, pencodedattributes.rawAddress)

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStore): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(dwflags.toInt(), pvsystemstorelocationpara.rawAddress, pvarg.rawAddress, 0L)

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(dwflags.toInt(), pvarg.rawAddress, 0L)

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindAttribute(pszobjid.rawAddress, cattr.toInt(), rgattr.rawAddress))

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr, pprevcrlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress, pprevcrlcontext.rawAddress))

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr, pprevctlcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(hcertstore.rawAddress, dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress, pprevctlcontext.rawAddress))

public actual fun certFindCertificateInCRL(pcert: ConstPtr, pcrlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppcrlentry: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(pcert.rawAddress, pcrlcontext.rawAddress, dwflags.toInt(), pvreserved.rawAddress, ppcrlentry.rawAddress)

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr, pprevcertcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress, pprevcertcontext.rawAddress))

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr, pprevchaincontext: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindChainInStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress, pprevchaincontext.rawAddress))

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindExtension(pszobjid.rawAddress, cextensions.toInt(), rgextensions.rawAddress))

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(pszobjid.rawAddress, pname.rawAddress))

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress, pctlcontext.rawAddress, dwflags.toInt()))

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pencodedattributes: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(psubjectidentifier.rawAddress, pctlcontext.rawAddress, dwflags.toInt(), pvreserved.rawAddress, pencodedattributes.rawAddress)

public actual fun certFreeCRLContext(pcrlcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(pcrlcontext.rawAddress)

public actual fun certFreeCTLContext(pctlcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(pctlcontext.rawAddress)

public actual fun certFreeCertificateChain(pchaincontext: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(pchaincontext.rawAddress)
}

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(hchainengine.rawAddress)
}

public actual fun certFreeCertificateChainList(prgpselection: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(prgpselection.rawAddress)
}

public actual fun certFreeCertificateContext(pcertcontext: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(pcertcontext.rawAddress)

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(pserverocspresponsecontext.rawAddress)
}

public actual fun certGetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(pcrlcontext.rawAddress, dwpropid.toInt(), pvdata.rawAddress, pcbdata.rawAddress)

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr, pprevcrlcontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(hcertstore.rawAddress, pissuercontext.rawAddress, pprevcrlcontext.rawAddress, pdwflags.rawAddress))

public actual fun certGetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(pctlcontext.rawAddress, dwpropid.toInt(), pvdata.rawAddress, pcbdata.rawAddress)

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr, ptime: ConstPtr, hadditionalstore: Hcertstore, pchainpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppchaincontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(hchainengine.rawAddress, pcertcontext.rawAddress, ptime.rawAddress, hadditionalstore.rawAddress, pchainpara.rawAddress, dwflags.toInt(), pvreserved.rawAddress, ppchaincontext.rawAddress)

public actual fun certGetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(pcertcontext.rawAddress, dwpropid.toInt(), pvdata.rawAddress, pcbdata.rawAddress)

public actual fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr, dwflags: UInt, pusage: MutPtr, pcbusage: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(pcertcontext.rawAddress, dwflags.toInt(), pusage.rawAddress, pcbusage.rawAddress)

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr, pbkeyusage: MutPtr, cbkeyusage: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(dwcertencodingtype.toInt(), pcertinfo.rawAddress, pbkeyusage.rawAddress, cbkeyusage.toInt())

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr, pprevissuercontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(hcertstore.rawAddress, psubjectcontext.rawAddress, pprevissuercontext.rawAddress, pdwflags.rawAddress))

public actual fun certGetNameStringA(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pstr, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetNameStringA(pcertcontext.rawAddress, dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress, psznamestring.rawAddress, cchnamestring.toInt()).toUInt()

public actual fun certGetNameStringW(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetNameStringW(pcertcontext.rawAddress, dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress, psznamestring.rawAddress, cchnamestring.toInt()).toUInt()

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(dwcertencodingtype.toInt(), ppublickey.rawAddress).toUInt()

public actual fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(hserverocspresponse.rawAddress, dwflags.toInt(), pvreserved.rawAddress))

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(hcertstore.rawAddress, dwpropid.toInt(), pvdata.rawAddress, pcbdata.rawAddress)

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(hcertstore.rawAddress, dwcertencodingtype.toInt(), pcertid.rawAddress))

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr, cnumoids: MutPtr, rghoids: MutPtr, pcboids: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertGetValidUsages(ccerts.toInt(), rghcerts.rawAddress, cnumoids.rawAddress, rghoids.rawAddress, pcboids.rawAddress)

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr, prdn: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), pcertname.rawAddress, prdn.rawAddress)

public actual fun certIsStrongHashToSign(pstrongsignpara: ConstPtr, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(pstrongsignpara.rawAddress, pwszcnghashalgid.rawAddress, psigningcert.rawAddress)

public actual fun certIsValidCRLForCertificate(pcert: ConstPtr, pcrl: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(pcert.rawAddress, pcrl.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr, ptimestamp: ConstPtr, pwszfilename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertIsWeakHash(dwhashusetype.toInt(), pwszcnghashalgid.rawAddress, dwchainflags.toInt(), psignerchaincontext.rawAddress, ptimestamp.rawAddress, pwszfilename.rawAddress)

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertNameToStrA(dwcertencodingtype.toInt(), pname.rawAddress, dwstrtype.toInt(), psz.rawAddress, csz.toInt()).toUInt()

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertNameToStrW(dwcertencodingtype.toInt(), pname.rawAddress, dwstrtype.toInt(), psz.rawAddress, csz.toInt()).toUInt()

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(pszobjid.rawAddress).toUInt()

public actual fun certOpenServerOcspResponse(pchaincontext: ConstPtr, dwflags: UInt, popenpara: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(pchaincontext.rawAddress, dwflags.toInt(), popenpara.rawAddress))

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertOpenStore(lpszstoreprovider.rawAddress, dwencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), pvpara.rawAddress))

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(hprov.toLong(), szsubsystemprotocol.rawAddress))

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(hprov.toLong(), szsubsystemprotocol.rawAddress))

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(dwvaluetype.toInt(), pvalue.rawAddress, psz.rawAddress, csz.toInt()).toUInt()

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pwstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(dwvaluetype.toInt(), pvalue.rawAddress, psz.rawAddress, csz.toInt()).toUInt()

public actual fun certRegisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(pvsystemstore.rawAddress, dwflags.toInt(), pwszstorename.rawAddress, pstoreinfo.rawAddress, pvreserved.rawAddress)

public actual fun certRegisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(pvsystemstore.rawAddress, dwflags.toInt(), pstoreinfo.rawAddress, pvreserved.rawAddress)

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(pcertcontext.rawAddress, pszusageidentifier.rawAddress)

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(hcollectionstore.rawAddress, hsiblingstore.rawAddress)
}

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(hchainengine.rawAddress)

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr, ppbdata: MutPtr, pcbdata: MutPtr, ppwszmimetype: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(pcertcontext.rawAddress, lpszlogoorbiometrictype.rawAddress, dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), pvreserved.rawAddress, ppbdata.rawAddress, pcbdata.rawAddress, ppwszmimetype.rawAddress)

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSaveStore(hcertstore.rawAddress, dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), pvsavetopara.rawAddress, dwflags.toInt())

public actual fun certSelectCertificateChains(pselectioncontext: ConstPtr, dwflags: UInt, pchainparameters: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, hstore: Hcertstore, pcselection: MutPtr, pprgpselection: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(pselectioncontext.rawAddress, dwflags.toInt(), pchainparameters.rawAddress, ccriteria.toInt(), rgpcriteria.rawAddress, hstore.rawAddress, pcselection.rawAddress, pprgpselection.rawAddress)

public actual fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(pcrlcontext.rawAddress, dwflags.toInt(), pbelement.rawAddress, pcbelement.rawAddress)

public actual fun certSerializeCTLStoreElement(pctlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(pctlcontext.rawAddress, dwflags.toInt(), pbelement.rawAddress, pcbelement.rawAddress)

public actual fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(pcertcontext.rawAddress, dwflags.toInt(), pbelement.rawAddress, pcbelement.rawAddress)

public actual fun certSetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(pcrlcontext.rawAddress, dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress)

public actual fun certSetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(pctlcontext.rawAddress, dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress)

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr, pctlentry: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(pcertcontext.rawAddress, pctlentry.rawAddress, dwflags.toInt())

public actual fun certSetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(pcertcontext.rawAddress, dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress)

public actual fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr, pusage: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(pcertcontext.rawAddress, pusage.rawAddress)

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(hcertstore.rawAddress, dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress)

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertStrToNameA(dwcertencodingtype.toInt(), pszx500.rawAddress, dwstrtype.toInt(), pvreserved.rawAddress, pbencoded.rawAddress, pcbencoded.rawAddress, ppszerror.rawAddress)

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertStrToNameW(dwcertencodingtype.toInt(), pszx500.rawAddress, dwstrtype.toInt(), pvreserved.rawAddress, pbencoded.rawAddress, pcbencoded.rawAddress, ppszerror.rawAddress)

public actual fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(pvsystemstore.rawAddress, dwflags.toInt(), pwszstorename.rawAddress)

public actual fun certUnregisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(pvsystemstore.rawAddress, dwflags.toInt())

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr, ccrlinfo: UInt, rgpcrlinfo: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(dwcertencodingtype.toInt(), pcertid.rawAddress, ccrlinfo.toInt(), rgpcrlinfo.rawAddress)

public actual fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr, pcrlinfo: ConstPtr): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(ptimetoverify.rawAddress, pcrlinfo.rawAddress)

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, psubjectusage: ConstPtr, dwflags: UInt, pverifyusagepara: ConstPtr, pverifyusagestatus: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress, psubjectusage.rawAddress, dwflags.toInt(), pverifyusagepara.rawAddress, pverifyusagestatus.rawAddress)

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr, ppolicypara: ConstPtr, ppolicystatus: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(pszpolicyoid.rawAddress, pchaincontext.rawAddress, ppolicypara.rawAddress, ppolicystatus.rawAddress)

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr, dwflags: UInt, prevpara: ConstPtr, prevstatus: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), rgpvcontext.rawAddress, dwflags.toInt(), prevpara.rawAddress, prevstatus.rawAddress)

public actual fun certVerifySubjectCertificateContext(psubject: ConstPtr, pissuer: ConstPtr, pdwflags: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(psubject.rawAddress, pissuer.rawAddress, pdwflags.rawAddress)

public actual fun certVerifyTimeValidity(ptimetoverify: ConstPtr, pcertinfo: ConstPtr): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(ptimetoverify.rawAddress, pcertinfo.rawAddress)

public actual fun certVerifyValidityNesting(psubjectinfo: ConstPtr, pissuerinfo: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(psubjectinfo.rawAddress, pissuerinfo.rawAddress)

public actual fun closeCryptoHandle(hcrypto: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(hcrypto.rawAddress)

public actual fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr, dwflags: CryptAcquireFlags, pvparameters: ConstPtr, phcryptprovorncryptkey: MutPtr, pdwkeyspec: MutPtr, pfcallerfreeprovorncryptkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(pcert.rawAddress, dwflags.toInt(), pvparameters.rawAddress, phcryptprovorncryptkey.rawAddress, pdwkeyspec.rawAddress, pfcallerfreeprovorncryptkey.rawAddress)

public actual fun cryptAcquireContextA(phprov: MutPtr, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(phprov.rawAddress, szcontainer.rawAddress, szprovider.rawAddress, dwprovtype.toInt(), dwflags.toInt())

public actual fun cryptAcquireContextW(phprov: MutPtr, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(phprov.rawAddress, szcontainer.rawAddress, szprovider.rawAddress, dwprovtype.toInt(), dwflags.toInt())

public actual fun cryptBinaryToStringA(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(pbbinary.rawAddress, cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress, pcchstring.rawAddress)

public actual fun cryptBinaryToStringW(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(pbbinary.rawAddress, cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress, pcchstring.rawAddress)

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync)

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptContextAddRef(hprov.toLong(), pdwreserved.rawAddress, dwflags.toInt())

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(dwflags.toInt(), phasync.rawAddress)

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptCreateHash(hprov.toLong(), algid.toInt(), hkey.toLong(), dwflags.toInt(), phhash.rawAddress)

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr, pbhash: MutPtr, pcbhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), pszpubkeyoid.rawAddress, ppubkeystruc.rawAddress, cbpubkeystruc.toInt(), dwflags.toInt(), pvreserved.rawAddress, pbhash.rawAddress, pcbhash.rawAddress)

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencodedblob: ConstPtr, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr, pdwinnercontenttype: MutPtr, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(dwmsgtypeflags.toInt(), pdecryptpara.rawAddress, pverifypara.rawAddress, dwsignerindex.toInt(), pbencodedblob.rawAddress, cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), pdwmsgtype.rawAddress, pdwinnercontenttype.rawAddress, pbdecoded.rawAddress, pcbdecoded.rawAddress, ppxchgcert.rawAddress, ppsignercert.rawAddress)

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress, pbencoded.rawAddress, cbencoded.toInt(), dwflags.toInt(), pvstructinfo.rawAddress, pcbstructinfo.rawAddress)

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress, pbencoded.rawAddress, cbencoded.toInt(), dwflags.toInt(), pdecodepara.rawAddress, pvstructinfo.rawAddress, pcbstructinfo.rawAddress)

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress)

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(pdecryptpara.rawAddress, pverifypara.rawAddress, dwsignerindex.toInt(), pbencryptedblob.rawAddress, cbencryptedblob.toInt(), pbdecrypted.rawAddress, pcbdecrypted.rawAddress, ppxchgcert.rawAddress, ppsignercert.rawAddress)

public actual fun cryptDecryptMessage(pdecryptpara: ConstPtr, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(pdecryptpara.rawAddress, pbencryptedblob.rawAddress, cbencryptedblob.toInt(), pbdecrypted.rawAddress, pcbdecrypted.rawAddress, ppxchgcert.rawAddress)

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDeriveKey(hprov.toLong(), algid.toInt(), hbasedata.toLong(), dwflags.toInt(), phkey.rawAddress)

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash.toLong())

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey.toLong())

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr, dwflags: UInt, phhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(hhash.toLong(), pdwreserved.rawAddress, dwflags.toInt(), phhash.rawAddress)

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr, dwflags: UInt, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(hkey.toLong(), pdwreserved.rawAddress, dwflags.toInt(), phkey.rawAddress)

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEncodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress, pvstructinfo.rawAddress, pbencoded.rawAddress, pcbencoded.rawAddress)

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr, pvencoded: MutPtr, pcbencoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress, pvstructinfo.rawAddress, dwflags.toInt(), pencodepara.rawAddress, pvencoded.rawAddress, pcbencoded.rawAddress)

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwbuflen: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEncrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress, dwbuflen.toInt())

public actual fun cryptEncryptMessage(pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobeencrypted: ConstPtr, cbtobeencrypted: UInt, pbencryptedblob: MutPtr, pcbencryptedblob: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(pencryptpara.rawAddress, crecipientcert.toInt(), rgprecipientcert.rawAddress, pbtobeencrypted.rawAddress, cbtobeencrypted.toInt(), pbencryptedblob.rawAddress, pcbencryptedblob.rawAddress)

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvarg: MutPtr, pfnenum: PfnCryptEnumKeyidProp): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(pkeyidentifier.rawAddress, dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress, pvreserved.rawAddress, pvarg.rawAddress, 0L)

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress, pszoid.rawAddress, dwflags.toInt(), pvarg.rawAddress, 0L)

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress, 0L)

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pstr, pcbtypename: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(dwindex.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pdwprovtype.rawAddress, sztypename.rawAddress, pcbtypename.rawAddress)

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pwstr, pcbtypename: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(dwindex.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pdwprovtype.rawAddress, sztypename.rawAddress, pcbtypename.rawAddress)

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pstr, pcbprovname: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(dwindex.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pdwprovtype.rawAddress, szprovname.rawAddress, pcbprovname.rawAddress)

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pwstr, pcbprovname: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(dwindex.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pdwprovtype.rawAddress, szprovname.rawAddress, pcbprovname.rawAddress)

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptExportKey(hkey.toLong(), hexpkey.toLong(), dwblobtype.toInt(), dwflags.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress)

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pbprivatekeyblob: MutPtr, pcbprivatekeyblob: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(hcryptprov.toLong(), dwkeyspec.toInt(), pszprivatekeyobjid.rawAddress, dwflags.toInt(), pvauxinfo.rawAddress, pbprivatekeyblob.rawAddress, pcbprivatekeyblob.rawAddress)

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress, pcbinfo.rawAddress)

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress, dwflags.toInt(), pvauxinfo.rawAddress, pinfo.rawAddress, pcbinfo.rawAddress)

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey.rawAddress, dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress, dwflags.toInt(), pvauxinfo.rawAddress, pinfo.rawAddress, pcbinfo.rawAddress)

public actual fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr, dwflags: CryptFindFlags, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(pcert.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(pwszcryptname.rawAddress))

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr, dwgroupid: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(dwkeytype.toInt(), pvkey.rawAddress, dwgroupid.toInt()))

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, pbformat: MutPtr, pcbformat: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), pformatstruct.rawAddress, lpszstructtype.rawAddress, pbencoded.rawAddress, cbencoded.toInt(), pbformat.rawAddress, pcbformat.rawAddress)

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(hfuncaddr.rawAddress, dwflags.toInt())

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGenKey(hprov.toLong(), algid.toInt(), dwflags.toInt(), phkey.rawAddress)

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGenRandom(hprov.toLong(), dwlen.toInt(), pbbuffer.rawAddress)

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr, ppfnfree: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(hasync, pszparamoid.rawAddress, ppvparam.rawAddress, ppfnfree.rawAddress)

public actual fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(hfuncset.rawAddress, dwencodingtype.toInt(), pwszdlllist.rawAddress, pcchdlllist.rawAddress)

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(hfuncset.rawAddress, dwencodingtype.toInt(), pwszdll.rawAddress, dwflags.toInt(), ppvfuncaddr.rawAddress, phfuncaddr.rawAddress)

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(dwprovtype.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pszprovname.rawAddress, pcbprovname.rawAddress)

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(dwprovtype.toInt(), pdwreserved.rawAddress, dwflags.toInt(), pszprovname.rawAddress, pcbprovname.rawAddress)

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetHashParam(hhash.toLong(), dwparam.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress, dwflags.toInt())

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(pkeyidentifier.rawAddress, dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress, pvreserved.rawAddress, pvdata.rawAddress, pcbdata.rawAddress)

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(hkey.toLong(), dwparam.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress, dwflags.toInt())

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), pbsignedblob.rawAddress, cbsignedblob.toInt()))

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(dwmsgencodingtype.toInt(), pbsignedblob.rawAddress, cbsignedblob.toInt())

public actual fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(hfuncset.rawAddress, dwencodingtype.toInt(), pszoid.rawAddress, dwflags.toInt(), ppvfuncaddr.rawAddress, phfuncaddr.rawAddress)

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr, pbvaluedata: MutPtr, pcbvaluedata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress, pszoid.rawAddress, pwszvaluename.rawAddress, pdwvaluetype.rawAddress, pbvaluedata.rawAddress, pcbvaluedata.rawAddress)

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr, dwflags: CryptGetUrlFlags, purlarray: MutPtr, pcburlarray: MutPtr, purlinfo: MutPtr, pcburlinfo: MutPtr, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(pszurloid.rawAddress, pvpara.rawAddress, dwflags.toInt(), purlarray.rawAddress, pcburlarray.rawAddress, purlinfo.rawAddress, pcburlinfo.rawAddress, pvreserved.rawAddress)

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetProvParam(hprov.toLong(), dwparam.toInt(), pbdata.rawAddress, pdwdatalen.rawAddress, dwflags.toInt())

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptGetUserKey(hprov.toLong(), dwkeyspec.toInt(), phuserkey.rawAddress)

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), pbencoded.rawAddress, cbencoded.toInt(), pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(pwszcnghashalgid.rawAddress, dwflags.toInt(), pvreserved.rawAddress, pbencoded.rawAddress, cbencoded.toInt(), pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptHashData(hhash: ULong, pbdata: ConstPtr, dwdatalen: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashData(hhash.toLong(), pbdata.rawAddress, dwdatalen.toInt(), dwflags.toInt())

public actual fun cryptHashMessage(phashpara: ConstPtr, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbhashedblob: MutPtr, pcbhashedblob: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashMessage(phashpara.rawAddress, fdetachedhash, ctobehashed.toInt(), rgpbtobehashed.rawAddress, rgcbtobehashed.rawAddress, pbhashedblob.rawAddress, pcbhashedblob.rawAddress, pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress, pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash.toLong(), hkey.toLong(), dwflags.toInt())

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(hcryptprov.toLong(), dwcertencodingtype.toInt(), pbencoded.rawAddress, cbencoded.toInt(), pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptImportKey(hprov: ULong, pbdata: ConstPtr, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptImportKey(hprov.toLong(), pbdata.rawAddress, dwdatalen.toInt(), hpubkey.toLong(), dwflags.toInt(), phkey.rawAddress)

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr, pvauxinfo: ConstPtr): Bool =
    0

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(hcryptprov.toLong(), dwcertencodingtype.toInt(), pinfo.rawAddress, phkey.rawAddress)

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), pinfo.rawAddress, aikeyalg.toInt(), dwflags.toInt(), pvauxinfo.rawAddress, phkey.rawAddress)

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), pinfo.rawAddress, dwflags.toInt(), pvauxinfo.rawAddress, phkey.rawAddress)

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(pszfuncname.rawAddress, dwflags.toInt()))

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(0L, pvarg.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr, phdefaultcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(hcryptprov.toLong(), dwdefaulttype.toInt(), pvdefaultpara.rawAddress, dwflags.toInt(), pvreserved.rawAddress, phdefaultcontext.rawAddress)

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(hmodule.rawAddress, dwencodingtype.toInt(), pszfuncname.rawAddress, cfuncentry.toInt(), rgfuncentry.rawAddress, dwflags.toInt())

public actual fun cryptMemAlloc(cbsize: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMemAlloc(cbsize.toInt()))

public actual fun cryptMemFree(pv: ConstPtr) {
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMemFree(pv.rawAddress)
}

public actual fun cryptMemRealloc(pv: ConstPtr, cbsize: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMemRealloc(pv.rawAddress, cbsize.toInt()))

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress, pszinnercontentobjid.rawAddress, cbdata.toInt()).toUInt()

public actual fun cryptMsgClose(hcryptmsg: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgClose(hcryptmsg.rawAddress)

public actual fun cryptMsgControl(hcryptmsg: ConstPtr, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgControl(hcryptmsg.rawAddress, dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress)

public actual fun cryptMsgCountersign(hcryptmsg: ConstPtr, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(hcryptmsg.rawAddress, dwindex.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress)

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr, pbcountersignature: MutPtr, pcbcountersignature: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(dwencodingtype.toInt(), pbsignerinfo.rawAddress, cbsignerinfo.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress, pbcountersignature.rawAddress, pcbcountersignature.rawAddress)

public actual fun cryptMsgDuplicate(hcryptmsg: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(hcryptmsg.rawAddress))

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), pctlinfo.rawAddress, psigninfo.rawAddress, dwflags.toInt(), pbencoded.rawAddress, pcbencoded.rawAddress)

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr, csignerstore: UInt, rghsignerstore: ConstPtr, dwflags: UInt, ppsigner: MutPtr, pdwsignerindex: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(hcryptmsg.rawAddress, csignerstore.toInt(), rghsignerstore.rawAddress, dwflags.toInt(), ppsigner.rawAddress, pdwsignerindex.rawAddress)

public actual fun cryptMsgGetParam(hcryptmsg: ConstPtr, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(hcryptmsg.rawAddress, dwparamtype.toInt(), dwindex.toInt(), pvdata.rawAddress, pcbdata.rawAddress)

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr, pstreaminfo: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toLong(), precipientinfo.rawAddress, pstreaminfo.rawAddress))

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress, pszinnercontentobjid.rawAddress, pstreaminfo.rawAddress))

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr, cbctlcontent: UInt, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(dwmsgencodingtype.toInt(), pbctlcontent.rawAddress, cbctlcontent.toInt(), psigninfo.rawAddress, dwflags.toInt(), pbencoded.rawAddress, pcbencoded.rawAddress)

public actual fun cryptMsgUpdate(hcryptmsg: ConstPtr, pbdata: ConstPtr, cbdata: UInt, ffinal: Bool): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(hcryptmsg.rawAddress, pbdata.rawAddress, cbdata.toInt(), ffinal)

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(hcryptprov.toLong(), dwencodingtype.toInt(), pbsignerinfo.rawAddress, cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress, cbsignerinfocountersignature.toInt(), pcicountersigner.rawAddress)

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr, dwflags: UInt, pvextra: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toLong(), dwencodingtype.toInt(), pbsignerinfo.rawAddress, cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress, cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), pvsigner.rawAddress, dwflags.toInt(), pvextra.rawAddress)

public actual fun cryptProtectData(pdatain: ConstPtr, szdatadescr: Pcwstr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptProtectData(pdatain.rawAddress, szdatadescr.rawAddress, poptionalentropy.rawAddress, pvreserved.rawAddress, ppromptstruct.rawAddress, dwflags.toInt(), pdataout.rawAddress)

public actual fun cryptProtectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptProtectMemory(pdatain.rawAddress, cbdatain.toInt(), dwflags.toInt())

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr, pdwcontenttype: MutPtr, pdwformattype: MutPtr, phcertstore: MutPtr, phmsg: MutPtr, ppvcontext: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptQueryObject(dwobjecttype.toInt(), pvobject.rawAddress, dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), pdwmsgandcertencodingtype.rawAddress, pdwcontenttype.rawAddress, pdwformattype.rawAddress, phcertstore.rawAddress, phmsg.rawAddress, ppvcontext.rawAddress)

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress, dwindex.toInt(), pwszdll.rawAddress)

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress, pszoid.rawAddress, pwszdll.rawAddress, pszoverridefuncname.rawAddress)

public actual fun cryptRegisterOIDInfo(pinfo: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(pinfo.rawAddress, dwflags.toInt())

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov.toLong(), dwflags.toInt())

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(pszurl.rawAddress, pszobjectoid.rawAddress, dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress, hasyncretrieve, pcredentials.rawAddress, pvverify.rawAddress, pauxinfo.rawAddress)

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(pszurl.rawAddress, pszobjectoid.rawAddress, dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress, hasyncretrieve, pcredentials.rawAddress, pvverify.rawAddress, pauxinfo.rawAddress)

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr, pbdata: ConstPtr, cbdata: UInt, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(wszurl.rawAddress, dwretrievalflags.toInt(), dwtimeout.toInt(), pszhashid.rawAddress, ppara.rawAddress, pbdata.rawAddress, cbdata.toInt(), pptscontext.rawAddress, pptssigner.rawAddress, phstore.rawAddress)

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(hasync, pszparamoid.rawAddress, pvparam.rawAddress, 0L)

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetHashParam(hhash.toLong(), dwparam.toInt(), pbdata.rawAddress, dwflags.toInt())

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(pkeyidentifier.rawAddress, dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress, pvreserved.rawAddress, pvdata.rawAddress)

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(hkey.toLong(), dwparam.toInt(), pbdata.rawAddress, dwflags.toInt())

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr, cbvaluedata: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress, pszoid.rawAddress, pwszvaluename.rawAddress, dwvaluetype.toInt(), pbvaluedata.rawAddress, cbvaluedata.toInt())

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetProvParam(hprov.toLong(), dwparam.toInt(), pbdata.rawAddress, dwflags.toInt())

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetProviderA(pszprovname.rawAddress, dwprovtype.toInt())

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(pszprovname.rawAddress, dwprovtype.toInt(), pdwreserved.rawAddress, dwflags.toInt())

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(pszprovname.rawAddress, dwprovtype.toInt(), pdwreserved.rawAddress, dwflags.toInt())

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSetProviderW(pszprovname.rawAddress, dwprovtype.toInt())

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), lpszstructtype.rawAddress, pvstructinfo.rawAddress, psignaturealgorithm.rawAddress, pvhashauxinfo.rawAddress, pbencoded.rawAddress, pcbencoded.rawAddress)

public actual fun cryptSignAndEncryptMessage(psignpara: ConstPtr, pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobesignedandencrypted: ConstPtr, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr, pcbsignedandencryptedblob: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(psignpara.rawAddress, pencryptpara.rawAddress, crecipientcert.toInt(), rgprecipientcert.rawAddress, pbtobesignedandencrypted.rawAddress, cbtobesignedandencrypted.toInt(), pbsignedandencryptedblob.rawAddress, pcbsignedandencryptedblob.rawAddress)

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbsignature: MutPtr, pcbsignature: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pbencodedtobesigned.rawAddress, cbencodedtobesigned.toInt(), psignaturealgorithm.rawAddress, pvhashauxinfo.rawAddress, pbsignature.rawAddress, pcbsignature.rawAddress)

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignHashA(hhash.toLong(), dwkeyspec.toInt(), szdescription.rawAddress, dwflags.toInt(), pbsignature.rawAddress, pdwsiglen.rawAddress)

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignHashW(hhash.toLong(), dwkeyspec.toInt(), szdescription.rawAddress, dwflags.toInt(), pbsignature.rawAddress, pdwsiglen.rawAddress)

public actual fun cryptSignMessage(psignpara: ConstPtr, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignMessage(psignpara.rawAddress, fdetachedsignature, ctobesigned.toInt(), rgpbtobesigned.rawAddress, rgcbtobesigned.rawAddress, pbsignedblob.rawAddress, pcbsignedblob.rawAddress)

public actual fun cryptSignMessageWithKey(psignpara: ConstPtr, pbtobesigned: ConstPtr, cbtobesigned: UInt, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(psignpara.rawAddress, pbtobesigned.rawAddress, cbtobesigned.toInt(), pbsignedblob.rawAddress, pcbsignedblob.rawAddress)

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(pszstring.rawAddress, cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress, pcbbinary.rawAddress, pdwskip.rawAddress, pdwflags.rawAddress)

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(pszstring.rawAddress, cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress, pcbbinary.rawAddress, pdwskip.rawAddress, pdwflags.rawAddress)

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(dwflags.toInt(), pvreserved.rawAddress)

public actual fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(hdefaultcontext.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun cryptUnprotectData(pdatain: ConstPtr, ppszdatadescr: MutPtr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUnprotectData(pdatain.rawAddress, ppszdatadescr.rawAddress, poptionalentropy.rawAddress, pvreserved.rawAddress, ppromptstruct.rawAddress, dwflags.toInt(), pdataout.rawAddress)

public actual fun cryptUnprotectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(pdatain.rawAddress, cbdatain.toInt(), dwflags.toInt())

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress, pwszdll.rawAddress)

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress, pszoid.rawAddress)

public actual fun cryptUnregisterOIDInfo(pinfo: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(pinfo.rawAddress)

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr, pdwfailurecount: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(poldsid.rawAddress, pwszoldpassword.rawAddress, dwflags.toInt(), pdwsuccesscount.rawAddress, pdwfailurecount.rawAddress)

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, ppublickey: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(hcryptprov.toLong(), dwcertencodingtype.toInt(), pbencoded.rawAddress, cbencoded.toInt(), ppublickey.rawAddress)

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr, dwissuertype: UInt, pvissuer: ConstPtr, dwflags: CryptVerifyCertFlags, pvextra: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress, dwissuertype.toInt(), pvissuer.rawAddress, dwflags.toInt(), pvextra.rawAddress)

public actual fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr, pbdetachedhashblob: ConstPtr, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(phashpara.rawAddress, pbdetachedhashblob.rawAddress, cbdetachedhashblob.toInt(), ctobehashed.toInt(), rgpbtobehashed.rawAddress, rgcbtobehashed.rawAddress, pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, ppsignercert: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(pverifypara.rawAddress, dwsignerindex.toInt(), pbdetachedsignblob.rawAddress, cbdetachedsignblob.toInt(), ctobesigned.toInt(), rgpbtobesigned.rawAddress, rgcbtobesigned.rawAddress, ppsignercert.rawAddress)

public actual fun cryptVerifyMessageHash(phashpara: ConstPtr, pbhashedblob: ConstPtr, cbhashedblob: UInt, pbtobehashed: MutPtr, pcbtobehashed: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(phashpara.rawAddress, pbhashedblob.rawAddress, cbhashedblob.toInt(), pbtobehashed.rawAddress, pcbtobehashed.rawAddress, pbcomputedhash.rawAddress, pcbcomputedhash.rawAddress)

public actual fun cryptVerifyMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppsignercert: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(pverifypara.rawAddress, dwsignerindex.toInt(), pbsignedblob.rawAddress, cbsignedblob.toInt(), pbdecoded.rawAddress, pcbdecoded.rawAddress, ppsignercert.rawAddress)

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr, ppublickeyinfo: ConstPtr, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(pverifypara.rawAddress, ppublickeyinfo.rawAddress, pbsignedblob.rawAddress, cbsignedblob.toInt(), pbdecoded.rawAddress, pcbdecoded.rawAddress)

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(hhash.toLong(), pbsignature.rawAddress, dwsiglen.toInt(), hpubkey.toLong(), szdescription.rawAddress, dwflags.toInt())

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(hhash.toLong(), pbsignature.rawAddress, dwsiglen.toInt(), hpubkey.toLong(), szdescription.rawAddress, dwflags.toInt())

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr, cbtscontentinfo: UInt, pbdata: ConstPtr, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(pbtscontentinfo.rawAddress, cbtscontentinfo.toInt(), pbdata.rawAddress, cbdata.toInt(), hadditionalstore.rawAddress, pptscontext.rawAddress, pptssigner.rawAddress, phstore.rawAddress)

public actual fun cryptXmlAddObject(hsignatureorobject: ConstPtr, dwflags: UInt, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, ppobject: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(hsignatureorobject.rawAddress, dwflags.toInt(), rgproperty.rawAddress, cproperty.toInt(), pencoded.rawAddress, ppobject.rawAddress)

public actual fun cryptXmlClose(hcryptxml: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlClose(hcryptxml.rawAddress)

public actual fun cryptXmlCreateReference(hcryptxml: ConstPtr, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr, ctransform: UInt, rgtransform: ConstPtr, phreference: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(hcryptxml.rawAddress, dwflags.toInt(), wszid.rawAddress, wszuri.rawAddress, wsztype.rawAddress, pdigestmethod.rawAddress, ctransform.toInt(), rgtransform.rawAddress, phreference.rawAddress)

public actual fun cryptXmlDigestReference(hreference: ConstPtr, dwflags: UInt, pdataproviderin: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(hreference.rawAddress, dwflags.toInt(), pdataproviderin.rawAddress)

public actual fun cryptXmlEncode(hcryptxml: ConstPtr, dwcharset: CryptXmlCharset, rgproperty: ConstPtr, cproperty: UInt, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlEncode(hcryptxml.rawAddress, dwcharset, rgproperty.rawAddress, cproperty.toInt(), pvcallbackstate.rawAddress, 0L)

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress, 0L)

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr, dwgroupid: UInt, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), pvfindby.rawAddress, dwgroupid.toInt(), dwflags.toInt()))

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr, dwflags: CryptXmlFlags, ppalginfo: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(pxmlalgorithm.rawAddress, dwflags.toInt(), ppalginfo.rawAddress)

public actual fun cryptXmlGetDocContext(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(hcryptxml.rawAddress, ppstruct.rawAddress)

public actual fun cryptXmlGetReference(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(hcryptxml.rawAddress, ppstruct.rawAddress)

public actual fun cryptXmlGetSignature(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(hcryptxml.rawAddress, ppstruct.rawAddress)

public actual fun cryptXmlGetStatus(hcryptxml: ConstPtr, pstatus: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(hcryptxml.rawAddress, pstatus.rawAddress)

public actual fun cryptXmlGetTransforms(ppconfig: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(ppconfig.rawAddress)

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr, phkey: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(dwflags.toInt(), pkeyvalue.rawAddress, phkey.rawAddress)

public actual fun cryptXmlOpenToDecode(pconfig: ConstPtr, dwflags: CryptXmlFlags, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phcryptxml: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(pconfig.rawAddress, dwflags.toInt(), rgproperty.rawAddress, cproperty.toInt(), pencoded.rawAddress, phcryptxml.rawAddress)

public actual fun cryptXmlOpenToEncode(pconfig: ConstPtr, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phsignature: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(pconfig.rawAddress, dwflags.toInt(), wszid.rawAddress, rgproperty.rawAddress, cproperty.toInt(), pencoded.rawAddress, phsignature.rawAddress)

public actual fun cryptXmlSetHMACSecret(hsignature: ConstPtr, pbsecret: ConstPtr, cbsecret: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(hsignature.rawAddress, pbsecret.rawAddress, cbsecret.toInt())

public actual fun cryptXmlSign(hsignature: ConstPtr, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr, psignaturemethod: ConstPtr, pcanonicalization: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlSign(hsignature.rawAddress, hkey.toLong(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, pvkeyinfospec.rawAddress, psignaturemethod.rawAddress, pcanonicalization.rawAddress)

public actual fun cryptXmlVerifySignature(hsignature: ConstPtr, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(hsignature.rawAddress, hkey.rawAddress, dwflags.toInt())

public actual fun decrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyDecrypt(hcrypto.rawAddress, foaep, cbindata.toInt(), pindata.rawAddress, pcboutdata.rawAddress, ppoutdata.rawAddress)

public actual fun encrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyEncrypt(hcrypto.rawAddress, foaep, cbindata.toInt(), pindata.rawAddress, pcboutdata.rawAddress, ppoutdata.rawAddress)

public actual fun findCertsByIssuer(pcertchains: MutPtr, pcbcertchains: MutPtr, pccertchains: MutPtr, pbencodedissuername: ConstPtr, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(pcertchains.rawAddress, pcbcertchains.rawAddress, pccertchains.rawAddress, pbencodedissuername.rawAddress, cbencodedissuername.toInt(), pwszpurpose.rawAddress, dwkeyspec.toInt())

public actual fun freeToken(pallocmemory: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyFreeToken(pallocmemory.rawAddress)

public actual fun generateDerivedKey(hcrypto: ConstPtr, cblabel: UInt, plabel: ConstPtr, cbnonce: UInt, pnonce: ConstPtr, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr, ppkey: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(hcrypto.rawAddress, cblabel.toInt(), plabel.rawAddress, cbnonce.toInt(), pnonce.rawAddress, derivedkeylength.toInt(), offset.toInt(), algid.rawAddress, pcbkey.rawAddress, ppkey.rawAddress)

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr, pcbtoken: MutPtr, pptoken: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetBrowserToken(dwparamtype.toInt(), pparam.rawAddress, pcbtoken.rawAddress, pptoken.rawAddress)

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetCipherInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getCryptoTransform(hsymmetriccrypto: ConstPtr, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr, pphtransform: MutPtr): Hresult =
    0

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetHashInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(pszprovidername.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getKeyedHash(hsymmetriccrypto: ConstPtr, pphhash: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetKeyedHash(hsymmetriccrypto.rawAddress, pphhash.rawAddress)

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetRngInterface(pszprovidername.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetSChannelInterface(pszprovidername.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetSignatureInterface(pszprovidername.rawAddress, pszalgid.rawAddress, ppfunctiontable.rawAddress, dwflags.toInt())

public actual fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr, securitytoken: MutPtr, phprooftokencrypto: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyGetToken(cpolicychain.toInt(), ppolicychain.rawAddress, securitytoken.rawAddress, phprooftokencrypto.rawAddress)

public actual fun hashCore(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyHashCore(hcrypto.rawAddress, cbindata.toInt(), pindata.rawAddress)

public actual fun hashFinal(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyHashFinal(hcrypto.rawAddress, cbindata.toInt(), pindata.rawAddress, pcboutdata.rawAddress, ppoutdata.rawAddress)

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyImportInformationCard(filename.rawAddress)

public actual fun manageCardSpace(): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyManageCardSpace()

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(hdescriptor.rawAddress)

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: MutPtr, cbclaimblob: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), pparameterlist.rawAddress, pbclaimblob.rawAddress, cbclaimblob.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(hprovider.toLong(), phkey.rawAddress, pszalgid.rawAddress, pszkeyname.rawAddress, dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(pwszdescriptorstring.rawAddress, dwflags.toInt(), phdescriptor.rawAddress)

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptDecrypt(hkey.toLong(), pbinput.rawAddress, cbinput.toInt(), ppaddinginfo.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(hsharedsecret.toLong(), pwszkdf.rawAddress, pparameterlist.rawAddress, pbderivedkey.rawAddress, cbderivedkey.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptEncrypt(hkey.toLong(), pbinput.rawAddress, cbinput.toInt(), ppaddinginfo.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(hprovider.toLong(), dwalgoperations.toInt(), pdwalgcount.rawAddress, ppalglist.rawAddress, dwflags.toInt())

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr, ppenumstate: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(hprovider.toLong(), pszscope.rawAddress, ppkeyname.rawAddress, ppenumstate.rawAddress, dwflags.toInt())

public actual fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(pdwprovidercount.rawAddress, ppproviderlist.rawAddress, dwflags.toInt())

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptExportKey(hkey.toLong(), hexportkey.toLong(), pszblobtype.rawAddress, pparameterlist.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptFreeBuffer(pvinput: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(pvinput.rawAddress)

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject.toLong())

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: ObjectSecurityInformation): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptGetProperty(hobject.toLong(), pszproperty.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr, dwinfotype: UInt, ppvinfo: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(hdescriptor.rawAddress, pmempara.rawAddress, dwinfotype.toInt(), ppvinfo.rawAddress)

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, phkey: MutPtr, pbdata: ConstPtr, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptImportKey(hprovider.toLong(), himportkey.toLong(), pszblobtype.rawAddress, pparameterlist.rawAddress, phkey.rawAddress, pbdata.rawAddress, cbdata.toInt(), dwflags.toInt())

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(hprovider.toLong(), pszalgid.rawAddress, dwflags.toInt())

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey.toLong())

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(hkey.toLong(), pparameterlist.rawAddress, pbderivedkey.rawAddress, cbderivedkey.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(hprovider.toLong(), phevent.rawAddress, dwflags.toInt())

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptOpenKey(hprovider.toLong(), phkey.rawAddress, pszkeyname.rawAddress, dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptOpenStorageProvider(phprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(phprovider.rawAddress, pszprovidername.rawAddress, dwflags.toInt())

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbprotectedblob: MutPtr, pcbprotectedblob: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(hdescriptor.rawAddress, dwflags.toInt(), pbdata.rawAddress, cbdata.toInt(), pmempara.rawAddress, hwnd.rawAddress, ppbprotectedblob.rawAddress, pcbprotectedblob.rawAddress)

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(pwszname.rawAddress, pwszdescriptorstring.rawAddress, pcdescriptorstring.rawAddress, dwflags.toInt())

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(pwszname.rawAddress, pwszdescriptorstring.rawAddress, dwflags.toInt())

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(hprivkey.toLong(), hpubkey.toLong(), phagreedsecret.rawAddress, dwflags.toInt())

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptSetProperty(hobject.toLong(), pszproperty.rawAddress, pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptSignHash(hkey.toLong(), ppaddinginfo.rawAddress, pbhashvalue.rawAddress, cbhashvalue.toInt(), pbsignature.rawAddress, cbsignature.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptStreamClose(hstream.rawAddress)

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr, phstream: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(hdescriptor.rawAddress, dwflags.toInt(), hwnd.rawAddress, pstreaminfo.rawAddress, phstream.rawAddress)

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(pstreaminfo.rawAddress, dwflags.toInt(), hwnd.rawAddress, phstream.rawAddress)

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(pstreaminfo.rawAddress, dwflags.toInt(), hwnd.rawAddress, phstream.rawAddress)

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr, cbdata: ULong, ffinal: Bool): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(hstream.rawAddress, pbdata.rawAddress, cbdata.toLong(), ffinal)

public actual fun nCryptTranslateHandle(phprovider: MutPtr, phkey: MutPtr, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(phprovider.rawAddress, phkey.rawAddress, hlegacyprov.toLong(), hlegacykey.toLong(), dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptUnprotectSecret(phdescriptor: MutPtr, dwflags: NcryptFlags, pbprotectedblob: ConstPtr, cbprotectedblob: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbdata: MutPtr, pcbdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(phdescriptor.rawAddress, dwflags.toInt(), pbprotectedblob.rawAddress, cbprotectedblob.toInt(), pmempara.rawAddress, hwnd.rawAddress, ppbdata.rawAddress, pcbdata.rawAddress)

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: ConstPtr, cbclaimblob: UInt, poutput: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), pparameterlist.rawAddress, pbclaimblob.rawAddress, cbclaimblob.toInt(), poutput.rawAddress, dwflags.toInt())

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(hkey.toLong(), ppaddinginfo.rawAddress, pbhashvalue.rawAddress, cbhashvalue.toInt(), pbsignature.rawAddress, cbsignature.toInt(), dwflags.toInt())

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyPFXExportCertStore(hstore.rawAddress, ppfx.rawAddress, szpassword.rawAddress, dwflags.toInt())

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, pvpara: ConstPtr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(hstore.rawAddress, ppfx.rawAddress, szpassword.rawAddress, pvpara.rawAddress, dwflags.toInt())

public actual fun pFXImportCertStore(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    MutPtr(WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyPFXImportCertStore(ppfx.rawAddress, szpassword.rawAddress, dwflags.toInt()))

public actual fun pFXIsPFXBlob(ppfx: ConstPtr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(ppfx.rawAddress)

public actual fun pFXVerifyPassword(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(ppfx.rawAddress, szpassword.rawAddress, dwflags.toInt())

public actual fun processPrng(pbdata: MutPtr, cbdata: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyProcessPrng(pbdata.rawAddress, cbdata.toLong())

public actual fun signError(): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignError()

public actual fun signHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, pcbsig: MutPtr, ppsig: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignHash(hcrypto.rawAddress, cbhash.toInt(), phash.rawAddress, hashalgoid.rawAddress, pcbsig.rawAddress, ppsig.rawAddress)

public actual fun signerFreeSignerContext(psignercontext: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(psignercontext.rawAddress)

public actual fun signerSign(psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerSign(psubjectinfo.rawAddress, psignercert.rawAddress, psignatureinfo.rawAddress, pproviderinfo.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress)

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerSignEx(dwflags.toInt(), psubjectinfo.rawAddress, psignercert.rawAddress, psignatureinfo.rawAddress, pproviderinfo.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress)

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerSignEx2(dwflags.toInt(), psubjectinfo.rawAddress, psignercert.rawAddress, psignatureinfo.rawAddress, pproviderinfo.rawAddress, dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress, pcryptopolicy.rawAddress, preserved.rawAddress)

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, pdigestsigninfo: ConstPtr, preserved: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerSignEx3(dwflags.toInt(), psubjectinfo.rawAddress, psignercert.rawAddress, psignatureinfo.rawAddress, pproviderinfo.rawAddress, dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress, pcryptopolicy.rawAddress, pdigestsigninfo.rawAddress, preserved.rawAddress)

public actual fun signerTimeStamp(psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerTimeStamp(psubjectinfo.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress)

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx(dwflags.toInt(), psubjectinfo.rawAddress, pwszhttptimestamp.rawAddress, psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress)

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(dwflags.toInt(), psubjectinfo.rawAddress, pwszhttptimestamp.rawAddress, dwalgid.toInt(), psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress)

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), psubjectinfo.rawAddress, pwszhttptimestamp.rawAddress, pszalgorithmoid.rawAddress, psrequest.rawAddress, psipdata.rawAddress, ppsignercontext.rawAddress, pcryptopolicy.rawAddress, preserved.rawAddress)

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslChangeNotify(hevent.rawAddress, dwflags.toInt())

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pszalgid.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr, cbrandoms: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(hsslprovider.toLong(), hmasterkey.toLong(), pbrandoms.rawAddress, cbrandoms.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pboutput.rawAddress, cboutput.toInt(), dwflags.toInt())

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslComputeSessionHash(hsslprovider.toLong(), hhandshakehash.toLong(), dwprotocol.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(hsslprovider.toLong(), phhandshakehash.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), pszhashalgid.rawAddress, dwflags.toInt())

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr, cbparams: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(hsslprovider.toLong(), phephemeralkey.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), pbparams.rawAddress, cbparams.toInt(), dwflags.toInt())

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(hsslprovider.toLong(), phhandshakehash.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt())

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslDecryptPacket(hsslprovider.toLong(), hkey.toLong(), pbinput.rawAddress, cbinput.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, sequencenumber.toLong(), dwflags.toInt())

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(hsslprovider.toLong(), htranscripthash.toLong(), phtranscripthash.rawAddress, dwflags.toInt())

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslEncryptPacket(hsslprovider.toLong(), hkey.toLong(), pbinput.rawAddress, cbinput.toInt(), pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, sequencenumber.toLong(), dwcontenttype.toInt(), dwflags.toInt())

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite.rawAddress, ppenumstate.rawAddress, dwflags.toInt())

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite.rawAddress, ppenumstate.rawAddress, dwflags.toInt())

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr, ppecccurve: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslEnumEccCurves(hsslprovider.toLong(), pecccurvecount.rawAddress, ppecccurve.rawAddress, dwflags.toInt())

public actual fun sslEnumProtocolProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(pdwprovidercount.rawAddress, ppproviderlist.rawAddress, dwflags.toInt())

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandBinderKey(hsslprovider.toLong(), hearlykey.toLong(), phbinderkey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phexportermasterkey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr, cbticketnonce: UInt, phpresharedkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(hsslprovider.toLong(), hresumptionmasterkey.toLong(), pbticketnonce.rawAddress, cbticketnonce.toInt(), phpresharedkey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(hsslprovider.toLong(), hmasterkey.toLong(), hhashvalue.toLong(), phresumptionmasterkey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr, phservertraffickey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phclienttraffickey.rawAddress, phservertraffickey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExpandWriteKey(hsslprovider.toLong(), hbasetraffickey.toLong(), phwritekey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExportKey(hsslprovider.toLong(), hkey.toLong(), pszblobtype.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr, cbrandoms: UInt, pbcontextvalue: ConstPtr, cbcontextvalue: UShort, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(hsslprovider.toLong(), hmasterkey.toLong(), slabel.rawAddress, pbrandoms.rawAddress, cbrandoms.toInt(), pbcontextvalue.rawAddress, cbcontextvalue.toShort(), pboutput.rawAddress, cboutput.toInt(), dwflags.toInt())

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(hsslprovider.toLong(), hpresharedkey.toLong(), phearlykey.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), hearlykey.toLong(), phhandshakekey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslExtractMasterKey(hsslprovider.toLong(), hhandshakekey.toLong(), phmasterkey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslFreeBuffer(pvinput: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslFreeBuffer(pvinput.rawAddress)

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslFreeObject(hobject.toLong(), dwflags.toInt())

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), phmasterkey.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(hsslprovider.toLong(), hpublickey.toLong(), phpremasterkey.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress, pboutput.rawAddress, cboutput.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(hsslprovider.toLong(), hmasterkey.toLong(), phreadkey.rawAddress, phwritekey.rawAddress, pparameterlist.rawAddress, dwflags.toInt())

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), szprfhash.rawAddress, dwflags.toInt())

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGetKeyProperty(hkey.toLong(), pszproperty.rawAddress, ppboutput.rawAddress, pcboutput.rawAddress, dwflags.toInt())

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslGetProviderProperty(hsslprovider.toLong(), pszproperty.rawAddress, ppboutput.rawAddress, pcboutput.rawAddress, ppenumstate.rawAddress, dwflags.toInt())

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslHashHandshake(hsslprovider.toLong(), hhandshakehash.toLong(), pbinput.rawAddress, cbinput.toInt(), dwflags.toInt())

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr, pszblobtype: Pcwstr, pbkeyblob: ConstPtr, cbkeyblob: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslImportKey(hsslprovider.toLong(), phkey.rawAddress, pszblobtype.rawAddress, pbkeyblob.rawAddress, cbkeyblob.toInt(), dwflags.toInt())

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pbencryptedkey: ConstPtr, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslImportMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), phmasterkey.rawAddress, dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress, pbencryptedkey.rawAddress, cbencryptedkey.toInt(), dwflags.toInt())

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pcipherlengths.rawAddress, cbcipherlengths.toInt(), dwflags.toInt())

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pciphersuite.rawAddress, dwflags.toInt())

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr, pcertcontext: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(hsslprovider.toLong(), phprivatekey.rawAddress, pcertcontext.rawAddress, dwflags.toInt())

public actual fun sslOpenProvider(phsslprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslOpenProvider(phsslprovider.rawAddress, pszprovidername.rawAddress, dwflags.toInt())

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslSignHash(hsslprovider.toLong(), hprivatekey.toLong(), pbhashvalue.rawAddress, cbhashvalue.toInt(), pbsignature.rawAddress, cbsignature.toInt(), pcbresult.rawAddress, dwflags.toInt())

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySslVerifySignature(hsslprovider.toLong(), hpublickey.toLong(), pbhashvalue.rawAddress, cbhashvalue.toInt(), pbsignature.rawAddress, cbsignature.toInt(), dwflags.toInt())

public actual fun systemPrng(pbrandomdata: MutPtr, cbrandomdata: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographySystemPrng(pbrandomdata.rawAddress, cbrandomdata.toLong())

public actual fun transformBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyTransformBlock(hcrypto.rawAddress, cbindata.toInt(), pindata.rawAddress, pcboutdata.rawAddress, ppoutdata.rawAddress)

public actual fun transformFinalBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyTransformFinalBlock(hcrypto.rawAddress, cbindata.toInt(), pindata.rawAddress, pcboutdata.rawAddress, ppoutdata.rawAddress)

public actual fun verifyHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr, pfverified: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssysWindowsWin32SecurityCryptographyVerifyHash(hcrypto.rawAddress, cbhash.toInt(), phash.rawAddress, hashalgoid.rawAddress, cbsig.toInt(), psig.rawAddress, pfverified.rawAddress)
