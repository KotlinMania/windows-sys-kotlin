#ifndef WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(uint32_t hlicensestorage, void* wszlicense, void* wszurl, void* pvcontext);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(uint32_t hclient, uint32_t uflags, void* pvreserved, uint32_t ctemplates, void* pwsztemplateids, void* wszurl, void* pvcontext);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(uint32_t hsession, uint32_t uflags, void* wszgroupidentitycredential, void* wszrequestedrights, void* wszcustomdata, void* wszurl, void* pvcontext);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMActivate(uint32_t hclient, uint32_t uflags, uint32_t ulangid, void* pactservinfo, void* pvcontext, void* hparentwnd);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(uint32_t hlicensestorage, uint32_t uflags, void* wszlicense);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(uint32_t hissuancelicense, uint32_t hright, uint32_t huser);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMAttest(uint32_t henablingprincipal, void* wszdata, int32_t etype, void* pcattestedblob, void* wszattestedblob);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(uint32_t henv, uint32_t clevel);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(uint32_t hissuancelicense);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(uint32_t henv);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(uint32_t handle);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(uint32_t hpub);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(uint32_t hquery);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(uint32_t hsession);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(uint32_t ccertificates, void* rgwszcertificates, void* pcchain, void* wszchain);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(uint32_t henv, void* pparams, void* wszlicensechain, void* phboundlicense, void* pherrorlog);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(void* pfncallback, uint32_t ucallbackversion, void* wszgroupidprovidertype, void* wszgroupid, void* phclient);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phdecryptor);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phencryptor);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(uint32_t henv, uint32_t hlibrary, void* wszobject, void* pidprincipal, void* wszcredentials, void* phenablingprincipal);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense(void* psttimefrom, void* psttimeuntil, void* wszreferralinfoname, void* wszreferralinfourl, uint32_t howner, void* wszissuancelicense, uint32_t hboundlicense, void* phissuancelicense);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(uint32_t henv, uint32_t hdefaultlibrary, uint32_t hclient, uint32_t uflags, void* wszissuancelicense, void* phlicensestorage);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateRight(void* wszrightname, void* pstfrom, void* pstuntil, uint32_t cextendedinfo, void* pwszextendedinfoname, void* pwszextendedinfovalue, void* phright);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMCreateUser(void* wszusername, void* wszuserid, void* wszuseridtype, void* phuser);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDecode(void* wszalgid, void* wszencodedstring, void* pudecodeddatalen, void* pbdecodeddata);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain(void* wszchain, uint32_t iwhich, void* pccert, void* wszcert);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(uint32_t hsession, void* wszlicenseid);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(uint32_t htocopy, void* phcopy);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(uint32_t htocopy, void* phcopy);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(uint32_t hpubin, void* phpubout);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(uint32_t hsessionin, void* phsessionout);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMEncode(void* wszalgid, uint32_t udatalen, void* pbdecodeddata, void* puencodedstringlen, void* wszencodedstring);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(uint32_t hsession, uint32_t uflags, uint32_t uindex, void* pfsharedflag, void* pucertificatedatalen, void* wszcertificatedata);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(uint32_t hissuancelicense, uint32_t uindex, void* punamelength, void* wszname, void* puvaluelength, void* wszvalue);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(uint32_t hqueryroot, void* wszattribute, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(uint32_t hqueryroot, void* wszattribute, void* pcattributes);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iwhich, void* phsubobject);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount(void* wszchain, void* pccertcount);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion(void* pdrmclientversioninfo);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(uint32_t hissuancelicense, void* pcdays);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(uint32_t hissuancelicense, void* psttimefrom, void* psttimeuntil, uint32_t uflags, void* pudistributionpointnamelength, void* wszdistributionpointname, void* pudistributionpointurllength, void* wszdistributionpointurl, void* phowner, void* pfofficial);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(uint32_t hissuancelicense, void* puissuancelicensetemplatelength, void* wszissuancelicensetemplate);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(uint32_t hissuancelicense, void* pucontentidlength, void* wszcontentid, void* pucontentidtypelength, void* wszcontentidtype, void* puskuidlength, void* wszskuid, void* puskuidtypelength, void* wszskuidtype, void* pucontenttypelength, void* wszcontenttype, void* pucontentnamelength, void* wszcontentname);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(uint32_t hissuancelicense, uint32_t uindex, void* pulcid, void* punamelength, void* wszname, void* pudescriptionlength, void* wszdescription);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(uint32_t hissuancelicense, void* puownerlicenselength, void* wszownerlicense);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(uint32_t hlibrary, void* wszprocname, void* ppfnprocaddress);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(uint32_t hissuancelicense, void* puidlength, void* wszid, void* puidtypelength, void* wszidtype, void* puurllength, void* wszrl, void* pstfrequency, void* punamelength, void* wszname, void* pupublickeylength, void* wszpublickey);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(uint32_t hright, uint32_t uindex, void* puextendedinfonamelength, void* wszextendedinfoname, void* puextendedinfovaluelength, void* wszextendedinfovalue);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(uint32_t hright, void* purightnamelength, void* wszrightname, void* pstfrom, void* pstuntil);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uint32_t uflags, void* putypelen, void* wsztype, void* pupathlen, void* wszpath);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(uint32_t hclient, uint32_t uservicetype, uint32_t uservicelocation, void* wszissuancelicense, void* puserviceurllength, void* wszserviceurl);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* wszclientlicensorcertificate, void* pfncallback, void* wszurl, void* pvcontext);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* pvreserved, uint32_t henablingprincipal, uint32_t hboundlicenseclc, void* pfncallback, void* pvcontext);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetTime(uint32_t henv, int32_t etimeridtype, void* potimeobject);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(uint32_t hqueryroot, void* wszattributetype, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(uint32_t hqueryroot, void* wszattributetype, void* pcattributes);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iindex, void* phsubquery);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(uint32_t hissuancelicense, uint32_t uindex, void* peusagepolicytype, void* pfexclusion, void* punamelength, void* wszname, void* puminversionlength, void* wszminversion, void* pumaxversionlength, void* wszmaxversion, void* pupublickeylength, void* wszpublickey, void* pudigestalgorithmlength, void* wszdigestalgorithm, void* pcbdigest, void* pbdigest);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(uint32_t huser, void* puusernamelength, void* wszusername, void* puuseridlength, void* wszuserid, void* puuseridtypelength, void* wszuseridtype);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(uint32_t hissuancelicense, uint32_t huser, uint32_t uindex, void* phright);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(uint32_t hissuancelicense, uint32_t uindex, void* phuser);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(int32_t esecurityprovidertype, int32_t especification, void* wszsecurityprovider, void* wszmanifestcredentials, void* wszmachinecredentials, void* phenv, void* phdefaultlibrary);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(uint32_t hclient, uint32_t uflags, void* pactservinfo);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected(void* hwnd, void* pfprotected);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(uint32_t henv, int32_t especification, void* wszlibraryprovider, void* wszcredentials, void* phlibrary);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense(void* wszcertificate, void* phqueryroot);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(int32_t fregister);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(uint32_t henv, void* hwnd);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(uint32_t henv, void* wszrevocationlist);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMRepair(void);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(uint32_t hissuancelicense, int32_t fdelete, void* wszname, void* wszvalue);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(int32_t eglobaloptions, void* pvdata, uint32_t dwlen);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(uint32_t hissuancelicense, uint32_t cdays);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(uint32_t hissuancelicense, void* wszcontentid, void* wszcontentidtype, void* wszskuid, void* wszskuidtype, void* wszcontenttype, void* wszcontentname);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(uint32_t hissuancelicense, int32_t fdelete, uint32_t lcid, void* wszname, void* wszdescription);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(uint32_t hissuancelicense, int32_t fdelete, void* wszid, void* wszidtype, void* wszurl, void* pstfrequency, void* wszname, void* wszpublickey);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(uint32_t hissuancelicense, int32_t eusagepolicytype, int32_t fdelete, int32_t fexclusion, void* wszname, void* wszminversion, void* wszmaxversion, void* wszpublickey, void* wszdigestalgorithm, void* pbdigest, uint32_t cbdigest);
int32_t windowssys_windows_win32_data_rightsmanagement_dRMVerify(void* wszdata, void* pcattesteddata, void* wszattesteddata, void* petype, void* pcprincipal, void* wszprincipal, void* pcmanifest, void* wszmanifest);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H */
