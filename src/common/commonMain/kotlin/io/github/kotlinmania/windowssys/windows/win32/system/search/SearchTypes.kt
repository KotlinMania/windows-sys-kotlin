package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public typealias ACCESS_MASKENUM = Int

public typealias AUTH_TYPE = Int

public typealias CASE_REQUIREMENT = Int

public typealias CHANNEL_AGENT_FLAGS = Int

public typealias CLUSION_REASON = Int

public typealias CONDITION_CREATION_OPTIONS = Int

public typealias CREATESUBSCRIPTIONFLAGS = Int

public typealias CatalogPausedReason = Int

public typealias CatalogStatus = Int

public typealias DBACCESSORFLAGSENUM = Int

public typealias DBASYNCHOPENUM = Int

public typealias DBASYNCHPHASEENUM = Int

public typealias DBBINDFLAGENUM = Int

public typealias DBBINDSTATUSENUM = Int

public typealias DBBINDURLFLAGENUM = Int

public typealias DBBINDURLSTATUSENUM = Int

public typealias DBBOOKMARK = Int

public typealias DBCOLUMNDESCFLAGSENUM = Int

public typealias DBCOLUMNFLAGS15ENUM = Int

public typealias DBCOLUMNFLAGSDEPRECATED = Int

public typealias DBCOLUMNFLAGSENUM = Int

public typealias DBCOLUMNFLAGSENUM20 = Int

public typealias DBCOLUMNFLAGSENUM21 = Int

public typealias DBCOLUMNFLAGSENUM26 = Int

public typealias DBCOMMANDPERSISTFLAGENUM = Int

public typealias DBCOMMANDPERSISTFLAGENUM21 = Int

public typealias DBCOMPAREENUM = Int

public typealias DBCOMPAREOPSENUM = Int

public typealias DBCOMPAREOPSENUM20 = Int

public typealias DBCONSTRAINTTYPEENUM = Int

public typealias DBCONVERTFLAGSENUM = Int

public typealias DBCONVERTFLAGSENUM20 = Int

public typealias DBCOPYFLAGSENUM = Int

public typealias DBCOSTUNITENUM = Int

public typealias DBDATACONVERTENUM = Int

public typealias DBDEFERRABILITYENUM = Int

public typealias DBDELETEFLAGSENUM = Int

public typealias DBEVENTPHASEENUM = Int

public typealias DBEXECLIMITSENUM = Int

public typealias DBINDEX_COL_ORDERENUM = Int

public typealias DBLITERALENUM = Int

public typealias DBLITERALENUM20 = Int

public typealias DBLITERALENUM21 = Int

public typealias DBMATCHTYPEENUM = Int

public typealias DBMEMOWNERENUM = Int

public typealias DBMOVEFLAGSENUM = Int

public typealias DBPARAMFLAGSENUM = Int

public typealias DBPARAMFLAGSENUM20 = Int

public typealias DBPARAMIOENUM = Int

public typealias DBPARTENUM = Int

public typealias DBPENDINGSTATUSENUM = Int

public typealias DBPOSITIONFLAGSENUM = Int

public typealias DBPROMPTOPTIONSENUM = Int

public typealias DBPROPENUM = Int

public typealias DBPROPENUM15 = Int

public typealias DBPROPENUM20 = Int

public typealias DBPROPENUM21 = Int

public typealias DBPROPENUM25 = Int

public typealias DBPROPENUM25_DEPRECATED = Int

public typealias DBPROPENUM26 = Int

public typealias DBPROPENUMDEPRECATED = Int

public typealias DBPROPFLAGSENUM = Int

public typealias DBPROPFLAGSENUM21 = Int

public typealias DBPROPFLAGSENUM25 = Int

public typealias DBPROPFLAGSENUM26 = Int

public typealias DBPROPOPTIONSENUM = Int

public typealias DBPROPSTATUSENUM = Int

public typealias DBPROPSTATUSENUM21 = Int

public typealias DBRANGEENUM = Int

public typealias DBRANGEENUM20 = Int

public typealias DBREASONENUM = Int

public typealias DBREASONENUM15 = Int

public typealias DBREASONENUM25 = Int

public typealias DBRESOURCEKINDENUM = Int

public typealias DBRESULTFLAGENUM = Int

public typealias DBROWCHANGEKINDENUM = Int

public typealias DBROWSTATUSENUM = Int

public typealias DBROWSTATUSENUM20 = Int

public typealias DBSEEKENUM = Int

public typealias DBSORTENUM = Int

public typealias DBSOURCETYPEENUM = Int

public typealias DBSOURCETYPEENUM20 = Int

public typealias DBSOURCETYPEENUM25 = Int

public typealias DBSTATUSENUM = Int

public typealias DBSTATUSENUM20 = Int

public typealias DBSTATUSENUM21 = Int

public typealias DBSTATUSENUM25 = Int

public typealias DBSTATUSENUM26 = Int

public typealias DBTABLESTATISTICSTYPE26 = Int

public typealias DBTYPEENUM = Int

public typealias DBTYPEENUM15 = Int

public typealias DBTYPEENUM20 = Int

public typealias DBUPDELRULEENUM = Int

public typealias DBWATCHMODEENUM = Int

public typealias DBWATCHNOTIFYENUM = Int

public typealias DCINFOTYPEENUM = Int

public typealias DELIVERY_AGENT_FLAGS = Int

public typealias EBindInfoOptions = Int

public typealias FOLLOW_FLAGS = Int

public typealias HACCESSOR = ULong

public typealias INTERVAL_LIMIT_KIND = Int

public typealias KAGREQDIAGFLAGSENUM = Int

public typealias LOCKMODEENUM = Int

public typealias MSDSDBINITPROPENUM = Int

public typealias MSDSSESSIONPROPENUM = Int

public typealias NAMED_ENTITY_CERTAINTY = Int

public typealias OSPCOMP = Int

public typealias OSPFIND = Int

public typealias OSPFORMAT = Int

public typealias OSPRW = Int

public typealias OSPXFER = Int

public fun interface PFNFILLTEXTBUFFERFn {
    public operator fun invoke(ptextsource: Long): HRESULT
}

public typealias PFNFILLTEXTBUFFER = PFNFILLTEXTBUFFERFn?

public typealias PRIORITIZE_FLAGS = Int

public typealias PRIORITY_LEVEL = Int

public typealias PROXY_ACCESS = Int

public typealias QUERY_PARSER_MANAGER_OPTION = Int

public typealias ROWSETEVENT_ITEMSTATE = Int

public typealias ROWSETEVENT_TYPE = Int

public typealias SEARCH_INDEXING_PHASE = Int

public typealias SEARCH_KIND_OF_CHANGE = Int

public typealias SEARCH_NOTIFICATION_PRIORITY = Int

public typealias SEARCH_QUERY_SYNTAX = Int

public typealias SEARCH_TERM_EXPANSION = Int

public typealias SQLINTERVAL = Int

public typealias SQLVARENUM = Int

public fun interface SQL_ASYNC_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(pcontext: Long, flast: BOOL): Short
}

public typealias SQL_ASYNC_NOTIFICATION_CALLBACK = SQL_ASYNC_NOTIFICATION_CALLBACKFn?

public typealias STRUCTURED_QUERY_MULTIOPTION = Int

public typealias STRUCTURED_QUERY_PARSE_ERROR = Int

public typealias STRUCTURED_QUERY_RESOLVE_OPTION = Int

public typealias STRUCTURED_QUERY_SINGLE_OPTION = Int

public typealias STRUCTURED_QUERY_SYNTAX = Int

public typealias SUBSCRIPTIONINFOFLAGS = Int

public typealias SUBSCRIPTIONSCHEDULE = Int

public typealias SUBSCRIPTIONTYPE = Int

public typealias WEBCRAWL_RECURSEFLAGS = Int
