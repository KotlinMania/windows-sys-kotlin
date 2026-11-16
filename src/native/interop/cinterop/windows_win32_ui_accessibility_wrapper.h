#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(void* hwndapp, uint32_t dwutilitystatemask, uint32_t dwutilitystate);
int32_t windowssysWindowsWin32UiAccessibilityAccessibleChildren(void* pacccontainer, int32_t ichildstart, int32_t cchildren, void* rgvarchildren, void* pcobtained);
int32_t windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(void* hwnd, uint32_t dwid, uint32_t dwchildid, void* ppacc, void* pvarchild);
int32_t windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(void* hwnd, uint32_t dwid, void* riid, void* ppvobject);
int32_t windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(void* hwnd, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject);
int32_t windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(void* hobj, int32_t dockposition);
int32_t windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(void* hobj);
void windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(void* pver, void* pbuild);
uint32_t windowssysWindowsWin32UiAccessibilityGetRoleTextA(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssysWindowsWin32UiAccessibilityGetRoleTextW(uint32_t lrole, void* lpszrole, uint32_t cchrolemax);
uint32_t windowssysWindowsWin32UiAccessibilityGetStateTextA(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
uint32_t windowssysWindowsWin32UiAccessibilityGetStateTextW(uint32_t lstatebit, void* lpszstate, uint32_t cchstate);
int32_t windowssysWindowsWin32UiAccessibilityGridPatternGetItem(void* hobj, int32_t row, int32_t column, void* presult);
int32_t windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(uint32_t event);
int32_t windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(void* hobj, void* paccessible);
int32_t windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(void* hobj, int32_t flagsselect);
int32_t windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(void* hobj, void* szvalue);
int64_t windowssysWindowsWin32UiAccessibilityLresultFromObject(void* riid, uint64_t wparam, void* punk);
int32_t windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(void* hobj, int32_t viewid, void* ppstr);
int32_t windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(void* hobj, int32_t viewid);
void windowssysWindowsWin32UiAccessibilityNotifyWinEvent(uint32_t event, void* hwnd, int32_t idobject, int32_t idchild);
int32_t windowssysWindowsWin32UiAccessibilityObjectFromLresult(int64_t lresult, void* riid, uint64_t wparam, void* ppvobject);
int32_t windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(void* hobj, double val);
int32_t windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(void* hwnd, int32_t pointertype, int32_t fobserve);
int32_t windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityScrollPatternScroll(void* hobj, int32_t horizontalamount, int32_t verticalamount);
int32_t windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(void* hobj, double horizontalpercent, double verticalpercent);
int32_t windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(void* hobj);
void* windowssysWindowsWin32UiAccessibilitySetWinEventHook(uint32_t eventmin, uint32_t eventmax, void* hmodwineventproc, void* pfnwineventproc, uint32_t idprocess, uint32_t idthread, uint32_t dwflags);
int32_t windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(void* hobj, int32_t inputtype);
int32_t windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(void* hobj, void* hnodechild, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeClone(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeCompare(void* hobj, void* range, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(void* hobj, int32_t unit);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeFindText(void* hobj, void* text, int32_t backward, int32_t ignorecase, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(void* hobj, int32_t attributeid, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(void* hobj, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeGetText(void* hobj, int32_t maxlength, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeMove(void* hobj, int32_t unit, int32_t count, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(void* hobj, int32_t endpoint, int32_t unit, int32_t count, void* pretval);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(void* hobj, int32_t aligntotop);
int32_t windowssysWindowsWin32UiAccessibilityTextRangeSelect(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityTogglePatternToggle(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityTransformPatternMove(void* hobj, double x, double y);
int32_t windowssysWindowsWin32UiAccessibilityTransformPatternResize(void* hobj, double width, double height);
int32_t windowssysWindowsWin32UiAccessibilityTransformPatternRotate(void* hobj, double degrees);
int32_t windowssysWindowsWin32UiAccessibilityUiaAddEvent(void* hnode, int32_t eventid, void* pcallback, int32_t scope, void* pproperties, int32_t cproperties, void* prequest, void* phevent);
int32_t windowssysWindowsWin32UiAccessibilityUiaClientsAreListening(void);
int32_t windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders(void);
int32_t windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(void* pprovider);
int32_t windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(void* hevent, void* hwnd);
int32_t windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(void* hevent, void* hwnd);
int32_t windowssysWindowsWin32UiAccessibilityUiaFind(void* hnode, void* pparams, void* prequest, void* pprequesteddata, void* ppoffsets, void* pptreestructures);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(void* pdescription);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(void* hnode, int32_t patternid, void* phobj);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(void* hnode, int32_t propertyid, void* pvalue);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(void* punkmixedattributevalue);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(void* punknotsupportedvalue);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetRootNode(void* phnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(void* hnode, void* pruntimeid);
int32_t windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(void* hnode, void* prequest, int32_t normalizestate, void* pnormalizecondition, void* pprequesteddata, void* pptreestructure);
int32_t windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(void* pvar, void* phobj);
int32_t windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(void* pvar, void* phtextrange);
int32_t windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(void* pvar, void* phnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(void* hwnd);
int32_t windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(void* hwnd, void* ppprovider);
int32_t windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(void* pprovider, uint32_t dwflags, void* ppaccessible, void* pvarchild);
int32_t windowssysWindowsWin32UiAccessibilityUiaLookupId(int32_t type, void* pguid);
int32_t windowssysWindowsWin32UiAccessibilityUiaNavigate(void* hnode, int32_t direction, void* pcondition, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(void* hwnd, void* phnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(double x, double y, void* prequest, void* pprequesteddata, void* pptreestructure);
int32_t windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(void* pprovider, void* phnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaNodeRelease(void* hnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaPatternRelease(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(void* hwnd, int32_t idobject, int32_t idchild, void* ppprovider);
int32_t windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(void* paccessible, int32_t idchild, uint32_t dwflags, void* ppprovider);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(void* provider, void* textrange);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(void* pprovider, int32_t asynccontentloadedstate, double percentcomplete);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(void* pprovider, int32_t id);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(void* pprovider, int32_t eventidcount, void* puiachanges);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(void* provider, int32_t notificationkind, int32_t notificationprocessing, void* displaystring, void* activityid);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(void* pprovider, int32_t structurechangetype, void* pruntimeid, int32_t cruntimeidlen);
int32_t windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(void* pprovider, int32_t texteditchangetype, void* pchangeddata);
void windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(void* pcallback);
int32_t windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(void* hevent);
int64_t windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(void* hwnd, uint64_t wparam, int64_t lparam, void* el);
int32_t windowssysWindowsWin32UiAccessibilityUiaSetFocus(void* hnode);
int32_t windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityUnhookWinEvent(void* hwineventhook);
int32_t windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(void* hwnd, int32_t pointertype);
int32_t windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(void* hwnd, int32_t pointertype);
int32_t windowssysWindowsWin32UiAccessibilityValuePatternSetValue(void* hobj, void* pval);
int32_t windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(void* param0, void* phwnd);
int32_t windowssysWindowsWin32UiAccessibilityWindowPatternClose(void* hobj);
int32_t windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(void* hobj, int32_t state);
int32_t windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(void* hobj, int32_t milliseconds, void* presult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_ACCESSIBILITY_WINDOWS_WIN32_UI_ACCESSIBILITY_WRAPPER_H */
