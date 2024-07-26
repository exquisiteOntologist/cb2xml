/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ASignClauseClause extends PClause
{
    private PSignClause _signClause_;

    public ASignClauseClause()
    {
        // Constructor
    }

    public ASignClauseClause(
        @SuppressWarnings("hiding") PSignClause _signClause_)
    {
        // Constructor
        setSignClause(_signClause_);

    }

    @Override
    public Object clone()
    {
        return new ASignClauseClause(
            cloneNode(this._signClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASignClauseClause(this);
    }

    public PSignClause getSignClause()
    {
        return this._signClause_;
    }

    public void setSignClause(PSignClause node)
    {
        if(this._signClause_ != null)
        {
            this._signClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._signClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._signClause_ == child)
        {
            this._signClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._signClause_ == oldChild)
        {
            setSignClause((PSignClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}