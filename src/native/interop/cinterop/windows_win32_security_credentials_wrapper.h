#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_credentials_credDeleteA(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credDeleteW(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credEnumerateA(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_credEnumerateW(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_credFindBestCredentialA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_credFindBestCredentialW(void* targetname, uint32_t type, uint32_t flags, void* credential);
void windowssys_windows_win32_security_credentials_credFree(void* buffer);
int32_t windowssys_windows_win32_security_credentials_credGetSessionTypes(uint32_t maximumpersistcount, void* maximumpersist);
int32_t windowssys_windows_win32_security_credentials_credGetTargetInfoA(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssys_windows_win32_security_credentials_credGetTargetInfoW(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssys_windows_win32_security_credentials_credIsMarshaledCredentialA(void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_credIsMarshaledCredentialW(void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_credIsProtectedA(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssys_windows_win32_security_credentials_credIsProtectedW(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssys_windows_win32_security_credentials_credMarshalCredentialA(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_credMarshalCredentialW(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_credPackAuthenticationBufferA(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssys_windows_win32_security_credentials_credPackAuthenticationBufferW(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssys_windows_win32_security_credentials_credProtectA(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssys_windows_win32_security_credentials_credProtectW(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssys_windows_win32_security_credentials_credReadA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_credReadDomainCredentialsA(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_credReadDomainCredentialsW(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_credReadW(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_credRenameA(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credRenameW(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
uint32_t windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsA(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsW(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUIConfirmCredentialsA(void* psztargetname, int32_t bconfirm);
uint32_t windowssys_windows_win32_security_credentials_credUIConfirmCredentialsW(void* psztargetname, int32_t bconfirm);
uint32_t windowssys_windows_win32_security_credentials_credUIParseUserNameA(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssys_windows_win32_security_credentials_credUIParseUserNameW(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssys_windows_win32_security_credentials_credUIPromptForCredentialsA(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUIPromptForCredentialsW(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsA(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsW(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_credUIReadSSOCredW(void* pszrealm, void* ppszusername);
uint32_t windowssys_windows_win32_security_credentials_credUIStoreSSOCredW(void* pszrealm, void* pszusername, void* pszpassword, int32_t bpersist);
int32_t windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferA(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchlmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferW(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssys_windows_win32_security_credentials_credUnmarshalCredentialA(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssys_windows_win32_security_credentials_credUnmarshalCredentialW(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssys_windows_win32_security_credentials_credUnprotectA(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssys_windows_win32_security_credentials_credUnprotectW(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssys_windows_win32_security_credentials_credWriteA(void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credWriteDomainCredentialsA(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credWriteDomainCredentialsW(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_credWriteW(void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_getOpenCardNameA(void* param0);
int32_t windowssys_windows_win32_security_credentials_getOpenCardNameW(void* param0);
void windowssys_windows_win32_security_credentials_keyCredentialManagerFreeInformation(void* keycredentialmanagerinfo);
int32_t windowssys_windows_win32_security_credentials_keyCredentialManagerGetInformation(void* keycredentialmanagerinfo);
int32_t windowssys_windows_win32_security_credentials_keyCredentialManagerGetOperationErrorStates(int32_t keycredentialmanageroperationtype, void* isready, void* keycredentialmanageroperationerrorstates);
int32_t windowssys_windows_win32_security_credentials_keyCredentialManagerShowUIOperation(void* hwndowner, int32_t keycredentialmanageroperationtype);
void* windowssys_windows_win32_security_credentials_sCardAccessStartedEvent(void);
int32_t windowssys_windows_win32_security_credentials_sCardAddReaderToGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardAddReaderToGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardAudit(uint64_t hcontext, uint32_t dwevent);
int32_t windowssys_windows_win32_security_credentials_sCardBeginTransaction(uint64_t hcard);
int32_t windowssys_windows_win32_security_credentials_sCardCancel(uint64_t hcontext);
int32_t windowssys_windows_win32_security_credentials_sCardConnectA(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_sCardConnectW(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_sCardControl(uint64_t hcard, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_security_credentials_sCardDisconnect(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssys_windows_win32_security_credentials_sCardDlgExtendedError(void);
int32_t windowssys_windows_win32_security_credentials_sCardEndTransaction(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssys_windows_win32_security_credentials_sCardEstablishContext(uint32_t dwscope, void* pvreserved1, void* pvreserved2, void* phcontext);
int32_t windowssys_windows_win32_security_credentials_sCardForgetCardTypeA(uint64_t hcontext, void* szcardname);
int32_t windowssys_windows_win32_security_credentials_sCardForgetCardTypeW(uint64_t hcontext, void* szcardname);
int32_t windowssys_windows_win32_security_credentials_sCardForgetReaderA(uint64_t hcontext, void* szreadername);
int32_t windowssys_windows_win32_security_credentials_sCardForgetReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardForgetReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardForgetReaderW(uint64_t hcontext, void* szreadername);
int32_t windowssys_windows_win32_security_credentials_sCardFreeMemory(uint64_t hcontext, void* pvmem);
int32_t windowssys_windows_win32_security_credentials_sCardGetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, void* pcbattrlen);
int32_t windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdA(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdW(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssys_windows_win32_security_credentials_sCardGetProviderIdA(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssys_windows_win32_security_credentials_sCardGetProviderIdW(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdA(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdW(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssys_windows_win32_security_credentials_sCardGetReaderIconA(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssys_windows_win32_security_credentials_sCardGetReaderIconW(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssys_windows_win32_security_credentials_sCardGetStatusChangeA(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardGetStatusChangeW(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardGetTransmitCount(uint64_t hcard, void* pctransmitcount);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeA(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeW(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceReaderA(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardIntroduceReaderW(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssys_windows_win32_security_credentials_sCardIsValidContext(uint64_t hcontext);
int32_t windowssys_windows_win32_security_credentials_sCardListCardsA(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssys_windows_win32_security_credentials_sCardListCardsW(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssys_windows_win32_security_credentials_sCardListInterfacesA(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssys_windows_win32_security_credentials_sCardListInterfacesW(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssys_windows_win32_security_credentials_sCardListReaderGroupsA(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssys_windows_win32_security_credentials_sCardListReaderGroupsW(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssys_windows_win32_security_credentials_sCardListReadersA(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_sCardListReadersW(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdA(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdW(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_sCardLocateCardsA(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardLocateCardsByATRA(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardLocateCardsByATRW(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardLocateCardsW(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_sCardReadCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssys_windows_win32_security_credentials_sCardReadCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssys_windows_win32_security_credentials_sCardReconnect(uint64_t hcard, uint32_t dwsharemode, uint32_t dwpreferredprotocols, uint32_t dwinitialization, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_sCardReleaseContext(uint64_t hcontext);
void windowssys_windows_win32_security_credentials_sCardReleaseStartedEvent(void);
int32_t windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_sCardSetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, uint32_t cbattrlen);
int32_t windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssys_windows_win32_security_credentials_sCardState(uint64_t hcard, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_sCardStatusA(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_sCardStatusW(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_sCardTransmit(uint64_t hcard, void* piosendpci, void* pbsendbuffer, uint32_t cbsendlength, void* piorecvpci, void* pbrecvbuffer, void* pcbrecvlength);
int32_t windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardA(void* param0);
int32_t windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardW(void* param0);
int32_t windowssys_windows_win32_security_credentials_sCardWriteCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);
int32_t windowssys_windows_win32_security_credentials_sCardWriteCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H */
